package test;

import java.util.Scanner;

public class Ex001b {

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
		int win1 = 0;
		int win2 = 0;
		boolean run = true;
		int turn = 1;

		while (run) {
			int cnt1 = 0;
			int cnt2 = 0;
			int check = 0;
			//출력
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					if(omok[i][j] == 1) {
						System.out.print(" ● ");
					}
					if(omok[i][j] == 2) {
						System.out.print(" ○ ");
					}
					if(omok[i][j] == 0) {
						System.out.print(j+"" + i +" ");
					}
				}
				System.out.println();
			}
			//승리
			if(win1 == 1 ) {
					System.out.println("흑의 승리입니다.");
				break;
			}
			if(win2 == 1 ) {
				System.out.println("백의 승리입니다.");
				break;
			}
			System.out.printf("플레이어%d의 차례입니다.\nx와 y의 좌표를 입력해주세요 .",turn);
			int x = sc.nextInt();
			int y = sc.nextInt();
			//예외
			if(x < 0 || x >=10 || y <0 || y>=10) {
				System.out.println("범위를 벗어난 좌표입니다 . 다시 입력해주세요 .");
				continue;
			}
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					if(omok[y][x] != 0 ) {
						check = 1;
					}
				}
			}
			if(check == 1) {
				System.out.println("이미 선택된 좌표입니다. 다시 입력해주세요 ");
				continue;
			}
			//흑백의 돌 놓기 .
				for(int i=0; i<10; i++) {
					for(int j=0; j<10; j++) {
						if(omok[i][j] == 0) {
							omok[y][x] = turn;
						}
					}
				}

			//가로
			 win1 = 0;
			 win2 = 0;
			for(int i=0; i<10; i++) {
				cnt1 = 0;
				cnt2 = 0;
				for(int j =0; j<10; j++) {
					if(omok[i][j] == 1) {
						cnt1++;
					}
					else {
						cnt1 = 0;
					}
					if(omok[i][j] == 2) {
						cnt2++;
					}
					else {
						cnt2 = 0;
					}
					if (cnt1 == 5) {
						win1 = 1;
					}
					if(cnt1 == 6) {
						win1 = 0;
					}
					if (cnt2 == 5) {
						win2 = 1;
					}
					if (cnt2 == 6) {
						win2 = 0;
					}
				}
			}
			if(win1 == 1 || win2 == 1) {
				continue;
			}
			//세로
			 win1 = 0;
			 win2 = 0;
			for(int i=0; i<10; i++) {
				cnt2 = 0;
				cnt1 = 0;
				for(int j =0; j<10; j++) {
					if(omok[j][i] == 1) {
						cnt1++;
					}
					else {
						cnt1 = 0;
					}
					if(omok[j][i] == 2) {
						cnt2++;
					}
					else {
						cnt2 = 0;
					}
					if (cnt1 == 5) {
						win1 = 1;
					}
					if (cnt1 == 6) {
						win1 = 0;
					}
					if (cnt2 == 5) {
						win2 = 1;
					}
					if (cnt2 == 6) {
						win2 = 0;
					}
				}
			}
			if(win1 == 1 || win2 == 1) {
				continue;
			}
			//대각선\
			 win1 = 0;
			 win2 = 0;
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			for(int i=0; i<6; i++) {
				for(int j =0; j<6; j++) {
					cnt1 = 0;
					cnt2 = 0;
					if(omok[i][j] == 1) {
						a = i;
						b = j;
					}
					if(omok[i][j] == 2) {
						c = i;
						d = j;
					}
					while (a < 10 && b < 10) {
						if(omok[a][b] == 1) {
							cnt1 ++;
						}
						else {
							cnt1 = 0;
						}
						if(cnt1 == 5 && win1 != 5) {
							win1 = 1;
						}
						if(cnt1 == 6) {
							win1 = 5;
						}
						a++;
						b++;
 					}
					while (c < 10 && d < 10) {
						if(omok[c][d] == 2) {
							cnt2 ++;
						}
						else {
							cnt2 = 0;
						}
						if(cnt2 == 5 && win2 != 5) {
							win2 = 1;
						}
						if(cnt2 == 6) {
							win2 = 5;
						}
						c++;
						d++;
					}
				}
			}
			if(win1 == 1 || win2 == 1) {
				continue;
			}
			//대각선/
			 win1 = 0;
			 win2 = 0;
			a = 0;
			b = 0;
			c = 0;
			d = 0;
			for(int i=0; i<6; i++) {
				for(int j =4; j<10; j++) {
					cnt1 = 0;
					cnt2 = 0;
					if(omok[i][j] == 1) {
						a = i;
						b = j;
					}
					if(omok[i][j] == 2) {
						c = i;
						d = j;
					}
					while (a < 10 && b >= 0) {
						if(omok[a][b] == 1) {
							cnt1 ++;
						}
						else {
							cnt1 = 0;
						}
						if(cnt1 == 5 && win1 != 5) {
							win1 = 1;
						}
						if(cnt1 == 6) {
							win1 = 5;
						}
						a++;
						b--;
 					}
					while (c < 10 && d >= 0) {
						if(omok[c][d] == 2) {
							cnt2 ++;
						}
						else {
							cnt2 = 0;
						}
						if(cnt2 == 5 && win2 != 5) {
							win2 = 1;
						}
						if(cnt2 == 6) {
							win2 = 5;
						}
						c++;
						d--;
					}
				}
			}
			
				turn = turn == 1 ? 2 : 1;		
		}//while
		sc.close();		
	}//c
}