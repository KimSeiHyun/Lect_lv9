package lv.test_4;

import java.util.Random;

public class lv4_03s {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */
		
		int[] arr = new int[5];

		Random ran = new Random();
		
		int x = 0;
		while (x <5) {
			int check = 0;
			int num = ran.nextInt(10)+1;
			for(int i=0; i<5; i++) {
				if(num == arr[i]) {
					check = 1;
				}
			}
			if(check == 0) {
				arr[x] = num;
				x++;
			}
		}//w
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
