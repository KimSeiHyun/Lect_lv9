package lv7;

import java.util.Scanner;

//Ƽ�Ͽ��� �ý��� �ϼ�

class Seat{
	int seat;
	int price = 12000;
	int total;

	
}

class TMS{
	Scanner sc = new Scanner(System.in);

	Seat arr[][] = new Seat[10][10];
	Seat s = new Seat();
	void set() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = new Seat();
			}
		}

	}
	
	void book() {
		System.out.println("�¼��� ��ǥ�� �Է����ּ��� .");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x >= 0 && x <= 9 && y >= 0 && y <= 9) {
			if(arr[x][y].seat == 0) {
				arr[x][y].seat = 1;
				s.total += s.price;
			}else {
				System.out.println("�̹� ���ŵ� �¼��Դϴ�.");
			}
			
		}
		else System.out.println("�¼��� ��ǥ�� �ٽ� Ȯ�����ּ��� . ");
	}
	
	void calculate() {
		if(s.total != 0) {
			System.out.printf("�� %d�� �Դϴ�.\n�����Ͻ� ������ �Է����ּ��� \n",s.total);
			while(true) {
				int inMoney = sc.nextInt();
				if(inMoney >= s.total) {
					System.out.printf("����� �Ϸ�Ǿ����ϴ�\n�ܵ� : %d\n",inMoney-s.total);
					s.total = 0;
					break;
				}
				else System.out.println("������ �����մϴ� �ٽ� �Է����ּ��� .");
			}
		}else System.out.println("���޸� ���� ���ּ��� .");
	}

	int menu() {
		print();
		System.out.println("1.�����ϱ�\n2.����ϱ�\n3.����");
		int sel = sc.nextInt();
		if(sel == 1) {
			book();
			
		}
		if(sel == 2) {
			calculate();
		}
		return sel;
	}
	
	void print() {
		System.out.println("----------��ũ��----------");
		for(int i=0; i<arr.length; i++) {
			if(i == 0) System.out.print("   ");
			System.out.print(i + " ");
			if(i ==4 ) System.out.print(" ");
		}System.out.println("\n");
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "  ");
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j].seat == 1) System.out.print("X ");
				else System.out.print(arr[i][j].seat + " ");
				
				if(j == 4) System.out.print(" ");
			}
			System.out.println();
		}System.out.println();
	}

	public void run() {
		set();
		
		while(true) {
			if(menu() == 3) {
				break;
			}
			
		}
		
	}
}


public class Ex001_002 {

	public static void main(String[] args) {
		TMS tms = new TMS();

		tms.run();
		
		
	}

}
