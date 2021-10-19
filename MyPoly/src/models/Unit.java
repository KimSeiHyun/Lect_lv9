package models;

import java.util.Random;

import controller.UnitManager;

interface Attack {
	public void attack(Player player);
}

public abstract class Unit implements Attack {
	private UnitManager um = UnitManager.getUnitManagerinstance();
	Random rn = new Random();
	private String name;
	private int hp;
	private int MaxHp;
	private int power;
	private int mp;
	private int MaxMp;
	private boolean deth;
	
	public Unit() {}
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
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setMinusMp() {
		this.mp -= 10;
	}
	public void setOverHp() {
		this.hp = this.MaxHp;
	}
	public void setOverMp() {
		this.mp = this.MaxMp;
	}
	
	public void attack(Player player) {
		System.out.printf("%s의 공격 !! %s는 %d의 데미지를 입었다 .\n",this.getName() , player.getName() , this.getPower());
		player.setHp(-this.getPower());
	}
	
	
	
	
}

