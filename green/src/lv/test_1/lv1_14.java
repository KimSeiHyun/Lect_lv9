package lv.test_1;

import java.util.Scanner;

public class lv1_14 {

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
		System.out.println("2.����   ���� : " + price2 + "��");
		System.out.println("3.��      �� : " + price3 + "��");
		
		System.out.println("�ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է����ּ��� . ");
		int menu = sc.nextInt();
		if(menu ==1) {
			 menu = price1;
		}
		if(menu ==2) {
			menu = price2;
		}
		if(menu ==3) {
			menu = price3;
		}
		System.out.println("������ �Է����ּ��� . ");
		int money = sc.nextInt();
		
		System.out.println("------������------");
		System.out.println("�Է¹��� ���� : " + money +"��");
		System.out.println("�ֹ��Ͻ� �޴� ���� : "+menu + "��");
		if(money < menu ) {
			System.out.println("������ �����մϴ� . ");
		}

		
	}

}
