package lv.test_1;

import java.util.Scanner;

public class lv1_15 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[1�ܰ�]
		 * 1. ���� 3���� �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� ���Ͽ�,
		 * 3. ���� ū ��(MAX)�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = 0;
		
		if(num1 > num2 && num1>num3) {
			max = num1;
		}
		if(num2 > num1 && num2>num3) {
			max = num2;
		}
		if(num3 > num2 && num3>num1) {
			max = num3;
		}
		System.out.println("���� ū ���� : " + max);

	}

}
