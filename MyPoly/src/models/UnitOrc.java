package models;

interface SkillOrc {}

public class UnitOrc extends Unit implements SkillOrc {

	public UnitOrc(String name, int hp, int power , int mp) {
		super(name, hp, power , mp);
	}
	
}
