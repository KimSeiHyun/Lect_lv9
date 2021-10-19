package lv7.test;

import java.util.Scanner;

class Seat {
	private int x;
	
	int getX() {
		return this.x;
	}
	void setX(int x ) {
		this.x = x;
	}
}

class TMS {
	Scanner sc = new Scanner(System.in);
	private int price = 12000;
	private int total = 0;
	Seat seat[][] = new Seat[10][10];
	
	void set() {
		for(int i=0; i<this.seat.length; i++) {
			for(int j=0; j<this.seat[i].length; j++) {
				this.seat[i][j] = new Seat();
			}
		}
	}
	
	int menu() {
		print();
		System.out.println("1.좌석선택");
		System.out.println("2.결제하기");
		System.out.println("3.종료");
		int sel = sc.nextInt();
		if(sel == 1) {
			selSeat();
		}
		if(sel == 2) {
			calculate();
		}
		return sel;
	}
	
	void selSeat() {
		System.out.println("원하시는 좌석의 좌표를 입력해주세요 .");
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		if(x >= 0 && x < 10 && y >= 0 && y < 10) {
			if(this.seat[x][y].getX() == 0) {
				this.seat[x][y].setX(1);
				this.total += this.price;
			}
			else {
				System.out.println("이미 예약된 좌석입니다.");
			}
			
		}else System.out.println("좌석의 범위를 벗어났습니다.");
	}
	
	void calculate() {
		if(this.total != 0) {
		System.out.printf("결제금액은 %d입니다 . \n계산하실 현금을 입력해주세요 . ",this.total);
		while(true) {
			int money = sc.nextInt();
			if(money >= this.total) {
				System.out.printf("결제가 완료되었습니다. \n잔액은 %d원 입니다.\n",money-this.total);
				this.total = 0;
				break;
			}
			else System.out.println("현금이 부족합니다 다시 입력해주세요 . ");
		}
		}else System.out.println("좌석선택을 먼저 해주세요 .");
	}
	void print() {
		System.out.print("---------------스크린---------------\n\t");
		for(int i=0; i<this.seat.length; i++) {
			System.out.print(i+1 + " ");
			if(i == 4)System.out.print( " ");
		}System.out.println();
		for(int i=0; i<this.seat.length; i++) {
			System.out.print(i+1 +"\t");
			for(int j=0; j<this.seat[i].length; j++) {
				System.out.print(this.seat[i][j].getX() + " ");
				if(j == 4)System.out.print( " ");
			}System.out.println();
		}
	}
	
	
	
	public void run() {
		set();
		while(true) {
			if(menu() == 3) {
				System.out.println("종료합니다. ");
				break;
			}
		}
	}
}

public class test002 {

	public static void main(String[] args) {
		// 티켓예매 시스템 완성
		// 시작시간 11 : 33
		// 종료시간 12 : 48
		// 소요시간 00 : 34
		TMS ex = new TMS();
		ex.run();

	}

}
