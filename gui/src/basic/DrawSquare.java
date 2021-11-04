package basic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Rect2 {
	public void setWidth(int width) {
		this.width = width;
	}

	private int x , y , width , height ;
	private boolean check;
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
	public boolean getCheck() {
		return this.check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}

}

class Circle {
	private int x , y , width , height , arcWidth , arcHeight;
	
	public Circle(int x , int y , int width , int height , int arcWidth , int arcHeight) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.arcWidth = arcWidth;
		this.arcHeight = arcHeight;
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

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArcWidth() {
		return arcWidth;
	}

	public void setArcWidth(int arcWidth) {
		this.arcWidth = arcWidth;
	}

	public int getArcHeight() {
		return arcHeight;
	}

	public void setArcHeight(int arcHeight) {
		this.arcHeight = arcHeight;
	}
}

class Triangle {
	
	private int x[] = new int[3];
	private int y[] = new int[3];
	
	public Triangle(int x0 , int y0 , int x1, int y1 , int x2 , int y2) {
		this.x[0] = x0;
		this.x[1] = x1;
		this.x[2] = x2;
		this.y[0] = y0;
		this.y[1] = y1;
		this.y[2] = y2;
		
	}
	
	public int[] getArrX() {
		return this.x;
	}
	public int[] getArrY() {
		return this.y;
	}
	public int getX(int idx) {
		return x[idx];
	}
	public void setX(int idx , int x ) {
		this.x[idx] = x;
	}
	public int getY(int idx) {
		return y[idx];
	}
	public void setY(int idx , int  y) {
		this.y[idx] = y;
	}
	
	
}
class Square2 extends MyUtil {
	Rect2 rect;
	Circle circle;
	Triangle tri;
	ArrayList<Rect2> arrRect = new ArrayList<>();
	ArrayList<Circle> arrCircle = new ArrayList<>();
	ArrayList<Triangle> arrTriangle = new ArrayList<>();
	private boolean check;
	private boolean shiftCheck;
	
	private int startX;
	private int startY;
	private int dragX;
	private int dragY;
	public JButton close = new JButton();
	private JLabel text = new JLabel();
	private JButton squareButton = new JButton();
	private JButton circleButton = new JButton();
	private JButton triangleButton = new JButton();
	private JButton resetButton = new JButton();
	private int shape = 1;
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
		setSquareButton();
		setCircleButton();
		setTriangleButton();
		setResetButton();
	}

	private void setSquareButton() {
		this.squareButton.setBounds(30,30,50,50);
		this.squareButton.setText("□");
		this.squareButton.addActionListener(this);
		add(this.squareButton);
	}
	private void setCircleButton() {
		this.circleButton.setBounds(100,30,50,50);
		this.circleButton.setText("○");
		this.circleButton.addActionListener(this);
		add(this.circleButton);
	}
	private void setTriangleButton() {
		this.triangleButton.setBounds(170,30,50,50);
		this.triangleButton.setText("△");
		this.triangleButton.addActionListener(this);
		add(this.triangleButton);
	}
	
	private void setResetButton() {
		this.resetButton.setBounds(650,30,100,30);
		this.resetButton.setText("RESET");
		this.resetButton.addActionListener(this);
		add(this.resetButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.squareButton) this.shape = 1;
		if(e.getSource() == this.circleButton) this.shape = 2;
		if(e.getSource() == this.triangleButton) this.shape = 3;
		if(e.getSource() == this.resetButton) {
			this.arrRect.clear();
			rect = new Rect2(0,0,0,0);
			
			this.arrCircle.clear();
			this.circle = new Circle(0,0,0,0,0,0);
			
			this.arrTriangle.clear();
			this.tri = new Triangle(0,0,0,0,0,0);
		}
		this.check = false;
	}



	private void setClose() {
		this.close.setText("Close");
		this.close.setBounds(600,600,100,30);
		this.close.addActionListener(this);
		add(this.close);
	}


	private void setText() {
		this.text.setText("Shift off");
		this.text.setBounds(0,0,800,40);
		this.text.setFont(new Font("",1,30));
		this.text.setHorizontalAlignment(JLabel.CENTER);
		add(this.text);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.shape == 1) {
			if(this.check) {
				g.drawRect(this.rect.getX(), this.rect.getY(), this.rect.getWidth(), this.rect.getHeight());
			}
		}else if(this.shape == 2) {
			if(this.check) {
				g.drawRoundRect(this.circle.getX(), this.circle.getY(), this.circle.getWidth(), this.circle.getHeight(), this.circle.getArcWidth(), this.circle.getArcHeight());
			}
		}else if(this.shape == 3) {
			if(this.check) {
				g.drawPolygon(this.tri.getArrX(), this.tri.getArrY(), 3);
			}
		}
		for (int i = 0; i < this.arrRect.size(); i++) {
			//if(this.arrRect.get(i).getCheck()) {
				Rect2 temp = this.arrRect.get(i);
				g.drawRect(temp.getX(), temp.getY(), temp.getWidth(), temp.getHeight());
//				g.drawRect(this.arrRect.get(i).getX(),this.arrRect.get(i).getY(),this.arrRect.get(i).getWidth(),this.arrRect.get(i).getHeight());				
			//}
		}
		
		for(int i=0; i<this.arrCircle.size(); i++) {
			Circle temp = this.arrCircle.get(i);
			g.drawRoundRect(temp.getX(), temp.getY(), temp.getWidth(), temp.getHeight(), temp.getArcWidth(), temp.getArcHeight());
		}
		
		for(int i=0; i<this.arrTriangle.size(); i++) {
			Triangle temp = this.arrTriangle.get(i);
			g.drawPolygon(temp.getArrX(), temp.getArrY(), 3);
		}
	//	g.drawRect(100, 100, 100, 100); // 실험
	//	g.drawRoundRect(100, 100, 200, 200, 300, 300);
	//	g.drawRoundRect(100, 100, 100, 100, 100, 100);

		requestFocusInWindow(); // KeyListener에 대한 포커스 다시 요청.
		repaint();
	}
	

	
	@Override
	public void mouseDragged(MouseEvent e) { //마우스를 드래그
		this.dragX = e.getX();
		this.dragY = e.getY();
		
		// 정삼각형의 높이 : 루트3/2 * 임의의변
		// 루트3 
		double root = Math.sqrt(3);
		//임의의변
		double byeon = this.dragX - this.startX;
		//높이
		double temp = root/2 * byeon;
		int height = (int)temp;
		
		//누른시점에서 오른쪽위로
		if(this.shape == 1) { // 사각형 = 1
			if(this.startX < this.dragX && this.startY > this.dragY ) {
				if(!this.shiftCheck) { // 쉬프트를 누르지 않은 상태 
					this.rect = new Rect2(this.startX,this.dragY,(this.dragX - this.startX),(this.startY - this.dragY));
				}else { // 쉬프트를 누른 상태
					this.rect = new Rect2(this.startX,this.dragY,(this.startY - this.dragY),(this.startY - this.dragY));
				}
				this.check = true;
			}
			//누른시점에서 왼쪽위로
			if(this.startX > this.dragX && this.startY > this.dragY) {
				if(!this.shiftCheck) {
					this.rect = new Rect2(this.dragX,this.dragY,(this.startX - this.dragX),(this.startY - this.dragY));		
				}else {
					this.rect = new Rect2(this.startX-(this.startY - this.dragY),this.dragY,(this.startY - this.dragY),(this.startY - this.dragY));	
				}
				this.check = true;
			}
			//누른시점에서 오른쪽아래로
			if(this.startX < this.dragX && this.startY < this.dragY) {
				if(!this.shiftCheck) {
					this.rect = new Rect2(this.startX,this.startY,(this.dragX - this.startX),(this.dragY - this.startY));	
				}else {
					this.rect = new Rect2(this.startX,this.startY,(this.dragY - this.startY),(this.dragY - this.startY));								
				}
				this.check = true;
			}
			//누른시점에서 왼쪽아래로
			if(this.startX > this.dragX && this.startY < this.dragY) {
				if(!this.shiftCheck) {
					this.rect = new Rect2(this.dragX,this.startY,(this.startX - this.dragX),(this.dragY - this.startY));	
				}else {
					this.rect = new Rect2(this.startX-(this.dragY - this.startY),this.startY,(this.dragY - this.startY),(this.dragY - this.startY));								
				}
				this.check = true;
			}
			
		}
		else if (this.shape == 2) { // 동그라미 = 2;
			//누른시점에서 오른쪽위로
			if(this.startX < this.dragX && this.startY > this.dragY) {
				if(!this.shiftCheck) {
					this.circle = new Circle(this.startX,this.dragY,(this.dragX - this.startX),(this.startY - this.dragY) ,(this.dragX - this.startX) ,(this.startY - this.dragY) );					
				}else {
					this.circle = new Circle(this.startX,this.dragY,(this.startY - this.dragY),(this.startY - this.dragY),(this.startY - this.dragY),(this.startY - this.dragY));
				}
				this.check = true;					
			}
			//누른시점에서 왼쪽위로
			if(this.startX > this.dragX && this.startY > this.dragY) {
				if(!this.shiftCheck) {
					this.circle = new Circle(this.dragX,this.dragY,(this.startX - this.dragX),(this.startY - this.dragY),(this.startX - this.dragX),(this.startY - this.dragY));
				}else {
					this.circle = new Circle(this.startX-(this.startY - this.dragY),this.dragY,(this.startY - this.dragY),(this.startY - this.dragY),(this.startY - this.dragY),(this.startY - this.dragY));
				}
				this.check = true;
			}
			//누른시점에서 오른쪽아래로
			if(this.startX < this.dragX && this.startY < this.dragY) {
				if(!this.shiftCheck) {
					this.circle = new Circle(this.startX,this.startY,(this.dragX - this.startX),(this.dragY - this.startY),(this.dragX - this.startX),(this.dragY - this.startY));
				}else {
					this.circle = new Circle(this.startX,this.startY,(this.dragY - this.startY),(this.dragY - this.startY),(this.dragY - this.startY),(this.dragY - this.startY));
				}
				this.check = true;
			}
			//누른시점에서 왼쪽아래로
			if(this.startX > this.dragX && this.startY < this.dragY) {
				if(!this.shiftCheck) { 
					this.circle = new Circle(this.dragX,this.startY,(this.startX - this.dragX),(this.dragY - this.startY),(this.startX - this.dragX),(this.dragY - this.startY));
				}else {
					this.circle = new Circle(this.startX-(this.dragY - this.startY),this.startY,(this.dragY - this.startY),(this.dragY - this.startY),(this.dragY - this.startY),(this.dragY - this.startY));
				}
				this.check = true;
			}
		}
		else if(this.shape == 3) {
			//누른시점에서 오른쪽위로 
			// 제곱근 구하는 메서드 Marg.sqrt(변수);
			if(this.startX < this.dragX && this.startY > this.dragY) {
				if(!this.shiftCheck) {
					this.tri = new Triangle(this.startX,this.startY , this.dragX , this.startY, this.dragX-(this.dragX-this.startX)/2,this.dragY);
				}else {
					this.tri = new Triangle(this.startX,this.startY , this.dragX , this.startY, this.dragX-(this.dragX-this.startX)/2,this.startY - height);
				}
				this.check = true;					
			}
			//누른시점에서 왼쪽위로
			if(this.startX > this.dragX && this.startY > this.dragY) {
				if(!this.shiftCheck) {
					//x1,y1,x2,y2,x3,y3
					this.tri = new Triangle(this.startX , this.startY ,this.dragX , this.startY , this.startX - (this.startX - this.dragX)/2,this.dragY );
				}else {
					this.tri = new Triangle(this.startX , this.startY ,this.dragX , this.startY , this.startX - (this.startX - this.dragX)/2,this.startY + height );
				}
				this.check = true;
			}
			//누른시점에서 오른쪽아래로
			if(this.startX < this.dragX && this.startY < this.dragY) {
				if(!this.shiftCheck) {
					this.tri = new Triangle(this.startX , this.startY , this.dragX , this.startY ,this.dragX - (this.dragX - this.startX)/2 ,this.dragY);
				}else {
					this.tri = new Triangle(this.startX , this.startY , this.dragX , this.startY ,this.dragX - (this.dragX - this.startX)/2 ,this.startY + height);
				}
				this.check = true;
			}
			//누른시점에서 왼쪽아래로
			if(this.startX > this.dragX && this.startY < this.dragY) {
				if(!this.shiftCheck) { 
					this.tri = new Triangle(this.startX , this.startY ,this.dragX , this.startY , this.startX - (this.startX - this.dragX)/2,this.dragY );
				}else {
					this.tri = new Triangle(this.startX , this.startY ,this.dragX , this.startY , this.startX - (this.startX - this.dragX)/2,this.startY - height );
				}
				this.check = true;
			}
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
		this.startX = e.getX();
		this.startY = e.getY();
	//	System.out.println("누름 지점 x : " + e.getX());
	//	System.out.println("누름 지점 y : " + e.getY());
	}
	@Override
	public void mouseReleased(MouseEvent e) {//마우스를 땐 지점
		//누른시점에서 오른쪽위로
		if (this.shape == 1) {
			if (this.check) {
				this.arrRect.add(rect);
			}
		} else if (this.shape == 2) {
			if (this.check) {
				this.arrCircle.add(circle);
			}
		} else if (this.shape == 3) {
			if (this.check) {
				this.arrTriangle.add(tri);
			}
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {// 키보드 누르고있을때 
		if(e.getKeyCode() == 16 ) {
			this.shiftCheck = true;
			this.text.setText("Shift On");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {// 키보드 땟을때
		this.shiftCheck = false;
		this.text.setText("Shift Off");
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