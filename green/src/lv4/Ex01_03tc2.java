package lv4;

import java.util.Random;

public class Ex01_03tc2 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */
		
		int[] arr = new int[5];

		Random rn = new Random();
		
		for(int i=0; i<5; i++) {
			int rNum = rn.nextInt(10) +1;
			boolean check = true;
			for(int j=0; j<5; j++) {
				if(arr[i] == rNum) {
					check = false;
				}
			}
			
			if(check == true) {
				arr[i] = rNum;
			}
			
			else { // �ߺ��߽߰� 
				i--;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
