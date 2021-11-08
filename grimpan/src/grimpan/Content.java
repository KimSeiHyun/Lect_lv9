package grimpan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;

public class Content extends MyUtil {
	
	
	private Nemo nemo = null; //  < drag �ϴµ��� ��ü�� �ӽ� Ȱ�� , 
	ArrayList<Nemo> nemos = new ArrayList<>(); // < mouseRealesed �� �� , �Ƚ��� �׸� ��Ƶα�  <- paintComponent() �޼ҵ忡�� �׸��� ó��
	ArrayList<Nemo> semos = new ArrayList<>();
	ArrayList<Nemo> circles = new ArrayList<>();
	
	private int x , y , startX , startY;
	private int type; // 0-�׸� , 1-���� , 2-���׶��
	private final int RECTANGLE = 0;
	private final int TRIANGLE = 1;
	private final int CIRCLE = 2;
	
	JButton close = new JButton("close");
	
	private JButton[] btns = new JButton[3];
	public Content() {
		setLayout(null);
		setBounds(0,0,900,700);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		setFocusable(true);
		addKeyListener(this);
		
		
		
		setButton();
	}

	private void setButton() {
		this.close.setBounds(750,600,100,50);
		add(this.close);
		
		//�׸� ���� ���׶��
		String text[]  = {"��","��","��"};
		int x = 30;
		int y = 50;
		for(int i=0; i<this.btns.length; i++) {
			JButton bt = new JButton();
			bt.setBounds(x , y , 50 , 50);
			bt.setText(text[i]);
			bt.addActionListener(this);
			
			add(bt);
			this.btns[i] = bt;
			
			y += 50 + 3;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// �ﰢ�� �׸���
		// darwPolygon(int [] , int[] , int)
		// (x��ǥ�� �迭 , y ��ǥ�� �迭 , ������ ����)
		int[] xxx = { 100 , 50 , 150};
		int[] yyy = { 100 , 200 ,200};
		g.setColor(Color.red);
		g.drawPolygon(xxx,yyy,3);
		if(this.nemo != null) {
			g.setColor(this.nemo.getC());
			if(this.type == this.RECTANGLE)
				g.drawRect(this.nemo.getX(), this.nemo.getY(), this.nemo.getWidth(), this.nemo.getHeight());
			else if(this.type == this.TRIANGLE) {
				int xx[] = new int[3];
				int yy[] = new int[3];
				
				xx[0] = this.nemo.getX();
				yy[0] = this.nemo.getY();
				
				xx[1] = this.nemo.getX() - this.nemo.getWidth()/2;
				yy[1] = this.nemo.getY() + this.nemo.getHeight();
				
				xx[2] = this.nemo.getX() + this.nemo.getWidth()/2;
				yy[2] = this.nemo.getY() + this.nemo.getHeight();
		
				g.drawPolygon(xx,yy,3);				
			}
			else if(this.type == this.CIRCLE) 
				g.drawRoundRect(this.nemo.getX(), this.nemo.getY(), this.nemo.getWidth(), this.nemo.getHeight(), this.nemo.getWidth(), this.nemo.getHeight());
		}
		
		
		// �׸� ��ü�迭 �׸��� 
		for(Nemo n : this.nemos) {
			g.setColor(n.getC());
			g.drawRect(n.getX(), n.getY(), n.getWidth(), n.getHeight());
		}
		for(Nemo n : this.circles) {
			g.setColor(n.getC());
			g.drawRoundRect(n.getX(), n.getY(), n.getWidth(), n.getHeight(), n.getWidth(), n.getHeight());
		}
		for(Nemo n : this.semos) {
			g.setColor(n.getC());
			int xx[] = new int[3];
			int yy[] = new int[3];
			
			xx[0] = n.getX();
			yy[0] = n.getY();
			
			xx[1] = n.getX() - n.getWidth()/2;
			yy[1] = n.getY() + n.getHeight();
			
			xx[2] = n.getX() + n.getWidth()/2;
			yy[2] = n.getY() + n.getHeight();
			g.drawPolygon(xx , yy , 3);
		}
		requestFocusInWindow();
		repaint();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
		this.startX = x; // ������ ������ ��ǥ�� �������� ����ϱ� ����.
		this.startY = y;
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		if(this.type == this.RECTANGLE) 
			this.nemos.add(nemo);
		else if(this.type == this.TRIANGLE) 
			this.semos.add(this.nemo);
		else if(this.type == this.CIRCLE) 
			this.circles.add(this.nemo);
			
		this.nemo = null;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		this.x = this.startX;
		this.y = this.startY;
		
		int xx = e.getX();
		int yy = e.getY();
		
		// �׸� ����
		int width = this.type == this.TRIANGLE ? xx - x : Math.abs(xx -x );
		int height = this.type == this.TRIANGLE ? yy - y : Math.abs(yy - y );
		
		if(this.x > xx && width > 1) {
			x = startX- width;
		}
		if(this.y > yy && height > 1) {
			y = startY - height;
		}
		
		
		this.nemo = new Nemo(x,y,width,height,Color.blue);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton target = (JButton) e.getSource();
			
			if(target == this.btns[0]) this.type = this.RECTANGLE;
			else if(target == this.btns[1]) this.type = this.TRIANGLE;
			else if(target == this.btns[2]) this.type = this.CIRCLE;
			
		}
	}
	
}
