package lv3.test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		/*
		 * # 영화관 좌석예매
		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		 * 4. 한 좌석당 예매 가격은 12000원이다.
		 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
		 * 예)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 이미 예매가 완료된 자리입니다.
		 * ----------------------
		 * 매출액 : 24000원
		 */
		// 시작 01:41
		// 종료 02:02
		// 소요 21분
		
		int arr[] = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		int money = 0 ;
		while (t) {
			System.out.println("------영화관------");
			System.out.println("1.예매");
			System.out.println("2.종료");
			for(int i = 0; i<7; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("지불해야될 금액 : " + money);
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("원하는 좌석을 입력해주세요.(0~7)");
				int a = sc.nextInt();
			for(int i =0; i<7; i++) {
				if ( i == a) { 
					arr[i] ++;
					money += 12000;
				}
				if(arr[i] == 2) {
					System.out.println("이미 예매가 완료된 자리입니다 .");
					arr[i] --;
					money -= 12000;
				}
			}
			}
			if ( sel == 2 ) {
				System.out.println("예매를 종료합니다 .");
				break; 
			}
			
			else {
				System.out.println("잘못된 메뉴입니다.");
			}

		}
		
	}

}
