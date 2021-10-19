package controller;

import java.util.ArrayList;
import java.util.Random;

import models.Player;
import models.Stage;
import models.Unit;
import models.UnitBat;
import models.UnitOrc;
import models.UnitWolf;

public class UnitManager {
	public static UnitManager instance = new UnitManager();
	public ArrayList<Unit> unit = new ArrayList<>();
	public ArrayList<Player> player = new ArrayList<>();
	private String monsterName[] = {"¹ÚÁã" , "¿ÀÅ©" , "¿ïÇÁ"};
	Random rn = new Random();
	public static UnitManager getUnitManagerinstance() {
		return UnitManager.instance;
	}
	
	public void playerInit() {
		player.add(new Player("Àü»ç" , 999 , 60 , 20));
		player.add(new Player("¹ı»ç" , 500 , 30 , 60));
		player.add(new Player("±Ã¼ö" , 700 , 50 , 30));
		player.add(new Player("Èú·¯" , 500 , 25 , 40));
	}
	public void monsterInit() {
		for(int i=0; i<4; i++) {
			int r = rn.nextInt(this.monsterName.length);
			if(r == 0) {
				unit.add(new UnitBat(this.monsterName[r] , (150+Stage.stageLevel*10) , (10+Stage.stageLevel*2) , 10));				
			}
			if(r == 1) {
				unit.add(new UnitOrc(this.monsterName[r], (150+Stage.stageLevel*10) , (10+Stage.stageLevel*2) , 10));				
			}
			if(r == 2) {
				unit.add(new UnitWolf(this.monsterName[r] , (150+Stage.stageLevel*10) , (10+Stage.stageLevel*2) , 10));				
			}
		}
	}
	

	
	
}
