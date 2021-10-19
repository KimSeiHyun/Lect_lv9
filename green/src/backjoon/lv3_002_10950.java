package backjoon;

import java.util.Scanner;

public class lv3_002_10950 {

	public static void main(String[] args) {//문제번호 10950
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
