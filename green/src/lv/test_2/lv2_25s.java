package lv.test_2;

import java.util.Scanner;

public class lv2_25s {

	public static void main(String[] args) {
		/*
		 * # ����� ���� 
		 * 1. 5ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� ������ ���� ���� ����Ѵ�. 
		 * 3. ���࿡ �Է¹��� ���� 100 �̻��̸�  �ݺ��� 5ȸ�� �ƴ����� ��� ���� 
		 * 
		 * ��) 7 ==> �� : 7 ,  14 ==> �� : 21 , 1000 ==> �� : 1021 !����
		 * 
		 */	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++) {
			System.out.println("���ڸ� �Է����ּ��� .");
			int num = sc.nextInt();
			sum += num;
			System.out.println("sum :" + sum);
			if(sum >= 100) {
				System.out.println("100�� �Ѿ�Ƿ� ���� ! ");
				break;
			}
		}
	}

}
