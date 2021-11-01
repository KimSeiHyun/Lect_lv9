package basic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MenuKeyListener;

class Square {
	int x , y , width , height;
	
	public Square(int x , int y , int width , int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}

class Nemo2 {
	int x , y , width , height;
	
	public Nemo2(int x , int y , int width , int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
class ClickNemo extends JPanel implements MouseListener , KeyListener{
	

	Nemo2 nemo[] = new Nemo2[4];
	Square square[] = new Square[2];
	public ClickNemo() {
		setLayout(null);
		setBounds(0,0,1200,800);
		setBackground(Color.pink);
		setFocusable(true);
		addKeyListener(this);
		addMouseListener(this);
		setNemo();
	}

	private void setNemo() {
			this.nemo[0] = new Nemo2(1000,500,50,50);
			this.nemo[1] = new Nemo2(950,550,50,50);
			this.nemo[2] = new Nemo2(1000,550,50,50);
			this.nemo[3] = new Nemo2(1050,550,50,50);
			this.square[0] = new Square(150,150,100,100);
			this.square[1] = new Square(280,150,100,100);
	}
	
	@Override
	protected void paintComponent(Graphics g) { // 그리기 메소드 
		super.paintComponent(g);
		
		//방향키 

			for(int i=0; i<this.nemo.length; i++) {
				g.drawRect(nemo[i].x, nemo[i].y, nemo[i].width, nemo[i].height);
				g.setFont(new Font("",1,15));
				if(i == 0) g.drawString("up", nemo[i].x+10, nemo[i].y+30);
				if(i == 1) g.drawString("left", nemo[i].x+10, nemo[i].y+30);
				if(i == 2) g.drawString("down", nemo[i].x+10, nemo[i].y+30);
				if(i == 3) g.drawString("right", nemo[i].x+10, nemo[i].y+30);
			}
			

		//사각형
		for(int i=0; i<this.square.length; i++) {
			g.drawRect(this.square[i].x, this.square[i].y, this.square[i].width, this.square[i].height);
		}
		
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) { //클릭! 발생시
		
	}

	@Override
	public void mousePressed(MouseEvent e) { //클(누르고있는상태)
		//클릭이 발생한 지점의 좌표를 가져온다.
		int x = e.getX();
		int y = e.getY();
		
		if(x >= this.nemo[0].x && x <this.nemo[0].x+this.nemo[0].width && y >= this.nemo[0].y && y < this.nemo[0].y+this.nemo[0].height ) {
			System.out.println("업");
			this.square[0].y -=2;
			if(this.square[0].y - this.square[0].height == this.square[1].y 
					&& this.square[0].x >= this.square[1].x-this.square[1].width 
					&& this.square[0].x < this.square[1].x+this.square[1].width  ) {
				this.square[1].y-=2;
			}
		}
		if(x >= this.nemo[1].x && x <this.nemo[1].x+this.nemo[1].width && y >= this.nemo[1].y && y < this.nemo[1].y+this.nemo[1].height ) {
			System.out.println("left");
			this.square[0].x -=2;
			if(this.square[0].x - this.square[0].width == this.square[1].x 
					&& this.square[0].y >= this.square[1].y-this.square[1].height 
					&& this.square[0].y < this.square[1].y+this.square[1].height  ) {
				this.square[1].x-=2;
			}
		}
		if(x >= this.nemo[2].x && x <this.nemo[2].x+this.nemo[2].width && y >= this.nemo[2].y && y < this.nemo[2].y+this.nemo[2].height ) {
			System.out.println("down");
			this.square[0].y +=2;
			if(this.square[0].y + this.square[0].height == this.square[1].y 
					&& this.square[0].x >= this.square[1].x-this.square[1].width 
					&& this.square[0].x < this.square[1].x+this.square[1].width  ) {
				this.square[1].y+=2;
			}
		}
		if(x >= this.nemo[3].x && x <this.nemo[3].x+this.nemo[3].width && y >= this.nemo[3].y && y < this.nemo[3].y+this.nemo[3].height ) {
			System.out.println("right");
			this.square[0].x +=2;
			if(this.square[0].x + this.square[0].width == this.square[1].x 
					&& this.square[0].y >= this.square[1].y-this.square[1].height 
					&& this.square[0].y < this.square[1].y+this.square[1].height  ) {
				this.square[1].x+=2;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) { //릭!(땐상태)
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {// listener가 add된 범위 안으로 들어오면 작동

	}

	@Override
	public void mouseExited(MouseEvent e) {// listener가 add된 범위 밖으로 나가면 작동
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		//상 하 좌 우  38  40  37  39
		if(e.getKeyCode() == 38) {
			System.out.println("업");
			this.square[0].y -=2;
			if(this.square[0].y - this.square[0].height == this.square[1].y 
					&& this.square[0].x >= this.square[1].x-this.square[1].width 
					&& this.square[0].x < this.square[1].x+this.square[1].width  ) {
				this.square[1].y-=2;
			}
		}
		if(e.getKeyCode() == 37) {
			System.out.println("left");
			this.square[0].x -=2;
			if(this.square[0].x - this.square[0].width == this.square[1].x 
					&& this.square[0].y >= this.square[1].y-this.square[1].height 
					&& this.square[0].y < this.square[1].y+this.square[1].height  ) {
				this.square[1].x-=2;
			}
		}
		if(e.getKeyCode() == 40) {
			System.out.println("down");
			this.square[0].y +=2;
			if(this.square[0].y + this.square[0].height == this.square[1].y 
					&& this.square[0].x >= this.square[1].x-this.square[1].width 
					&& this.square[0].x < this.square[1].x+this.square[1].width  ) {
				this.square[1].y+=2;
			}
		}
		if(e.getKeyCode() == 39) {
			System.out.println("right");
			this.square[0].x +=2;
			if(this.square[0].x + this.square[0].width == this.square[1].x 
					&& this.square[0].y >= this.square[1].y-this.square[1].height 
					&& this.square[0].y < this.square[1].y+this.square[1].height  ) {
				this.square[1].x+=2;
			}
		}
		
	}
	

	

}
class PushGame extends JFrame {
	
	ClickNemo click = new ClickNemo();
	public PushGame() {
		super("PushPush");
		setLayout(null);
		setBounds(100,100,1200,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(click);
		
		setVisible(true);
		revalidate();
	}
}

public class PushPush {

	public static void main(String[] args) {
		PushGame p = new PushGame();
	}

}
