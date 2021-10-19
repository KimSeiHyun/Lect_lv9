package lv.test_2;

import java.util.Scanner;

public class lv2_11s {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[2단계]
		 * 1. 3회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x =0;
		int max = 0;
		while (x <3) {
			System.out.println("숫자를 입력해주세요 .");
			int num = sc.nextInt();
			if( max < num) {
				
				max = num;
			}
			x++;
		}
		System.out.println("가장 큰 값은 : " + max);
		
	}

}
