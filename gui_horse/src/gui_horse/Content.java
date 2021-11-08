package gui_horse;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Content extends MyUtil{
	
	private Horse horse[];
	private Image image[];
	private JLabel winner[];
	//private JLabel horseImage[];
	private final int WIDTH = 100;
	private final int HEIGHT = 100;
	private int startX = 100;
	private int startY = 50;
	private int win = 1;
	
	private int startCheck = -1;
	
	private JButton startButton = new JButton();
	private JButton resetButton = new JButton();
	public Content() {
		setLayout(null);
		setBounds(0,0,1000,800);
		setBackground(Color.pink);
		revalidate();
		
		setHorse();
		setWinner();
		setStartButton();
		setresetButton();
	}
	
	private void setresetButton() {
		this.resetButton.setBounds(400,this.startY,100,50);
		this.resetButton.setText("RESET");
		this.resetButton.setFont(new Font("",1,15));
		this.resetButton.addActionListener(this);
		add(this.resetButton);
	}

	private void setStartButton() {
		this.startButton.setBounds(200,this.startY,100,50);
		this.startButton.setText("START");
		this.startButton.setFont(new Font("",1,15));
		this.startButton.addActionListener(this);
		add(this.startButton);
	}

	private void setWinner() {
		this.winner = new JLabel[5];
		int x = 850;
		int y = 50;
		for(int i=0; i<this.winner.length; i++) {
			this.winner[i] = new JLabel();
			this.winner[i].setBounds(x,y,100,100);
			this.winner[i].setFont(new Font("",1,50));
		//	this.winner[i].setText((i+1)+"");
			add(this.winner[i]);
			y += 120;
		}
	}

	private void setHorse() {
		this.horse = new Horse[5];
		for(int i=0; i<this.horse.length; i++) {
			this.horse[i] = new Horse(this.startX , this.startY , this.WIDTH , this.HEIGHT);
			this.startY += 120;
		}
		
		this.image = new Image[this.horse.length];
		for(int i=0; i<this.image.length; i++) {
			this.image[i] = new ImageIcon("images/horse"+(i+1)+".png").getImage().getScaledInstance(this.WIDTH, this.HEIGHT, Image.SCALE_SMOOTH);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.startButton) {
			this.startCheck = 1;
		}
		if(e.getSource() == this.resetButton) {
			this.startCheck = -1;
			this.win = 1;
			this.startY = 50;
			for(int i=0; i <5; i++) {
				this.winner[i].setText("");
			}
			this.horse = new Horse[5];
			for(int i=0; i<this.horse.length; i++) {
				this.horse[i] = new Horse(this.startX , this.startY , this.WIDTH , this.HEIGHT);
				this.startY += 120;
			}
		}
	}


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(850, 50, 850, 650);
		for(int i=0; i<this.image.length; i++) {
			g.drawImage(this.image[i] , this.horse[i].getX() ,this.horse[i].getY() , null);
		}
		
		try {
			Random rn = new Random();
			Thread.sleep(50); // 1000 = 1초 
			
			if(this.startCheck == 1) {
				for(int i=0; i<this.horse.length; i++) {
					int r = rn.nextInt(30);
					if(this.horse[i].getX() < 850-this.WIDTH) { // 말의 크기 : 100 , 골인라인의 x좌표 : 850
						this.horse[i].setX(this.horse[i].getX() + r);											
					}else if(this.horse[i].getX() >= 850-this.WIDTH){
						if(this.winner[i].getText().equals("")) {
							this.winner[i].setText(this.win+"");
							this.win ++;
						}
						
					}
				}
				
			}
			
		} catch (Exception e) {
			
		}
		
		repaint();
	}
}
