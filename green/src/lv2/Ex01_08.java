package lv2;

import java.util.Scanner;

public class Ex01_08 {

	public static void main(String[] args) {
		/*
		 * # ���θ� �ڷΰ���
		 * 
		 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� 
		 *      �ڷΰ��� ������������ �����Ƿ� ������ �� �����Ϸ����Ѵ�.
		 * ��Ʈ) ���� ���� �ݺ����� �߰� ���ָ�ȴ�. 
		 * 1. �����Ƿ�
		 * 		1) Ƽ����
		 * 		2) ����
		 * 		3) �ڷΰ���
		 * 2. �����Ƿ�
		 * 		1) �����
		 * 		2) ġ��
		 * 		3) �ڷΰ���
		 * 3. ����
		 */
		

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sel = 0;
		boolean t = true;
		
		while (t) {
			System.out.println("------------���θ�----------");
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			System.out.println("---------------------------");
			 System.out.println("�޴��� �������ּ��� .");
			 sel = sc.nextInt();
			 
			 if (sel == 1) {	
				 while (t) {

					 System.out.println("�����Ƿ�");
					 System.out.println("1)Ƽ����");
					 System.out.println("2)����");
					 System.out.println("3)�ڷΰ���");
					 sel = sc.nextInt();
					 
					 if ( sel == 1 ) {
						 continue;
					 }
					 else if (sel == 2 ) {
						 continue;
					 }
					 else if (sel == 3) {
						 break;
					 }
					 else {
						 System.out.println("�߸��� �����Դϴ�.");
					 }
				 }
			 }
			 
			 else if (sel == 2) {
				 while (t) {

					 System.out.println("�����Ƿ�");
					 System.out.println("1)�����");
					 System.out.println("2)ġ��");
					 System.out.println("3)�ڷΰ���");
					 sel = sc.nextInt();
					 
					 if ( sel == 1 ) {
						 continue;
					 }
					 else if (sel == 2 ) {
						 continue;
					 }
					 else if (sel == 3) {
						 break;
					 }
					 else {
						 System.out.println("�߸��� �����Դϴ�.");
					 }
				 }
			 }
			 else if (sel == 3 ) {
				 break;
			 }
			 else {
				 System.out.println("�߸��� �޴��Դϴ� �ٽ� �Է����ּ��� .");
			 }
		}

	}

}
