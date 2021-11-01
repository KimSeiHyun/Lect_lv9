package basic;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyUtil extends JPanel implements ActionListener , MouseListener , KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

class Rect {
	private int x , y , width , height;
	
	public Rect(int x, int y , int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}


}
class PushPanel extends MyUtil{
	
	private int dir; // 0 정지 1 왼 2 하 3 오 4 상
	private int xx;
	private int yy;
	private boolean check;
	//사각형이 두개
	private final int SIZE = 100; 
	private Rect r1 = null;
	private Rect r2 = null;
	
	
	//방향키
	private JButton[] btn = new JButton[4];
	
	public PushPanel() {
		setLayout(null);
		setBounds(0,0,700,700);
		
		setRect();
		setBtn();
		setFocusable(true);
		addKeyListener(this);
	}

	private void setBtn() {
		
		String text[] = {"←","↓","→","↑"};
		int size = 50;
		int x = 700 - 200;
		int y = 700 - 100;
		for(int i=0; i<this.btn.length; i++) {
			this.btn[i] = new JButton();
			this.btn[i].setBounds(x,y,size,size);
			this.btn[i].setText(text[i]);
			this.btn[i].addMouseListener(this);
			add(this.btn[i]);
			x += size;
			if(i == this.btn.length-1 -1) {
				x = 700 - 200 + size;
				y -= size;
				
			}
		}
	}

	private void setRect() {
		Random rn = new Random();
		
		int x = rn.nextInt(700)+1;
		int y = rn.nextInt(700)+1;
		
		this.r1 = new Rect(x,y,SIZE,SIZE);
		
		while(true) {
			 x = rn.nextInt(700-100-200)+100;
			 y = rn.nextInt(700-100-200)+100;
			 
			 if(x >= this.r1.getX() && x < this.r1.getX() + SIZE && y >= this.r1.getY() && y<this.r1.getY() + SIZE)continue;
			 if(x+SIZE >= this.r1.getX() && x+SIZE < this.r1.getX() + SIZE && y >= this.r1.getY() && y<this.r1.getY() + SIZE)continue;
			 if(x >= this.r1.getX() && x < this.r1.getX() + SIZE && y >= this.r1.getY() && y<this.r1.getY() + SIZE)continue;
			 if(x >= this.r1.getX() && x < this.r1.getX() + SIZE && y >= this.r1.getY() && y<this.r1.getY() + SIZE)continue;
			
			 break;
		}
		
		this.r2 = new Rect(x,y,SIZE,SIZE);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == this.btn[0]) {
			System.out.println("왼");
			this.dir = 1;
		}
		else if (e.getSource() == this.btn[1]) {
			this.dir = 2;
		}
		else if (e.getSource() == this.btn[2]) {
			this.dir = 3;
		}
		else if (e.getSource() == this.btn[3]) {
			this.dir = 4;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.dir = 0;
	}

	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		update();
		// r1 , r2
		
		g.setColor(Color.black);
		g.drawRect(this.r1.getX() , this.r1.getY() , this.r1.getWidth() , this.r1.getHeight());
		
		if(check) g.setColor(Color.red);
		else g.setColor(Color.blue);
		g.setColor(Color.blue);
		g.drawRect(this.r2.getX() , this.r2.getY() , this.r2.getWidth() , this.r2.getHeight());
		
		repaint();
	}

	private void update() {
		 xx = this.r1.getX();
		 yy = this.r1.getY();
		
		
		if(this.dir == 1 && this.r1.getX() > 0) {//왼
			if(this.r1.getX() - SIZE == this.r2.getX() && this.r1.getY() >= this.r2.getY()-SIZE && this.r1.getY() < this.r2.getY()+SIZE) {
				return;
			}//return 하는이유 : r1사각형이 r2사각형을 벽에 붙였을때 안넘어가게 처리 ver.1
				//ver.2 = 260Line
			xx --;				
		}else if(this.dir == 2 && this.r1.getY() + SIZE < 700) {//하
			if(this.r1.getY() + SIZE == this.r2.getY() && this.r1.getX() >= this.r2.getX()-SIZE && this.r1.getX() < this.r2.getX()+SIZE) {
				return;
			}
			yy ++;
		}
		else if(this.dir == 3 && this.r1.getX() + SIZE < 700) {//오
			if(this.r1.getX() + SIZE == this.r2.getX() && this.r1.getY() >= this.r2.getY()-SIZE && this.r1.getY() < this.r2.getY()+SIZE) {
				return;
			}
			xx ++;
		}
		else if(this.dir == 4 && this.r1.getY() > 0) {//상
			if(this.r1.getY() - SIZE == this.r2.getY() && this.r1.getX() >= this.r2.getX()-SIZE && this.r1.getX() < this.r2.getX()+SIZE) {
				return;
			}
			yy --;
		}

		
		checkAnother();
		if(this.dir == 1) { // 좌
			if(check && this.r2.getX()+SIZE > SIZE) {
				this.r2.setX(this.r2.getX()-1);
				this.r1.setX(xx);
			}
			else if(!check && xx > 0) {
				//else if문 넣은 이유: r1사각형이 r2사각형을 벽에 붙였을때 안넘어가게 처리 ver.2
				//ver.1 = 230Line
				this.r1.setX(xx);				
			}
		}
		if(this.dir == 2) { // 하
			if(check && this.r2.getY() < 700 - SIZE ) {
				this.r2.setY(this.r2.getY()+1);
			}
			this.r1.setY(yy);
		}
		if(this.dir == 3) { // 우
			if(check && this.r2.getX() < 700 - SIZE ) {
				this.r2.setX(this.r2.getX()+1);
			}
			this.r1.setX(xx);
		}
		if(this.dir == 4) { // 상
			if(check && this.r2.getY() +SIZE > SIZE ) {
				this.r2.setY(this.r2.getY()-1);
			}
			this.r1.setY(yy);
		}
		
	}

	private void checkAnother() {
		check = false;
		if(this.dir == 1) {
			if(this.r2.getX() + SIZE == xx && this.r2.getY() >= this.r1.getY() - SIZE && this.r2.getY() < this.r1.getY()+SIZE ) 
				check = true;
		}
		if(this.dir == 2) {
			if(this.r2.getY() - SIZE == yy && this.r2.getX() >= this.r1.getX() - SIZE && this.r2.getX() < this.r1.getX() + SIZE) {
				check = true;
			}
		}
		if(this.dir == 3) {
			if(this.r2.getX() -SIZE == xx
					&& this.r2.getY() >= this.r1.getY() - SIZE && this.r2.getY() < this.r1.getY() + SIZE) {
				check = true;
			}	
		}
		if(this.dir == 4) {
			if(this.r2.getY() + SIZE == yy && this.r2.getX() >= this.r1.getX() - SIZE && this.r2.getX() < this.r1.getX() + SIZE) {
				check = true;
			}
		}
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		
		if(e.getKeyCode() == e.VK_LEFT) { // 좌 e.VK_LEFT == 37
			this.dir = 1;
		}
		if(e.getKeyCode() == e.VK_DOWN) { // 하 e.VK_DOWN == 40
			this.dir = 2;
		}
		if(e.getKeyCode() == 39) { // 우
			this.dir = 3;
		}
		if(e.getKeyCode() == 38) { // 상
			this.dir = 4;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		this.dir = 0;
	}
}

class PushFrame extends JFrame {
	
	private PushPanel Panel = new PushPanel();
	
	public PushFrame() {
		super("PushPush");
		setLayout(null);
		setBounds(50,50,700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(this.Panel);
		setVisible(true);
		revalidate();
	}
}

public class PushPushTc {

	public static void main(String[] args) {
		PushFrame a = new PushFrame();
	}

}
