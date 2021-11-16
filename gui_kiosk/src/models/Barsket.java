package models;

public class Barsket {
	
	private String name;
	private int price;
	private int cnt;
	
	public Barsket(String name , int price , int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = 1;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
