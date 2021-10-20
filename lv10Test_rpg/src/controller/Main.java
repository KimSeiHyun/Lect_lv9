package controller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ���� 10 : 25
		// ���� 00 : 00 
		Scanner sc = new Scanner(System.in);
		DungeonManager dm = new DungeonManager();
		GuildManager gm = new GuildManager();
		ItemManager im = new ItemManager();
		im.itemInit();
		while(true) { 
			System.out.println("--- Dungeon RPG --- ");
			System.out.println("[1.������]  [2.��������]  [3.����]");
			int sel = sc.nextInt();
			if( sel == 1) {
				gm.guildManageRun();
			}
			if( sel == 2) {
				dm.dungeonManagerRun();
			}
			if( sel == 3) {
				im.itemManagerRun();
			}
		}
		
		//1
	}

}
