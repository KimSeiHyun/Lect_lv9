package models;
//
public class Member {
	private String name;
	private int level;
	private int hp;
	private int maxHp;
	private int atk;
	private int def;
	private int exp;
	private boolean party;
	private Inventory weapon;
	private Inventory armor;
	private Inventory accessorise;
	

	public Member(String name , int level , int hp , int atk , int def , int exp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.maxHp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}
	public Member(String name , int level , int hp , int atk , int def , int exp , boolean party) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.maxHp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
		this.party = party;
	}
	
	public void levelUp() {
		this.level ++;
		this.maxHp += 10;
		this.hp = maxHp;
		this.atk += 3;
		this.def ++;
	}
	public String getName() {
		return this.name;
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
	public int getExp() {
		return this.exp;
	}
	public boolean getParty() {
		return this.party;
	}
	public Inventory getWeapon() {
		return this.weapon;
	}
	public Inventory getArmor() {
		return this.armor;
	}
	public Inventory getAccessorise() {
		return this.accessorise;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public void setParty(boolean party) {
		this.party = party;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void setWeapon(Inventory weapon) {
		this.weapon = weapon;
	}
	public void setArmor(Inventory armor) {
		this.armor = armor;
	}
	public void setAccessorise(Inventory accessorise) {
		this.accessorise = accessorise;
	}
}
