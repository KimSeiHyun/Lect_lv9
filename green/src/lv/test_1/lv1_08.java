package lv.test_1;

import java.util.Scanner;

public class lv1_08 {

	public static void main(String[] args) {
		/*
		 * # ����(0)����(1)��(2) ����[1�ܰ�]
		 * 1. com�� ����(1)�� �� �� �ִ�.
		 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
		 * 3. com�� me�� ����,
		 * 		1) ����.
		 * 		2) ���� �̰��.
		 * 		3) ���� ����.			�� ����Ѵ�.
		 */
		int com = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� ���� ! ");
		System.out.print("0=����\n1=����\n2=��");
		int me = sc.nextInt();
		
		if(me < com ) {
			System.out.println("���� ���� ..");
		}
		if(me == com ) {
			System.out.println("����");
		}
		if(me > com ) {
			System.out.println("���� �̰�� !!");
		}
		
	}

}
