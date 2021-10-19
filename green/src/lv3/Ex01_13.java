package lv3;

import java.util.Scanner;

public class Ex01_13 {

	public static void main(String[] args) {
		/*
		 * # 즉석복권 1. 숫자 7이 연속으로 3번 등장하면, "당첨" 출력.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int[] lotto = { 0, 0, 0, 7, 7, 0, 7, 7 };
		// int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};
		boolean run = true;
		System.out.println("1) 복권 결과확인");
		System.out.print("메뉴 선택 : ");
		int sel = scan.nextInt();
		while(run) {	
		if (sel == 1) {
			for (int i = 0; i<5; i++) {
				if ( lotto[i] == 7) {
					i++;
					if( lotto[i] ==7 ) {
						i ++;
						if (lotto[i] ==7) {
							System.out.println("당첨 . ");
							run = false;
						}
						else {
							System.out.println("꽝!");
							run = false;
						}
					}
				}


			}


		}
		else {
			System.out.println("종료합니다 .");
			run = false;
		}
		}
	}

}
