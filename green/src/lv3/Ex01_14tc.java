package lv3;

import java.util.Random;

public class Ex01_14tc {

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
		int[] check = new int[5]; // �ߺ�ó���� ���� ���� . 
		int[] arr = new int[5]; // ������� ������ �迭 . -> arr �迭 ��� ( ��� ) 
		
		Random rn = new Random();
		
		int idx = 0; // arr �ε��� (������ ���� ä���� ������ ����)
		while(idx < 5) {
			// arr �迭�� �������� > �ߺ����� ��(0~4)�� ���� . 
			int rNum = rn.nextInt(5); // 0~4
			
			if(check[rNum] == 0) {
			// idx �������� ���ǹ� �ȿ� ���α�
				arr[idx] = rNum;
				check[rNum] = 1;
				idx ++;
			}
			
		}
		
		for ( int i=0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
