package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex11_3 {

	public static void main(String[] args) {
		/*
		 * # ������ ��ȣ ���߱� ����
		 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
		 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
		 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
		 * 	  1) ����	  2)  �E��     3) ����	 4) ����
		 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
		 * ��) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) /
		 *    ���� : 2��
		 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int a = ran.nextInt(10) +1;
		int b = ran.nextInt(10) +1;
		int c = ran.nextInt(4)  +1;
		// a  c  b  =  a c b 
		
		int result = 0;
		
		if(c == 1) {
			result = a + b ;
		}
		else if ( c == 2) {
			result = a - b ;
		}
		else if ( c == 3 ) {
			result = a * b ;
		}
		else if (c == 4 ) {
			result = a % b ;
		}
		
		//���� �����ֱ� 
		System.out.println(a + " ? " +  b + " = " + result);
		System.out.println("�����ڴ� ? 1.+  2.-  3.*  4.  % ");
			
		int answer = sc.nextInt();
		
		//�˻� 
		if(answer == c) {
			System.out.println("���� !!");
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ� . ");
		}
		

	}

}
