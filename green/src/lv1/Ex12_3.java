package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex12_3 {


	public static void main(String[] args) {
		/*
		 * # ���������� ����[2�ܰ�]��
		 *   if - else if �������� �����غ���.
		 *   ���� 0 ���� 1 �� 2
		 *   �� = a ��ǻ�� = com
		 *   ���� : 9:33
		 *   ���� : 9:40
		 *   �ҿ� : 7��
		 */ 
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� ���� !");
		System.out.println("������������ �Է��ϼ��� : ���� 0 , ���� 1 , �� 2");
		int me = sc.nextInt();
		int com = ran.nextInt(3);
		if ( me == com ) {
			System.out.println("���� !" );
		}
		else if (me == 0 && com == 1) {
			System.out.println("����!");
		}
		else if (me == 0 && com == 2) {
			System.out.println("�̰�� !");
		}
		else if (me == 1 && com == 0) {
			System.out.println(" �̰�� !");
		}
		else if (me == 1 && com == 2) {
			System.out.println("����!");
		}
		else if (me == 2 && com == 0) {
			System.out.println("�̰�� !");
		}
		else if (me == 2 && com == 1) {
			System.out.println("����!");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
			

	}
}
