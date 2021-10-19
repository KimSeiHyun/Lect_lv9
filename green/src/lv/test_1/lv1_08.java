package lv.test_1;

import java.util.Scanner;

public class lv1_08 {

	public static void main(String[] args) {
		/*
		 * # 가위(0)바위(1)보(2) 게임[1단계]
		 * 1. com은 바위(1)만 낼 수 있다.
		 * 2. me는 0~2 사이의 숫자를 입력받는다.
		 * 3. com과 me를 비교해,
		 * 		1) 비겼다.
		 * 		2) 내가 이겼다.
		 * 		3) 내가 졌다.			를 출력한다.
		 */
		int com = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임 ! ");
		System.out.print("0=가위\n1=바위\n2=보");
		int me = sc.nextInt();
		
		if(me < com ) {
			System.out.println("내가 졋다 ..");
		}
		if(me == com ) {
			System.out.println("비겻다");
		}
		if(me > com ) {
			System.out.println("내가 이겻다 !!");
		}
		
	}

}
