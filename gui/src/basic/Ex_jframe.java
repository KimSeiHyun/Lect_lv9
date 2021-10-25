package basic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
//import javax.swing.*; // 스윙이 가지고있는 모든 클래스 사용 가능 . 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// GUI : Graphic User Interface
// ㄴ awt 
// ㄴ swing

// JFrame : 최상위 컨테이너 
// JPanel : 컨테이너 <- 컴포넌트(요소들을 붙여add() 나가면서  완성함)
// ㄴ JButton , JTextField , JLabel , JCheckBox ...

class HeadTitle extends JLabel {
	public HeadTitle() {
		setBounds(MyFrame.W/2-150,0,300,300);
		setText("제목");
		setFont(new Font("asd", Font.BOLD , 30));
		setHorizontalAlignment(CENTER);
		setVisible(true);
	}
	
}
class MyPanel extends JPanel implements ActionListener { 
	Random rn = new Random();
	// 버튼 만들기
	// JButton
	JButton bt = new JButton(); 
	
	// 버튼 연습
	// 정방향으로 3*3 버튼의 나열
	JButton[] map = new JButton[9];
	
	public MyPanel() {
		setLayout(null); // 디폴트 레이아웃 구성을 삭제함.
		// 특정 위치에 색깔지정
		setBounds(MyFrame.W/2-100, MyFrame.H/2-100, 200, 200);
		System.out.println(MyFrame.W/2-100);
		System.out.println(MyFrame.H/2-100);
		setBackground(Color.orange);
		
//		this.bt.setBounds(50,50,50,50);
//		this.bt.setVisible(true);
		
		add(new HeadTitle());
		int x = 300;
		int y = 200;
		for(int i=0; i<this.map.length; i++) {
			map[i] = new JButton();
				this.map[i].setBounds(x,y,65,65);
				this.map[i].setBackground(Color.blue);
				this.map[i].setVisible(true);				
			x += 65;
			if(x == 495) y += 65;
			if(x == 495) x = 300;
			
			this.map[i].addActionListener(this);
			
			add(this.map[i]);
		}
		
		// map의 각 버튼 셋팅
		// 모두 -> panel 에 add
//		add(this.bt);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton temp = (JButton) e.getSource(); // 이벤트가 발생한 객체를 가져옴 . 
		for(int i=0; i<this.map.length; i++) {
			if(this.map[i] == temp) {
				int r = rn.nextInt(5);
				if(r == 0) {this.map[i].setBackground(Color.green);}
				if(r == 1) {this.map[i].setBackground(Color.black);}
				if(r == 2) {this.map[i].setBackground(Color.blue);}
				if(r == 3) {this.map[i].setBackground(Color.gray);}
				if(r == 4) {this.map[i].setBackground(Color.pink);}
				System.out.println(i); //콘솔에 액션이 발생한 인덱스를 출력
			}
		}
		
		// 버튼 클릭시 -> 버튼의 색이 변경되도록 처리 . 
	}
}
class MyFrame extends JFrame {
	
	// 사용자의 스크린샷기준으로 데이터를 가져옴 . (모니터해상도에따라 다름)
	private Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	private int width = dm.width;
	private int hight = dm.height;
	public final static int W = 800;
	public final static int H = 600;
	public MyFrame(String title) {
		// 부모 생성자를 활용한 프레임의 제목 설정 . 
		super(title);
		setLayout(null); // 디폴트 레이아웃 구성을 삭제함.
		// 프레임의 크기 설정
		// setBounds( x , y , width , height);
		//setBounds(100,100,800,600);
		// Dimension을 활용한 스크린 중앙에 좌표잡기 . 
		setBounds(this.width/2-W/2 , this.hight/2-H/2 , W , H);
		// 프레임의 종료 연산(명령)을 결정 . (생략시 , 프레임은 사라지지만 스레드는 종료되지 않음.)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임을 눈에 보이게 설정.
		setVisible(true);
		
		//add(new MyPanel());
	//	this.setContentPane(new MyPanel());
	}
}
public class Ex_jframe {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Green IT");
		frame.setContentPane(new MyPanel());
		
		
		
	}

}
