package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex03_09v2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		int[] temp = new int[maxNum*maxNum];
		int size = 50;
		int win = 0;
		int a = 0;
		while (true) {
			int sum = 0;
		int check = -1;
		int ranNum = ran.nextInt(50)+1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(bingo[i][j] == ranNum) {
					check = 1;
				}
			}		
		}
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(check == -1) {
					bingo[i][j] = ranNum;
					check =1;
					break;
				}
			}
				if(check ==1 ) {
					break;
				}
		}
		
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(bingo[i][j] != 0) {
					sum ++;
				}
			}
		}
		if(sum == 0) {
			break;
		}

		}//while
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(bingo[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
