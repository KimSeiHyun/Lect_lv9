package lv6;

import java.util.Scanner;

class Ex07 {
	
	int seat[] = new int[7];
	int pay = 0;
	
}
public class Ex001_005 {

	public static void main(String[] args) {
		
		/*
		 * # 영화관 좌석예매 : 클래스 + 변수
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
		
		
		Scanner sc = new Scanner(System.in);
		Ex07 ex = new Ex07();
		while(true) {
			for(int i=0; i<7; i++) {
				System.out.print(ex.seat[i] + " ");
			}System.out.println();
			System.out.println("1.예매하기");
			System.out.println("0.종료하기");
			int sel2 = sc.nextInt();
			
			if(sel2 == 1) {

				System.out.println("예매하실 좌석을 입력해주세요 .");
				int sel = sc.nextInt()-1;
				
				if(sel >=0 && sel < 7) {
					if(ex.seat[sel] == 0) {
						ex.seat[sel] = 1;	
						ex.pay += 12000;
					}else System.out.println("이미 예약된 좌석입니다.");
				}else System.out.println("좌석의 범위를 다시 확인해주세요 . ");
				
			}
			if(sel2 == 0) {
				System.out.println("프로그램을 종료합니다");
				System.out.println("매출액 : "  + ex.pay);
				break;
			}
			
			
		}//while(true)

		
	}

}
