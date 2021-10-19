package lv.test_7;

import java.util.Scanner;

//티켓예매 시스템 완성

class Seats{
	private Integer seat;
	
	Seats (Integer seat) {
		this.seat = seat;
	}
	
	public Integer getSeat() {
		return this.seat;
	}
	
	public void setSeat(Integer seat) {
		this.seat = seat;
	}
}

class TMSs{
	public static Scanner sc = new Scanner(System.in);
	private Seats arr[] = new Seats[10];
	private int total;
	
	public void set() {
		for(int i=0; i<arr.length; i++) {
			this.arr[i] = new Seats(0);
		}
	}
	
	public void print() {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print(this.arr[i].getSeat() + " ");
		}System.out.println();
		System.out.println("1.예약하기");
		System.out.println("2.종료.");
	}
	
	public void book() {
		System.out.print("좌석 입력 (인덱스 ) : ");
		int idx = sc.nextInt();
		if(idx >=0 && idx < this.arr.length) {
			if(this.arr[idx].getSeat() == 0) {
				this.arr[idx].setSeat(1);
				this.total += 12000;
			}else System.out.println("이미 예약된 좌석입니다.");
			
		}else System.out.println("인덱스 범위 확인 ! ");
	}
	
	public void end() {
		System.out.println("총 매출액 : " +this.total);
		
	}
	public void run() {
		set();
		
		while(true) {
			print();
			int sel = sc.nextInt();
			if(sel == 1) {
				book();				
			}
			if(sel == 2) {
				end();
				break;
			}
		}
		
	}

}

public class lv7_04s {

	public static void main(String[] args) {
		TMSs tms = new TMSs();
		tms.run();

		
	}
}