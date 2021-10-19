package lv.test_1;

import java.util.Scanner;

public class lv1_15s {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[1단계]
		 * 1. 숫자 3개를 입력받는다.
		 * 2. 입력받은 3개의 수를 비교하여,
		 * 3. 가장 큰 수(MAX)를 출력한다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요 . ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요 . ");
		int num2 = sc.nextInt();
		System.out.println("세번째 숫자를 입력해주세요 . ");
		int num3 = sc.nextInt();
		
		int max = num1;
		
		if(max < num2) {
			max = num2;
		}
		if(max < num3 ) {
			max = num3;
		}
		System.out.println("최대값은 : " + max);

	}

}
