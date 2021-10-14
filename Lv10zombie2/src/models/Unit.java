package models;

interface Attackable {
	public void attack(Unit target);
}

interface Criticalable {}

public class Unit implements Attackable , Criticalable {
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int floor;
	private int cnt = 0;
	public Unit(String name , int hp , int atk , int def , int floor) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.floor = floor;
	}
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getAtk() {
		return this.atk;
	}
	public int getDef() {
		return this.def;
	}
	public int getFloor() {
		return this.floor;
	}
	
	public void setAddHp(int hp) {
		this.hp += hp;
	}
	public void setAddAtk(int atk) {
		this.atk += atk;
	}
	public void setAddDef(int def) {
		this.def += def;
	}
	public void setMinusHp(int atk) {
		this.hp -= atk;
	}
	public void setPlusHp(int hp) {
		this.hp += hp;
	}
	public void setAddFloor() {
		this.floor ++;
	}

	@Override
	public void attack(Unit target) {
		if(this.floor == 10) {
			if(this.atk > target.def) {
				if(cnt != 4) {
					System.out.printf("%s의 공격 !! %s는 %d의 데미지를 입었다!!\n",this.name , target.name , (this.atk-target.def));
					target.setMinusHp((this.atk-target.def));			
					this.cnt ++;
				}else {
					critical(target , target);
					this.cnt = 0;
				}
			}else System.out.println("흠집조차 나지 않았따..");
		}else {
			if(this.atk > target.def) {
				System.out.printf("%s의 공격 !! %s는 %d의 데미지를 입었다!!\n",this.name , target.name , (this.atk-target.def));
				target.setMinusHp((this.atk-target.def));
			}else System.out.println("흠집조차 나지 않았따..");
		}
		
	}
	
	public void critical(Criticalable criticalable , Unit target) {
		System.out.printf("%s의 크리티컬 공격 !!!!!!!!!(보스는 두배의 데미지를 입힙니다) %s는 %d의 데미지를 입었다!!\n",this.name , target.name , (this.atk*2-target.def));
		target.setMinusHp((this.atk*2-target.def));	
	}
	
	

	
	
	
	
	
	
}
