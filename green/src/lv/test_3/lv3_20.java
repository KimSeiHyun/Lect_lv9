package lv.test_3;

import java.util.Random;
import java.util.Scanner;

public class lv3_20 {

	public static void main(String[] args) {
		/*
		 * #  1 to 4
		 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
		 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
		 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
		 * ��)
		 * 4 2 3 1
		 * �Է� : 3
		 * 4 2 3 9
		 * �Է� : 1
		 * 4 9 3 9
		 * ...
		 */
		int[] arr = new int[4];
		int[] check = new int[4];
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while (x <4) {//�������ο� 
			int ranNum = rn.nextInt(4)+1;
			int check1 = 0;
			for(int i=0; i<4; i++ ) {
				if(arr[i] == ranNum ) {
					check1 = 1;
				}
			}
			if(check1 == 0) {
				for(int i=0; i<4 ; i++) {
					if(arr[i] == 0 ) {
						arr[i] = ranNum;
						break;
					}
				}
			}
			else {
				x--;
			}
			x++;
		}//w
		int cnt = 0;
		while(true) {
			int min =100;
		for(int i=0; i<4 ; i++) {
			System.out.print(arr[i] + " ");
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		
		System.out.println("�������� �ε�����  �Է����ּ��� . ");
		int num = sc.nextInt();
		if(arr[num] == min) {
			arr[num] = 9;
			cnt ++;
		}
		if(cnt == 4) {
			System.out.println("���� Ŭ���� .");
			break;
		}
		
		}//w2
		
		
		
	}

}
