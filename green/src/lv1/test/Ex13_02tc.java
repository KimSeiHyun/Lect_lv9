package lv1.test;

import java.util.Scanner;

public class Ex13_02tc {

	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[2단계]
		 * 1. 3회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		int cnt = 1;
		while (cnt <= 3) {
			System.out.println(cnt + "번째 정수 입력 :");
			int num = sc.nextInt();
			
			if (max < num) {
				max = num;
			}
			cnt ++;
		}
		System.out.println("최대값 : " + max);
	}

}
