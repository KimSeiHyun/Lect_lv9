package lv.test_2;

import java.util.Scanner;

public class lv2_11s {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[2�ܰ�]
		 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x =0;
		int max = 0;
		while (x <3) {
			System.out.println("���ڸ� �Է����ּ��� .");
			int num = sc.nextInt();
			if( max < num) {
				
				max = num;
			}
			x++;
		}
		System.out.println("���� ū ���� : " + max);
		
	}

}
