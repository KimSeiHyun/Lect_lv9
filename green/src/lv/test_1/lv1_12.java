package lv.test_1;

import java.util.Scanner;

public class lv1_12 {

	public static void main(String[] args) {
		/*
		 * # 점수 유효성 검사
		 * 1. 점수을 입력받는다.
		 * 2. 점수가  60점 이상이면 합격, 60점 미만이면 불합격이다.
		 * 3. 단, 입력받은 정수가 
		 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
		 *    예) 점수를  잘못 입력했습니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>=60 && score <= 100) {
			System.out.println("합격 !! ");
		}
		if(score <60 && score >= 0 ) {
			System.out.println("불합격 !! ");
		}
		if(score >100 || score <0) {
			System.out.println("점수를 잘못 입력했습니다.");
		}

	}

}
