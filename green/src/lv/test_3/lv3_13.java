package lv.test_3;

import java.util.Random;

public class lv3_13 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[1�ܰ�]
		 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
		 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
		 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
		 * 
		 * ��)
		 * �������� : 1
		 * check = {0, 1, 0, 0, 0}
		 * arr   = {1, 0, 0, 0, 0}
		 * �������� : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * �������� : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		int[] check = new int[5];
		int[] arr = new int[5];
		
		Random rn = new Random();
		

		for(int i=0; i<5; i++) {
			int num = rn.nextInt(5);
			arr[i] = num;
			if(check[num] == 0) {
				check[num] =1;
			}
			else {
				i--;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
