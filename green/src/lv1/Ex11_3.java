package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex11_3 {

	public static void main(String[] args) {
		/*
		 * # 연산자 기호 맞추기 게임
		 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
		 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
		 * 3. 위 숫자는 연산자 기호에 해당된다.
		 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 머지
		 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
		 * 예) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) /
		 *    정답 : 2번
		 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int a = ran.nextInt(10) +1;
		int b = ran.nextInt(10) +1;
		int c = ran.nextInt(4)  +1;
		// a  c  b  =  a c b 
		
		int result = 0;
		
		if(c == 1) {
			result = a + b ;
		}
		else if ( c == 2) {
			result = a - b ;
		}
		else if ( c == 3 ) {
			result = a * b ;
		}
		else if (c == 4 ) {
			result = a % b ;
		}
		
		//문제 보여주기 
		System.out.println(a + " ? " +  b + " = " + result);
		System.out.println("연산자는 ? 1.+  2.-  3.*  4.  % ");
			
		int answer = sc.nextInt();
		
		//검사 
		if(answer == c) {
			System.out.println("정답 !!");
		}
		else {
			System.out.println("틀렸습니다 . ");
		}
		

	}

}
