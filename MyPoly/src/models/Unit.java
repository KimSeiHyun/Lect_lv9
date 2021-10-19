package models;
interface Attack {
	public void attack();
}

public abstract class Unit implements Attack {
	private String name;
	private int hp;
	private int MaxHp;
	private int power;
	private int mp;
	private int MaxMp;
	private boolean deth;

	public Unit(String name , int hp , int power , int mp) {
		this.name = name;
		this.hp = hp;
		this.MaxHp = hp;
		this.power = power;
		this.mp = mp;
		this.MaxMp = mp;
		this.deth = true;
	}
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMaxHp() {
		return this.MaxHp;
	}
	public int getPower() {
		return this.power;
	}
	public int getMp() {
		return this.mp;
	}
	public int getMaxMp() {
		return this.MaxMp;
	}
	public boolean getDeth() {
		return this.deth;
	}
	public void setHp(int power) {
		this.hp += power;
	}
	public void setMinusMp() {
		this.mp -= 10;
	}
	public void setOverHp() {
		this.hp = this.MaxHp;
	}
	public void attack() {
		
	}
	
	
	
	
}

