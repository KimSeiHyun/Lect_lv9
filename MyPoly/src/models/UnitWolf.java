package models;

interface SkillWolf {}

public class UnitWolf extends Unit implements SkillWolf {

	public UnitWolf(String name, int hp, int power , int mp) {
		super(name, hp, power , mp);
		
	}
	
	// 스플래시어택 : 전체에게 공격력만큼 데미지 
	public static void skillWolf(SkillWolf skillWolf  , Unit unit , Player player) {
		System.out.printf("%s의 스플래시어택!! %s는 %d의 데미지를 입었다 .\n",unit.getName() ,player.getName() , unit.getPower());
		player.setHp(-unit.getPower());
	}
	
}
