package lv.test_7;

import java.util.Scanner;

//Ƽ�Ͽ��� �ý��� �ϼ�

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
		System.out.println("1.�����ϱ�");
		System.out.println("2.����.");
	}
	
	public void book() {
		System.out.print("�¼� �Է� (�ε��� ) : ");
		int idx = sc.nextInt();
		if(idx >=0 && idx < this.arr.length) {
			if(this.arr[idx].getSeat() == 0) {
				this.arr[idx].setSeat(1);
				this.total += 12000;
			}else System.out.println("�̹� ����� �¼��Դϴ�.");
			
		}else System.out.println("�ε��� ���� Ȯ�� ! ");
	}
	
	public void end() {
		System.out.println("�� ����� : " +this.total);
		
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