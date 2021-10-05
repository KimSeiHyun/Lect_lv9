package models;

import java.util.ArrayList;

public class User {
	private String id;
	private int money;
	public ArrayList<Cart> cart = new ArrayList<>();

	public User (String id , int money) {
		this.id = id;
		this.money = money;
	}
	
	public String getId() {
		return this.id;
	}
	public int getMoney() {
		return this.money;
	}
	public void setMinusMoney(int money) {
		this.money = this.money-money;
	}
}
