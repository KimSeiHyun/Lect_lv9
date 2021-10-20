package models;

interface Meteor {}
public class Raid {
	private int level;
	private int hp;
	private int maxHp;
	private int atk;
	private int def;
	
	public Raid(int level , int hp , int atk , int def) {
		this.level = level;
		this.hp = hp;
		this.maxHp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public int getLevel() {
		return this.level;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMaxHp() {
		return this.maxHp;
	}
	public int getAtk() {
		return this.atk;
	}
	public int getDef() {
		return this.def;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public static void skillMeteor(Meteor meteor) {
		
	}
}
