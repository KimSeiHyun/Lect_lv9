package models;

interface SkillBat {
}

public class UnitBat extends Unit implements SkillBat{
	
	
	public UnitBat(String name, int hp, int power , int mp) {
		super(name, hp, power, mp);
	}
	
	// 공격력만큼 데미지를 주며 1턴 기절시킴 . 
	public static void skillBat(SkillBat SkillBat , Unit unit , Player player , int idx) {
		System.out.printf("%s의 초음파 공격!! %s는 %d의 데미지를 입고 1턴 기절한다 .\n",unit.getName(),player.getName(),unit.getPower());
		player.setHp(-unit.getPower());
		StageBattle.batCount = idx;
	}
	

}
