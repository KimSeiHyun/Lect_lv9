package models;
//
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
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMaxHp() {
		return this.Maxhp;
	}
	public int getMp() {
		return this.mp;
	}
	public int getMaxMp() {
		return this.Maxmp;
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
	public void setMp() {
		this.mp = 0;
	}
	
	public  void attack(Member member) {
		int damage = (this.atk-member.getDef());
		System.out.printf("%s의 공격!! %s는 %d의 데미지를 입었다.\n",this.name , member.getName(), damage);
		member.setHp((member.getHp()-damage));
		
		
	}
}
