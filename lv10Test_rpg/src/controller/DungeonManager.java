package controller;

import java.util.ArrayList;
import java.util.Scanner;

import models.Dungeon;
import models.Inventory;

public class DungeonManager extends Dungeon {
	public static DungeonManager instance = new DungeonManager();
	public static  DungeonManager getDungeonManagerInstance() {
		return DungeonManager.instance;
	}
	private int dungeonLevel = 1;
	
	Scanner sc = new Scanner(System.in);
	
	public void dungeonManagerRun() {
		while(true) {
			this.dungeonManagerMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				
			}
			if(sel == 2) {
				
			}
			if(sel == 3) {
				
			}
			if(sel == 4) {
				
			}
			if(sel == 5) {
				
			}
		}
	}
	
	private void dungeonManagerMenuPrint() {
		System.out.println("1.��������\n2.�����ʱ�ȭ\n3.���緹���Ǵ�������\n4.����\n5.�ڷΰ���");
	}
	
	
	@Override
	public void dungeonLevelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dungeonReset() {
		// TODO Auto-generated method stub
		
	}
	
	
}
