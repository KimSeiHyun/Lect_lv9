package lv.test_3;

import java.util.Random;
import java.util.Scanner;

public class lv3_32s {

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
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int x = 0;
		
		while (x <4) {
			int check1 =0;
			int num = rn.nextInt(4)+1;
			for(int i=0; i<4;i++) {
				if(arr[i] == num) {
					check1 = 1;
				}
			}
			if(check1 == 0) {
				arr[x] = num;
				x++;
			}

			
		}//w
		int cnt = 0;
		while(true) {
			int min = 100;
		for(int i=0; i<4; i++) {
			System.out.print(arr[i] + " ");
			if(min > arr[i]) {
				min = arr[i];
			}
		}System.out.println();
		System.out.println("���� ���� ������ �ε������� �Է��ϼ��� . ");
		int idx = sc.nextInt();
		if(arr[idx] == min ) {
			arr[idx] = 9;
			cnt++;
		}
		if(cnt == 4) {
			System.out.println("game clear !! ");
			break;
		}
		
		
		}//w2
		
		
		
	}

}
