package lv.test_1;

import java.util.Scanner;

public class lv1_22 {

	public static void main(String[] args) {
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		
		int cash = 20000;  // �Աݽ� ����  , ��ݽ� ����
		int balance = 30000; // �Աݽ� ���� , ��ݽ� ���� 
		int account  = 11111; // �α��ν� ���
		int password  = 1234; // �α��ν� ��� 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===ATM===");
			System.out.println("1.�α��� 2.����");
			int sel = sc.nextInt();
		if(sel == 1) {
			System.out.println("���̵� �Է����ּ��� . ");
			int inId = sc.nextInt();
			System.out.println("��й�ȣ�� �Է����ּ��� . ");
			int inPw = sc.nextInt();
			if(inId == account && inPw == password) {
				System.out.println("1.�Ա� 2.��� 3.��ȸ");
				sel = sc.nextInt();
				if(sel == 1) {
					System.out.println("�Ա��� �ݾ��� �Է����ּ��� . ");
					int inMoney = sc.nextInt();
					if(inMoney < cash) {
						balance += inMoney;
						cash -= inMoney;
						System.out.println("�Ա��� �Ǿ����ϴ�.");
					}
					else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}
				if(sel == 2) {
					System.out.println("����� �ݾ��� �Է����ּ��� . ");
					int outMoney = sc.nextInt();
					if(outMoney < balance) {
						balance -= outMoney;
						cash += outMoney;
						System.out.println("����� �Ǿ����ϴ�.");
					}
					else {
						System.out.println("�ܾ��� �����մϴ�. ");
					}
				}
				if(sel == 3) {
					System.out.println("���� ������ : " + cash);
					System.out.println("���� ���忡 �ݾ��� : " + balance);
				}
			}
			else {
				System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ��� . ");
			}
			
		}
		else {
			System.out.println("�����մϴ� . ");
			break;
		}
		}
		
	}

}
