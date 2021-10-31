package basic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class AlertEnd extends JFrame {
	
	private JLabel text = new JLabel();
	
	public AlertEnd(int ms) {
		super("GAME CLEAR");
		setLayout(null);
		setBounds(Otf.W/2-150 , Otf.H/2-100 , 300 , 200);
		setVisible(true);
		
		this.text.setBounds(0,0,300,200);
		this.text.setText(String.format("기록 : %d,%3d", ms/1000 , ms%1000));
		this.text.setVerticalAlignment(JLabel.CENTER);
		this.text.setHorizontalAlignment(JLabel.CENTER);
		add(this.text);
	}
}

class Map extends JPanel implements ActionListener , Runnable {
	
	private final int SIZE = 5;
	private JButton map[][] = new JButton[SIZE][SIZE];
	private int front[][] = new int[SIZE][SIZE];
	private int back[][] = new int[SIZE][SIZE];
	private final int BUTTON = 60;
	
	private int gameNum = 1;
	
	private JLabel timer = new JLabel();
	private int ms;
	private boolean isRun;
	
	private JButton reset = new JButton();
	
	
	public Map() {
		setLayout(null);
		setBounds(0,0 , Otf.WIDTH , Otf.HEIGHT);
		setBackground(Color.LIGHT_GRAY);
		
		setTimer();
		setMap();
		setResetButton();
	}

	private void setResetButton() {
		this.reset.setBounds(Otf.WIDTH/2-150 , Otf.HEIGHT-200 , 300 , 50);
		this.reset.setText("RESET");
		this.reset.addActionListener(this);
		add(this.reset);
	}

	private void setTimer() {
		this.timer.setBounds(0,0,Otf.WIDTH, 200 );
		this.timer.setText(String.format("%d.%3d", this.ms/1000 , this.ms%1000)); // 0.000
		this.timer.setVerticalAlignment(JLabel.CENTER);
		this.timer.setHorizontalAlignment(JLabel.CENTER);
		this.timer.setFont(new Font("Alart",1,40));
		add(this.timer);
		
	}

	private void setMap() {
		shuffle();
		int y = Otf.HEIGHT/2-BUTTON*SIZE/2;
		for(int i=0; i<this.SIZE; i++) {
			int x = Otf.WIDTH/2-BUTTON*SIZE/2;
			for(int j=0; j<this.SIZE; j++) {
				this.map[i][j] = new JButton();
				this.map[i][j].setBounds(x , y , BUTTON , BUTTON);
				this.map[i][j].setText(this.front[i][j]+"");
				this.map[i][j].addActionListener(this);
				this.map[i][j].setBackground(new Color(150,187,124));
				this.map[i][j].setFont(new Font("",1,15));
				this.map[i][j].setForeground(Color.white);
				
				add(this.map[i][j]);
				x += BUTTON +3;
			}
			
			y += BUTTON +3;
		}
	}

	private void shuffle() {
		int n =1;
		for(int i=0; i<this.SIZE; i++) {
			for(int j=0; j<this.SIZE; j++) {
				this.front[i][j] = n;
				this.back[i][j] = n + this.SIZE * this.SIZE;
				n++;
			}
		}
		
		// shuffle
		Random rn = new Random();
		for(int i=0; i<1000; i++) {
			int a = rn.nextInt(this.SIZE);
			int b = rn.nextInt(this.SIZE);
			
			int temp = this.front[0][0];
			this.front[0][0] = this.front[a][b];
			this.front[a][b] = temp;
			
			 a = rn.nextInt(this.SIZE);
			 b = rn.nextInt(this.SIZE);
			
			temp = this.back[0][0];
			this.back[0][0] = this.back[a][b];
			this.back[a][b] = temp;
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton target = (JButton) e.getSource();
		
		if(target == this.reset) {
			resetMap();
		}else {
			for(int i=0; i<this.SIZE; i++) {
				for(int j=0; j<this.SIZE; j++) {
					if(target == this.map[i][j] && this.front[i][j] == this.gameNum) {
						
						if(this.gameNum == 1) this.isRun = true;
						this.front[i][j] = this.back[i][j];
						this.back[i][j] = 0;
						
						if(this.front[i][j] == 0 ) {
							target.setText("");
							target.setBackground(Color.lightGray);												
						}else {
							target.setText(this.front[i][j]+"");
							target.setBackground(new Color(24,77,71));						
						}
						this.gameNum ++;
					}
				}
			}
			if(this.gameNum > this.SIZE * this.SIZE *2 ) {
				// 게임종료
				new AlertEnd(this.ms);
			}
			
		}
	}

	private void resetMap() {
		shuffle();
		this.gameNum = 1;
		this.isRun = false;
		this.ms = 0;
		
		for(int i=0; i<this.SIZE; i++) {
			for(int j=0; j<this.SIZE; j++) {
				this.map[i][j].setBackground(new Color(150,187,124));
				this.map[i][j].setText(this.front[i][j]+"");
			}
		}
		
		setTimer();
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				
			}
			if(this.isRun) {
				this.ms ++;
				this.timer.setText(String.format("%d.%3d", this.ms/1000 , this.ms%1000));
			}
		}
		
	}
}
class Otf extends JFrame {
	
	private static Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	public static final int W = dm.width;
	public static final int H = dm.height;
	
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
	private Map map = new Map();
	public Otf() {
		super("1 to 50");
		setLayout(null);
		setBounds(W/2-WIDTH/2, H/2-HEIGHT/2 , WIDTH , HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		revalidate();

		
		add(map);
		map.run();
	}
}

public class Ex1to50tc {

	public static void main(String[] args) {
		Otf ttt = new Otf();
	}

}
