package models;

interface Meteor {}
public class Raid {
	
	private int level;
	private int hp;
	private int maxHp;
	private int atk;
	private int def;
	private int count = 0;
	public Raid(int level , int hp , int atk , int def) {
		this.level = level;
		this.hp = hp;
		this.maxHp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public int getCount() {
		return this.count;
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
	public void setCount() {
		this.count = 1;
	}
	public  void attack(Member member) {
		int damage = (this.atk-member.getDef());
		System.out.printf("보스의공격!! %s는 %d의 데미지를 입었다.\n",member.getName(), damage);
		member.setHp((member.getHp()-damage));
	}
	public  void skillMeteor(Member member) {
		int damage = (this.atk*4-member.getDef());
		System.out.printf("보스가 메테오를 사용했다 !! %s는 %d의 데미지를 입었다.\n",member.getName(), damage);
		member.setHp((member.getHp()-damage));
		this.setCount();
	}
}
