package lv6;

import java.util.Random;
import java.util.Scanner;

class Move{
	int x;
	final int P1 = 2;
	final int WALL = 1;
	final int SIZE = 10;
	int map[] = new int[SIZE];
	
	
}


public class Ex001_006tc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		Move game = new Move();
		
		// setting
		game.x = rn.nextInt(game.SIZE);
		game.map[game.x] = game.P1;
		
		for(int i=0; i<2; i++) {
			int rNum = rn.nextInt(game.SIZE);
			if(game.map[rNum] == 0) {
				game.map[rNum] = game.WALL;
			}
			else {
				i --;
			}
		}
		
		// run
		while(true) {
			for(int i=0; i<game.map.length; i++) {
				if(game.map[i] == game.P1) {
					System.out.print("¿Ê ");
				}
				else if(game.map[i] == game.WALL) {
					System.out.print("¡á ");
				}
				else {
					System.out.print("_ ");
				}
				

			}
			System.out.println();
			
			System.out.println("1.¿Þ  2.¿À   3. °ÝÆÄ\n");
			System.out.println("¸Þ´º : ");
			int sel = sc.nextInt();
			
			int xx = game.x;
			if(sel == 1) {
				xx--;
			}
			else if( sel == 2) {
				xx++;
			}
			
			if( xx >= 0 && xx < game.SIZE && game.map[xx] == 0) {
				//move
				game.map[game.x] = 0;
				game.x = xx;
				game.map[game.x]= game.P1; 				
			}
			if(sel == 3) {
				if(game.x-1 >= 0 && game.map[game.x-1] == game.WALL) {
					game.map[game.x-1] = 0;
				}
				else if (game.x+1 < game.SIZE && game.map[game.x+1] == game.WALL) {
					game.map[game.x+1] = 0;
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
