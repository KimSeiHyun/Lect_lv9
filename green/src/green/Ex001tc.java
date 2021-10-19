package green;

import java.util.Scanner;

public class Ex001tc {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int omok[][] = new int[SIZE][SIZE];
		
		int turn = 1; // 1,2,1,2,1,2,1 ...
		int win = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//print
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(omok[i][j] == 1) {
						System.out.print("[o] ");
					}
					else if(omok[i][j] == 2) {
						System.out.print("[x] ");
					}
					else {
						System.out.print( i +"" + j+ " " );
					}
				}
				System.out.println();
			}
			
			//input
			System.out.printf("p%d Y: ",turn);
			int y = sc.nextInt();
			System.out.printf("p%d X: ",turn);
			int x = sc.nextInt();
			
			if(y >= 0 && y < SIZE && x>= 0 && x <SIZE && omok[y][x] == 0) {
				omok[y][x] = turn;
				
				//end
				if(win != 0) {
					System.out.printf("p%d 승리 ! ",win);
					break;
				}
				
				// ㅡ
				for(int i=0; i<SIZE; i++) {
					for (int j=0; j<SIZE-4; j++) {
						int cnt = 0;
						if(omok[i][j] == turn ) {
							for(int k=0; k<5; k++) { //실제 검사문 
								if(omok[i][j+k] == turn) cnt ++;
							}
						}
						if(cnt == 5) win = turn;
					}
				}
				// ㅣ
				for(int i=0; i<SIZE; i++) {
					for(int j=0; j<SIZE-4; j++) {
						int cnt = 0;
						if(omok[j][i] == turn) {
							for(int k=0; k<5; k++) {
								if(omok[j+k][i] == turn) cnt ++;
							}
						}
						if(cnt == 5) win = turn ;
					}
				}
				
				// \
				for(int i=0; i<SIZE-4; i++) {
					for(int j=0; j<SIZE-4; j++) {
						int cnt = 0;
						if(omok[i][j] == turn) {
							for(int k=0; k<5; k++) {
								if(omok[i+k][j+k] == turn) cnt ++;
							}
						}
						if(cnt == 5) win = turn;
					}
				}
				
				// /
				for(int i=0; i<SIZE-4; i++) {
					for(int j=4; j<SIZE; j++) {
						int cnt = 0;
						if(omok[i][j] == turn) {
							for(int k=0; k<4; k++) {
								if(omok[i+k][j-k] == turn) cnt ++;
							}
						}
						if(cnt == 5 ) win = turn;
					}
				}
				
				
				
				turn = turn == 1? 2: 1;
			}
			
		}//w
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
