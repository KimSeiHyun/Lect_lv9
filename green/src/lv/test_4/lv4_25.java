package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int maxNum = 5;
		
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		
		int[] temp = new int[maxNum*maxNum];
		int size = 50; // 1~50까지의 수를 중복없이 빙고판에 배치 

		int win = 0;
		
		int x = 0;
		while(x < 25) {
			int rNum = rn.nextInt(50)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == rNum) {
						check = 1;
						break;
					}
				}
				if(check == 1) {
					break;
				}
			}
			if(check == 1) {
				continue;
			}
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == 0) {
						bingo[i][j] = rNum;
						check = 2;
						x++;
						break;
					}
					
				}
				if(check == 2) break;
			}
			
			
			
		}
		
		
		while(true) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(bingo[i][j] + "\t");
				}System.out.println();
			}
			System.out.println("빙고의 좌표(x,y)를 입력해주세요 . ");
			System.out.print("x : ");
			x = sc.nextInt();
			System.out.print("y : ");
			int y = sc.nextInt();
			
			if(x >= 0 && x < 5 && y >= 0 && y <5) {
				if(bingo[x][y] != 0) {
					bingo[x][y] = 0;
				}else {
					System.out.println("이미 선택된 자리입니다.");
				}
				
			}else System.out.println("좌표를 다시 확인해주세요 . ");
			
			//가로
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == 0)cnt ++;
				}
				if(cnt == 5) win ++;
			}
			//세로
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<5; j++) {
					if(bingo[j][i] == 0)cnt ++;
				}
				if(cnt == 5) win ++;
			}
			//대각\
			int cnt = 0;
			for(int i=0; i<5; i++) {
				if(bingo[i][i] == 0) {
					cnt ++;
				}
			}
			if(cnt ==5 ) win++;
			//대각/
			cnt = 0;
			for(int i=0; i<5; i++) {
				if(bingo[i][4-i] == 0) {
					cnt ++;
				}
			}
			if(cnt ==5 ) win++;
			
			if(win != 0) {
				System.out.println("빙고!");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
