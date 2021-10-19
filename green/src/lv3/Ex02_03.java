package lv3;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		
	
		/*
		 * # 소수찾기[2단계]
		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 * 예)
		 * 입력 : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */

		Scanner sc = new Scanner(System.in);
		
	
		int b = 0;
		int a = sc.nextInt();
			for(int i =2; i<=a; i++) { 			// 2 3 4 5 6 7 8 9 10
				int cnt = 0;
				int x = 1;
				for(int j =1; j<=i; j++) {
					if ( i%x == 0) {
						cnt ++;
					}
					x++;
				}
				if (cnt == 2) {
					System.out.println(i);
				}
			}

		
		
		
		
		
	}

}
