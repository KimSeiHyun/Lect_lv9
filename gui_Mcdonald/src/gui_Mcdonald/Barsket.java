package gui_Mcdonald;

public class Barsket {
	private String name;
	private int price;
	private int cnt;
	
	public Barsket(String name , int price) {
		this.name = name;
		this.price = price;
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
