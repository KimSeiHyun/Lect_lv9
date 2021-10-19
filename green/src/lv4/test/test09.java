package lv4.test;

import java.util.Random;
import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		int[][] map = new int[SIZE][SIZE];
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		// 시작 12:07
		// 종료 01:44 
		// 소요 01:37
		
		System.out.println("설치할 벽의 갯수를 입력하세요 . ");
		wallCount = sc.nextInt();
		int x = 0;
		while(x < wallCount) { //벽 설치
			int check = 10;
			for(int i=0; i<7; i++) {
				for(int j=0; j<7; j++) {
					if(map[i][j] == 0) {
					map[i][j] = 1;
					check = 1;
					x++;
					break;
					}
				}
				if(check == 1) break;
			}
		}//w
		for(int i=0; i<7; i++) { // 사람 설치
			int check = 0;
			for(int j=0; j<7; j++) {
				if(map[i][j] == 0) {
				map[i][j] = 2;
				check = 1;
				break;
				}
			}
			if(check == 1) break;
		}
		for(int i=0; i<7; i++) { // 공 설치
			int check = 0;
			for(int j=0; j<7; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 3;
					check = 1;
					break;
				}
			}
			if(check == 1) break;
		}
		for(int i=0; i<7; i++) { // 골대 설치
			int check = 0;
			for(int j=0; j<7; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 4;
					check = 1;
					break;
				}
			}
			if(check == 1) break;
		}	
		int x2 = 0;
		while (x2 < 1) {// 벽 사람 공 골대 임의 배치 
			x = 0;
		while(x < 500) {
			int a = rn.nextInt(7);
			int b = rn.nextInt(7);
			int temp = map[0][0];
			map[0][0] = map[a][b];
			map[a][b] = temp;
			x ++;
		}
		for(int i=1; i<6; i++) {
			for(int j= 1; j<6; j++) {
				if(map[i][j] == 3 && map[i][j+1] != 1 && map[i][j-1] != 1
						&& map[i+1][j] != 1 && map[i-1][j] != 1) {
					x2 = 2;
				}
			}
		}
		
		}
		
		int check = -1;
		while(true) {
			for(int i=0; i<7; i++) {//출력
				for(int j=0; j<7; j++) {
					if(map[i][j] == 1) {
						System.out.print("■ ");
					}
					if(map[i][j] == 2) {
						System.out.print("옷 ");
					}
					if(map[i][j] == 3) {
						System.out.print("● ");
					}
					if(map[i][j] == 4) {
						System.out.print("○ ");
					}
					if(map[i][j] == 0) {
						System.out.print("+ ");
					}
				}
				System.out.println();
			}
			if(check == 1) { // 게임종료
				System.out.println("game clear ! ");
				break;
			}
			System.out.println("4.좌  8.상  6.우  2.하");
			int move = sc.nextInt();
			
			if (move == 4) { // 좌
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][0] == 2) {
							break;
						}
						if(map[i][j] == 2 && map[i][j-1] == 3 && map[i][j-2] == 1) {
							break;
						}
						if(map[i][j] == 2 && map[i][j-1] == 1) {
							break;
						}
						if(map[i][1] == 2 && map[i][0] == 3) {
							break;
						}
						if(map[i][j] == 2 && map[i][j-1] == 4) {
							break;
						}
						if(map[i][j] == 2 && map[i][j-1] == 3 && map[i][j-2] == 4) {
							check = 1;
						}
						if(map[i][j] == 2 && map[i][j-1] == 0) {
							map[i][j] = 0;
							map[i][j-1] = 2;
							break;
						}
						if(map[i][j] == 2 && map[i][j-1] == 3) {
							map[i][j] = 0;
							map[i][j-1] = 2;
							map[i][j-2] = 3;
							break;
						}
					}
				}
				
			}
			if (move == 6) { // 우
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] == 2 && map[i][j+1] == 3 && map[i][j+2] == 4) {
							check = 1;
						}
						if(map[i][6] == 2) {
							break;
						}
						if(map[i][j] == 2 && map[i][j+1] == 3 && map[i][j+2] == 1) {
							break;
						}
						if(map[i][j] == 2 && map[i][j+1] == 1) {
							break;
						}
						if(map[i][5] == 2 && map[i][6] == 3) {
							break;
						}
						if(map[i][j] == 2 && map[i][j+1] == 4) {
							break;
						}
						if(map[i][j] == 2 && map[i][j+1] == 0) {
							map[i][j] = 0;
							map[i][j+1] = 2;
							break;
						}
						if(map[i][j] == 2 && map[i][j+1] == 3) {
							map[i][j] = 0;
							map[i][j+1] = 2;
							map[i][j+2] = 3;
							break;
						}
					}
				}
			}
			if (move == 8) { // 상 
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[0][j] == 2) {
							break;
						}
						if(map[1][j] == 2 && map[0][j] == 3) {
							break;
						}
						if(map[i][j] == 2 && map[i-1][j] == 1) {
							break;
						}
						if(map[i][j] == 2 && map[i-1][j] == 3 && map[i-2][j] == 1) {
							break;
						}
						if(map[i][j] == 2 && map[i-1][j] == 4) {
							break;
						}
						if(map[i][j] == 2 && map[i-1][j] == 3 && map[i-2][j] == 4) {
							check = 1;
						}
						if(map[i][j] == 2 && map[i-1][j] == 0) {
							map[i][j] = 0;
							map[i-1][j] = 2;
							break;
						}
						if(map[i][j] == 2 && map[i-1][j] == 3) {
							map[i][j] = 0;
							map[i-1][j] = 2;
							map[i-2][j] = 3;
							break;
						}
					}
				}
			}
			if (move == 2) { // 하 
				int check2 = 0;
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[6][j] == 2) {
							break;
						}
						if(map[5][j] == 2 && map[6][j] == 3) {
							break;
						}
						if(map[i][j] == 2 && map[i+1][j] == 1) {
							break;
						}
						if(map[i][j] == 2 && map[i+1][j] == 3 && map[i+2][j] == 1) {
							break;
						}
						if(map[i][j] == 2 && map[i+1][j] == 4) {
							break;
						}
						if(map[i][j] == 2 && map[i+1][j] == 3 && map[i+2][j] == 4) {
							check = 1;
						}
						if(map[i][j] == 2 && map[i+1][j] == 0) {
							map[i][j] = 0;
							map[i+1][j] = 2;
							check2 = 1;
							break;
						}
						if(map[i][j] == 2 && map[i+1][j] == 3) {
							map[i][j] = 0;
							map[i+1][j] = 2;
							map[i+2][j] = 3;
							check2 = 1;
							break;
						}
					}
					if(check2 == 1) {
						break;
					}
				}
			}
			

			
		}//w
		

		
	}

}
