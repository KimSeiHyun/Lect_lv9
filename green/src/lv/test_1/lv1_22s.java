package lv.test_1;

import java.util.Scanner;

public class lv1_22s {

	public static void main(String[] args) {
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		
		int cash = 20000;  // �Աݽ� ����  , ��ݽ� ����
		int balance = 30000; // �Աݽ� ���� , ��ݽ� ���� 
		int account  = 11111; // �α��ν� ���
		int password  = 1234; // �α��ν� ��� 
		Scanner scan = new Scanner(System.in);
		System.out.println("===ATM===");
		System.out.println("1.�α��� 2.����");
		int sel = scan.nextInt();
		
		if( sel == 1) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ��� . ");
			int inId = scan.nextInt();
			int inPw = scan.nextInt();
			if(inId == account && inPw == password) {
				System.out.println("�α��� ���� ! ");
			System.out.println("1.�Ա� 2.��� 3.��ȸ");
			int sel2 = scan.nextInt();
			if (sel2 == 1) {
				System.out.println("�Ա��� �ݾ��� �Է����ּ��� .");
				int inMoney = scan.nextInt();
				if(inMoney < cash ) {
					balance += inMoney;
					cash -= inMoney;
					System.out.println("�Ա� �Ϸ�.");
				}
				else {
					System.out.println("�ܾ��� �����մϴ� . ");
				}
			}
			else if (sel2 == 2) {
				System.out.println("����� �ݾ��� �Է����ּ��� .");
				int outMoney = scan.nextInt();
				if(outMoney < balance) {
					balance -= outMoney;
					cash += outMoney;
					System.out.println("��� �Ϸ� .");
				}
				else {
					System.out.println("�ܾ��� �����մϴ� .");
				}
			}
			else if (sel2 == 3) {
				System.out.println("�� ���� �ܾ��� : " + balance);
			}
			}
			else {
				System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ��� . ");
			}
		}
		else {
			System.out.println("���� .");
		}

	}

}
