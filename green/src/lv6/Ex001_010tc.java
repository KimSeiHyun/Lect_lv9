package lv6;

import java.util.Random;
import java.util.Scanner;

class Sadari {
	int size;
	int steps = 10;
	int ladder[][];
	String items[];
	
	String front[] = {"매운","치즈치즈","쇼킹한","눈물나는","큼큼한","오마이","오늘도"};
	String back[] = {"라면","떡볶이","피자","파스타","햄버거","국밥","곱창","닭발","치킨"};
}


public class Ex001_010tc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		Sadari game = new Sadari();
		
		System.out.print("참여할 인원수 : ");
		game.size = sc.nextInt();
		
		// setting
		game.ladder = new int[game.steps][game.size];
		for(int y=0; y<game.ladder.length; y++) {
			int r = rn.nextInt(game.size-1);
			if(game.ladder[y][r] == 0 && game.ladder[y][r+1] == 0) {
				game.ladder[y][r] = 1;
				game.ladder[y][r+1] = 2;
			}
		}
		game.items = new String[game.size];
		for(int i=0; i<game.size; i++) {
			int r1 = rn.nextInt(game.front.length);
			int r2 = rn.nextInt(game.front.length);
			game.items[i] = game.front[r1] + game.back[r2];
		}
		
		while(true) {
			// print
			for(int i=0; i<game.size; i++) System.out.print(i+1 + " ");
			System.out.println();
			for(int y= 0; y<game.ladder.length; y++) {
				for(int x = 0; x<game.ladder.length; x++) {
					if(game.ladder[y][x] == 1) {
						System.out.print("┣━");
					}
					else if (game.ladder[y][x] == 2) {
						System.out.print("┫ ");						
					}
					else {
						System.out.print("┃ ");												
					}
				}
				System.out.println();
			}
			for(int i=0; i<game.items.length;i ++) {
				System.out.printf("%c) %s\n",(char)'a'+i,game.items[i]);
			}
			break;
		}//while
		
	}

}
