package lv.test_6;
/*
 * # 영화관 좌석예매 : 클래스 + 메서드
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

import java.util.Scanner;

class Theater{
	
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	
	String name = "";				// 영화관 이름
	int cnt = 0;					// 예매 수
	int money = 0;					// 매출액
	
	
	void showMenu() {
		System.out.println("=== " + name + " ===");
		System.out.println("1.예매하기");
		System.out.println("2.종료하기");
	}
	
	public void seatPrint() {
		for(int i=0; i<this.seat.length; i++) {
			System.out.print(this.seat[i] + " ");
		}System.out.println();
	}
	
	public void choiceIdx() {
		System.out.print("예매할 자리입력(idx) : ");
		int idx = scan.nextInt();
		if(idx >= 0 && idx < this.seat.length) {
			if(this.seat[idx] == 0 ) {
				this.seat[idx] = 1;
				cnt ++;
			}else System.out.println("이미 선택된 자리입니다.");
			
		}else System.out.println("인덱스 범위 확인 . ");
	}
	
	public void moneyPrint() {
		System.out.println("총 매출액 : " + this.cnt*12000);
		
	}
	
	void run() {
		while(true) {
			seatPrint();
			showMenu();
			int sel = scan.nextInt();
			if(sel == 1) {
				choiceIdx();
			}
			if(sel == 2) {
				moneyPrint();
				break;
			}
			
		}
	}
}
public class lv6_34 {

	public static void main(String[] args) {
		Theater megabox = new Theater();
		megabox.name = "메가박스";
		
		megabox.run();

	}
}
