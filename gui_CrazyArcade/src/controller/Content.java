package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import models.CrazyArcade;
import models.Map;

public class Content extends MyUtil{
	private Random random = new Random();
	private int bombMax = 10;
	private int bombCnt = 0;
	private int grassArr[][] = {{1,2,3,4,5,6,7,8,9,10},{0,2,4,6,8,10},{0,1,2,3,4,5,6,7,8,9,10},{0,2,4,6,8,10},{0,1,2,3,4,5,6,7,8,9,10},{0,2,4,6,8,10},{0,1,2,3,4,5,6,7,8,9,10},{0,2,4,6,8,10},{0,1,2,3,4,5,6,7,8,9,10},{0,2,4,6,8,10},{0,1,2,3,4,5,6,7,8,9,10}};
	private int playerY = 0;
	private int playerX = 0;
	private boolean playerCheck;
	private boolean deathCheck;
	private final int MAPSIZE = 11;
	private final int IMAGESIZE = 50;
	private Map map[][] = new Map[MAPSIZE][MAPSIZE];
	private ArrayList<Map> bombArr = new ArrayList<>();
	
	private ArrayList<Map> chainBombIdxArr = new ArrayList<>();
	
	private Image bazziImage = new ImageIcon("images/bazzi.jpg").getImage().getScaledInstance(IMAGESIZE, IMAGESIZE, Image.SCALE_SMOOTH);
	private Image bombImage = new ImageIcon("images/bomb.jpg").getImage().getScaledInstance(IMAGESIZE, IMAGESIZE, Image.SCALE_SMOOTH);
	private Image brickImage = new ImageIcon("images/brick.jpg").getImage().getScaledInstance(IMAGESIZE, IMAGESIZE, Image.SCALE_SMOOTH);
	private Image grassImage = new ImageIcon("images/grass.jpg").getImage().getScaledInstance(IMAGESIZE, IMAGESIZE, Image.SCALE_SMOOTH);
	private Image itemImage = new ImageIcon("images/item.jpg").getImage().getScaledInstance(IMAGESIZE, IMAGESIZE, Image.SCALE_SMOOTH);
	
	private JLabel bombCntText = new JLabel();
	private JButton resetButton = new JButton();
	
	public Content() {
		setLayout(null);
		setBounds(0,0,800,800);
		setBackground(Color.pink);
		setFocusable(true);
		addKeyListener(this);
		setMap();
		setBombCntText();
		setResetButton();
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0; i<this.MAPSIZE; i++) {
			for(int j=0; j<this.MAPSIZE; j++) {
				g.drawImage(this.map[i][j].getImage(),this.map[i][j].getX() , this.map[i][j].getY() , null);
			}
		} 
		
		
		requestFocusInWindow();
		repaint();
	}//paintComponent();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.resetButton) {
			this.bombArr.clear();
			this.deathCheck = false;
			this.playerX = 0;
			this.playerY = 0;
			this.bombCnt = 0;
			this.bombMax = 3;
			this.bombCntText.setText(String.format("<html>BombCnt : %d<br>BombMaxCnt : %d<br><br>SpaceBar : ????????<br>A : ????</html>", this.bombCnt , this.bombMax));
			this.setMap();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// ??38 ??40 ??37 ??39 ??????????32 A65
		int y = this.playerY;
		int x = this.playerX;
		if(e.getKeyCode() == 38) y --;
		if(e.getKeyCode() == 40) y ++;
		if(e.getKeyCode() == 37) x --;
		if(e.getKeyCode() == 39) x ++;
		
		if(x == 11 || x == -1 || y == 11 || y == -1) return; //?????????? ????
		if(this.map[y][x].getImage() == this.brickImage) return; //???? ?????? ????
		if(this.map[y][x].getImage() == this.bombImage) return; // ?????? ?????? ????
		if(this.map[y][x].getImage() == this.grassImage) { // ?????? ???????? 
			if(this.map[this.playerY][this.playerX].isBazziCheck()) { // ?????? ???????? ????????
				this.map[y][x].setImage(bazziImage);
				this.map[this.playerY][this.playerX].setImage(bombImage);
				this.playerCheck = false;
			}else {													//?????? ???????? ???? ????????
				this.map[y][x].setImage(bazziImage);
				this.map[this.playerY][this.playerX].setImage(grassImage);				
			}
		}
		if(this.map[y][x].getImage() == this.itemImage) { // ???????? ???????? 
			this.map[y][x].setImage(bazziImage);
			this.map[this.playerY][this.playerX].setImage(grassImage);
			if(this.bombMax < 6 ) { // ???????? ???? 7?????? . 
				this.bombMax ++;
			}
			this.bombCntText.setText(String.format("<html>BombCnt : %d<br>BombMaxCnt : %d<br><br>SpaceBar : ????????<br>A : ????</html>", this.bombCnt , this.bombMax));
		}
		this.playerX = x;
		this.playerY = y;
		
		if(e.getKeyCode() == 32 && this.bombCnt < this.bombMax) { // ?????? ?????????? 
			this.map[this.playerY][this.playerX].setImage(bombImage);
			this.map[this.playerY][this.playerX].setBazziCheck(true);
			this.bombCnt ++;
			this.bombArr.add(new Map(x,y));
			this.playerCheck = true;
			this.bombCntText.setText(String.format("<html>BombCnt : %d<br>BombMaxCnt : %d<br><br>SpaceBar : ????????<br>A : ????</html>", this.bombCnt , this.bombMax));
		}
		if(e.getKeyCode() == 32) { // ???? ???? ?????? 
			for(int i=0; i<this.bombArr.size(); i++) {
			}
		}
		
		if(e.getKeyCode() == 65 && !this.playerCheck && this.bombCnt > 0) {
				Map tempBomb = this.bombArr.get(0);
				int tempY = -1;
				int tempX = -1;
				int idx = -1;
				for(int i=-1; i<=1; i++) {
					//		System.out.println("tempBomb y : " +tempBomb.getY());
					//		System.out.println("tempBomb x : " +tempBomb.getX());
					if( i != 0 && tempBomb.getX()+i >=0 && tempBomb.getX()+i < 11) { //?????? ????????
						if(this.map[tempBomb.getY()][tempBomb.getX()+i].getImage() == this.bazziImage) this.deathCheck = true;
						if(this.map[tempBomb.getY()][tempBomb.getX()+i].getImage() == this.itemImage) {
							this.map[tempBomb.getY()][tempBomb.getX()+i].setImage(grassImage);
						}
						if(this.map[tempBomb.getY()][tempBomb.getX()+i].getImage() == this.brickImage) {
							int rNum = this.random.nextInt(5);
							if(rNum == 0) this.map[tempBomb.getY()][tempBomb.getX()+i].setImage(itemImage);
							else this.map[tempBomb.getY()][tempBomb.getX()+i].setImage(grassImage);
						}
						if(this.map[tempBomb.getY()][tempBomb.getX()+i].getImage() == this.bombImage) { //???????? ?????? ???????? ?????? ?????? . 
							tempY = tempBomb.getY();
							tempX = tempBomb.getX()+i;			
							this.chainBombIdxArr.add(new Map(tempX , tempY));
						}
					}
					
					if( i != 0 && tempBomb.getY()+i >= 0 && tempBomb.getY() +i < 11) { //?????? ????????
						if(this.map[tempBomb.getY()+i][tempBomb.getX()].getImage() == this.bazziImage) this.deathCheck = true;
						if(this.map[tempBomb.getY()+i][tempBomb.getX()].getImage() == this.itemImage) {
							this.map[tempBomb.getY()+i][tempBomb.getX()].setImage(grassImage);
						}
						if(this.map[tempBomb.getY()+i][tempBomb.getX()].getImage() == this.brickImage) {
							int rNum = this.random.nextInt(5);
							if(rNum == 0) this.map[tempBomb.getY()+i][tempBomb.getX()].setImage(itemImage);
							else this.map[tempBomb.getY()+i][tempBomb.getX()].setImage(grassImage);
						}
						if(this.map[tempBomb.getY()+i][tempBomb.getX()].getImage() == this.bombImage) {
							tempY = tempBomb.getY()+i;
							tempX = tempBomb.getX();			
							this.chainBombIdxArr.add(new Map(tempX , tempY));
						}
					}
				}
				this.map[this.bombArr.get(0).getY()][this.bombArr.get(0).getX()].setImage(grassImage);
				this.map[this.bombArr.get(0).getY()][this.bombArr.get(0).getX()].setBazziCheck(false);
				this.bombArr.remove(0);
				this.bombCnt --;
				this.bombCntText.setText(String.format("<html>BombCnt : %d<br>BombMaxCnt : %d<br><br>SpaceBar : ????????<br>A : ????</html>", this.bombCnt , this.bombMax));
					while(this.chainBombIdxArr.size() != 0) {
						//chainBombIdxArr ?? ?????????? ?????????? ?????? ??????(x,y).
						//?????? chainBombIdxArr?? ???? ??????  bombArr?? ???? ?????? ???????? ?????? 
						//chainBombIdxArr?? bombArr?? ???? remove???????? . 
						for(int a=0; a<this.bombArr.size(); a++) {
							for(int b=0; b<this.chainBombIdxArr.size(); b++) {
								System.out.println("bombarr  : " + this.bombArr.size() );
								System.out.println("chainarr  : " + this.chainBombIdxArr.size() );
								System.out.println("a : " + a);
								System.out.println("b : " + b);
								if(this.bombArr.get(a).getX() == this.chainBombIdxArr.get(b).getX() && this.bombArr.get(a).getY() == this.chainBombIdxArr.get(b).getY()) {
									Map tempBomb2 = this.bombArr.get(a);
									tempY = -1;
									tempX = -1;
									idx = -1;
									for(int i=-1; i<=1; i++) {
										if( i != 0 && tempBomb2.getX()+i >=0 && tempBomb2.getX()+i < 11) { //?????? ????????
											if(this.map[tempBomb2.getY()][tempBomb2.getX()+i].getImage() == this.bazziImage) this.deathCheck = true;
											if(this.map[tempBomb2.getY()][tempBomb2.getX()+i].getImage() == this.itemImage) {
												this.map[tempBomb2.getY()][tempBomb2.getX()+i].setImage(grassImage);
											}
											if(this.map[tempBomb2.getY()][tempBomb2.getX()+i].getImage() == this.brickImage) {
												int rNum = this.random.nextInt(5);
												if(rNum == 0) this.map[tempBomb2.getY()][tempBomb2.getX()+i].setImage(itemImage);
												else this.map[tempBomb2.getY()][tempBomb2.getX()+i].setImage(grassImage);
											}
											if(this.map[tempBomb2.getY()][tempBomb2.getX()+i].getImage() == this.bombImage) { //???????? ?????? ???????? ?????? ?????? . 
												tempY = tempBomb2.getY();
												tempX = tempBomb2.getX()+i;			
												this.chainBombIdxArr.add(new Map(tempX , tempY));
											}
										}
										
										if( i != 0 && tempBomb2.getY()+i >= 0 && tempBomb2.getY() +i < 11) { //?????? ????????
											if(this.map[tempBomb2.getY()+i][tempBomb2.getX()].getImage() == this.bazziImage) this.deathCheck = true;
											if(this.map[tempBomb2.getY()+i][tempBomb2.getX()].getImage() == this.itemImage) {
												this.map[tempBomb2.getY()+i][tempBomb2.getX()].setImage(grassImage);
											}
											if(this.map[tempBomb2.getY()+i][tempBomb2.getX()].getImage() == this.brickImage) {
												int rNum = this.random.nextInt(5);
												if(rNum == 0) this.map[tempBomb2.getY()+i][tempBomb2.getX()].setImage(itemImage);
												else this.map[tempBomb2.getY()+i][tempBomb2.getX()].setImage(grassImage);
											}
											if(this.map[tempBomb2.getY()+i][tempBomb2.getX()].getImage() == this.bombImage) {
												tempY = tempBomb2.getY()+i;
												tempX = tempBomb2.getX();			
												this.chainBombIdxArr.add(new Map(tempX , tempY));
											}
										}
									}
									
									this.map[this.bombArr.get(a).getY()][this.bombArr.get(a).getX()].setImage(grassImage);
									this.map[this.bombArr.get(a).getY()][this.bombArr.get(a).getX()].setBazziCheck(false);
									this.bombArr.remove(a);
									this.chainBombIdxArr.remove(b);
									this.bombCnt --;
									this.bombCntText.setText(String.format("<html>BombCnt : %d<br>BombMaxCnt : %d<br><br>SpaceBar : ????????<br>A : ????</html>", this.bombCnt , this.bombMax));
									break;
								}
							}
						}
					}

			
				
				
			}
		if(this.deathCheck) {
			CrazyArcade.end();
		}
			
			
			
			
			
			
			
//			boolean check = false;
//			while(!check && this.bombCnt != 0) {
//				Map tempBomb = this.bombArr.get(0);
//				int tempY = -1;
//				int tempX = -1;
//				int idx = -1;
//				for(int i=-1; i<=1; i++) {
//					//		System.out.println("tempBomb y : " +tempBomb.getY());
//					//		System.out.println("tempBomb x : " +tempBomb.getX());
//					if( i != 0 && tempBomb.getX()+i >=0 && tempBomb.getX()+i < 11) { //?????? ????????
//						if(this.map[tempBomb.getY()][tempBomb.getX()+i].getImage() == this.bazziImage) this.deathCheck = true;
//						if(this.map[tempBomb.getY()][tempBomb.getX()+i].getImage() == this.itemImage) {
//							this.map[tempBomb.getY()][tempBomb.getX()+i].setImage(grassImage);
//						}
//						if(this.map[tempBomb.getY()][tempBomb.getX()+i].getImage() == this.brickImage) {
//							int rNum = this.random.nextInt(5);
//							if(rNum == 0) this.map[tempBomb.getY()][tempBomb.getX()+i].setImage(itemImage);
//							else this.map[tempBomb.getY()][tempBomb.getX()+i].setImage(grassImage);
//						}
//						if(this.map[tempBomb.getY()][tempBomb.getX()+i].getImage() == this.bombImage) { //???????? ?????? ???????? ?????? ?????? . 
//							check = true;
//							tempY = tempBomb.getY();
//							tempX = tempBomb.getX()+i;			
//						}
//					}
//					
//					if( i != 0 && tempBomb.getY()+i >= 0 && tempBomb.getY() +i < 11) { //?????? ????????
//						if(this.map[tempBomb.getY()+i][tempBomb.getX()].getImage() == this.bazziImage) this.deathCheck = true;
//						if(this.map[tempBomb.getY()+i][tempBomb.getX()].getImage() == this.itemImage) {
//							this.map[tempBomb.getY()+i][tempBomb.getX()].setImage(grassImage);
//						}
//						if(this.map[tempBomb.getY()+i][tempBomb.getX()].getImage() == this.brickImage) {
//							int rNum = this.random.nextInt(5);
//							if(rNum == 0) this.map[tempBomb.getY()+i][tempBomb.getX()].setImage(itemImage);
//							else this.map[tempBomb.getY()+i][tempBomb.getX()].setImage(grassImage);
//						}
//						if(this.map[tempBomb.getY()+i][tempBomb.getX()].getImage() == this.bombImage) {
//							check = true;
//							tempY = tempBomb.getY()+i;
//							tempX = tempBomb.getX();			
//						}
//					}
//				}
//				this.map[this.bombArr.get(0).getY()][this.bombArr.get(0).getX()].setImage(grassImage);
//				this.map[this.bombArr.get(0).getY()][this.bombArr.get(0).getX()].setBazziCheck(false);
//				
//				if(!check) {
//					this.bombArr.remove(0);
//					this.bombCnt --;
//					this.bombCntText.setText(String.format("<html>BombCnt : %d<br>BombMaxCnt : %d<br><br>SpaceBar : ????????<br>A : ????</html>", this.bombCnt , this.bombMax));
//					break;
//				}
//				else {
//					for(int i=0; i<this.bombArr.size(); i++) {
//						if(this.bombArr.get(i).getX() == tempX && this.bombArr.get(i).getY() == tempY) { //???? ?????? ?????? ???????? ???????? ????. 
//							idx = i;
//						}
//					}
//					Map temp2 = this.bombArr.get(0); // ???? ???????? ???? ?????? ?????? 0???????? ?????????? ???????? ?????? while?? ???? ????(???? ?????? ??????????)
//					this.bombArr.set(0, this.bombArr.get(idx));
//					this.bombArr.set(idx, temp2);
//					this.bombArr.remove(idx);
//					
//					this.bombCnt --;
//					this.bombCntText.setText(String.format("<html>BombCnt : %d<br>BombMaxCnt : %d<br><br>SpaceBar : ????????<br>A : ????</html>", this.bombCnt , this.bombMax));	
//					check = false;
//				}
//			
//			}
//				
//				
//			}
//		if(this.deathCheck) {
//			CrazyArcade.end();
//		}
			
			
			
	}//keyReleased();
	


	private void setMap() {
		int x = 0;
		int y = 0;
		for(int i=0; i<this.map.length; i++) { //?? ?????? ???? ????
			for(int j=0; j<this.map[i].length; j++) {
				this.map[i][j] = new Map(x,y,IMAGESIZE,IMAGESIZE);
				x+=50;
			}
			y+=50;
			x= 0;
		}
		for(int i=0; i<this.grassArr.length; i++) { //?? ?????? ???? ?????? ????
			for(int j=0; j<this.grassArr[i].length; j++) {
				this.map[i][this.grassArr[i][j]].setImage(grassImage);
			}
		}
		this.map[this.playerY][this.playerX].setImage(bazziImage); //?? ?????? ???? ?????? ????
		
		for(int i=0; i<this.map.length; i++) { // ?? ?????? ???????? ???????? ?? ???? 
			for(int j=0; j<this.map[i].length; j++) {
				if(this.map[i][j].getImage() == null) {
					this.map[i][j].setImage(brickImage);
				}
			}
		}
	}//setMap();
	
	private void setBombCntText() {
		this.bombCntText.setBounds(550,0,200,200);
		this.bombCntText.setText(String.format("<html>BombCnt : %d<br>BombMaxCnt : %d<br><br>SpaceBar : ????????<br>A : ????</html>", this.bombCnt , this.bombMax));
		this.bombCntText.setFont(new Font("",1,20));
		add(this.bombCntText);
	}//setBombCntText();
	
	private void setResetButton() {
		this.resetButton.setBounds(600,400,100,50);
		this.resetButton.setText("RESET");
		this.resetButton.addActionListener(this);
		add(this.resetButton);
	}
}
