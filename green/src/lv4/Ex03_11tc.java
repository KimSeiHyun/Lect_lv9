package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex03_11tc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
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
		wallCount = scan.nextInt();
		for(int i=0; i<wallCount; i++) {
			int y = ran.nextInt(SIZE);
			int x = ran.nextInt(SIZE);
			
			if(map[y][x] == 0) {
				if(i == wallCount) {
					map[y][x] = GOAL;
				}
				else {
					map[y][x] = WALL;					
				}
			}
			else {
				i --;
			}
		}
		
		// sel Ball
		while(true) {
			int y = ran.nextInt(SIZE-2) + 1;
			int x = ran.nextInt(SIZE-2) + 1;
			
			if(map[y][x] == 0) {
				// cross check
				int check = 0;
				for(int i=-1; i<=1; i++) {// i : -1 0 1
					if(y+i >=  0 && y+i < SIZE && map[y+i][x] != 0) check ++;
					if(x+i >=  0 && x+1 < SIZE && map[y][x+i] != 0) check ++;
				}
				if(check <= 1 ) {
					ballY = y;
					ballX = x;
					map[ballY][ballX] = BALL;
					break;
				}
			}
		}
		
		// set Player
		while(true) {
			int y = ran.nextInt(SIZE);
			int x = ran.nextInt(SIZE);
			
			if(map[y][x] == 0) {
				pY = y;
				pX = x;
				map[pY][pX] = PLAYER;
				break;
			}
		}
		//run 
		boolean goal = false;
		while(true) {
			//print 
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == PLAYER) {
						System.out.print("옷\t");
					}
					else if(map[i][j] == WALL) {
						System.out.print("■\t");
					}
					else if(map[i][j] == GOAL) {
						System.out.print("☆\t");
					}
					else if(map[i][j] == BALL) {
						System.out.print("●\t");
					}
					else {
						System.out.print("□\t");
					}
				}
				System.out.println();
			}
		
		// end 
			if(goal) {
				System.out.println("goal !!!");
				break;
			}
			
			//input
		System.out.print("a좌 w위 s우 d하 :");
		String dir = scan.next();
		
		int yy = pY;
		int xx = pX;
		
		int byy = ballY;
		int bxx = ballX;
		if(dir.equals("a")) {
			xx --;
			bxx --;
		}
		else if(dir.equals("d")) {
			xx ++;
			bxx ++;
		}
		else if(dir.equals("w")) {
			yy --;
			byy --;
		}
		else if(dir.equals("s")) {
			yy ++;
			byy ++;
		}
		//exception 예외
		if(yy <0 || yy >SIZE-1 || xx < 0 || xx > SIZE-1 || map[yy][xx] == WALL 
				|| map[yy][xx] == GOAL) {
			continue;
		}
		//ball
		if(map[yy][xx] == BALL) {
		if(byy <0 || byy >SIZE-1 || bxx < 0 || bxx > SIZE-1 || map[byy][bxx] == WALL) {
			continue;
		}
		else if(map[byy][bxx] == GOAL) goal = true;
		
		ballY = byy;
		ballX = bxx;
		map[ballY][ballX] = BALL;
		}
		
		map[pY][pX] = 0;
		pY = yy;
		pX = xx;
		map[pY][pX] = PLAYER;
		
		}
		
		
		
		
		
		
		
		
	}

}
