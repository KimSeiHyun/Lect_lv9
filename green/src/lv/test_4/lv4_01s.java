package lv.test_4;

import java.util.Scanner;

public class lv4_01s {

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
		
		int x = 0;
		int cnt = 0;
		while(x <5 ) {
			int max = 0;
			for(int i=0; i<5; i++) {
				if(max <arr[i]) {
					max = arr[i];
				}
			}
			for(int i=0; i<5; i++) {
				System.out.print(arr[i] + " ");
			}System.out.println();
			System.out.println("����ū������ �Է��ϼ��� .");
			int num = sc.nextInt();
			for(int i =0; i<5; i++) {
				if(arr[i] == max && arr[i] == num) {
					arr[i] = 0;
					cnt ++;
				}
			}
			if(cnt == 5) {
				System.out.println("clear !!");
				break;
			}
		}
		
		
		
	}

}
