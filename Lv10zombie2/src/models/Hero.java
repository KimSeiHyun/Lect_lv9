package models;

public class Hero extends Unit implements Attackable {
	private int portion = 5;
	private int money = 10;
	public Hero(String name, int hp, int atk, int def, int floor) {
		super(name, hp, atk, def, floor);
	}
	
	public int getPortion() {
		return this.portion;
	}
	public int getMoney() {
		return this.money;
	}
	
	public void setAddPortion() {
		this.portion ++;
	}
	public void setMinusPortion() {
		this.portion --;
	}
	
	public void setAddMoney() {
		this.money += 30;
	}
	public void setMinusMoney() {
		this.money -= 10;
	}
	
	public void setAddHp(int hp) {
		super.setAddHp(hp);
	}
	public void setAddAtk(int atk) {
		super.setAddAtk(atk);
	}
	public void setAddDef(int def) {
		super.setAddDef(def);
	}
	
	public void reset() {
		this.portion = 5;
		this.money = 0;
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	




}
