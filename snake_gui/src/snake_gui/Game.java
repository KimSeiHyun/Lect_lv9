package snake_gui;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
class SnakePanel extends MyUtil {
	
	
	private final int MAPSIZE = 10;
	private final int SIZE = 50;
	private Rect[][] map;	
	private Rect[] snake;
	
	public SnakePanel() {
		setLayout(null);
		setBounds(0,0,900,900);
		setBackground(Color.pink);
		setFocusable(true);
		setVisible(true);
		revalidate();
		
		setMap();
	}

	private void setMap() {
		this.map = new Rect[MAPSIZE][MAPSIZE];
		int y = 100;
		for(int i=0; i<this.map.length; i++) {
			int x = 300;
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
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map[i].length; j++) {
				Rect temp = this.map[i][j];
				g.drawRect(temp.getX(),temp.getY(),temp.getWidth(),temp.getHeight());
			}
		}
	}
}
public class Game extends JFrame{
	private SnakePanel panel = new SnakePanel();
	
	public Game() {
		super("Snake Game");
		setLayout(null);
		setBounds(50,50,900,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
		revalidate();
	}
}
