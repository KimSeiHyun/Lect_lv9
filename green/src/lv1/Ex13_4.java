package lv1;

import java.util.Scanner;

public class Ex13_4 {

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
		
		int water1 = 500;
		int water2 = 1000;
		int water3 = 1500;
		int water4 = 2000;
		System.out.println("=======�����=======");
		System.out.println("1.�ڿ��� : " + water1 + "��");
		System.out.println("2.����� : " + water2 + "��");
		System.out.println("3.������ : " + water3 + "��");
		System.out.println("4.����� : " + water4 + "��");

		Scanner sc = new Scanner(System.in);
		
		int a = 0 ;
		while ( a < 5) {
			int sel = sc.nextInt();
			if (sel == 1)
			a++;		
		}
	}

}
