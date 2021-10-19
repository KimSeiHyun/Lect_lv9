package models;

interface SkillWolf {}

public class UnitWolf extends Unit implements SkillWolf {

	public UnitWolf(String name, int hp, int power , int mp) {
		super(name, hp, power , mp);
		
	}
	
	// ���÷��þ��� : ��ü���� ���ݷ¸�ŭ ������ 
	public static void skillWolf(SkillWolf skillWolf  , Unit unit , Player player) {
		System.out.printf("%s�� ���÷��þ���!! %s�� %d�� �������� �Ծ��� .\n",unit.getName() ,player.getName() , unit.getPower());
		player.setHp(-unit.getPower());
	}
	
}
