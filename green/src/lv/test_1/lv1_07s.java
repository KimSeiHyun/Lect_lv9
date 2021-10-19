package lv.test_1;

import java.util.Scanner;

public class lv1_07s {

	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[1단계]
		 * 1. com은 8이다.
		 * 2. me는 숫자를 하나입력받는다.
		 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		int com = 8;
		
		Scanner sc = new Scanner(System.in);
		
		int me = sc.nextInt();
		
		if(me < com) {
			System.out.println("up!");
		}
		if(me == com) {
			System.out.println("bingo!");
		}
		if(me > com) {
			System.out.println("down!");
		}
	}

}
