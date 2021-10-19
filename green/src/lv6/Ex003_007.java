package lv6;

import java.util.Scanner;

class Ex003_07 {
	Scanner sc= new Scanner(System.in);
	int seat[] = new int[8];
	int cnt = 0;
	
	void print() {
		System.out.print("seat = ");
		for(int i=0; i<this.seat.length;i ++) {
			System.out.print(this.seat[i] + " ");
		}System.out.println();
		
	}
	int reservation() {
		System.out.println("좌석번호(index) 입력 : ");
		System.out.println("(종료를 원하시면 10 입력) ");
		int sel =sc.nextInt();
		int x = 0;
		if(sel>=0 && sel <this.seat.length && this.seat[sel] == 0) {
			this.seat[sel] = 1;
			cnt ++;
		}else if(sel>=0 && sel <this.seat.length && this.seat[sel] == 1) {
			System.out.println("이미 예약된 좌석입니다.");
		}
		
		return sel;
		
	}
	
	void pay() {
			System.out.println("----------------");
			System.out.println("총 매출액 : " + cnt*12000);
	}
	
	public void run() {
		while(true) {
		print();
		if(reservation() == 10) {
			pay();
			break;
		}
		
		}
	}
	
}
public class Ex003_007 {

	public static void main(String[] args) {
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
		Ex003_07 ex = new Ex003_07();
		ex.run();
	}

}
