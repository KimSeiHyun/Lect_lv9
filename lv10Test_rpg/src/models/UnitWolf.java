package models;
//
interface SkillWolf {}
public class UnitWolf extends Unit implements SkillWolf{

	public UnitWolf(String name, int hp, int mp, int atk, int def) {
		super(name, hp, mp, atk, def);
		// TODO Auto-generated constructor stub
	}
	
	public static void SKillWolf(SkillWolf skillwolf , Unit unit , Member member) {
		int damage = (unit.getAtk()*4-member.getDef());
		System.out.printf("%s�� ������!! %s�� %d�� �������� �Ծ���.\n",unit.getName() , member.getName(), damage);
		member.setHp((member.getHp()-damage));
	}

}
