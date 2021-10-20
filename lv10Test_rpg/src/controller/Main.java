package controller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 시작 10 : 25
		// 종료 00 : 00 
		Scanner sc = new Scanner(System.in);
		DungeonManager dm = new DungeonManager();
		GuildManager gm = new GuildManager();
		ItemManager im = new ItemManager();
		im.itemInit();
		while(true) { 
			System.out.println("--- Dungeon RPG --- ");
			System.out.println("[1.길드관리]  [2.던전입장]  [3.상점]");
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
