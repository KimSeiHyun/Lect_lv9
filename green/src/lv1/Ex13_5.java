package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex13_5 {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[2�ܰ�]
		 * 1. com �� �������� 1~100���̸� �����Ѵ�.
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�.
		 */

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int com = ran.nextInt(100)+1 ;

		System.out.println("���ٿ� ���� ! ");
		System.out.println("���ڸ� �Է��ϼ��� ! ");
		int me = sc.nextInt();
		while (com != me) {

			if (com > me ) {
				System.out.println("up!");
			}
			else if (com < me ) {
				System.out.println("down!");
			}
			else  {
				System.out.println("�����Դϴ� .");
			}
		}
	}
}
