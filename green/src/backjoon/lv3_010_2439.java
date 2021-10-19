package backjoon;

import java.util.Scanner;

public class lv3_010_2439 {

	public static void main(String[] args) { //문제번호 2439
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			for(int j=i; j<x-1; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
