package basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class AlertFrame1to50 extends JFrame {
	
	JLabel clearText = new JLabel();
	public AlertFrame1to50() {
		setLayout(null);
		setBounds(800,400,200,150);
		setVisible(true);
		this.clearText.setBounds(0,0,170,100);
		this.clearText.setText("GAME CLEAR !!");
		this.clearText.setVisible(true);
		this.clearText.setHorizontalAlignment(JLabel.CENTER);
		add(this.clearText);
		
	}
}

class Content1to50 extends JPanel implements ActionListener{
	
	Random rn = new Random();
	private final int SIZE = 5;
	private JButton map[][] = new JButton[SIZE][SIZE];
	private int front[][] = new int[SIZE][SIZE];
	private int back[][] = new int[SIZE][SIZE];
	private int cnt = 1;
	 JButton reset = new JButton();
	 
	JLabel timer = new JLabel();
	private int min;
	private int sec;
	private int ms;
	public Content1to50() {
		setLayout(null);
		setBounds(0,0,800,800);
		setBackground(new Color(205, 240, 250));
		this.ranNumSet();
		this.print();
		setHeader();
		setMap();
		setResetButton();
		setTimer();
	}
	
	private void setTimer() {
		this.timer.setBounds(0,0,200,100);
		this.timer.setText(String.format("%2d, %2d, %3d\n",this.min , this.sec , this.ms));
		add(this.timer);
		
	}
	
	public void setTime() {
		
	}
	private void setResetButton() {
		this.reset.setText("RESET");
		this.reset.setBounds(20,250,100,50);
		this.reset.setFont(new Font("",1,15));
		this.reset.setBackground(new Color(248, 240, 223));
		this.reset.addActionListener(this);
		add(reset);
	}
	
	private void resetMap() {
		System.out.println("리셋!!");
		this.cnt = 1;
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				this.map[i][j].setBackground(new Color(249, 249, 249));
				this.map[i][j].setText(this.front[i][j]+"");
			}
		}
	}
	private void setHeader() {
		JLabel head = new JLabel("1 to 50");
		head.setText("1 to 50");
		head.setBounds(0,0,800,200);
		head.setFont(new Font("",Font.BOLD,40));
		head.setHorizontalAlignment(JLabel.CENTER);
		add(head);
	}
	
	private void setMap() {
		int y = 150;
		for(int i=0; i<SIZE; i++) {
			int x = 150;
			for(int j=0; j<SIZE; j++) {
				this.map[i][j] = new JButton();
				this.map[i][j].setBounds(x,y,100,100);
				this.map[i][j].setBackground(new Color(249, 249, 249));
				this.map[i][j].setFont(new Font("",1,35));
				this.map[i][j].setText(this.front[i][j]+"");
				this.map[i][j].addActionListener(this);
				add(this.map[i][j]);
				x += 100;
			}
			y += 100;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton target = (JButton) e.getSource();
		System.out.println("cnt : " + cnt);
		if(target == this.reset) {
			this.resetMap();
		}
		else {
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(this.cnt < 26 &&  target == map[i][j] && target.getText().equals(this.cnt+"")) {
						this.map[i][j].setText(this.back[i][j]+"");
						this.map[i][j].setBackground(new Color(247, 219, 240));
						this.cnt ++;
					}
					if(  this.cnt >= 26 &&target == map[i][j] && target.getText().equals(this.cnt+"") ) {
						this.map[i][j].setText("");
						this.map[i][j].setBackground(new Color(205, 240, 234));
						//remove(this.map[i][j]);
						this.cnt ++;
					}
				}
			}
		}
		if(this.cnt == 51) {
			AlertFrame1to50 a = new AlertFrame1to50();
		}
	}
	
	private void ranNumSet() {//랜덤숫자 세팅.
		while(true) {
			int rNum = rn.nextInt(25)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(front[i][j] == rNum ){
						check = 1;
						break;
					}
					if(check == 0 && front[i][j] == 0) {
						front[i][j] = rNum;
						check = 2;
						break;
					}
				}
				if(check == 2) {
					break;
				}
				if(check == 1) break;
			}
			if(front[4][4] != 0) break;
		}
		while(true) {
			int rNum = rn.nextInt(25)+26;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(back[i][j] == rNum ){
						check = 1;
						break;
					}
					if(check == 0 && back[i][j] == 0) {
						back[i][j] = rNum;
						check = 2;
						break;
					}
				}
				if(check == 2) {
					break;
				}
				if(check == 1) break;
			}
			if(back[4][4] != 0) break;
		}
	}
	
	public void print() { //랜덤숫자 잘 세팅되었는지 확인용 
		this.ranNumSet();
		System.out.println("front");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(front[i][j] +" ");
			}System.out.println();
		} 
		System.out.println("back");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(back[i][j] +" ");
			}System.out.println();
		} 
	}
}// Content1to50

class One extends JFrame {
	private Content1to50 content = new Content1to50();
	public One() {
		super("1 to 50");
		setLayout(null);
		setBounds(500,200,800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(content);
		setVisible(true);
		revalidate();
		
	}
	public void setWatchTime(int n) {
		content.setTime();
	}
	
	
}

public class Ex1to50 {

	public static void main(String[] args) {
		One one = new One();
		
		int n = 0;
		while(true) {
			try {
				
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			one.setWatchTime(n);
		}
	}

}
