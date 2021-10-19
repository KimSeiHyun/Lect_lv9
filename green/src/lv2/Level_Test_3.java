package lv2;

import java.util.Random;

public class Level_Test_3 {

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
		//	시작 : 10:43
		//	종료 : 10:52
		//	소요 : 9분
		
		Random ran = new Random();
		int a = 1 ;
		int pass = 0;
		int sum = 0;
		int avr = 0;
		int top = 0;
		int max = 0;
		
		while (a <= 10 ) {
			int score = ran.nextInt(100) +1;
			System.out.print(a + "번째 학생 :" + score);
			if (score >= 60 ) {
				System.out.println("(합격) ");
				pass++;
			}
			else {
				System.out.println("(불합격!)");
			}
			if (max < score) {
				max = score;
				top = a;
			}
			
			a++;
			
			sum += score;
			avr = sum/10;
		}
		
		System.out.println("전교생의 총점:" + sum );
		System.out.println("전교생의 평균:" + avr );
		System.out.println("합격자수 :" + pass);
		System.out.println("1등 학생의 번호 와 성적 : " + top + "번째" + max + "점");

	}

}
