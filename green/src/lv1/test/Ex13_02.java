package lv1.test;

import java.util.Scanner;

public class Ex13_02 {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[2단계]
		 * 1. 3회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		boolean d = true;
		while (d) { 
			System.out.println("최대값 구하기 .");
			System.out.println("첫번째 숫자를 입력하세요 . ");
			a = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요 . ");
			b = sc.nextInt();
			System.out.println("새번째 숫자를 입력하세요 . ");
			c = sc.nextInt();
			if (a > b && a >c ) {
				System.out.println("가장 큰 값은 1번째 입력한 ");
				System.out.println(a);
			}
			if(b > a && b > c) {
				System.out.println("가장 큰 값은 2번째 입력한 ");
				System.out.println(b);
			}
			if( c> a && c > b ) {
				System.out.println("가장 큰 값은 3번째 입력한 ");
				System.out.println(c);
			}
			d = false;
			
					
			
		}

	}

}
