package lv.test_2;

import java.util.Random;
import java.util.Scanner;

public class lv2_20 {

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
		
		boolean t = true;
		System.out.println("com :" + com);
		System.out.println("���ٿ� ���� ! ");
		System.out.println("1~100���̿� �ִ� ���ڸ� �Է����ּ��� . ");
		while (t) {
			int me = sc.nextInt();
			
			if(me < com ) {
				System.out.println("��!!");
			}
			else if (me > com ) {
				System.out.println("�ٿ� !! ");
			}
			else {
				System.out.println("���� !! ");
				t = false;
			}
		}
	}

}
