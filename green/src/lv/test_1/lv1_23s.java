package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_23s {

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
		
		System.out.println("��� ���� ���߱� ���� ! ");
		
		int ranNum = rn.nextInt(101)+150;
		System.out.println("������ ���� ���� ���� : " + ranNum);
		
		System.out.println("��� ���ڸ� �Է����ּ��� ! ");
		int num = sc.nextInt();
		
		int temp = ranNum %100 / 10;
		
		if(num == temp) {
			System.out.println("����!");
		}
		else {
			System.out.println("���� ! ");
		}

		
	}

}
