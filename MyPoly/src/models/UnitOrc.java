package models;

interface SkillOrc {}

public class UnitOrc extends Unit implements SkillOrc {

	public UnitOrc(String name, int hp, int power , int mp) {
		super(name, hp, power , mp);
	}
	
	//강타  : 임의의 대상에게 3배의 데미지 
	public static void skillOrc(SkillOrc skillOrc  , Unit unit , Player player) {
		System.out.printf("%s의 강타!! %s는 %d의 데미지를 입었다 .\n",unit.getName() ,player.getName() , unit.getPower()*3);
		player.setHp(-unit.getPower()*3);
	}
	
}
