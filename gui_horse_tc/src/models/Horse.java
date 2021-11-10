package models;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Horse {
	
	//state
	public final int RUN = 0;
	public final int GOAL = 1;
	
	private int num;
	private int x , y , w , h;
	private int state; // 0rin 1goal
	
	private String fileName;
	private ImageIcon image;
	
	private int rank;
	private String record;

	// »ý¼ºÀÚ
	public Horse(int num , int x , int y , int w , int h , String fileName) {
		this.num = num;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.fileName = fileName;
		this.image = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH));
	}
	
	public String getRecord() {
		return record;
	}
	
	public void setRecord(String record) {
		this.record = record;
	}
	public int getNum() {
		return num;
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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRUN() {
		return RUN;
	}

	public int getGOAL() {
		return GOAL;
	}


}
