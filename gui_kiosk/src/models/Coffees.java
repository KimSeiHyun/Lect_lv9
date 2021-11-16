package models;

public class Coffees {
	private String name;
	private int price;
	
	public Coffees(String name , int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}
	
}
