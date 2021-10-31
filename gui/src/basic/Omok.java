package basic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class AlertOmokWinner extends JFrame{
	private JLabel text = new JLabel();
	
	public AlertOmokWinner(int win) {
		super("Omok Game");
		setLayout(null);
		setBounds(OmokGame.W/2-100 , OmokGame.H/2-200 , 200 , 200);
		setVisible(true);
		revalidate();
		
		this.text.setBounds(0,20,200,100);
		if(win == 1) {
			this.text.setText("흑의 승리 !!");
		}else {
			this.text.setText("백의 승리 !!");			
		}
		this.text.setFont(new Font("",1,20));
		this.text.setHorizontalAlignment(JLabel.CENTER);
		add(text);
	}
}

class AlertViewGuide extends JFrame{
	
	private JLabel text = new JLabel();
	
	public AlertViewGuide() {
		super("Omok Guide");
		setLayout(null);
		setBounds(OmokGame.W/2-100 , OmokGame.H/2-200,300,300);
		setVisible(true);
		revalidate();
		
		this.text.setBounds(0,0,500,100);
		this.text.setText(String.format("<html>[1] 시작은 흑부터 입니다.<br>[2] 연속으로 다섯개를 두면 승리입니다. <br>[3] 육목은 승리조건이 아닙니다.<br>[4] 오목은 흑이 유리합니다.</html>"));
		this.text.setFont(new Font("",1,15));
		add(this.text);
	}
}

class OmokMap extends JPanel implements ActionListener{
	
	private final int SIZE = 10;
	private JButton map[][] = new JButton[SIZE][SIZE];
	private JLabel titleLabel = new JLabel();
	private JLabel turnLabel = new JLabel();
	private JButton resetButton = new JButton();
	private JButton guideButton = new JButton();
	private int checkMap[][] = new int[SIZE][SIZE];
	private int turn = 1;
	private int win;
	private int buttonSize = 50;
	public OmokMap () {
		setLayout(null);
		setBounds(0,0,OmokGame.WIDTH , OmokGame.HEIGHT);
		setBackground(new Color(200, 227, 212));
		
		setTitleLabel();
		setTurnLabel();
		setMap();
		setResetButton();
		setGudieButton();
	}
	

	private void setGudieButton() {
		this.guideButton.setBounds(50,370,200,50);
		this.guideButton.setText("VIEW GUIDE");
		this.guideButton.setFont(new Font("",1,20));
		this.guideButton.addActionListener(this);
		add(this.guideButton);
	}


	private void setResetButton() {
		this.resetButton.setBounds(50,300,200,50);
		this.resetButton.setText("RESET");
		this.resetButton.setFont(new Font("",1,20));
		this.resetButton.addActionListener(this);
		add(this.resetButton);
	}


	private void setMap() {
		int y = 150;
		for(int i=0; i<this.SIZE; i++) {
			int x = 350;
			for(int j=0; j<this.SIZE; j++) {
				this.map[i][j] = new JButton();
				this.map[i][j].setBounds(x,y,this.buttonSize,this.buttonSize);
				this.map[i][j].setBackground(new Color(246, 215, 167));
				add(this.map[i][j]);
				this.map[i][j].addActionListener(this);
				x += this.buttonSize;
			}
			y += this.buttonSize;
		}
	}
	
	private void resetMap() {
		for(int i=0; i<this.SIZE; i++) {
			for(int j=0; j<this.SIZE; j++) {
				this.map[i][j].setText("");
				this.checkMap[i][j] = 0;
			}
		}
		this.turn = 1;
		this.win = 0;
		this.turnLabel.setText(String.format("Player %d의 차례입니다.", this.turn));
	}

	private void setTitleLabel() {
		this.titleLabel.setText("<오목의 달인>");
		this.titleLabel.setBounds(50,50,280,50);
		this.titleLabel.setFont(new Font("",1,35));
		add(this.titleLabel);
	}

	private void setTurnLabel() {
		this.turnLabel.setText(String.format("Player %d의 차례입니다.", this.turn));
		this.turnLabel.setBounds(50,100,260,50);
		this.turnLabel.setFont(new Font("",Font.BOLD,20));
		add(this.turnLabel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton target = (JButton) e.getSource();
		if(target == this.resetButton) {
			resetMap();
		}
		else if(target == this.guideButton) {
			AlertViewGuide a = new AlertViewGuide();
		}
		else {
			for(int i=0; i<this.SIZE; i++) {
				for(int j=0; j<this.SIZE; j++) {
					if(map[i][j] == target && this.checkMap[i][j] == 0) {
						this.checkMap[i][j] = this.turn;
						if(this.turn == 1) {
							this.map[i][j].setText("●");
							this.map[i][j].setFont(new Font("",Font.BOLD,15));
						}else {
							this.map[i][j].setText("○");
							this.map[i][j].setFont(new Font("",Font.BOLD,15));
						}
						this.winCheck();
						this.turn = this.turn == 1? 2: 1;
						this.turnLabel.setText(String.format("Player %d의 차례입니다.", this.turn));
					}
				}
			}
		}
		
		if(this.win != 0) {
			AlertOmokWinner b = new AlertOmokWinner(this.win);
		}
	}
	
	public void winCheck() {
		// 육목이 안되게 처리해야함 . 
		//가로 ver.1
		for(int i=0; i<this.SIZE; i++) {
			for(int j=0; j<this.SIZE-4; j++) {
				
				if(j == 0) {
					this.widthCheck(i, j , +5);
				}else if ( j == 5) {
					this.widthCheck(i, j , -1);
				}else {
					this.widthCheck(i, j , 0);
				}

			}
		}
		//세로 ver.2
		for(int i=0; i<this.SIZE; i++) {
			int cnt = 0;
			for(int j=0; j<this.SIZE; j++) {
				if(this.checkMap[j][i] == this.turn) {
					cnt ++;
				}
				else {
					cnt = 0;
				}
				if(cnt == 5) {
					this.win = this.turn;
				}
				if(cnt == 6) {
					this.win = 0;
				}
		}
		}
		//대각\
		int cnt = 0;
		for(int i=0; i<this.SIZE; i++) {
			if(this.checkMap[i][i] == this.turn) {
				cnt ++;
			}
			else {
				cnt = 0;
			}
			if(cnt == 5) {
				this.win = this.turn;
			}
			if(cnt == 6) {
				this.win = 0;
			}
		}
		//대각/
		cnt = 0;
		for(int i=this.SIZE-1; i>=0; i--) {
			//0 9  1 8  2 7
			if(this.checkMap[(this.SIZE-i-1)][i] == this.turn) {
				cnt ++;
			}
			else {
				cnt = 0;
			}
			if(cnt == 5) {
				this.win = this.turn;
			}
			if(cnt == 6) {
				this.win = 0;
			}
		}
	}
	
	private void widthCheck(int i ,int j , int x) {
		int cnt = 0;
		for(int k=j; k<j+5; k++) {
			if(this.checkMap[i][k] == turn) {
				cnt++;
			}else {
				cnt = 0;
			}
		}
		if(j == 0 || j == 5) {
			if(cnt == 5 && this.checkMap[i][j+x] != this.turn) {
				this.win = this.turn;
			}			
		}else {
			if(cnt == 5 && this.checkMap[i][j-1] != this.turn && this.checkMap[i][j+5] != this.turn) {
				this.win = this.turn;						
			}
		}
	}
	

}

class OmokGame extends JFrame{
	
	private static Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static final int W = dm.width;
	public static final int H = dm.height;
	
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 800;
	private OmokMap map = new OmokMap();
	public OmokGame() {
		super("Omok Game");
		setLayout(null);
		setBounds(W/2-500 , H/2-400, 1000 , 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		revalidate();
		
		add(map);
	}
}


public class Omok {

	public static void main(String[] args) {
		OmokGame e = new OmokGame();
	}

}
