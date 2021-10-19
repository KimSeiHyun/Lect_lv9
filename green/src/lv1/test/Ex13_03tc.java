package lv1.test;

import java.util.Random;

public class Ex13_03tc {

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

		int cnt = 0;
		int total = 0;
		int avg = 0;
		int pass = 0;
		int max = 0;
		int top = 0;
		
		while (cnt < 10) {
			int score = rn.nextInt(100) +1;
			
			total += score;
			System.out.print(cnt+1 + "번 학생의 점수 : " + score + "점");
		
			if(score >= 60) {
				System.out.println("(합격 !)");
				pass ++;
			}
			else {
				System.out.println("(불합격 !) ");
			}
			if (max < score) {
				max = score;
				top = cnt +1;
			}
			cnt ++;
		}
		
		System.out.println("total :" + total);
		System.out.println("avg:"+ total / 10);
		System.out.println("pass : " + pass);
		System.out.println("1등 : " + top + "번 학생 ," + max + "점");
	}

}
