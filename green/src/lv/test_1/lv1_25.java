package lv.test_1;

import java.util.Scanner;

public class lv1_25 {

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
		
		System.out.println("�̿��� ������ ���� �Է��ϼ��� . ");
		int x = sc.nextInt();
		
		int charge = 600;
		int cnt = 0;
		if(x >= 1 && x <= 5) {
			charge = 500;
		}
		if(x >= 6 && x <= 10) {
			charge = 600;
		}
		if(x >10 && x %2 == 0) {
			cnt = (x-10)/2 ;
			charge += cnt*50;
		}
		if(x >10 && x %2 == 1) {
			x ++;
			cnt = (x-10)/2 ;
			charge += cnt*50;
		}
		
		System.out.println("����� : " + charge + "�Դϴ�." );
	
	}

}
