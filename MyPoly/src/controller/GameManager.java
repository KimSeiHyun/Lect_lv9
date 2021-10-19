package controller;

import java.util.Scanner;

import models.StageTitle;

public class GameManager {
	Scanner sc = new Scanner(System.in);
	private StageManager sm = StageManager.getSatageManagerInstance();
	private StageTitle st = StageTitle.getStageTitleInstance();
	private UnitManager um = UnitManager.getUnitManagerinstance();
	public void run() {
		um.monsterInit();
		um.playerInit();
		while(true) {
			st.menu();
			int sel = sc.nextInt();
			if(sel == 1) {
				sm.stageRun();
			}
			if(sel == 2) {
				st.GameMenual();
			}
			if(sel == 3) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	
	
}
