package lv3;

import java.util.Scanner;

public class Ex02_03tc {

	public static void main(String[] args) {
		
		/*
		 * # 소수찾기[2단계]
		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 * 예)
		 * 입력 : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt(); // 2~num
		int count = 0;
		for ( int i=2; i<=num; i++) {
			int cnt = 0; // cnt 변수가 반복문 밖에 있으면 2이상으로 계속 누적됨 . 그래서 소수를 찾을 수 없음 . 
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt ++;
				}
			}
			if ( cnt == 2 ) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count + "개");
		
		
		
		
		
		
		
		
		
		
		
	}

}
