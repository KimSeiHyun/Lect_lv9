package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex03_10tc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int maxNum = 5;
		int[][] me = new int[maxNum][maxNum];
		int[][] you = new int[maxNum][maxNum];
		int[][] meMark = new int[maxNum][maxNum];
		int[][] youMark = new int[maxNum][maxNum];
		int[] temp = new int[maxNum * maxNum];
		int win = 0;
		
		System.out.print("size : ");
		int size = scan.nextInt();
		System.out.print("n Bingo:");
		int n = scan.nextInt();
		
	//	if(size >= 2) {
		int range = (int)Math.round(size*size*1.5);
		int p1[][] = new int[size][size];
		int p2[][] = new int[size][size];
		
		//랜덤 뿌리기 (중복없이 )
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				int rNum = ran.nextInt(25) +1;
				
				int check = 1;
				for(int y=0; y<size; y++) {
					for(int x = 0; x<size; x ++) {
						if(p1[y][x] == rNum) {
							check = -1;
						}
							
					}
				}
				
				if(check == 1) {
					p1[i][j] = rNum ;
				}
				else {
					 j --;
				}
			}
		}
		// p2
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				int rNum = ran.nextInt(25) +1;
				
				int check = 1;
				for(int y=0; y<size; y++) {
					for(int x = 0; x<size; x ++) {
						if(p2[y][x] == rNum) {
							check = -1;
						}
						
					}
				}
				
				if(check == 1) {
					p2[i][j] = rNum ;
				}
				else {
					j --;
				}
			}
		}
		//run
		int end = 0;
		int turn = 1;
		while(true) {
			int win1 =0;
			int win2 =0;
			
			//print
			System.out.println("[bingo]");
			System.out.println("p1>>");
			for(int i=0; i<size; i++) {
				for(int j =0; j<size; j++) {
					if(p1[i][j] ==0) {
						System.out.print("*\t");
					}
					else {
						System.out.print(p1[i][j] + "\t");					
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("p2>>");
			for(int i=0; i<size; i++) {
				for(int j =0; j<size; j++) {
					if(p2[i][j] ==0) {
						System.out.print("*\t");
					}
					else {
						System.out.print(p2[i][j] + "\t");					
					}
				}
				System.out.println();
			}
			//end
			if(end != 0) {
				System.out.printf("p%d %d Bingo!",end , n);
				break;
			}
			
			
			//input
			System.out.printf("p%d ", turn);
			int num = scan.nextInt();
			
			
			// mark
			for(int i=0; i<size; i++) {
				for(int j =0; j<size; j++) {
					if(p1[i][j] == num) {
						p1[i][j] = 0;
					}
					if(p2[i][j] == num) {
						p2[i][j] = 0;
					}
				}
			}
			
			
			//check
			// 가로 
			for(int i =0; i<size; i++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int j=0; j<size; j++) {
					if(p1[i][j] == 0) {
						cnt1 ++;
					}
					if(p2[i][j] == 0) {
						cnt2 ++;
					}
				}
				if(cnt1 == size) win1 ++;
				if(cnt2 == size) win2 ++;
			}
			// 세로
			for(int i=0; i<size; i++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int j=0; j<size; j++) {
					if(p1[j][i] == 0) cnt1 ++;
					if(p2[j][i] == 0) cnt2 ++;
				}
				if(cnt1 == size ) win1 ++;
				if(cnt2 == size ) win2 ++;
			}
			// 대각선\
			int cnt1 =0;
			int cnt2 =0;
			for(int i=0; i<size; i++) {
				if(p1[i][i] == 0) cnt1 ++;
				if(p2[i][i] == 0) cnt2 ++;
			}
			if(cnt1 == size) win1 ++;
			if(cnt2 == size) win2 ++;
			
			// 대각선/
			cnt1 =0;
			cnt2 =0;
			for(int i=0; i<size; i++) {
				if(p1[i][size-1-i] == 0) cnt1 ++;
				if(p2[i][size-1-i] == 0) cnt2 ++;
			}
			if(cnt1 == size) win1 ++;
			if(cnt2 == size) win2 ++;
			
			
			if(win1 == 1) end = 1;
			if(win2 == 1) end = 2;
			turn = turn == 1 ? 2 : 1;
		}//while

	}

}
