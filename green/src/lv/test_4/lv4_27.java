package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_27 {

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
		
		// 벽 설치
		System.out.print(">>>설치할 벽의 개수를 입력하세요 : ");
		wallCount = sc.nextInt();
		int cnt = 0;
		while(cnt < wallCount) {
			int r1 = rn.nextInt(SIZE);
			int r2 = rn.nextInt(SIZE);
			if(map[r1][r2] == 0) {
				map[r1][r2] = WALL;
				cnt++;
			}
		}
		// 공 설치
		while(true) {
			int r1 = rn.nextInt(SIZE-1)+1;
			int r2 = rn.nextInt(SIZE-1)+1;
			if(map[r1][r2] == 0) {
				map[r1][r2] = BALL;
				ballY = r1;
				ballX = r2;
				break;
			}
		}
		
		// 골대 설치
		while(true) {
			int r1 = rn.nextInt(SIZE);
			int r2 = rn.nextInt(SIZE);
			if(map[r1][r2] == 0) {
				map[r1][r2] = GOAL;
				goalY = r1;
				goalX = r2;
				break;
			}
		}
		
		
		// 플레이어 배치
		while(true) {
			int r1 = rn.nextInt(SIZE);
			int r2 = rn.nextInt(SIZE);
			if(map[r1][r2] == 0) {
				map[r1][r2] = PLAYER;
				pY = r1;
				pX = r2;
				break;
			}
		}
		
		// 게임 시작
		while(true) {
			// 화면 출력
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == PLAYER) System.out.print("옷 ");
					else if(map[i][j] == WALL) System.out.print("■ ");
					else if(map[i][j] == BALL) System.out.print("● ");
					else if(map[i][j] == GOAL) System.out.print("○ ");
					else System.out.print(map[i][j] + " ");
				}System.out.println();
			}
			
			if(ballX == goalX && ballY == goalY) {
				System.out.println("clear!!");
				break;
			}
			int tempX = pX;
			int tempY = pY;
			System.out.println("8.상  2.하  4.좌  6.우");
			int sel = sc.nextInt();
			if(sel == 8) tempY--;
			if(sel == 2) tempY++;
			if(sel == 4) tempX--;
			if(sel == 6) tempX++;
			
			if(tempY < 0 || tempY >= SIZE) continue;
			if(tempX < 0 || tempX >= SIZE) continue;
			if(map[tempY][tempX] == WALL || map[tempY][tempX] == GOAL) continue;
			
			if(map[tempY][tempX] == BALL) {
				int tempBallX = ballX;
				int tempBallY = ballY;
				if(sel == 8) tempBallY--;
				if(sel == 2) tempBallY++;
				if(sel == 4) tempBallX--;
				if(sel == 6) tempBallX++;
				if(tempBallY < 0 || tempBallY >= SIZE) continue;
				if(tempBallX < 0 || tempBallX >= SIZE) continue;
				if(map[tempBallY][tempBallX] == WALL) continue;
				
				map[tempBallY][tempBallX] = BALL;
				ballX = tempBallX;
				ballY = tempBallY;
				
			}
			
			map[pY][pX] = 0;
			map[tempY][tempX] = PLAYER;
			pY = tempY;
			pX = tempX;

		}//while 

	}

}