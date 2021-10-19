package lv1;

import java.util.Scanner;

public class Ex12_8 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제) 시험점수3개를 입력받고 학점출력 
		// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
		// 조건 2) 3과목의 평균이 100~90 ==> A
		// 조건 3) 3과목의 평균이 89~80 ==> B
		// 조건 4) 3과목의 평균이 79~70 ==> C
		// 조건 5) 69이하                      ==> 재시험 
		// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
		// 예) 98 ==> A+
		// 예) 89 ==> B+
		// 예) 79 ==> C+
		// 시작시간 : 10 : 54
		// 종료시간 : 11 : 30
		// 소요시간 : 36분.
		
		System.out.println("국어 영어 일본어 점수를 입력하세요.");
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int ja = sc.nextInt();
		
		int avr = (kr+en+ja) /3;
		if (avr >= 90 && avr < 97 ) {
			System.out.println(avr + "=A");
		}
		else if ( avr >= 97 && avr < 101) {
			System.out.println(avr + "=A+");
		}
		else if (avr >= 80 && avr  < 87 ) {
			System.out.println(avr + "=B");
		}
		else if ( avr >= 87 && avr < 90) {
			System.out.println(avr + "=B+");
		}
		else if (avr >= 70 && avr < 77 ) {
			System.out.println(avr + "=C");
		}
		else if (avr >= 77 && avr < 80 )
			System.out.println(avr + "=C+");
		else if (avr < 70 ){
			System.out.println(avr +"=재시험");
		}
		else {
			System.out.println("잘못된 점수입니다 .");
		}
		

	}

}
