package models;

interface SkillBat{}

public class UnitBat extends Unit implements SkillBat{

	public UnitBat(String name, int hp, int mp, int atk, int def) {
		super(name, hp, mp, atk, def);
	}
	
	public static void skillBat() {
		
	}

}
