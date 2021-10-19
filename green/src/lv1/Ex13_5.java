package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex13_5 {

	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[2단계]
		 * 1. com 은 랜덤으로 1~100사이를 저장한다.
		 * 2. me 는 1~100사이를 입력한다. 	 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다.
		 */

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int com = ran.nextInt(100)+1 ;

		System.out.println("업다운 게임 ! ");
		System.out.println("숫자를 입력하세요 ! ");
		int me = sc.nextInt();
		while (com != me) {

			if (com > me ) {
				System.out.println("up!");
			}
			else if (com < me ) {
				System.out.println("down!");
			}
			else  {
				System.out.println("정답입니다 .");
			}
		}
	}
}
