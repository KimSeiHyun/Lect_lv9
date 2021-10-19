package lv7;

import java.util.Scanner;

class Seata{
	int num;
	boolean res;
	int price;
	char level;
	
	void printSeat() {
		if(this.res) {
			System.out.print("■ ");
		}
		else {
			System.out.print("□ ");
		}
	}
	
	void setSeat(int num, int price) {
		this.num = num;
		this.price = price;
		this.level = 1;
	}
 
}
class TMSa{
	Scanner sc = new Scanner(System.in);
	String name = "GGV";
	
	int total;
	Seata seats[] = new Seata[10];
	
	int price = 12000;
	void printSeats() {
		for(int i=0; i<seats.length; i++) {
			seats[i].printSeat();
		}
		System.out.println();
	}
	
	void setTms() {
		for(int i=0; i<seats.length; i++) {
			this.seats[i] = new Seata(); // 클래스 배열안에 각각의 클래스를 초기화
			this.seats[i].setSeat(i+1, this.price);
		}
	}
	
	boolean selectSeat() {
		System.out.println("예메할 좌석번호 입력 (종료 : end) : ");
		String input = sc.next();
		int num = -1;
		try {
			num = Integer.parseInt(input);
			if(checkSeat(num)) {
				System.out.println("예매완료 ! ");
			}
			else {
				System.out.println("이미 선택된 좌석입니다 . ");
			}
		} catch (Exception e) {
			if(input.equals("end")) {
				return false;
			}
		}
		return true;
		
		
//		int num = sc.nextInt();
		
	}
	
	boolean checkSeat(int num) {
		int idx = -1;
		for(int i=0; i<this.seats.length; i++) {
			if(num == this.seats[i].num) {
				idx = i;				
			}
		}
		if(idx != -1 && !this.seats[idx].res) {
			this.seats[idx].res = true;
			this.total += this.seats[idx].price;
			return true;
		}else
			return false;
	}
	public void run() {
		
		while(true) {
			setTms();
			while(true) {
				System.out.printf("--- %s ----\n",this.name);
				printSeats();
				if(!selectSeat()) {
					break;
				}
			}
			System.out.println("총 매출 : " + total + "원");
			
		}
	}
}


public class Ex001_002tc {
	public static void main(String[] args) {
	
		TMSa tms = new TMSa();
		tms.run();

		
	}
}