package lv.test_2;

import java.util.Random;
import java.util.Scanner;

public class lv2_05s {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[2�ܰ�]
		 * 1. com �� �������� 1~100���̸� �����Ѵ�.
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int com = rn.nextInt(100)+1;
		System.out.println("com :" + com);
		while(x <1) {
			System.out.println("1~100���ڸ� �Է����ּ��� ");
			int me = sc.nextInt();
			
			if(me >= 1 && me <= 100) {
				if(me == com) {
					System.out.println("���� !! ");
					x = 1;
				}
				if(me < com) {
					System.out.println("��! ");
				}
				if(me > com) {
					System.out.println("�ٿ�!! ");
				}
			}
			else {
				System.out.println("������ ��� �����Դϴ�. ");
			}
			
		}

	}

}
