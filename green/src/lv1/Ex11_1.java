package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		
		/*
		 * # 가운데 숫자 맞추기 게임
		 * 1. 150~250 사이의 랜덤 숫자 저장
		 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
		 * 예)
		 * 		249		: 4
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가운데 숫자 맞추기 게임 ! ");
		int a = ran.nextInt(101) + 150 ; 
		System.out.println(a);
		
		int answer = a / 10 % 10 ; // 십의자리수만 남음 . ex 150 / 10 % 10 = 5 
		System.out.println("가운데 숫자를 입력해주세요 !");
		int b = sc.nextInt();
		
		if (b == answer) {
			System.out.println("정답입니다.");
		} 
		else {
			System.out.println("틀렸습니다 .");
		}
		
		/*
		 * # 369게임[1단계]
		 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
		 * 2. 위 수에 369의 개수가
		 * 	1) 2개이면, 짝짝을 출력
		 *  2) 1개이면, 짝을 출력
		 *  3) 0개이면, 해당 숫자를 출력
		 * 예)
		 * 		33	 : 짝짝
		 * 		16	 : 짝
		 * 		 7	 : 7
		 */
		
		int quiz = ran.nextInt(50) +1;
		
		int ten = quiz / 10;
		int one = quiz % 10;
		
		int clap = 0;
		
		if(ten % 3 == 0  && ten != 0) {
			clap ++;
		}
		if (one % 3 == 0 && one != 0) {
			clap ++;
			
		}
		
		//박수시작
		System.out.println("quiz : " + quiz);
		if(clap == 2 ) {
			System.out.println("짝짝");
		}
		else if (clap == 1) {
			System.out.println("짝");
		}
		else if (clap == 3) {
			System.out.println(quiz);
		}

	}

}
