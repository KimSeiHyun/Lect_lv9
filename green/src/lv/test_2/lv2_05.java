package lv.test_2;

import java.util.Random;
import java.util.Scanner;

public class lv2_05 {

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
		
		int com = rn.nextInt(100)+1;
		int x = 0;
		System.out.println("com : " + com);
		System.out.println("���ٿ� ���� ! ");
		System.out.println("���ڸ� �Է����ּ��� ! ");
		while (x <1) {
			int me = sc.nextInt();
			if(me >= 1  && me <= 100) {
				if(me == com ) {
					System.out.println("����!");
					x = 1;
				}
				else if (me < com ) {
					System.out.println("��!");
				}
				else if (me > com ) {
					System.out.println("�ٿ�!");
				}
			}
			else {
				System.out.println("������ ������ ������ϴ� . ");
			}
			
			
		}
		
		
	}

}
