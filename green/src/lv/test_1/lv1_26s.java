package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_26s {

	public static void main(String[] args) {
		/*
		 * # ������ ��ȣ ���߱� ����
		 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
		 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
		 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
		 * 	  1) ����	  2)  �E��     3) ����	 4) ������
		 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
		 * ��) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    ���� : 2��
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = rn.nextInt(10)+1;
		int b = rn.nextInt(10)+1;
		int c = rn.nextInt(4)+1;
		
		int temp = 0;
		if(c == 1) {
			temp = a+b;
		}
		if(c == 2) {
			temp = a-b;
		}
		if(c == 3) {
			temp = a*b;
		}
		if(c == 4) {
			temp = a%b;
		}
		
		System.out.println("������ ��ȣ ���߱� ���� ! ");
		System.out.println(a + " ? " + b + " = " + temp);
		
		System.out.println("?�� �� ��ȣ�� �����ϱ�� ? 1.+  2.-  3.*  4.%");
		int answer = sc.nextInt();
		
		if(answer == c ) {
			System.out.println("����!");
		}
		else {
			System.out.println("���� ! ");
		}

	}

}
