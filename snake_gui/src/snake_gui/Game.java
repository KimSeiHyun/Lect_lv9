package snake_gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Random;
class SnakePanel extends MyUtil {
	
	
	private final int MAPSIZE = 10;
	private final int SIZE = 50;
	private final int MAX = 8;
	private int dir = 0;
	private boolean item;
	private Rect[][] map;	
	private Rect[] snake;
	private JLabel titleLabel = new JLabel();
	private JButton button[] = new JButton[4];
	private boolean death;
	public SnakePanel() {
		setLayout(null);
		setBounds(0,0,900,900);
		setBackground(new Color(247, 136, 18));
		setFocusable(true);
		setVisible(true);
		revalidate();
		
		//addMouseListener(this);
		addKeyListener(this);
		setSnake();
		setMap();
		setTitleLabel();
		setButton();
	}

	private void setButton() {
		int y = 550;
		int x = 600;
		String temp[] = {"◀","▼","▶","▲"};
		for(int i=0; i<this.button.length; i++) {
			this.button[i] = new JButton();
			if(i != this.button.length-1) {
				x += 50; 
			}else {
				 y -= 50;
				 x -= 50;
			}
			this.button[i].setBounds(x,y,50,50);
			this.button[i].addMouseListener(this);
			this.button[i].addKeyListener(this);
			add(this.button[i]);
			this.button[i].setText(temp[i]);
		}
	}

	private void setTitleLabel() {
		this.titleLabel.setBounds(50,45,500,50);
		this.titleLabel.setText("SNAKE GAME");
		this.titleLabel.setFont(new Font("",1,50));
		this.titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add(this.titleLabel);
	}

	private void setSnake() {
		this.snake = new Rect[5];
		int y = 100;
		int x = 250;
		for(int i=0; i<this.snake.length; i++) {
			this.snake[i] = new Rect(x,y,SIZE,SIZE);
			x -=50;
		}
		
	}

	private void setMap() {
		this.map = new Rect[MAPSIZE][MAPSIZE];
		int y = 100;
		for(int i=0; i<this.map.length; i++) {
			int x = 50;
			for(int j=0; j<this.map[i].length; j++) {
				this.map[i][j] = new Rect(x,y,SIZE,SIZE);
				x += 50;
			}
			y += 50;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0; i<this.snake.length; i++) {
			Rect temp = this.snake[i];
			g.drawRect(temp.getX(),temp.getY(),temp.getWidth(),temp.getHeight());
			if(i == 0 ) {
				g.setColor(new Color(81, 5, 15)); // 뱀 머리색
				g.fillRect(temp.getX(),temp.getY(),temp.getWidth(),temp.getHeight());
			}else {
				g.setColor(new Color(171, 109, 35)); // 뱀 몸통색
				g.fillRect(temp.getX(),temp.getY(),temp.getWidth(),temp.getHeight());
			}
		}
		g.setColor(Color.black);
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map[i].length; j++) {
				Rect temp = this.map[i][j];
				int itemX;
				int itemY;
				if(this.item) {
					
				}
				g.drawRect(temp.getX(),temp.getY(),temp.getWidth(),temp.getHeight());
				
				
			}
		}
		
		repaint();
	}
	

	@Override
	public void mouseReleased(MouseEvent e) {
		
		//상
		if(e.getSource() == this.button[3]) this.dir = 1;
		//하
		if(e.getSource() == this.button[1]) this.dir = 2;
		//좌
		if(e.getSource() == this.button[0]) this.dir = 3;
		//우
		if(e.getSource() == this.button[2]) this.dir = 4;
		
		this.move();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyCode());
		//상 38
		if(e.getKeyCode() == 38) this.dir = 1;
		//하 40
		if(e.getKeyCode() == 40) this.dir = 2;
		//좌 37
		if(e.getKeyCode() == 37) this.dir = 3;
		//우 39
		if(e.getKeyCode() == 39) this.dir = 4;
		
		this.move();
	}
	
	private void move() {
		// 아이템을 먹으면 꼬리가 한칸 증가.
		// 같은 몸을 만나면 사망. - clear
		// 최대 8칸까지가능 
		//머리(snake[0])가 한칸 움직이고 , 나머지 꼬리들은 앞에 배열의 좌표로 움직임. - clear
		//바로 뒤로는 못움직임 ex) 몸통-몸통-몸통-머리  일때 <<왼쪽으로는 이동불가 - clear
		// 움직일시 20프로 확률로 임의의곳에 아이템 생성 . 
		
		// JButton으로 추가한곳에서 마우스이벤트를 발생시키면 실제 좌표가 아니라 버튼이 생긴 지점(0,0)부터 좌표를 가져오기때문에
		// ㄴ최상위 오브젝트로 객체를 받아 사용함
		Rect temp[] = new Rect[this.snake.length];
		for(int i=0; i<temp.length; i++) {
			temp[i] = new Rect(this.snake[i].getX() , this.snake[i].getY() , this.SIZE , this.SIZE);
		}
		//상
		if(this.dir == 1&& this.snake[0].getY() != this.map[0][0].getY()) {
			if(this.snake[0].getY()-SIZE == this.snake[1].getY()) return;
			for(int i=0; i<this.snake.length; i++) {
				if( i == 0 ) {
					this.snake[i].setY(this.snake[i].getY()-this.SIZE);
				}else {
					this.snake[i] = temp[i-1];
				}
				if( i !=0 && this.snake[0].getY() == this.snake[i].getY() && this.snake[0].getX() == this.snake[i].getX()) 
					this.death = true;
			}
			
		}
		//하
		if(this.dir == 2 && this.snake[0].getY() != this.map[9][0].getY()) {
			if(this.snake[0].getY()+SIZE == this.snake[1].getY()) return;
			for(int i=0; i<this.snake.length; i++) {
				if( i == 0 ) {
					this.snake[i].setY(this.snake[i].getY()+this.SIZE);
				}else {
					this.snake[i] = temp[i-1];
				}
				if( i !=0 && this.snake[0].getY() == this.snake[i].getY() && this.snake[0].getX() == this.snake[i].getX()) 
					this.death = true;
			}
		}
		//좌
		if(this.dir == 3 && this.snake[0].getX() != this.map[0][0].getX()) {
			if(this.snake[0].getX()-SIZE == this.snake[1].getX()) return;
			for(int i=0; i<this.snake.length; i++) {
				if( i == 0 ) {
					this.snake[i].setX(this.snake[i].getX()-this.SIZE);
				}else {
					this.snake[i] = temp[i-1];
				}
				if( i !=0 && this.snake[0].getY() == this.snake[i].getY() && this.snake[0].getX() == this.snake[i].getX()) 
					this.death = true;
			}
		}
		//우
		if(this.dir == 4 && this.snake[0].getX() != this.map[0][9].getX()) {
			if(this.snake[0].getX()+SIZE == this.snake[1].getX()) return;
			for(int i=0; i<this.snake.length; i++) {
				if( i == 0 ) {
					this.snake[i].setX(this.snake[i].getX()+this.SIZE);
				}else {
					this.snake[i] = temp[i-1];
				}
				if( i !=0 && this.snake[0].getY() == this.snake[i].getY() && this.snake[0].getX() == this.snake[i].getX()) 
					this.death = true;
			}
		}
		
		this.dir = 0;
		this.addItem();
	}
	
	private void addItem() {
		Random rn = new Random();
		int r = rn.nextInt(5);
		if(r == 0) this.item = true;
	}
}
public class Game extends JFrame{
	private SnakePanel panel = new SnakePanel();
	
	public Game() {
		super("Snake Game");
		setLayout(null);
		setBounds(300,100,900,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		
		setVisible(true);
		revalidate();
	}
}
