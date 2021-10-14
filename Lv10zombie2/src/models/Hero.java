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
		System.out.println("(포션을 한개 획득했다 . )");
	}
	public void setMinusPortion() {
		this.portion --;
	}
	public void setAddFloor() {
		super.setAddFloor();
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
	
	public void attack(Unit target) {
		if(super.getAtk() > target.getDef()) {
			System.out.printf("%s의 공격 !! %s는 %d의 데미지를 입었다!!\n",super.getName(), target.getName() ,(super.getAtk()-target.getDef()) );
			target.setMinusHp((super.getAtk()-target.getDef()));
		}else System.out.println("흠집조차 나지 않았다...");
		
	}
	
	public void drink() {
		if(this.portion != 0 ) {
			System.out.printf("물약을 사용했다 . Hp 가 %d만큼 회복됬다 . \n",this.getFloor()*20);			
			this.setPlusHp(this.getFloor()*20);
			this.portion --;
		}else System.out.println("물약이 다 떨어졋다 ..");
	}
	




}
