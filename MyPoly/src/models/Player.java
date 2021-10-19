package models;

import controller.UnitManager;

interface Skill {}
public class Player extends Unit implements Skill {
	private UnitManager um = UnitManager.getUnitManagerinstance();
	public Player(String name, int hp, int power, int mp) {
		super(name, hp, power, mp);
	}
	 
	public void attack(Unit monster) {
		System.out.printf("%s의 공격 !! %s는 %d의 데미지를 입었다 .\n",this.getName() , monster.getName() , this.getPower());
		monster.setHp(-this.getPower());
	}
	
	public void skillPowerStrike(Skill skill , Unit monster) {
		System.out.printf("%s의 파워스트라이크 !! %s는 %d의 데미지를 입었다 .\n",this.getName() , monster.getName() , this.getPower()*2);
		monster.setHp(-this.getPower()*2);
		this.setMinusMp();
	}
	public void skillThunderbolt(Skill skill) {
		System.out.printf("%s의 썬더볼트 !! 적군모두에게 %d의 데미지를 입혔다 .\n",this.getName() , this.getPower());
		for(int i=0; i<this.um.unit.size(); i++) {
			this.um.unit.get(i).setHp(-this.getPower());
		}
		this.setMinusMp();
	}
	public void skillFocusShot(Skill skill , Unit monster) {
		System.out.printf("%s의 집중사격 !! %s는 %d의 데미지를 입었다 .\n",this.getName() , monster.getName() , this.getPower()*2);
		monster.setHp(-this.getPower()*2);
		this.setMinusMp();
	}
	public void skillHealingWave(Skill skill) {
		System.out.printf("%s의 힐링웨이브 !! 파티원 모두 체력을 회복했다 . \n" , this.getName());
		for(int i=0; i<um.player.size(); i++) {
			if(um.player.get(i).getHp() <= um.player.get(i).getMaxHp() - this.getPower()) {
				this.um.player.get(i).setHp(this.getPower());
			}else this.um.player.get(i).setOverHp();
		}
		this.setMinusMp();
	}

}
