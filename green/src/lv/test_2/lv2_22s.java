package lv.test_2;

import java.util.Random;

public class lv2_22s {

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
		Random rn = new Random();
		
		int x = 1;
		int sum = 0;
		int avr = 0;
		int cnt = 0;
		int max = 0;
		int y = 0;
		while (x <=10) {
			int score = rn.nextInt(100)+1;
			if (max <score ) {
				max = score;
				y = x ;
			}
			sum += score;
			System.out.print(x + "번의 성적 : " + score);
			if(score >= 60 ) {
				System.out.print("(합격!!)");
				cnt ++;
			}
			System.out.println();
			x++;
		}//w
		avr = sum / 10;
		System.out.println("전교생의 총점 : "+sum);
		System.out.println("전교생의 평균 : "+avr);
		System.out.println("합격자 수 : " + cnt + "명");
		System.out.println("1등 학생의 번호와 성적 : " +y + "번째 "+ max + "점");
		
		
	}

}
