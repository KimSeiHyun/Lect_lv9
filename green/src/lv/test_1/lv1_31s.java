package lv.test_1;

import java.util.Scanner;

public class lv1_31s {

	public static void main(String[] args) {
		/*
		 * # ������ ���[1�ܰ�]
		 * 1. �޴����� ����Ѵ�.
		 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
		 * 3. ������ �Է¹޴´�.
		 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
		 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����  ���� : " + price2 + "��");
		System.out.println("3.��     �� : " + price3 + "��");
		
		System.out.println("�ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է����ּ��� .");
		int x = sc.nextInt();
		if(x == 1) {
			x = price1;
		}
		if(x == 2) {
			x = price2;
		}
		if(x == 3) {
			x = price3;
		}
		System.out.println("�������� ������ �Է����ּ��� . ");
		int money = sc.nextInt();
		
		System.out.println("------������------");
		System.out.println("������ ��� ���� : " + money);
		System.out.println("������ �޴��� ���� : " + x );
		System.out.println("-----------------");
		if(money > x ) {
			System.out.println("�ܵ� : "+ (money -x) + "��" );
		}
		else {
			System.out.println("�ܾ��� �����մϴ�.");
		}

	}

}
