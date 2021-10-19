package lv.test_1;

import java.util.Scanner;

public class lv1_32s {

	public static void main(String[] args) {
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 점수를 입력해주세요 .");
		int a = sc.nextInt();
		System.out.println("두번째 점수를 입력해주세요 .");
		int b = sc.nextInt();
		System.out.println("세번째 점수를 입력해주세요 .");
		int c = sc.nextInt();
		
		int avr = (a+b+c)/3;
		System.out.println("평균 : " + avr);
		if(avr >= 90 && avr <= 100) {
			if(avr%10 >= 7) {
				System.out.println("A+");
			}
			else {
				System.out.println("A");
			}
		}
		else if(avr >= 80 && avr < 90) {
			if(avr%10 >= 7) {
				System.out.println("B+");
			}
			else {
				System.out.println("B");
			}
		}
		else if(avr >= 70 && avr < 80) {
			if(avr%10 >= 7) {
				System.out.println("C+");
			}
			else {
				System.out.println("C");
			}
		}
		else {
			System.out.println("재시험 !! ");
		}

	}

}
