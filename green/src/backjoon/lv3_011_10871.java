package backjoon;

import java.util.Scanner;

public class lv3_011_10871 {

	public static void main(String[] args) { //문제번호 10871

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			if(A < X ) {
				System.out.println(A);
			}
		}
		
		
		
	}

}
