package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_25s {

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
		
		System.out.println("�̿��� ������ ���� �Է����ּ��� .");
		int x = sc.nextInt();
		
		int y = 0;
		if(x >=1 && x <=5) {
			y = 500;
		}
		else if(x >=6 && x <=10) {
			y = 600;
		}
		else {
			if(x %2 == 1) {
				x ++;
			}
			y = 600+(x-10)/2*50;
		}
		
		System.out.println("�̿�ݾ��� : "+ y +"�Դϴ�.");

	}

}
