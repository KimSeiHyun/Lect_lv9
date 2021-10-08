
public class Member {
	private String name;
	private int level;
	private int hp;
	private int maxHp;
	private int atk;
	private int def;
	private int exp;
	private boolean party = false;
	private Item weapon;
	private Item armor;
	private Item accessorise;
	
	public Member(String name , int level , int hp , int maxHp , int atk , int def ,int exp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.maxHp = maxHp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}
	public Member(String name , int level , int hp , int maxHp , int atk , int def ,int exp , boolean party) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.maxHp = maxHp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
		this.party = party;
	}
	public Member(String name , int level , int hp , int maxHp , int atk , int def ,int exp , boolean party , Item weapon , Item armor , Item accessorise) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.maxHp = maxHp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
		this.party = party;
		this.weapon = weapon;
		this.armor = armor;
		this.accessorise = accessorise;
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
	public Item getWeapon() {
		return this.weapon;
	}
	public Item getArmor() {
		return this.armor;
	}
	public Item getAccessorise() {
		return this.accessorise;
	}
	
	public void setParty() {
		
		if(this.party == false) {
			this.party = true;
			
			return;
		}
		else if(this.party == true) {
			this.party = false;
			
			return;
		}
	}
	
	public void setAtk(int atk) {
		this.atk = this.atk + atk;
	}
	
	public void setDef(int def) {
		this.def = this.def + def;
	}
	
	public void setDefActtion() {
		this.def = this.def*2;
	}
	public void setDefFinish() {
		this.def = this.def/2;
	}
	
	public void setMinusHp (int hp) {
		this.hp -= hp;
	}
	public void setHealHp (int maxHp) {
		this.hp = this.maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.hp = this.hp + maxHp;
		this.maxHp = this.maxHp + maxHp;
	}
	
	public void setLevel (int level) {
		this.level = level;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}
	
	public void setArmor(Item armor) {
		this.armor = armor;
	}
	
	public void setAccessorise(Item accessorise) {
		this.accessorise = accessorise;
	}
	
	public void levelUp() {
		this.level ++;
		this.atk +=3;
		this.def +=1;
		this.maxHp += 10;
		this.hp = this.maxHp;
		this.exp = 0;
	}
	
}
