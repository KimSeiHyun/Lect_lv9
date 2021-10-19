package lv1;

import java.util.Random;

public class Ex12_4 {

	public static void main(String[] args) {
		/*
		 * # 홀짝 게임
		 * 1. 1~100사이의 랜덤 숫자를 저장한다.
		 * 2. 저장된 랜덤 숫자를 보여주고,
		 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
		 * 시작 : 9:41
		 * 종료 : 9:45
		 * 소요시간 : 4분
		 */
		
		Random ran = new Random();
		
		int random = ran.nextInt(100)+1;
		System.out.println("홀짝게임 !");
		if (random %2 == 0  ) {
			System.out.println(random);
			System.out.println("짝수입니다 !");
		}
		else {
			System.out.println(random);
			System.out.println("홀수입니다 .");
		}

	}

}
