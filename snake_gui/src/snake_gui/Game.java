package snake_gui;

import javax.swing.JFrame;

class SnakePanel extends MyUtil {
	
	
	private Rect[][] map;
	
	private int size;
	private Rect[] snake;
	
	public SnakePanel() {
		
	}
}
public class Game extends JFrame{
	private SnakePanel panel = new SnakePanel();
	
	public Game() {
		super("Snake Game");
		setLayout(null);
		setBounds(50,50,700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		revalidate();
	}
}
