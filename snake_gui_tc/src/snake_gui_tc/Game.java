package snake_gui_tc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class Game extends MyUtil{
	
	private Rect[][] map = new Rect[10][10];
	
//	private int size;
//	private Rect[] snake;
	
	private ArrayList<Rect> snake = new ArrayList<>();
	private ArrayList<ArrayList<Integer>> yx = new ArrayList<>(); // {y,x} , {y,x} , {y,x}...
	
	private ArrayList<Rect> items = new ArrayList<>();
	private ArrayList<ArrayList<Integer>> itemsYx = new ArrayList<>();
	private Color head = Color.red;
	private Color body = Color.green;
	
	private int dir;
	private boolean growTail;
	public Game() {
		setLayout(null);
		setBounds(0,0,SnakeGame.SIZE , SnakeGame.SIZE);
//		setBackground(Color.orange);
		
		setMap();
		setSnake();
		setItems();
		setFocusable(true);
		addKeyListener(this);
	}

	private void setItems() {
		Random rn = new Random();
		int n = rn.nextInt(10)+5;
		
		for(int i=0; i<n; i++) {
			int y = rn.nextInt(this.map.length);
			int x = rn.nextInt(this.map.length);
			
			//check
			boolean check = false;
			for(int j=0; j<this.yx.size(); j++) {
				if(y == this.yx.get(j).get(0) && x == this.yx.get(j).get(1)) {
					check = true;
				}
			}
			if(check) i--;
			else {
				Rect temp = this.map[y][x];
				Rect item = new Rect(temp.getX()+10,temp.getY()+10,temp.getWidth()-20,temp.getHeight()-20,Color.cyan);
				this.items.add(item);
				
				// itemYx
				ArrayList<Integer> pair = new ArrayList<>();
				pair.add(y);
				pair.add(x);
				this.itemsYx.add(pair);
				
			}
		}
	}

	private void setSnake() {
		for(int i=0; i<4; i++) {
			//snake
			Rect temp = this.map[0][i]; // �����Ǿ��ִ� ���� ī����.
			Rect nemo = null;
			if(i == 0) {
				nemo = new Rect(temp.getX(), temp.getY(),temp.getWidth(),temp.getHeight(), this.head);				
			}else {
				nemo = new Rect(temp.getX(), temp.getY(),temp.getWidth(),temp.getHeight(), this.body);								
			}
			this.snake.add(nemo);
			
			// yx
			ArrayList<Integer> pair = new ArrayList<>();
			pair.add(0); // y
			pair.add(i); // x
			this.yx.add(pair);
		}
	}
	private void setMap() {
		
		int start = SnakeGame.SIZE/2-50*10/2;
		int x = start;
		int y = start;
		
		
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map[i].length; j++) {
				this.map[i][j] = new Rect(x,y,50,50,Color.gray);
				x +=50;
			}
			x = start;
			y += 50;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// snake
		for(int i=0; i<this.snake.size(); i++) {
			Rect nemo = this.snake.get(i);
			g.setColor(nemo.getC());
			g.fillRect(nemo.getX(), nemo.getY(), nemo.getWidth(), nemo.getHeight());
		}
		
		//map 
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map[i].length; j++) {
				Rect nemo = this.map[i][j];
				g.setColor(nemo.getC());
				g.drawRect(nemo.getX(), nemo.getY(), nemo.getWidth(), nemo.getHeight());
			}
		}
		
		// items
		for(int i=0; i<this.items.size(); i++) {
			Rect nemo = this.items.get(i);
			g.setColor(nemo.getC());
			g.fillRoundRect(nemo.getX(), nemo.getY(), nemo.getWidth(), nemo.getHeight(),nemo.getWidth(), nemo.getHeight());
		}
		
		repaint();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_LEFT) this.dir = 1;
		if(e.getKeyCode() == e.VK_RIGHT) this.dir = 2;
		if(e.getKeyCode() == e.VK_UP) this.dir = 3;
		if(e.getKeyCode() == e.VK_DOWN) this.dir = 4;
		move();
		System.out.println(e.getKeyCode());
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		this.dir = 0;
	}
	private void move() {
		int yy = this.yx.get(0).get(0); // �Ӹ��� y��ǥ (map)
		int xx = this.yx.get(0).get(1); // �Ӹ��� x��ǥ (map)
		if(this.dir == 1 && xx > 0 ) { // left
			xx --;
		}
		else if(this.dir == 2 && xx < this.map.length-1) { // right
			xx ++;
		}
		else if(this.dir == 3 && yy > 0) { // up
			yy --;
		}
		else if(this.dir == 4 && yy < this.map.length-1) { // down
			yy ++;
		}
		
		// check item
		for(int i=0; i<this.itemsYx.size(); i++) {
			if(yy == this.itemsYx.get(i).get(0) && xx == this.itemsYx.get(i).get(1)) {
				this.items.remove(i);
				this.itemsYx.remove(i);
				growTail = true;
			}
		}

		// check body
		boolean check = false;
		for(int i=0; i<this.yx.size(); i++) {
			if(yy == this.yx.get(i).get(0) && xx == this.yx.get(i).get(1)) {
				check =  true;
			}
		}
		
		if(!check) {
			//move
				// snake
			Rect tail = this.snake.get(this.snake.size()-1);
			ArrayList<Integer> tailYx = this.yx.get(this.yx.size()-1);
			
				for(int i=this.snake.size()-1; i>0; i--) {
					// body
					Rect temp = this.snake.get(i-1);
					temp.setC(body);
					this.snake.set(i, temp);
					// yx 
					this.yx.set(i, this.yx.get(i-1));
				}
				// new head
				Rect temp = this.map[yy][xx];
				Rect newHead = new Rect(temp.getX(),temp.getY(),temp.getWidth(),temp.getHeight(),this.head);
				this.snake.set(0, newHead);
				ArrayList<Integer> pair = new ArrayList<>();
				pair.add(yy);
				pair.add(xx);
				this.yx.set(0, pair);
				
				// tail
				if(growTail) {
					this.snake.add(tail);
					this.yx.add(tailYx);
					growTail = false;
				}
		}else {
			System.out.println("��� ... ");
			new Alert();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
