package basic;
//
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//// 최상위 컨테이너 : JFrame
//// 컨테이너 : JPanel
//// 컴포넌트 : JButton , JLabel , JTextField ...
//// 리스너 : 컴포넌트에 리스너를 add하면 , 이벤트 발생 시 -> 캐치 > 처리
//
//class Content extends JPanel implements ActionListener {
//	
//	private JButton[] map;
//	private int[] mark;
//	
//	private int turn = 1;
//	private int win;
//	private boolean printWinner;
//	
//	private int cnt = 1;
//	JButton reset = new JButton();
//	
//	public Content() {
//		setLayout(null);
//		setBounds(0,0,700,700);
//		
//		setHeader();
//		setMap();
//	}
//	
//	private void addResetButton() {
//		this.reset.setBounds(800/2-300/2 , 600 , 300 , 50);
//		this.reset.setText("START");
//		reset.addActionListener((ActionListener) this);
//	}
//	
//	private void setHeader() {
//		JLabel head = new JLabel("TIC TAC TOE");
//		head.setBounds(0,0,800,200);
//		head.setFont(new Font("", Font.BOLD , 40));
//		head.setHorizontalAlignment(JLabel.CENTER);
//		head.setVerticalAlignment(JLabel.BOTTOM);
//		add(head);
//	}
//	
//	private void setMap() {
//		map = new JButton[9];
//		mark = new int[9];
//		
//		int x = 800/2-300/2;
//		int y = 800/2-300/2;
//		for(int i=0; i<this.map.length; i++) {
//			this.map[i] = new JButton();
//			this.map[i].setBounds(x,y,100,100);
//			this.map[i].setBackground(Color.lightGray);
//			
//			add(this.map[i]);
//			x += 100;
//			if( i % 3 == 2) {
//				x = 800/2-300-2;
//				y += 100;
//			}
//			
//		}
//	}
//	
//
//	private void checkWin() {
//		this.win = this.win == 0 ? checkHori() : this.win;
//		this.win = this.win == 0 ? checkVerti() : this.win;
//		this.win = this.win == 0 ? checkDia() : this.win;
//		this.win = this.win == 0 ? checkReverse() : this.win;
//		if(this.printWinner == false && this.win != 0) {
//			System.out.printf("%d번째 게임 : p%d의 승리 !! \n" ,this.cnt, this.win);
//			this.printWinner = true;
//			this.cnt ++;
//		}
//	}
//	
//	/*
//	 *  0 1 2
//	 *  3 4 5 
//	 *  6 7 8
//	 */
//	private int checkReverse() {
//		int cnt = 0;
//		for(int i=8; i>=0; i-=4) {
//			if(this.mark[i] == this.turn ) {
//				cnt ++;
//			}
//		}
//		if(cnt == 3) {
//			return this.turn;
//		}
//		return 0;
//	}
//
//	private int checkDia() {
//		int cnt = 0;
//		for(int i=0; i<mark.length; i+=4) {
//			if(this.mark[i] == this.turn ) {
//				cnt ++;
//			}
//		}
//		if(cnt == 3) {
//			return this.turn;
//		}
//		return 0;
//	}
//
//	private int checkVerti() {
//		for(int i=0; i<3; i++) {
//			int cnt = 0;
//			for(int j=0; j<mark.length; j+=3) {
//				if(this.mark[i+j] == this.turn  ) cnt ++;
//			}
//			if(cnt == 3) 
//				return this.turn;
//		}
//		return 0;
//	}
//
//	private int checkHori() {
//		for(int i=0; i<this.mark.length; i+=3) {
//			int cnt = 0;
//			for(int j=0; j<3; j++) {
//				if(this.mark[i+j] == this.turn ) cnt ++;
//			}
//			if(cnt == 3) 
//				return this.turn;
//		}
//		return 0;
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton target = (JButton) e.getSource();
//		
//		if(target == this.reset) {
//			resetMap();
//		}else {
//			this.reset.setText("RESET");
//			for(int i=0; i<this.map.length; i++) {
//				if(target == this.map[i] && this.mark[i] == 0) {
//					if(this.turn == 1) {
//						target.setBackground(Color.black);
//					}
//					else {
//						target.setBackground(Color.orange);
//					}
//					this.mark[i] = this.turn;
//					checkWin();
//					this.turn = this.turn == 1 ? 2 : 1;
//				}
//			}
//			
//		}
//	}
//
//	private void resetMap() {
//		for(int i=0; i<this.map.length; i++) {
//			this.map[i].setBackground(Color.lightGray);
//		}
//		this.mark = new int[9];
//		this.turn = 1;
//		this.win = 0;
//		this.reset.setText("START");
//		this.printWinner = false;
//		
//	}
//}
//
//class Tictactoe extends JFrame {
//	
//	public Tictactoe() {
//		super("TIC TAC TOE");
//		
//		setLayout(null);
//		setBounds(100,100,800,800);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setBackground(Color.pink);
//		
//		add(new Content());
//		setVisible(true);
//		revalidate();//갱신
//		
//	}
//}
//
public class t {

	public static void main(String[] args) {
		//Tictactoe ttt = new Tictactoe();
	}

}
