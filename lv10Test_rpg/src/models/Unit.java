package models;

public class Unit {
	private String name;
	private int hp;
	private int Maxhp;
	private int mp;
	private int Maxmp;
	private int atk;
	private int def;
	
	public Unit(String name , int hp , int mp , int atk , int def) {
		this.name = name;
		this.hp = hp;
		this.Maxhp = hp;
		this.mp = mp;
		this.Maxmp = mp;
		this.atk = atk;
		this.def = def;
	}
	public  void attack() {
		
	}
}
