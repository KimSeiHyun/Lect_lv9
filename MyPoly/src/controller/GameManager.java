package controller;

import java.util.Scanner;

import models.StageBattle;
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
			if(um.player.size() == 0) {
				System.out.println("�ְ� �������� : " +StageBattle.stageLevel);
				break;
			}
			st.menu();
			int sel = sc.nextInt();
			if(sel == 1) {
				sm.stageRun();
			}
			if(sel == 2) {
				st.GameMenual();
			}
			if(sel == 3) {
				System.out.println("������ �����մϴ� . ");
				System.out.println("���� �������� : " +StageBattle.stageLevel);
				break;
			}
		}
	}
	
	
}
