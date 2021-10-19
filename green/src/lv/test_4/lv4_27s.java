package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_27s {

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
		
		// �� ��ġ
		System.out.print(">>>��ġ�� ���� ������ �Է��ϼ��� : ");
		wallCount = sc.nextInt();
		int temp = 0;
		while(temp < wallCount) {
			int r1 = rn.nextInt(SIZE);
			int r2 = rn.nextInt(SIZE);
			if(map[r1][r2] == 0) {
				map[r1][r2] = WALL;
				temp++;
			}
		}
		// �� ��ġ
		while(true) {
			int r1 = rn.nextInt(SIZE-2)+1;
			int r2 = rn.nextInt(SIZE-2)+1;
			if(map[r1][r2] == 0) {
				map[r1][r2] = BALL;
				ballX = r2;
				ballY = r1;
				break;
			}
		}
		
		// ��� ��ġ
		while(true) {
			int r1 = rn.nextInt(SIZE);
			int r2 = rn.nextInt(SIZE);
			if(map[r1][r2] == 0) {
				map[r1][r2] = GOAL;
				goalX = r2;
				goalY = r1;
				break;
			}
		}
		
		// ȭ�� ���
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				if(map[i][j] == WALL) System.out.print("�� ");
				if(map[i][j] == BALL) System.out.print("�� ");
				if(map[i][j] == GOAL) System.out.print("�� ");
				if(map[i][j] == PLAYER) System.out.print("�� ");
				if(map[i][j] == 0) System.out.print(map[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		// �÷��̾� ��ġ
		while(true) {
			System.out.println("�÷��̾ ��ġ�� ��ǥ �Է�  ");
			System.out.print("x : ");
			int x = sc.nextInt();
			System.out.print("y : ");
			int y = sc.nextInt();
			if(map[y][x] == 0) {
				map[y][x] = PLAYER;
				pX = x;
				pY = y;
				break;
			}else {
				System.out.println("�װ����� �÷��̾ ��ġ �� �� �����ϴ�.");
			}
		}
		
		// ���� ����
		while(true) {
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == WALL) System.out.print("�� ");
					if(map[i][j] == BALL) System.out.print("�� ");
					if(map[i][j] == GOAL) System.out.print("�� ");
					if(map[i][j] == PLAYER) System.out.print("�� ");
					if(map[i][j] == 0) System.out.print(map[i][j] + " ");
				}System.out.println();
			}System.out.println();
			if(ballX == goalX && ballY == goalY) {
				System.out.println("game clear !! ");
				break;
			}
			System.out.println("8.��  2.��  4.��  6.��");
			int move = sc.nextInt();
			
			int tempX = pX;
			int tempY = pY;
			
			if(move == 8) tempY --;
			if(move == 2) tempY ++;
			if(move == 4) tempX --;
			if(move == 6) tempX ++;
			
			if(tempY < 0 || tempY >=SIZE) continue;
			if(tempX < 0 || tempX >=SIZE) continue;
			if(map[tempY][tempX] == WALL || map[tempY][tempX] == GOAL) continue;
			
			if(map[tempY][tempX] ==BALL) {
				int tempBallX = ballX;
				int tempBallY = ballY;
				if(move == 8) tempBallY --;
				if(move == 2) tempBallY ++;
				if(move == 4) tempBallX --;
				if(move == 6) tempBallX ++;
				
				if(tempBallY < 0 || tempBallY >=SIZE) continue;
				if(tempBallX < 0 || tempBallX >=SIZE) continue;
				if(map[tempBallY][tempBallX] == WALL) continue;
				
				map[tempBallY][tempBallX] = BALL;
				map[ballY][ballX] = 0;
				ballY = tempBallY;
				ballX = tempBallX;	
			}
			
			map[tempY][tempX] = PLAYER;
			map[pY][pX] = 0;
			pY = tempY;
			pX = tempX;
			
			
		}//while
		
		
		
		
		
		
		
		
		
	}

}