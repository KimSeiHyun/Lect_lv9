package lv4;

import java.util.Random;

public class Ex01_03tc {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */
		
		int[] arr = new int[5];

		Random rn = new Random();
		
		int i = 0;
		while(i<5) {
			int rNum = rn.nextInt(10) +1;
			
			int check = -1;
			// �ߺ�Ȯ�� �� > ������ �� ����. 
			for(int j =0; j<5; j++) {
				if(rNum == arr[j]) {
					check = i;
				}
			}			
			if(check == -1) {
				arr[i] = rNum;
				i++;
			}
			
		} // while
		
		System.out.println("tc");
		for( i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
