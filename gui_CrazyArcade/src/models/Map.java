package models;

import java.awt.Image;

public class Map {
	
	private int x , y , w , h;
	private Image image;
	private boolean bazziCheck;
	
	public Map(int x , int y ) {
		this.x = x;
		this.y = y;
	}
	public Map(int x , int y , int w , int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.image = null;
	}
	public boolean isBazziCheck() {
		return bazziCheck;
	}

	public void setBazziCheck(boolean bazziCheck) {
		this.bazziCheck = bazziCheck;
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
	public int getH() {
		return h;
	}

	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
}
