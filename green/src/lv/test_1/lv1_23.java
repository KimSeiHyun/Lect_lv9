package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_23 {

	public static void main(String[] args) {
		/*
		 * # ��� ���� ���߱� ����
		 * 1. 150~250 ������ ���� ���� ����
		 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
		 * ��)
		 * 		249		: 4
		 */
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int ranNum = rn.nextInt(101)+150;
		System.out.println("��� ���� ���߱� ���� !! ");
		
		int temp = ranNum %100 /10;
		System.out.println("�����ڽ���");
		System.out.println("��� ���ڴ� : " + temp);
		
		System.out.println("��� ���ڸ� �Է����ּ��� ! ");
		int inNum = sc.nextInt();
		
		if(inNum == temp ) {
			System.out.println("���� !");
		}
		else {
			System.out.println("���� ! ");
		}
	}

}
