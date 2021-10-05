package models;

public class Cart {
	
	private String userId;
	private String itemName;
	private int itemPrice;
	
	public Cart(String userId , String itemName , int itemPrice) {
		this.userId = userId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	public String getUserId() {
		return this.userId;
	}
	public String getItemName() {
		return this.itemName;
	}
	public int getItemPrice() {
		return this.itemPrice;
	}
}
