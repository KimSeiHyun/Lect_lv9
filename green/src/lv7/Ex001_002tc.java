package lv7;

import java.util.Scanner;

class Seata{
	int num;
	boolean res;
	int price;
	char level;
	
	void printSeat() {
		if(this.res) {
			System.out.print("�� ");
		}
		else {
			System.out.print("�� ");
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
			this.seats[i] = new Seata(); // Ŭ���� �迭�ȿ� ������ Ŭ������ �ʱ�ȭ
			this.seats[i].setSeat(i+1, this.price);
		}
	}
	
	boolean selectSeat() {
		System.out.println("������ �¼���ȣ �Է� (���� : end) : ");
		String input = sc.next();
		int num = -1;
		try {
			num = Integer.parseInt(input);
			if(checkSeat(num)) {
				System.out.println("���ſϷ� ! ");
			}
			else {
				System.out.println("�̹� ���õ� �¼��Դϴ� . ");
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
			System.out.println("�� ���� : " + total + "��");
			
		}
	}
}


public class Ex001_002tc {
	public static void main(String[] args) {
	
		TMSa tms = new TMSa();
		tms.run();

		
	}
}