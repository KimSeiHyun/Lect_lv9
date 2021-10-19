package lv.test_1;

import java.util.Scanner;

public class lv1_16 {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[1단계]
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
		 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
		 * 예)	3 x 7 = ?
		 * 3. 문제에 해당하는 정답을 입력받는다.
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요 . ");
		int x = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요 . ");
		int y = sc.nextInt();
		
		System.out.println(x + " x " + y + " =  ?" );
		
		int z = x*y;
		
		System.out.println("정답을 입력해주세요 .");
		int answer = sc.nextInt();
		
		if(answer == z) {
			System.out.println("정답 ! ");
		}
		if(answer != z) {
			System.out.println("땡 !  ");
		}
		

	}

}
