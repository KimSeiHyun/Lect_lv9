package lv.test_1;

import java.util.Scanner;

public class lv1_15 {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[1단계]
		 * 1. 숫자 3개를 입력받는다.
		 * 2. 입력받은 3개의 수를 비교하여,
		 * 3. 가장 큰 수(MAX)를 출력한다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = 0;
		
		if(num1 > num2 && num1>num3) {
			max = num1;
		}
		if(num2 > num1 && num2>num3) {
			max = num2;
		}
		if(num3 > num2 && num3>num1) {
			max = num3;
		}
		System.out.println("가장 큰 수는 : " + max);

	}

}
