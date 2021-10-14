package models;

abstract public class Shop {
	
	private int hp = 20;
	private int atk = 3;
	private int def = 1;
	private int price = 10;
	
	public int getHp() {
		return this.hp;
	}
	public int getAtk() {
		return this.atk;
	}
	public int getDef() {
		return this.def;
	}
	public int getPrice() {
		return this.price;
	}
	public abstract void shopMenu();
}
