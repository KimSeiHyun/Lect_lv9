package lv3;

import java.util.Scanner;

public class Ex01_22 {

	public static void main(String[] args) {
		/* 
		 * # ∆Ω≈√≈‰
		 * === ∆Ω≈√≈‰ ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]¿Œµ¶Ω∫ ¿‘∑¬ : 6
		 * === ∆Ω≈√≈‰ ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]Ω¬∏Æ
		 * 
		 */
		//0  1  2
		//3  4  5
		//6  7  8 
		Scanner sc = new Scanner(System.in);
			int[] game = new int[9];
			
			System.out.println("===∆Ω≈√≈‰===");
			for(int i=0; i<9; i++) {
				if(game[i] == 0) {
					System.out.print("[ ]");
				}
				
				if (i%3 ==2 ) {
					System.out.println();
				}
			}

			int cnt = 1;
			int cnt2 = 2;
			boolean t = true;
		while(t) {
			System.out.println("p1≈œ¿‘¥œ¥Ÿ. ");
			int p1 = sc.nextInt()-1;
			System.out.println("===∆Ω≈√≈‰===");
			for(int i=0; i<9; i++) {
				if (p1 == i) {
					game[i] = cnt;
				}
				if(game[i] == 0) {
					System.out.print("[ ]");
				}
				else if (game[i] == 1){
					System.out.print("[X]");
				}
				else if (game[i] == 2) {
					System.out.print("[O]");
				}
				if (i%3 ==2 ) {
					System.out.println();
				}
			}
			for(int i=0; i<9; i+=3) {
				if ( game[i] == 1 && game[i+1] == 1 && game[i+2] == 1) {
					System.out.println("p1¿« ∫˘∞Ì!!");
					t = false;
				}
			}
			for(int i=0; i<3; i++) {
			if ( game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) {
					System.out.println("p1¿« ∫˘∞Ì!!");
					t = false;
				}
			}
			for(int i=0; i<1; i++) {
			if ( game[i] == 1 && game[i+4] == 1 && game[i+8] == 1) {
					System.out.println("p1¿« ∫˘∞Ì!!");
					t = false;
				}
			}
			for(int i=2; i<3; i++) {
			if ( game[i] == 1 && game[i+2] == 1 && game[i+4] == 1) {
					System.out.println("p1¿« ∫˘∞Ì!!");
					t = false;
				}
			}
			System.out.println("p2≈œ¿‘¥œ¥Ÿ. ");
			int p2 = sc.nextInt()-1;
			System.out.println("===∆Ω≈√≈‰===");
			for(int i=0; i<9; i++) {
				if (p2 == i) {
					game[i] = cnt2;
				}
				if(game[i] == 0) {
					System.out.print("[ ]");
				}
				else if (game[i] == 1){
					System.out.print("[X]");
				}
				else if (game[i] == 2) {
					System.out.print("[O]");
				}
				
				if (i%3 ==2 ) {
					System.out.println();
				}
			}
			for(int i=0; i<9; i+=3) {
				if ( game[i] == 2 && game[i+1] == 2 && game[i+2] == 2) {
					System.out.println("p2¿« ∫˘∞Ì!!");
					t = false;
				}
			}
			for(int i=0; i<3; i++) {
			if ( game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) {
					System.out.println("p2¿« ∫˘∞Ì!!");
					t = false;
				}
			}
			for(int i=0; i<1; i++) {
			if ( game[i] == 2 && game[i+4] == 2 && game[i+8] == 2) {
					System.out.println("p2¿« ∫˘∞Ì!!");
					t = false;
				}
			}
			for(int i=2; i<3; i++) {
			if ( game[i] == 2 && game[i+2] == 2 && game[i+4] == 2) {
					System.out.println("p2¿« ∫˘∞Ì!!");
					t = false;
				}
			}


				
		}
		
		
		
		
		
		
		
		
		
	}
}
			
			
			

		
			

	


