package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import models.Map;
import models.SokobanFrame;


public class Sokoban extends MyUtil {
	//골인지점을 제일 위로 올려야함 . 8 * 9 
	private int[][] floorArr = {{0,1,7},{3,4,5,7},{1,3,4,5,7},{3,4,5,7},{1,4,5,7},{1,3,4,5},{1,2,3,4,5,6},{1,2,3,4,5,6}};
	private int[][] wallArr = {{2,3,4,5,6},{0,1,2,6},{0,6},{0,1,2,6},{0,2,3,6},{0,2,6,7},{0,7},{0,7},{0,1,2,3,4,5,6,7}};
	private int[][] goalArr = {{-1},{-1},{1},{5},{1},{4},{3,6},{4}};
	private int[][] boxArr = {{-1},{-1},{3},{4},{4},{-1},{1,3,4,5},{-1}};
	private int playerX = 2;
	private int playerY = 2;
	private Map map[][] = new Map[9][8];
	public static int goalCnt;
	public static int inputBoxCnt;
	
	private final int SIZE = 50;
	Image floorImage = new ImageIcon("images/floor.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	Image wallImage = new ImageIcon("images/wall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	Image goalImage = new ImageIcon("images/goal.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	Image playerImage = new ImageIcon("images/player.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	Image boxImage = new ImageIcon("images/box.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	Image inputBoxImage = new ImageIcon("images/inputBox.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

	private JButton resetButton = new JButton();
	
	public Sokoban () {//프레임은 가로로 +16 세로로 +38더 크게 만들어야 panel이랑 딲맞음.
		setLayout(null);
		setBounds(0,0,600,600);
		setBackground(Color.pink);
		setFocusable(true);
		addKeyListener(this);
		setMap();
		setResetButton();
		revalidate();
		
	}
	
	private void setResetButton() {
		this.resetButton.setBounds(450,400,100,50);
		this.resetButton.setText("RESET");
		this.resetButton.setFont(new Font("",1,15));
		this.resetButton.addActionListener(this);
		add(this.resetButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.resetButton) {
			this.goalCnt = 0;
			this.inputBoxCnt = 0;
			this.playerX = 2;
			this.playerY = 2;
			setMap();
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map[i].length; j++) {
				Map temp = this.map[i][j];
				g.drawImage(temp.getImage() , temp.getX() ,temp.getY(),null);
			}
		}
		requestFocusInWindow();
		repaint();
	}
	
	private void setMap() {
		int x = 0;
		int y = 0;
		for(int i=0; i<this.map.length; i++) {
			for(int j=0; j<this.map[i].length; j++) {
				this.map[i][j] = new Map(x,y,SIZE,SIZE);
				x+= 50;
			}
			x = 0;
			y+= 50;
		}
		
		for(int i=0; i<this.floorArr.length; i++) {
			for(int j=0; j<this.floorArr[i].length; j++) {
				if(this.floorArr[i][j] != -1) {
					this.map[i][this.floorArr[i][j]].setImage(floorImage);
				}
			}
		}
		for(int i=0; i<this.wallArr.length; i++) {
			for(int j=0; j<this.wallArr[i].length; j++) {
				if(this.wallArr[i][j] != -1) {
					this.map[i][this.wallArr[i][j]].setImage(wallImage);
				}
			}
		}
		for(int i=0; i<this.goalArr.length; i++) {
			for(int j=0; j<this.goalArr[i].length; j++) {
				if(this.goalArr[i][j] != -1) {
					this.goalCnt ++;
					this.map[i][this.goalArr[i][j]].setImage(goalImage);
					this.map[i][this.goalArr[i][j]].setGoal(true);
				}
			}
		}
		for(int i=0; i<this.boxArr.length; i++) {
			for(int j=0; j<this.boxArr[i].length; j++) {
				if(this.boxArr[i][j] != -1) {
					if(this.map[i][this.boxArr[i][j]].getImage() == this.goalImage) {
						this.inputBoxCnt ++;
						this.map[i][this.boxArr[i][j]].setImage(inputBoxImage);
						this.map[i][this.boxArr[i][j]].setBox(true);
					}else {
						this.map[i][this.boxArr[i][j]].setImage(boxImage);						
					}
				}
			}
		}
		
		this.map[this.playerY][this.playerX].setImage(playerImage);
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyCode());
		int y = this.playerY; 
		int x = this.playerX;
		//상 38  하 40 좌 37 우 39
		if(e.getKeyCode() == 38) y --;
		if(e.getKeyCode() == 40) y ++;
		if(e.getKeyCode() == 37) x --;
		if(e.getKeyCode() == 39) x ++;
		
		if(this.map[y][x].getImage() == this.wallImage) {
			return;
		}
		
		if(this.map[y][x].getImage() == this.goalImage) {
			this.map[this.playerY][this.playerX].setImage(floorImage);
			this.map[y][x].setGoal(true);
			this.stayPlayerCheckGoal(y, x);
			System.out.println("aa");
		}
		
		if(this.map[y][x].getImage() == this.floorImage) {
			this.stayPlayerCheckGoal(y, x);
			System.out.println("bb");
		}
		if(this.map[y][x].getImage() == this.boxImage) {
			int boxY = y;
			int boxX = x;
			if(e.getKeyCode() == 38) boxY --;
			if(e.getKeyCode() == 40) boxY ++;
			if(e.getKeyCode() == 37) boxX --;
			if(e.getKeyCode() == 39) boxX ++;
			
			if(this.map[boxY][boxX].getImage() == this.floorImage) {
				this.map[this.playerY][this.playerX].setImage(floorImage);
				this.map[boxY][boxX].setImage(this.boxImage);
				this.stayPlayerCheckGoal(y, x);
				System.out.println("cc");
			}
			else if(this.map[boxY][boxX].getImage() == this.goalImage) {
				this.map[boxY][boxX].setImage(inputBoxImage);
				this.map[y][x].setImage(playerImage);
				this.stayPlayerCheckGoal(y, x);
				this.inputBoxCnt ++;
				System.out.println("dd");
			}
			else if(this.map[boxY][boxX].getImage() == this.wallImage) return;
			else if(this.map[boxY][boxX].getImage() == this.boxImage) return;
			else if(this.map[boxY][boxX].getImage() == this.inputBoxImage) return;
		}
		if(this.map[y][x].getImage() == this.inputBoxImage) {
			int boxY = y;
			int boxX = x;
			if(e.getKeyCode() == 38) boxY --;
			if(e.getKeyCode() == 40) boxY ++;
			if(e.getKeyCode() == 37) boxX --;
			if(e.getKeyCode() == 39) boxX ++;
			
			if(this.map[boxY][boxX].getImage() == this.floorImage) {
				this.map[boxY][boxX].setImage(boxImage);
				this.map[y][x].setImage(this.playerImage);
				this.stayPlayerCheckGoal(y, x);
				System.out.println("ee");
				this.inputBoxCnt --;
			}			
			else if(this.map[boxY][boxX].getImage() == this.goalImage) {
				this.map[boxY][boxX].setImage(inputBoxImage);
				this.map[y][x].setImage(playerImage);
				this.stayPlayerCheckGoal(y, x);
				System.out.println("ff");
			}
			else if(this.map[boxY][boxX].getImage() == this.wallImage) return;
			else if(this.map[boxY][boxX].getImage() == this.boxImage) return;
			else if(this.map[boxY][boxX].getImage() == this.inputBoxImage) return;
			
			
		}
		
		
		this.playerX = x;
		this.playerY = y;
		if(Sokoban.goalCnt == Sokoban.inputBoxCnt) {
			SokobanFrame.end();
		}
	}
	
	private void stayPlayerCheckGoal(int y , int x ) {
		if(this.map[this.playerY][this.playerX].isGoal()) {
			this.map[y][x].setImage(playerImage);
			this.map[this.playerY][this.playerX].setImage(goalImage);
		}else {
			this.map[y][x].setImage(playerImage);
			this.map[this.playerY][this.playerX].setImage(floorImage);
		}
	}
}


















