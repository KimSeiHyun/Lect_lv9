package models;

interface SkillBat {
}

public class UnitBat extends Unit implements SkillBat{
	
	
	public UnitBat(String name, int hp, int power , int mp) {
		super(name, hp, power, mp);
	}
	
	// ���ݷ¸�ŭ �������� �ָ� 1�� ������Ŵ . 
	public static void skillBat(SkillBat SkillBat , Unit unit , Player player , int idx) {
		System.out.printf("%s�� ������ ����!! %s�� %d�� �������� �԰� 1�� �����Ѵ� .\n",unit.getName(),player.getName(),unit.getPower());
		player.setHp(-unit.getPower());
		StageBattle.batCount = idx;
	}
	

}
