
public class Member {
	private String name;
	private int level;
	private int hp;
	private int maxHp;
	private int atk;
	private int def;
	private int exp;
	private Item weapon;
	private Item armor;
	private Item ring;
	
	public Member(String name , int level , int hp , int maxHp , int atk , int def ,int exp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.maxHp = maxHp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
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
	
}
