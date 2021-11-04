package basic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Rect2 {
	public void setWidth(int width) {
		this.width = width;
	}

	private int x , y , width , height ;
	
	public Rect2(int x , int y , int width , int height) {
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

	public void setHeight(int height) {
		this.height = height;
	}

}

class Square2 extends MyUtil {
	Rect2 rect;
	private boolean check;
	private boolean squareCheck;
	private int startX;
	private int startY;
	private int dragX;
	private int dragY;
	public JButton close = new JButton();
	private JLabel text = new JLabel();
	
	public Square2() {
		setLayout(null);
		setBounds(0,0,800,800);
		setBackground(Color.pink);
		setVisible(true);
		addKeyListener(this);
		setFocusable(true);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setText();
		setClose();
		
	}
	
	private void setClose() {
		this.close.setText("Close");
		this.close.setBounds(600,600,100,30);
		this.close.addActionListener(this);
		add(this.close);
	}


	private void setText() {
		this.text.setText("사각형을 그리기 전");
		this.text.setBounds(0,0,800,40);
		this.text.setFont(new Font("",1,30));
		this.text.setHorizontalAlignment(JLabel.CENTER);
		add(this.text);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.check) {
			g.drawRect(this.rect.getX(), this.rect.getY(), this.rect.getWidth(), this.rect.getHeight());
		}
		
		requestFocusInWindow(); // KeyListener에 대한 포커스 다시 요청.
		repaint();
	}
	

	
	@Override
	public void mouseDragged(MouseEvent e) { //마우스를 드래그
		this.dragX = e.getX();
		this.dragY = e.getY();
		//누른시점에서 오른쪽위로
		if(this.startX < this.dragX && this.startY > this.dragY ) {
			if(!this.squareCheck) { // 쉬프트를 누르지 않은 상태 
				this.rect = new Rect2(this.startX,this.dragY,(this.dragX - this.startX),(this.startY - this.dragY));
				this.text.setText("오른쪽위로 직사각형 그리기");
			}else { // 쉬프트를 누른 상태
				this.rect = new Rect2(this.startX,this.dragY,(this.startY - this.dragY),(this.startY - this.dragY));
				this.text.setText("오른쪽위로 정사각형 그리기");
			}
			this.check = true;
		}
		//누른시점에서 왼쪽위로
		if(this.startX > this.dragX && this.startY > this.dragY) {
			if(!this.squareCheck) {
				this.rect = new Rect2(this.dragX,this.dragY,(this.startX - this.dragX),(this.startY - this.dragY));		
				this.text.setText("왼쪽위로 직사각형 그리기");
			}else {
				this.rect = new Rect2(this.startX-(this.startY - this.dragY),this.dragY,(this.startY - this.dragY),(this.startY - this.dragY));	
				this.text.setText("왼쪽위로 정사각형 그리기");
			}
			this.check = true;
		}
		//누른시점에서 오른쪽아래로
		if(this.startX < this.dragX && this.startY < this.dragY) {
			if(!this.squareCheck) {
				this.rect = new Rect2(this.startX,this.startY,(this.dragX - this.startX),(this.dragY - this.startY));	
				this.text.setText("오른쪽아래로 직사각형 그리기");
			}else {
				this.rect = new Rect2(this.startX,this.startY,(this.dragY - this.startY),(this.dragY - this.startY));								
				this.text.setText("오른쪽아래로 정사각형 그리기");
			}
			this.check = true;
		}
		//누른시점에서 왼쪽아래로
		if(this.startX > this.dragX && this.startY < this.dragY) {
			if(!this.squareCheck) {
				this.rect = new Rect2(this.dragX,this.startY,(this.startX - this.dragX),(this.dragY - this.startY));	
				this.text.setText("왼쪽아래로 직사각형 그리기");
			}else {
				this.rect = new Rect2(this.startX-(this.dragY - this.startY),this.startY,(this.dragY - this.startY),(this.dragY - this.startY));								
				this.text.setText("왼쪽아래로 정사각형 그리기");
			}
			this.check = true;
		}
		//체크용 
//			System.out.println("그린 사각형의 x : " + this.startX);
//			System.out.println("그린 사각형의 y : " + this.dragY);
//			System.out.println("그린 사각형의 가로 : " + (this.dragX - this.startX));
//			System.out.println("그린 사각형의 세로 : " + (this.startY - this.dragY));
	}
	@Override
	public void mousePressed(MouseEvent e) { //마우스를 누른 지점
		this.check = false;
		this.squareCheck = false;
		this.startX = e.getX();
		this.startY = e.getY();
		System.out.println("aa");
	}
	@Override
	public void mouseReleased(MouseEvent e) {//마우스를 땐 지점

		System.out.printf("누른지점 (%d , %d)\n",this.startX , this.startY);
		System.out.printf("땐지점  (%d , %d)\n",e.getX() , e.getY());
	}
	@Override
	public void keyPressed(KeyEvent e) {// 키보드 누르고있을때 
		if(e.getKeyCode() == 16 ) {
			this.squareCheck = true;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {// 키보드 땟을때
		this.squareCheck = false;
	}
}
class Draw extends JFrame implements ActionListener{
	
	
	Square2 b = new Square2();
	
	
	public Draw() {
		super("Draw");
		setLayout(null);
		setBounds(100,100,800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		add(b);
		revalidate();
		b.close.addActionListener(this);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b.close) {
			this.dispose();
		}
		
	}
}
public class DrawSquare {

	public static void main(String[] args) {
		Draw a = new Draw();
	}

}
