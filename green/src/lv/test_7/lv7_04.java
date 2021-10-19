package lv.test_7;

import java.util.Scanner;

//Ƽ�Ͽ��� �ý��� �ϼ�

class Seat{
	private Integer seat;
	
	public Seat(int seat) {
		this.seat = seat;
	}
	public int getSeat() {
		return this.seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
}

class TMS{
	
	private Seat arr[] = new Seat[7];
	private int total;
	private int cnt;
	public static Scanner sc = new Scanner(System.in);
	
	public void set() {
		for(int i=0; i<this.arr.length; i++) {
			this.arr[i] = new Seat(0);
		}
	}
	
	public void print() {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print(this.arr[i].getSeat() + " ");
		}System.out.println();
	}
	
	public void endPrint() {
		System.out.println("�� ����� : " + this.total);
	}
	public void choice() {
		System.out.print("���Ͻô� �ڸ� �Է�(�ε���) : ");
		int idx = sc.nextInt();
		if(idx >= 0 && idx <this.arr.length) {
			if(this.arr[idx].getSeat() == 0) {
				this.arr[idx].setSeat(1);
				this.total += 12000;
			}else System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
		}else System.out.println("�ε��� ���� Ȯ�� ! ");
	}
	public void run() {
		set();
		while(true) {
			print();
			System.out.println("1.�����ϱ�");
			System.out.println("2.����");
			int sel = sc.nextInt();
			if(sel == 1) {
				choice();
			}
			if(sel == 2) {
				endPrint();
				break;
			}
		}
	}

}

public class lv7_04 {

	public static void main(String[] args) {
		TMS tms = new TMS();
		tms.run();

		
	}
}