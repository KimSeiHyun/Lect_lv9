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
		this.text.setText("�簢���� �׸��� ��");
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
		
		requestFocusInWindow(); // KeyListener�� ���� ��Ŀ�� �ٽ� ��û.
		repaint();
	}
	

	
	@Override
	public void mouseDragged(MouseEvent e) { //���콺�� �巡��
		this.dragX = e.getX();
		this.dragY = e.getY();
		//������������ ����������
		if(this.startX < this.dragX && this.startY > this.dragY ) {
			if(!this.squareCheck) { // ����Ʈ�� ������ ���� ���� 
				this.rect = new Rect2(this.startX,this.dragY,(this.dragX - this.startX),(this.startY - this.dragY));
				this.text.setText("���������� ���簢�� �׸���");
			}else { // ����Ʈ�� ���� ����
				this.rect = new Rect2(this.startX,this.dragY,(this.startY - this.dragY),(this.startY - this.dragY));
				this.text.setText("���������� ���簢�� �׸���");
			}
			this.check = true;
		}
		//������������ ��������
		if(this.startX > this.dragX && this.startY > this.dragY) {
			if(!this.squareCheck) {
				this.rect = new Rect2(this.dragX,this.dragY,(this.startX - this.dragX),(this.startY - this.dragY));		
				this.text.setText("�������� ���簢�� �׸���");
			}else {
				this.rect = new Rect2(this.startX-(this.startY - this.dragY),this.dragY,(this.startY - this.dragY),(this.startY - this.dragY));	
				this.text.setText("�������� ���簢�� �׸���");
			}
			this.check = true;
		}
		//������������ �����ʾƷ���
		if(this.startX < this.dragX && this.startY < this.dragY) {
			if(!this.squareCheck) {
				this.rect = new Rect2(this.startX,this.startY,(this.dragX - this.startX),(this.dragY - this.startY));	
				this.text.setText("�����ʾƷ��� ���簢�� �׸���");
			}else {
				this.rect = new Rect2(this.startX,this.startY,(this.dragY - this.startY),(this.dragY - this.startY));								
				this.text.setText("�����ʾƷ��� ���簢�� �׸���");
			}
			this.check = true;
		}
		//������������ ���ʾƷ���
		if(this.startX > this.dragX && this.startY < this.dragY) {
			if(!this.squareCheck) {
				this.rect = new Rect2(this.dragX,this.startY,(this.startX - this.dragX),(this.dragY - this.startY));	
				this.text.setText("���ʾƷ��� ���簢�� �׸���");
			}else {
				this.rect = new Rect2(this.startX-(this.dragY - this.startY),this.startY,(this.dragY - this.startY),(this.dragY - this.startY));								
				this.text.setText("���ʾƷ��� ���簢�� �׸���");
			}
			this.check = true;
		}
		//üũ�� 
//			System.out.println("�׸� �簢���� x : " + this.startX);
//			System.out.println("�׸� �簢���� y : " + this.dragY);
//			System.out.println("�׸� �簢���� ���� : " + (this.dragX - this.startX));
//			System.out.println("�׸� �簢���� ���� : " + (this.startY - this.dragY));
	}
	@Override
	public void mousePressed(MouseEvent e) { //���콺�� ���� ����
		this.check = false;
		this.squareCheck = false;
		this.startX = e.getX();
		this.startY = e.getY();
		System.out.println("aa");
	}
	@Override
	public void mouseReleased(MouseEvent e) {//���콺�� �� ����

		System.out.printf("�������� (%d , %d)\n",this.startX , this.startY);
		System.out.printf("������  (%d , %d)\n",e.getX() , e.getY());
	}
	@Override
	public void keyPressed(KeyEvent e) {// Ű���� ������������ 
		if(e.getKeyCode() == 16 ) {
			this.squareCheck = true;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {// Ű���� ������
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
