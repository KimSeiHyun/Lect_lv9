package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_19s {

	public static void main(String[] args) {
		/*
		 * # 가위(0)바위(1)보(2) 게임[2단계] 
		 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
		 * 2. me는 0~2 사이의 숫자를 입력받는다. 
		 * 3. com과 me를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com = rn.nextInt(3);
		
		System.out.println("관리자시점");
		System.out.println("com : " + com);
		
		System.out.println("숫자를 입력해주세요 . (0:가위  1:바위  2:보)");
		int me = sc.nextInt();
		
		if(me == com ) {
			System.out.println("비겻다 !! ");
		}
		if(me == 0 && com == 1) {
			System.out.println("내가졋다 ,,");
		}
		if(me == 0 && com == 2) {
			System.out.println("내가이겼다 !! ");
		}
		if(me == 1 && com == 0) {
			System.out.println("내가 이겻다 !! ");
		}
		if(me == 1 && com == 2) {
			System.out.println("내가 졋다 .. ");
		}
		if(me == 2 && com == 0) {
			System.out.println("내가 졋다 ..");
		}
		if(me == 2 && com == 1) {
			System.out.println("내가 이겻다 !! ");
		}
		
	}

}
