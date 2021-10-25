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

class HeadTitle2 extends JLabel {
	
	public HeadTitle2() {
		setBounds(MyFrame.W/2-150,0,300,300);
		setText("Tic Tac Toe");
		setFont(new Font("asd", Font.BOLD , 30));
		setHorizontalAlignment(CENTER);
		setVisible(true);
	}
	
	public HeadTitle2(String temp) {
		setBounds(MyFrame2.W/2+15 , MyFrame2.H/2+40 , 400 , 200);
		setText("<<START");
		setFont(new Font("START", Font.BOLD , 50));
		setHorizontalAlignment(CENTER);
		setVisible(true);
	}
	
	public HeadTitle2(int a) {
		setBounds(100,100,200,200);
		setFont(new Font("", Font.BOLD , 30));
		setHorizontalAlignment(CENTER);
		setText(MyPanel2.win+"의 승리 !! ");
		setVisible(true);
	}
}


class MyPanel2 extends JPanel implements ActionListener {
	public static MyPanel2 instance = new MyPanel2();
	Random rn = new Random();
	public JButton[] map = new JButton[9];
	int ttt[] = new int[9];
	JButton start = null;
	HeadTitle2 ht = new HeadTitle2();
	int turn = 1;
	int check = 0;
	static int win = 0;
	public MyPanel2() {
		setLayout(null); // 디폴트 레이아웃 구성을 삭제함.
		// 특정위치에 색깔지정
		setBounds(MyFrame.W/2-100, MyFrame.H/2-100, 200, 200); // 좌표 , 좌표 , 크기 , 크기
		setBackground(Color.orange); // 색깔
		this.startButton();
		add(new HeadTitle2());
		add(new HeadTitle2("temp"));
		int x = 300;
		int y = 200;
		for(int i=0; i<this.map.length; i++) {
			map[i] = new JButton();
				this.map[i].setBounds(x,y,65,65);
				this.map[i].setBackground(Color.blue);
				this.map[i].setText(i+"");
				this.map[i].setFont(new Font("", Font.BOLD, 30));
				this.map[i].setVisible(true);		
			x += 65;
			if(x == 495) y += 65;
			if(x == 495) x = 300;
			
			//this.map[i].addActionListener(this);
			
			add(this.map[i]);
		}
		

			this.start.addActionListener(this);

		if(map[0].getBackground() == Color.red) {
			System.out.println("1의승리!!");
		}
			
		
	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e ) {
		JButton temp = (JButton) e.getSource(); // 이벤트가 발생한 객체를 가져옴 . 
			temp.setText("RESET");

			for(int i=0; i<this.map.length; i++) {
					map[i].addActionListener(new aaa());
			}
			
			//reset
			if(temp == this.start) {
				for(int i=0; i<this.map.length; i++) {
					this.map[i].setBackground(Color.blue);
				}
				turn = 1;
			}
	}
	

	
	private class aaa implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton temp = (JButton) e.getSource();
			if(turn == 1 && temp.getBackground() == Color.blue) {
				temp.setBackground(Color.red);
				System.out.println("1턴!"); // 체크용 테스트 
				winCheck();
				turn = turn == 1? 2: 1;
			}
			else if(turn == 2 && temp.getBackground() == Color.blue) {
				temp.setBackground(Color.black);
				System.out.println("2턴!"); // 체크용 테스트
				winCheck();
				turn = turn == 1? 2: 1;
			}
			if(win != 0) {
				add(new HeadTitle2(2));
			}
			System.out.println("turn :" + turn); //체크용 텍스트
			

		}
		
	}
	
	public void winCheck() {
		//가로
		for(int i=0; i<8; i+=3) {
			if(map[i].getBackground() == Color.red && map[i+1].getBackground() == Color.red && map[i+2].getBackground() == Color.red ) {
				win = turn;
				System.out.printf("%d턴의 승리 ! \n",win);
			}
			if(map[i].getBackground() == Color.black && map[i+1].getBackground() == Color.black && map[i+2].getBackground() == Color.black ) {
				win = turn;
				System.out.printf("%d턴의 승리 ! \n",win);
			}
		}
		//세로
		for(int i=0; i<3; i++) {
			if(map[i].getBackground() == Color.red && map[i+3].getBackground() == Color.red && map[i+6].getBackground() == Color.red ) {
				win = turn;
				System.out.printf("%d턴의 승리 ! \n" , win);
			}
			if(map[i].getBackground() == Color.black && map[i+3].getBackground() == Color.black && map[i+6].getBackground() == Color.black ) {
				win = turn;
				System.out.printf("%d턴의 승리 ! \n", win);
			}
		}
		//대각\
		if(map[0].getBackground() == Color.red && map[4].getBackground() == Color.red && map[8].getBackground() == Color.red ) {
			win = turn;
			System.out.printf("%d턴의 승리 ! \n" , win);
		}
		if(map[0].getBackground() == Color.black && map[4].getBackground() == Color.black && map[8].getBackground() == Color.black ) {
			win = turn;
			System.out.printf("%d턴의 승리 ! \n", win);
		}
		//대각/
		if(map[2].getBackground() == Color.red && map[4].getBackground() == Color.red && map[6].getBackground() == Color.red ) {
			win = turn;
			System.out.printf("%d턴의 승리 ! \n" , win);
		}
		if(map[2].getBackground() == Color.black && map[4].getBackground() == Color.black && map[6].getBackground() == Color.black ) {
			win = turn;
			System.out.printf("%d턴의 승리 ! \n", win);
		}
	}
	

	
	public void startButton() {
		this.start = new JButton("START");
		this.start.setBounds(MyFrame2.W/2-101 , MyFrame2.H/2+120 , 200 , 50);
		this.start.setBackground(Color.green);
		this.start.setVisible(true);
		add(this.start);
	}
	
	public void tictactoePlay(JButton tempMap) {
		tempMap.setBackground(Color.black);
	}
	
}


class MyFrame2 extends JFrame {
	// 사용자의 스크린샷기준으로 데이터를 가져옴 . (모니터해상도에따라 다름)
	private Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	private int width = dm.width;
	private int hight = dm.height;
	public final static int W = 800;
	public final static int H = 600;
	
	public MyFrame2() {
		super("TicTacToe");
		setLayout(null); // 디폴트 레이아웃 구성을 삭제함.
		setBounds(this.width/2-W/2, this.hight/2-H/2, W, H); // 스크린을 띄울 좌표 , 좌표 , 크기 , 크기 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE); //창을닫으면 콘솔 종료 
		setVisible(true); // 프레임(스크린)을띄울 창을 눈에 보이게 설정
	}
}

public class TicTacToe {

	public static void main(String[] args) {
		MyFrame2 frame = new MyFrame2();
		frame.setContentPane(new MyPanel2());
	}

}
