package lv3;

import java.util.Scanner;

public class Ex01_12 {

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

				Scanner scan = new Scanner(System.in);
				
				int[] seat = new int[7];
				boolean run = true;
				int cnt = 0;
				while(run) {
					System.out.println("=영화관=");
					System.out.println("1.좌석예매");
					System.out.println("2.종료");
					System.out.println("메뉴 선택 : ");
					System.out.println("========");
					System.out.println("총급액 :" +cnt*12000);
					int sel = scan.nextInt();
					if(sel == 1) {
						
						System.out.println("좌석선택 : 0~7");
						int index = scan.nextInt();
						for (int i=0; i<7; i ++) {		

							if ( index == i) {
								seat[i] += 1;
								cnt++;
							}
							if ( seat[i] == 2) {
								seat[i] -= 1;
								cnt --;
								System.out.println("이미 예약된 자리입니다.");
							}


							 if (index > 7) {
								System.out.println("잘못된 범위입니다.");
								break;
							}

						}

					}
					else if(sel == 2) {
						System.out.println("티켓팅을 종료합니다.");
						run = false;
					}		

					for( int i=0; i<7; i++) {
						System.out.print(seat[i]+ "  ");
					}
				}

		
	}
}
