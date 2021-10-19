package lv4;

import java.util.Scanner;

public class Ex03_09tc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int size = 5;
		int bingo[][] = new int[size][size];
		
		int win = 0;
		while(true) {
			//print
			for(int i=0; i<size; i++ ) {
				for(int j=0; j<size; j++) {
					if(bingo[i][j] == 1) {
						System.out.print("0 ");
					}
					else {
						System.out.print("+ ");					
					}
				}
				System.out.println();
			}
			//end 
			if(win == 1) {
				System.out.println("game clear !");
				break;
			}
			
			
				// 입력값 input
				System.out.print("y : ");
				int y = sc.nextInt();
				System.out.print("x : ");
				int x = sc.nextInt();
				
				// exception
				if(y < 0 || y > size-1 || x< 0 || x> size-1) {
					continue;
				}
				// mark
				if(bingo[y][x] == 0) {
					bingo[y][x] = 1;				
				}
				
				// check
				// 가로
				for(int i=0; i<size; i++) { // i : 행이 넘어감
					int cnt = 0;
					for(int j=0; j<size; j++) { // j : 열
						if(bingo[i][j] ==1) {
							cnt ++;
						}
					}
					if(cnt == size) {
						win ++;
					}
				}
				// 세로
				for(int i =0; i<size; i++) { // i: 열
					int cnt = 0;
					for(int j=0; j<size; j++) { // j : 행
						if(bingo[j][i] == 1) {
							cnt ++;
						}
					}
					if(cnt == size) {
						win ++;
					}
				}
				// 대각선 \
				int cnt = 0;
				for(int i=0; i<size; i++) {
					if(bingo[i][i] == 1) {
						cnt ++;
					}
				}
				if(cnt == size) {
					win ++;
				}
				// 대각선 /
				
				cnt = 0;
				for(int i=0; i<size; i++) {
					if(bingo[i][size-1-i] == 1) {
						cnt ++;
					}
				}
				if(cnt == size) {
					win ++;
				}
				
				
				
				
				
				
		}//while 
		
		
		
	}

}
