package lv4;

import java.util.Random;

public class Ex01_03 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */
		
		int[] arr = new int[5];

		Random ran = new Random();
		
		int a = 0;
		while (a <5) {
			int num = ran.nextInt(10)+1;
			
			int check = 0 ;
			for(int i =0; i<5; i++) {
				if ( num == arr[i]) {
					check = a;				
				}
			}
			if ( check == 0) {
				arr[a] = num;
				a++;
				
			}

		}
		
		for(int j=0; j<5; j++) {
			System.out.println(arr[j]);
		}
		

	}

}
