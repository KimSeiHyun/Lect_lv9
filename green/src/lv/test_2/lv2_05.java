package lv.test_2;

import java.util.Random;
import java.util.Scanner;

public class lv2_05 {

	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[2단계]
		 * 1. com 은 랜덤으로 1~100사이를 저장한다.
		 * 2. me 는 1~100사이를 입력한다. 	 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다.
		 */
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com = rn.nextInt(100)+1;
		int x = 0;
		System.out.println("com : " + com);
		System.out.println("업다운 게임 ! ");
		System.out.println("숫자를 입력해주세요 ! ");
		while (x <1) {
			int me = sc.nextInt();
			if(me >= 1  && me <= 100) {
				if(me == com ) {
					System.out.println("정답!");
					x = 1;
				}
				else if (me < com ) {
					System.out.println("업!");
				}
				else if (me > com ) {
					System.out.println("다운!");
				}
			}
			else {
				System.out.println("숫자의 범위를 벗어났습니다 . ");
			}
			
			
		}
		
		
	}

}
