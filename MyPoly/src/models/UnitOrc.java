package models;

interface SkillOrc {}

public class UnitOrc extends Unit implements SkillOrc {

	public UnitOrc(String name, int hp, int power , int mp) {
		super(name, hp, power , mp);
	}
	
	//��Ÿ  : ������ ��󿡰� 3���� ������ 
	public static void skillOrc(SkillOrc skillOrc  , Unit unit , Player player) {
		System.out.printf("%s�� ��Ÿ!! %s�� %d�� �������� �Ծ��� .\n",unit.getName() ,player.getName() , unit.getPower()*3);
		player.setHp(-unit.getPower()*3);
	}
	
}
