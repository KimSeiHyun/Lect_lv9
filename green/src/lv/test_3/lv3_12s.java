package lv.test_3;

import java.util.Scanner;

public class lv3_12s {

	public static void main(String[] args) {
		/*
		 * # 즉석복권 1. 숫자 7이 연속으로 3번 등장하면, "당첨" 출력.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int[] lotto = { 0, 7, 7, 7, 7, 0, 0, 0 };
		// int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};
		
		boolean run = true;

		System.out.println("1) 복권 결과확인");
		System.out.print("메뉴 선택 : ");
		int sel = sc.nextInt();
		int cnt = 0;
		if (sel == 1) {
			for(int i=0; i<lotto.length; i++) {
				if(lotto[i] == 7) {
					cnt ++;
				}
				if(lotto[i] == 0) {
					cnt = 0;
				}
				if(cnt ==3 ) {
					System.out.println("당첨 !! ");
					break;
				}
			}
		}
		if(cnt != 3) {
			System.out.println("꽝 ! ");
		}
		
		
	}

}
