package backjoon;

import java.util.Scanner;

public class lv3_007_11021 {

	public static void main(String[] args) {// 문제번호 11021

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			System.out.printf("Case #%d: %d\n",i+1,c);
		}
	}

}
