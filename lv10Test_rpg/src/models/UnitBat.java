package models;
//
interface SkillBat{}

public class UnitBat extends Unit implements SkillBat{

	public UnitBat(String name, int hp, int mp, int atk, int def) {
		super(name, hp, mp, atk, def);
	}
	
	public static void skillBat(Unit unit , Member member) {
		int damage = (unit.getAtk()*2-member.getDef());
		System.out.printf("%s의 초음파!! %s는 %d의 데미지를 입었다.\n",unit.getName() , member.getName(), damage);
		member.setHp((member.getHp()-damage));
	}

}
