package lv1;

import java.util.Scanner;

public class Ex11_2 {

	public static void main(String[] args) {
		/*
		 * # ����ö ��� ���
		 * 1. �̿��� ������ ���� �Է¹޴´�.
		 * 2. ������ ���� ������ ���� ���� ����� ����ȴ�.
		 * 3. ���ǥ
		 * 1) 1~5	: 500��
		 * 2) 6~10	: 600��
		 * 3) 11,12 : 650�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * 4) 13,14 : 700�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * 5) 15,16 : 750�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * ... 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������� �Է��ϼ��� . ");
		int stop = sc.nextInt();
		
		int total = 0; //�ѿ��
		
		if(stop > 0) {
			total = 500; // �⺻��� 
			// 1�� ���� ( 6 ~ 10 )
			if (stop >= 6) {
				total += 100;
			}
			// 2�� ���� ( 11~ )
			if(stop > 10) {
				// 2�����帶�� 50���� ����.
				if(stop % 2 == 1 ) {
					stop ++; // ¦���� ���� .
				}
				int count = (stop - 10)/2;
				int add = count * 50;
				
				total += add;
			}
			
		}
		System.out.println("����� " + total + "�� �Դϴ�.");
		
		System.out.println("�̿��� ������ ���� �Է��ϼ��� .");
		int a = sc.nextInt();
		int b = ++a;
		int money = 500;
		
		if (a > 0 && a < 6) {
			System.out.println(money + "�� �Դϴ�.");
		}
		else if (a > 5 && a < 11 ) {
			System.out.println(money + 100 + "�� �Դϴ�.");
		}
		else if (a > 10   ) {		
			System.out.println(b);
		}


	}

}
