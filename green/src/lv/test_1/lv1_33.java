package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_33 {

	public static void main(String[] args) {
		/*
		 * # ������ ����[2�ܰ�]
		 * 1. ������ ������ �����ϱ� ����, ���� 2���� �����ϰ� �����Ѵ�.
		 * 2. ����� ���ڸ� ���� ������ ������ ����Ѵ�.
		 * ��)	3 x 7 = ?
		 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
		 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = rn.nextInt(9)+1;
		int b = rn.nextInt(9)+1;
		int c = a*b;
		System.out.println(a + " x " + b +" =  ?"  );
		
		int answer = sc.nextInt();
		
		if (answer == c ) {
			System.out.println("����!!");
		}
		else {
			System.out.println("�� !!");
		}

	}

}
