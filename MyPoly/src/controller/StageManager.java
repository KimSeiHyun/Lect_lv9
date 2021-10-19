package controller;

import java.util.Scanner;

import models.Stage;
import models.StageBattle;

public class StageManager {
	
	public static StageManager instance = new StageManager();
	private UnitManager um = UnitManager.getUnitManagerinstance();
	private StageBattle sb = StageBattle.getStageBattleInstance();
	Scanner sc = new Scanner(System.in);
	public static StageManager getSatageManagerInstance() {
		return StageManager.instance;
	}
	
	public void stageRun() {
		while(true) {
			sb.playerTurn();
			sb.monsterTurn();
			if(um.unit.size() == 0) {
				Stage.stageLevel ++;
				um.monsterInit();
				break;
			}
		}
		
	}
	
	
}
