package lv.test_6;
/*
 * # ��ȭ�� �¼����� : Ŭ���� + �޼���
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

import java.util.Scanner;

class Theater{
	
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	
	String name = "";				// ��ȭ�� �̸�
	int cnt = 0;					// ���� ��
	int money = 0;					// �����
	
	
	void showMenu() {
		System.out.println("=== " + name + " ===");
		System.out.println("1.�����ϱ�");
		System.out.println("2.�����ϱ�");
	}
	
	public void seatPrint() {
		for(int i=0; i<this.seat.length; i++) {
			System.out.print(this.seat[i] + " ");
		}System.out.println();
	}
	
	public void choiceIdx() {
		System.out.print("������ �ڸ��Է�(idx) : ");
		int idx = scan.nextInt();
		if(idx >= 0 && idx < this.seat.length) {
			if(this.seat[idx] == 0 ) {
				this.seat[idx] = 1;
				cnt ++;
			}else System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
			
		}else System.out.println("�ε��� ���� Ȯ�� . ");
	}
	
	public void moneyPrint() {
		System.out.println("�� ����� : " + this.cnt*12000);
		
	}
	
	void run() {
		while(true) {
			seatPrint();
			showMenu();
			int sel = scan.nextInt();
			if(sel == 1) {
				choiceIdx();
			}
			if(sel == 2) {
				moneyPrint();
				break;
			}
			
		}
	}
}
public class lv6_34 {

	public static void main(String[] args) {
		Theater megabox = new Theater();
		megabox.name = "�ް��ڽ�";
		
		megabox.run();

	}
}
