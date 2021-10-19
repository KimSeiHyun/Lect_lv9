package lv.test_4;

import java.util.Scanner;

public class lv4_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
		};

		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;

		int turn = 1;

		int win = 0;

		boolean run = true;
		while (run) {
			for(int i=0; i<omok.length; i++) {
				for(int j=0; j<omok[i].length; j++) {
					if(omok[i][j] == 1) System.out.print("● ");
					if(omok[i][j] == 2) System.out.print("○ ");
					if(omok[i][j] == 0) System.out.print(omok[i][j] + " ");
				}
				System.out.println();
			}
			if(win != 0) {
				System.out.printf("p%d의 승리!! ",win);
				break;
			}
			System.out.printf("p%d의 차례입니다.",turn);
			System.out.print("y좌표 입력 : ");
			int y = sc.nextInt();
			System.out.print("x좌표 입력 : ");
			int x = sc.nextInt();
			if(x >= 0 && x < size && y >= 0 && y <size) {
				if(omok[y][x] != 0) {
					System.out.println("이미 선택된자리입니다.");
					continue;
				}
				if(omok[y][x] == 0) omok[y][x] = turn;
				
			}else {
				System.out.println("범위를 벗어났습니다.");
				continue;
			}
			
			//가로
			
			for(int i=0; i<size; i++) {
				for(int j=0; j<size-4; j++) {
					int cnt = 0;
					for(int k=j; k<j+5; k++) {
						if(j ==0 ) {
							if(omok[i][k] == turn&& omok[i][j+5] != turn)
							cnt ++;
						}else if(j == size-5 ) {
							if(omok[i][k] == turn && omok[i][j-1] != turn)
							cnt ++;
						}else {
							if(omok[i][j-1] != turn && omok[i][j+5] != turn && omok[i][k] == turn) {
								cnt++;
							}
								
						}
						if(omok[i][k] != turn ) cnt = 0;
						if(cnt == 5) win = turn;
					}
				}
			}
			//세로
			//대각\
			//대각/
			turn = turn == 2 ? 1 : 2 ;
		}
 
	
		
		
		
		sc.close();
	}

}