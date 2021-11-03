package basic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class AlertOmokWinner extends JFrame {
	
	private JLabel text = new JLabel();
	
	public AlertOmokWinner() {
		setLayout(null);
		setBounds(300,300,200,150);
		setVisible(true);
		setText(Board.win);
		add(text);
		revalidate();
	}
	private void setText(int win) {
		this.text.setBounds(0,0,180,100);
		if(win == 1) {
			this.text.setText("���� �¸�!");
		}else {
			this.text.setText("���� �¸�!");
		}
		this.text.setFont(new Font("",1,30));
		this.text.setHorizontalAlignment(JLabel.CENTER);
	}
}
class Nemo {
	boolean click;
	int x , y , width , height ;
	int id;
	
	public Nemo(int x , 		int y , int width , int height) {
		this.x = x ;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
class Board extends JPanel implements MouseListener , ActionListener {
	
	private Nemo[][] map = new Nemo[10][10];
	private int turn = 1;
	public static int win = 0;
	private boolean play;
	private JButton reset = new JButton();
	private JLabel OmokLabel = new JLabel();
	private JLabel turnLabel = new JLabel();

	int xx;
	public Board() {
		setLayout(null);
		setBounds(0,0,900,900);
		setBackground(new Color(234, 220, 166));
		
		addMouseListener(this); // �гο� ���콺�����ʸ� �޾���.
		setMap();
		setOmokLabel();
		setResetButton();
		setTurnLabel();
	}
	
	private void setTurnLabel() {
		this.turnLabel.setBounds(50,200,200,50);
		this.turnLabel.setText(String.format("p%d�� ����", this.turn));
		this.turnLabel.setFont(new Font("",1,15));
		add(this.turnLabel);
	}

	private void setResetButton() {
		this.reset.setBounds(50,300,100,50);
		this.reset.setText("RESET");
		this.reset.addActionListener(this);
		add(this.reset);
	}

	private void setOmokLabel() {
		this.OmokLabel.setBounds(50,100,120,50);
		this.OmokLabel.setText("����");
		this.OmokLabel.setFont(new Font("",1,50));
		add(this.OmokLabel);
	}
	
	private void setMap() {
		//�׸� �簢���� ���� ������ Nemo�迭�� Ȱ���ؼ� ����
		int x = 1000/2-50*10/2;
		int y = 700/2-50*10/2;
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map[i].length; j++) {
				this.map[i][j] = new Nemo(x,y,50,50);
				x += 50;
			}
			x = 1000/2-50*10/2;
			y += 50;
		}
		// 
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // ������Ʈ�� ����� ����
		// �׸� �׸���
		// paintComponent() �޼ҵ尡 ���� ���� Grapics�� Ȱ��
		// drawRect(x,y,width,height) �޼ҵ带 Ȱ��
		

		// map line (������)
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map.length; j++) {
				Nemo nemo = this.map[i][j];
				Nemo temp = new Nemo(nemo.x-nemo.width/2 , nemo.y-nemo.height/2 , nemo.width , nemo.height);
				g.setColor(Color.black);
				g.drawRect(temp.x, temp.y, temp.width, temp.height);
				
				if(i == this.map.length-1) {
					g.drawRect(temp.x, temp.y+temp.height, temp.width, temp.height);					
				}
				if(j == this.map.length-1) {
					g.drawRect(temp.x+temp.width, temp.y, temp.width, temp.height);	
				}
				if( i == this.map.length-1 && j == this.map.length-1) {
					g.drawRect(temp.x+temp.width, temp.y+temp.height, temp.width, temp.height);	
				}
			}
		}
		
		if(this.play) {
			// stone
			// map �׸��� (���콺���� ĭ �����)
			for(int i=0; i<this.map.length; i++) {
				for(int j=0; j<this.map[i].length; j++) {
					// gudi line
					Nemo nemo = this.map[i][j];
					g.setColor(Color.pink); // �׵θ� �÷�
					g.drawRect(nemo.x , nemo.y , nemo.width , nemo.height); // �׸� ����
					//	g.fillRect(nemo.x , nemo.y , nemo.width , nemo.height); // �� ä���
					
					// stone
					if(nemo.click) {
						if(nemo.id == 1) {
							g.setColor(Color.black);
							g.drawRoundRect(nemo.x+10 , nemo.y+10 , nemo.width-20 , nemo.height-20 , nemo.width-20 , nemo.height-20 );
							g.fillRoundRect(nemo.x+10 , nemo.y+10 , nemo.width-20 , nemo.height-20 , nemo.width-20 , nemo.height-20 );
							//  �� ���׶�̱׸���(��ǥ,��ǥ,ũ��,ũ��,�ձ۱�ũ��,�ձ۱�ũ��)							
						}else if(nemo.id == 2){
							g.setColor(Color.white);
							g.drawRoundRect(nemo.x+10 , nemo.y+10 , nemo.width-20 , nemo.height-20 , nemo.width-20 , nemo.height-20 );
							g.fillRoundRect(nemo.x+10 , nemo.y+10 , nemo.width-20 , nemo.height-20 , nemo.width-20 , nemo.height-20 );
							//  �� ���׶�̱׸���(��ǥ,��ǥ,ũ��,ũ��,�ձ۱�ũ��,�ձ۱�ũ��)							
							
						}
						
					}
				}
			}
			
		}
		
		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) { // Ŭ�� �߻���
		System.out.println("�ƾ�");
		
		// Ŭ���� �߻��� ������ ��ǥ������ ������ . 
		int x = e.getX();
		int y = e.getY();

		// check
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map.length; j++) {
				Nemo stone = this.map[i][j];
				if(!stone.click && x >= stone.x && x < stone.x+stone.width && y >= stone.y && y < stone.y+stone.height) {
					stone.click = true;
					stone.id = this.turn;
					this.winCheck();
					this.turn = this.turn == 1 ? 2 : 1;
					if(!this.play) this.play = true;
					this.turnLabel.setText(String.format("p%d�� ����", this.turn));
				}
			}
		}
		
		if(this.win == 1 || this.win == 2) {
			AlertOmokWinner a = new AlertOmokWinner();
		}
	}
	private void winCheck() {
		//����
		for(int i=0; i<this.map.length; i++) {
			int cnt = 0;
			for(int j=0; j<this.map.length; j++) {
				if(this.map[i][j].id == this.turn) {
					cnt ++;
				}
				else {
					cnt = 0;
				}
				if(cnt == 5) {
					this.win = this.turn;
					return;
				}
				if(cnt == 6) {
					this.win = 0;
				}
		}
		}
		//����
		for(int i=0; i<this.map.length; i++) {
			int cnt = 0;
			for(int j=0; j<this.map.length; j++) {
				if(this.map[j][i].id == this.turn) {
					cnt ++;
				}
				else {
					cnt = 0;
				}
				if(cnt == 5) {
					this.win = this.turn;
					return;
				}
				if(cnt == 6) {
					this.win = 0;
				}
		}
		}
		
		//�밢 \
		win = 0;
		int a = 0;
		int b = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				int cnt = 0;
				if(this.map[i][j].id == this.turn) {
					 a = i;
					 b = j;
				}
					while (a < 10 && b < 10) {
						if(this.map[a][b].id == this.turn) {
							cnt++;
						}
						else {
							cnt = 0;
						}
						if(cnt == 5 && win != 5) {
							win = this.turn;
							return;
						}
						if(cnt == 6) {
							win = 5;
						}
						a++;
						b++;
 					}

			}
		}
		//�밢 /
		
		win = 0;
		 a = 0;
		 b = 0;
		for(int i=0; i<6; i++) {
			for(int j=4; j<10; j++) {
				int cnt = 0;
				if(this.map[i][j].id == this.turn) {
					 a = i;
					 b = j;
				}
					while (a < 10 && b >= 0) {
						if(this.map[a][b].id == this.turn) {
							cnt++;
						}
						else {
							cnt = 0;
						}
						if(cnt == 5 && win != 5) {
							win = this.turn;
							return;
						}
						if(cnt == 6) {
							win = 5;
						}
						a++;
						b--;
 					}

			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) { // Ŭ�� (������)
		System.out.println("Ŭ");
	}

	@Override
	public void mouseReleased(MouseEvent e) { // Ŭ�� (����)
		System.out.println("��");
	}

	@Override
	public void mouseEntered(MouseEvent e) { // listener �� add�� ���� ������ ���콺�� ������
		System.out.println("���콺������");
	}

	@Override
	public void mouseExited(MouseEvent e) { // listener �� add�� ���� ������ ���콺�� ������ ���� 
		System.out.println("���콺������");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.reset) {
			this.play = false;
			this.setMap();
			this.win = 0;
			this.turn = 1;
			this.turnLabel.setText(String.format("p%d�� ����", this.turn));
		}
	}
	
// �¸�����tc
//private void checkWin() {
//	this.win = this.win == 0 ? checkHori() : this.win;
//	this.win = this.win == 0 ? checkVerti() : this.win;
//	this.win = this.win == 0 ? checkDia() : this.win;
//	this.win = this.win == 0 ? checkReverse() : this.win;
//	
//	if(this.win != 0) {
//		System.out.printf("p%d�� ��!!",this.win);
//		new AlertWin(String.format("p%d�� ��!!", this.turn+""));
//	}
//}
//
//
//private int checkHori() {
//	for(int i=0; i<this.map.length; i++) {
//		int cnt = 0;
//		for(int j=0; j<this.map[i].length; j++) {
//			if(this.map[i][j].id == this.turn) cnt ++;
//			else cnt = 0;
//			if(cnt == 5) return this.turn;
//		}
//	}
//	return 0;
//}
//
//
//private int checkVerti() {
//	for(int i=0; i<this.map.length; i++) {
//		int cnt = 0;
//		for(int j=0; j<this.map[i].length; j++) {
//			if(this.map[j][i].id == this.turn ) cnt ++;
//			else cnt = 0;
//			if(cnt == 5 ) return this.turn;
//		}
//	}
//	return 0;
//}
//
//
//private int checkDia() {
//	for(int i=0; i<this.map.length-4; i++) {
//		for(int j=0; j<this.map[i].length-4; j++) {
//			if(this.map[i][j].id == this.turn) {
//				int cnt = 0;
//				for(int k=0; k<5; k++) {
//					if(this.map[i+k][j+k].id == this.turn ) cnt++;
//				}
//				if(cnt == 5 ) return this.turn;
//			}
//		}
//	}
//	return 0;
//}
//
//
//private int checkReverse() {
//	for(int i=4; i<this.map.length; i++) {
//		for(int j=0; j<this.map[i].length-4; j++) {
//			if(this.map[i][j].id == this.turn) {
//				int cnt = 0;
//				for(int k=0; k<5; k++) {
//					if(this.map[i+k][j-k].id == this.turn ) cnt++;
//				}
//				if(cnt == 5 ) return this.turn;
//			}
//		}
//	}
//	return 0;
//}
//}
//
//class AlertWin extends JFrame {
//private JLabel text = new JLabel();
//
//public AlertWin(String text) {
//	super("game clear!0");
//	setLayout(null);
//	setBounds(100,100,300,200);
//	setVisible(true);
//	
//	this.text.setBounds(0,0,200,200);
//	this.text.setText(text);
//	this.text.setHorizontalAlignment(JLabel.CENTER);
//	add(this.text);
//}
//}
}
class OmokGame extends JFrame{
	private Board board = new Board();
	
	public OmokGame() {
		super("Omok Game");
		setLayout(null);
		setBounds(50,50,900,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(board);
		
		setVisible(true);
		revalidate();
	}
}

public class OmokTc {

	public static void main(String[] args) {
		OmokGame e = new OmokGame();

	}

}