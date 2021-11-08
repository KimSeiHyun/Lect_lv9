package grimpan;

import java.awt.Color;

public class Nemo {

	public void setWidth(int width) {
		this.width = width;
	}

	private int x , y , width , height ;
	private Color c;
	private boolean check;
	public Nemo(int x , int y , int width , int height , Color c) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.c = c;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
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
