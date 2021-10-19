package lv.test_6;

import java.util.Scanner;

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

class Ex07s{
	private int[] seat = new int[7];
	private int money = 0;
	
	public void print() {
		for(int i=0; i<this.seat.length; i++) {
			System.out.print(this.seat[i] + " ");
		}System.out.println();
	}
	
	public int getSize() {
		return this.seat.length;
	}
	public int getSeat(int idx) {
		return this.seat[idx];
	}
	public void setSeat(int idx) {
		this.seat[idx] = 1;
	}
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney() {
		this.money += 12000;
	}
}
public class lv6_06s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex07s e = new Ex07s();
		
		while(true) {
			e.print();
			System.out.println("[MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("원하는 자리 인덱스 입력 :");
				int idx = sc.nextInt();
				if(idx >= 0 && idx < e.getSize() ) {
					if(e.getSeat(idx) == 0) {
						e.setSeat(idx);
						e.setMoney();
					}else System.out.println("이미 선택된 자리입니다.");
				}else System.out.println("인덱스 다시 확인 . ");
			}
			else if(sel == 2) {
				System.out.println("총 매출액은 : " + e.getMoney());
				break;
			}
		}


	}
}
