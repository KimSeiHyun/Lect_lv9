package basic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class Rect {
	private int x , y , width , height ;
	
	public Rect(int x , int y , int width , int height) {
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
class ExPanel extends MyUtil {
	
	private Rect rect = new Rect(100,100,100,100);
	private int dragX;
	private int dragY;
	private int clickX;
	private int clickY;
	private boolean check;
	public ExPanel() {
		setBounds(0,0,500,500);
		setBackground(Color.orange);
		
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		this.dragX = e.getX();
		this.dragY = e.getY();
		System.out.println("drag : " + e.getX() + " : " + e.getY());
		if(this.check) {
			this.rect.setX(this.dragX-this.rect.getWidth()/2);
			this.rect.setY(this.dragY-this.rect.getHeight()/2);
		}
		

	}
	

	
	@Override
	public void mousePressed(MouseEvent e) { // 마우스가 눌렷을때 좌표를 가져옴 .
		this.clickX = e.getX();
		this.clickY = e.getY();
		if(clickX >= this.rect.getX() && clickX < this.rect.getX() + this.rect.getWidth() && clickY >= this.rect.getY() && clickY < this.rect.getY() + this.rect.getHeight()) {
			this.check = true;
		}
			
			
	}
	@Override
	public void mouseReleased(MouseEvent e) { // 마우스가 땟을때 
		// TODO Auto-generated method stub
		super.mouseReleased(e);
		System.out.println("릭");
		this.check = false;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(this.rect.getX(), this.rect.getY(), this.rect.getWidth(), this.rect.getHeight());
		repaint();
	}
}


class ExFrame extends JFrame {
	public ExFrame() {
		super("drag");
		setLayout(null);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new ExPanel());
		
		setVisible(true);
		revalidate();
	}
}
public class ExDrag {

	public static void main(String[] args) {
		ExFrame a = new ExFrame();
	}

}
