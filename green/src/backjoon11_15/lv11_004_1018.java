package backjoon11_15;

import java.util.Random;
import java.util.Scanner;

public class lv11_004_1018 {

	public static void main(String[] args) { //1018
		Scanner sc= new Scanner(System.in);
		Random rn = new Random();
		int x = sc.nextInt();
		int y = sc.nextInt();
		String arr[][] = new String[x][y];
		String arr2[][] = new String[8][8];
		String arr3[][] = new String[8][8];
		String temp[] = new String[x];
		for(int i=0; i<x; i++) {
			String a = sc.next();
			temp[i] = a;
		}
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++ ) {
				arr[i][j] = temp[i].charAt(j)+"";
			}
		}
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(i % 2 == 0 ) {
					if(j % 2 == 0 ) {
						arr2[i][j] = "W";
					}
					else arr2[i][j] = "B";
				}
				else {
					if(j % 2 == 0 ) {
						arr2[i][j] = "B";
					}
					else arr2[i][j] = "W";
				}
			}
		}
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(i % 2 == 0 ) {
					if(j % 2 == 0 ) {
						arr3[i][j] = "B";
					}
					else arr3[i][j] = "W";
				}
				else {
					if(j % 2 == 0 ) {
						arr3[i][j] = "W";
					}
					else arr3[i][j] = "B";
				}
			}
		}
		int min = 32;
		for(int i=0; i<x-7; i++) {
			for(int j=0; j<y-7; j++ ) {
				int cnt1 = 0;
				int cnt2 = 0;
				int W = 0;
				int B = 0;
				int x2 = 0;
				for(int a=i; a<i+8; a++) {
					int y2 = 0;
					for(int b=j; b<j+8; b++) {
						if(!arr[a][b].equals(arr2[x2][y2])) {
							cnt1++;
						}
						if(!arr[a][b].equals(arr3[x2][y2])) {
							cnt2++;
						}
//						System.out.print(arr[a][b]);
				//		System.out.print(arr2[x2][y2]);
							y2++;
					}
					x2++;
				}
				if(cnt1 < min) {
					min = cnt1;
				}
				if(cnt2 < min) {
					min = cnt2;
				}
//				System.out.println("cnt1 : " + cnt1);
//				System.out.println("cnt2 : " + cnt2);
//				System.out.println("i : " + i);
//				System.out.println("j : " + j);
//				System.out.println("W : " + W);
//				System.out.println("B : " + B);
			}
		}
		
		System.out.println(min);

//		for(int i=0; i<x; i++) {
//			for(int j=0; j<y; j++ ) {
//				System.out.print(arr[i][j]);
//			}System.out.println();
//		}System.out.println();

		
		
		
    }
	
}
