package lv.test_3;

import java.util.Random;

public class lv3_36s {

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
		int x = 0; 
		while (x <5) {
			int a = 0;
			int num = rn.nextInt(5)+1;
			for(int i=0; i<5; i++) {
				if(arr[i] == num) {
					a = 1;
				}
			}
			
			if (a==0) {
				arr[x] = num;
				x++;
				
			}
		}
		for (int i = 0; i < 5; i++) {
			arr[i] -= 1;
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}