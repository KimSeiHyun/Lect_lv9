package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_25s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int maxNum = 5;
		
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		
		int[] temp = new int[maxNum*maxNum];
		int size = 50; // 1~50까지의 수를 중복없이 빙고판에 배치 

		int win = 0;
		
		int cnt = 0;
		while(cnt < 25) {
			int rNum = rn.nextInt(50)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == rNum) check = 1;
				}
			}
			
			if(check ==0) {
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						if(bingo[i][j] == 0) {
							bingo[i][j] = rNum;
							check = 2;
							break;
						}
					}
					if(check == 2) {
						cnt++;
						break;
					}
				}
			}
		}//while
		
		while(true) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(bingo[i][j] + "\t");
				}System.out.println();
			}
			
			System.out.println("숫자를 입력해주세요 .");
			int num = sc.nextInt();
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;
					}
				}
			}
			//가로
			for(int i=0; i<5; i++) {
				 cnt = 0;
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == 0)cnt ++;
				}
				if(cnt == 5) win ++;
			}
			//세로
			for(int i=0; i<5; i++) {
				 cnt = 0;
				for(int j=0; j<5; j++) {
					if(bingo[j][i] == 0)cnt ++;
				}
				if(cnt == 5) win ++;
			}
			//대각\
			 cnt = 0;
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
			
		}//while 
		
		
		
		
		
	}

}
