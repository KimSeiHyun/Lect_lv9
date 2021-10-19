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
		System.out.println("1.�¼�����");
		System.out.println("2.�����ϱ�");
		System.out.println("3.����");
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
		System.out.println("���Ͻô� �¼��� ��ǥ�� �Է����ּ��� .");
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		if(x >= 0 && x < 10 && y >= 0 && y < 10) {
			if(this.seat[x][y].getX() == 0) {
				this.seat[x][y].setX(1);
				this.total += this.price;
			}
			else {
				System.out.println("�̹� ����� �¼��Դϴ�.");
			}
			
		}else System.out.println("�¼��� ������ ������ϴ�.");
	}
	
	void calculate() {
		if(this.total != 0) {
		System.out.printf("�����ݾ��� %d�Դϴ� . \n����Ͻ� ������ �Է����ּ��� . ",this.total);
		while(true) {
			int money = sc.nextInt();
			if(money >= this.total) {
				System.out.printf("������ �Ϸ�Ǿ����ϴ�. \n�ܾ��� %d�� �Դϴ�.\n",money-this.total);
				this.total = 0;
				break;
			}
			else System.out.println("������ �����մϴ� �ٽ� �Է����ּ��� . ");
		}
		}else System.out.println("�¼������� ���� ���ּ��� .");
	}
	void print() {
		System.out.print("---------------��ũ��---------------\n\t");
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
				System.out.println("�����մϴ�. ");
				break;
			}
		}
	}
}

public class test002 {

	public static void main(String[] args) {
		// Ƽ�Ͽ��� �ý��� �ϼ�
		// ���۽ð� 11 : 33
		// ����ð� 12 : 48
		// �ҿ�ð� 00 : 34
		TMS ex = new TMS();
		ex.run();

	}

}
