package lv.test_2;

import java.util.Scanner;

public class lv2_04 {

	public static void main(String[] args) {
		/*
		 * # ������ ���[2�ܰ�]
		 * 1. 5�� �ֹ��� �޴´�.
		 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
		 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		 * 
		 * ��)
		 * �޴� ���� : 1
		 * �޴� ���� : 1
		 * �޴� ���� : 2
		 * �޴� ���� : 2
		 * �޴� ���� : 3
		 * �� �ݾ� = 31300��
		 * ���� �Է� : 32000
		 * === �Ե����� ������ ===
		 * 1. �Ұ�� ���� : 2��
		 * 2. ����    ���� : 2��
		 * 3. ��         �� : 1��
		 * 4. ��   ��   �� : 31300��
		 * 5. ��         �� : 700��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����  ���� : " + price2 + "��");
		System.out.println("3.��     �� : " + price3 + "��");
		
		int x = 0;
		int charge = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		while (x <5) {
			System.out.println("�޴��� �������ּ��� . ");
			int sel = sc.nextInt();
			if (sel == 1) {
				charge += price1;
				cnt1 ++;
			}
			if (sel == 2) {
				charge += price2;
				cnt2 ++;
			}
			if (sel == 2) {
				charge += price3;
				cnt3 ++;
			}

			x++;
		}
		System.out.println("������ �Է����ּ��� . ");
		int money = sc.nextInt();
		if(money > charge) {
		System.out.println("------������------");
		System.out.println("�Ұ����� : "+cnt1 +"��");
		System.out.println("���� ����  : "+cnt2 +"��");
		System.out.println("�ݶ�      : "+cnt3 +"��");
		System.out.println("���űݾ� : " + money);
		System.out.println("�ѱݾ� : " + charge);
		System.out.println("�ܵ� : " + (money -charge));
		}
		else {
			System.out.println("������ �����մϴ�.");
		}
		

	}

}
