package lv.test_1;

import java.util.Scanner;

public class lv1_15s {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[1�ܰ�]
		 * 1. ���� 3���� �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� ���Ͽ�,
		 * 3. ���� ū ��(MAX)�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է����ּ��� . ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ��� . ");
		int num2 = sc.nextInt();
		System.out.println("����° ���ڸ� �Է����ּ��� . ");
		int num3 = sc.nextInt();
		
		int max = num1;
		
		if(max < num2) {
			max = num2;
		}
		if(max < num3 ) {
			max = num3;
		}
		System.out.println("�ִ밪�� : " + max);

	}

}
