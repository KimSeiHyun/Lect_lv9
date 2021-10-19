package models;

interface SkillWolf {}

public class UnitWolf extends Unit implements SkillWolf {

	public UnitWolf(String name, int hp, int power , int mp) {
		super(name, hp, power , mp);
		
	}

}
