package models;
//
interface SkillOrc {}
public class UnitOrc extends Unit implements SkillOrc{

	public UnitOrc(String name, int hp, int mp, int atk, int def) {
		super(name, hp, mp, atk, def);
		// TODO Auto-generated constructor stub
	}
	
	public static void SkillOrc(SkillOrc skillorc ,Unit unit ,  Member member) {
		int damage = (unit.getAtk()*3-member.getDef());
		System.out.printf("%s의 내려찍기!! %s는 %d의 데미지를 입었다.\n",unit.getName() , member.getName(), damage);
		member.setHp((member.getHp()-damage));
	}
	
}
