package lv4;

import java.util.Scanner;

public class Ex01_01 {

	public static void main(String[] args) {
		
		/*
		 * # �ִ밪 ���ϱ�
		 * 1. ���� ū ���� ã�� �Է��Ѵ�.
		 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
		 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
		 * ��)
		 * 11, 87, 42, 100, 24
		 * �Է� : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * �Է� : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */
		
		int[] arr = {11, 87, 42, 100, 24};
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		int cnt = 0;
		while(t) {
			int max = 0;
			int k = 0;
			
			for(int i=0; i<5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("���� ū ������ �Է����ּ��� . ");
			int input = sc.nextInt();
			
			for (int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(max < arr[j]) {
						max = arr[j];
						k = j;
					}
				}
			}
			if(max == input) {
				arr[k] = 0;			
				cnt ++;
			}
			
			if(cnt ==5 ) {
				System.out.println("������ �� ������ϴ�. ������ ����˴ϴ�.");
				t = false;
			}
			
		}//while

	}

}
