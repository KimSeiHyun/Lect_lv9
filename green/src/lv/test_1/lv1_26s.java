package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_26s {

	public static void main(String[] args) {
		/*
		 * # 연산자 기호 맞추기 게임
		 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
		 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
		 * 3. 위 숫자는 연산자 기호에 해당된다.
		 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
		 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
		 * 예) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    정답 : 2번
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = rn.nextInt(10)+1;
		int b = rn.nextInt(10)+1;
		int c = rn.nextInt(4)+1;
		
		int temp = 0;
		if(c == 1) {
			temp = a+b;
		}
		if(c == 2) {
			temp = a-b;
		}
		if(c == 3) {
			temp = a*b;
		}
		if(c == 4) {
			temp = a%b;
		}
		
		System.out.println("연산자 기호 맞추기 게임 ! ");
		System.out.println(a + " ? " + b + " = " + temp);
		
		System.out.println("?에 들어갈 기호는 무엇일까요 ? 1.+  2.-  3.*  4.%");
		int answer = sc.nextInt();
		
		if(answer == c ) {
			System.out.println("정답!");
		}
		else {
			System.out.println("오답 ! ");
		}

	}

}
