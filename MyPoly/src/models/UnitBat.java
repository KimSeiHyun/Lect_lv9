package models;

interface SkillBat {}

public class UnitBat extends Unit implements SkillBat{

	public UnitBat(String name, int hp, int power , int mp) {
		super(name, hp, power, mp);
	}
	

}
