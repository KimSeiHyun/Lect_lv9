package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex13_5tc {

	public static void main(String[] args) {
		//제어문
		// ㄴ 조건문 if 
		// ㄴ 반복분 while , for 
		// ㄴ 보조제어문 break , continue
		
		//while 
		// 무한루프 -> 반복문 종료조건 .
		// 1. 초기식 
		// 2. 조건식
		// 3. 증감식 
		
		// 변수 n이 5까지 도달하면 -> 반복문 종료 .
		int n = 0; //초기식 
		
		while(n < 10) { // 조건식 

			if ( n < 5 ) {
				System.out.println("무한 반복중 ..");
			}
		//	if ( n == 4 ) {
	//			n = 11;
//			}
			n++;
		}
		
		/*
		 * # Up & Down 게임[2단계]
		 * 1. com 은 랜덤으로 1~100사이를 저장한다.
		 * 2. me 는 1~100사이를 입력한다. 	 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다.
		 */
		Scanner sc= new Scanner(System.in);
		Random rn = new Random();
		
		int quiz = rn.nextInt(100) +1 ;
		System.out.println("quiz :" + quiz);
		
//		boolean isRun = true ; 
		int isRun = 1 ;
		while(isRun == 1) {
			System.out.println("정답을 입력하세요 ! ");
			int answer = sc.nextInt();
			
			if (quiz == answer ) {
				System.out.println("정답입니다 .");
				//반복문 종료
//				isRun = false;
				isRun = 0;
			}
			else if ( quiz > answer ) {
				System.out.println("up!");
			}
			else if (quiz < answer ) {
				System.out.println("down!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
