package lv1.test;

import java.util.Scanner;

public class Ex13_02 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[2�ܰ�]
		 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		boolean d = true;
		while (d) { 
			System.out.println("�ִ밪 ���ϱ� .");
			System.out.println("ù��° ���ڸ� �Է��ϼ��� . ");
			a = sc.nextInt();
			System.out.println("�ι�° ���ڸ� �Է��ϼ��� . ");
			b = sc.nextInt();
			System.out.println("����° ���ڸ� �Է��ϼ��� . ");
			c = sc.nextInt();
			if (a > b && a >c ) {
				System.out.println("���� ū ���� 1��° �Է��� ");
				System.out.println(a);
			}
			if(b > a && b > c) {
				System.out.println("���� ū ���� 2��° �Է��� ");
				System.out.println(b);
			}
			if( c> a && c > b ) {
				System.out.println("���� ū ���� 3��° �Է��� ");
				System.out.println(c);
			}
			d = false;
			
					
			
		}

	}

}
