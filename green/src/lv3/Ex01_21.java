package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex01_21 {

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
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		for (int i =0; i<4; i++) {
			int r = ran.nextInt(4);
			if ( check[i] == 0 ) {
				arr[i] = r;
				check[r] = 1;
			}
			System.out.println(arr[i]);
		}
		
		
	}
}
