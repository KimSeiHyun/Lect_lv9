package lv.test_2;

import java.util.Scanner;

public class lv2_25 {

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
		int x = 0;
		int sum = 0;
		while (x <5) {
			int num = sc.nextInt();
			sum += num;
			System.out.println(sum);
			if(sum >=100) {
				x = 100;
			}
			x++;
		}
		
	}

}
