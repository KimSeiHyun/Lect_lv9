package lv1.test;

import java.util.Random;

public class Ex13_03 {

	public static void main(String[] args) {
		/*
		 * # 랜덤학생
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.
		 */

		Random ran = new Random();
		
		int a = 1;
		int score = 0;
		int sum = 0;
		double avr = 0;
		int pass = 0;
		int max = 0;
		int top = 0;
		while (a <= 10) {
			score = ran.nextInt(100) +1;
			System.out.print(a+ "번째 학생" + "의 점수 : " +  score);
			if ( score >= 60) {
				System.out.println("(합격) ");
				pass ++;
				}
			else {
				System.out.println("(불합격) ");
			}

			if (max < score) {
				max = score;
				top = a;
			}

		
			sum += score;
			avr = sum / a;
			a++;
			
		}
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +avr);
		System.out.println("합격자 수 :" + pass);
		System.out.println("1등의 번호와 성적 : " + top+ "번 학생 " + "," + max + "점");
	}

}
