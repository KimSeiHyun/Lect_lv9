package lv3.test;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

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
		// ���� 02:04
		// ���� 06:09
		// �ҿ� 4�ð�4�� 
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[4];
		int arr2[] = new int[4];
		int arr3[] = {1,2,3,4};
		
		int cnt = 1;
		int score = 0;
		
		boolean t = true;
		int a = 0;
		while(a<4) {
			int num = ran.nextInt(4)+1;
			if(arr2[num-1] == 0) {
				arr[a] = num;
				arr2[num-1] = 1;
				a++;
			}
		}

		while(t) {
			System.out.print("��ġ�� : ");
			for(int i=0; i<4; i++) {
				System.out.print(arr3[i] + " ");
			}
			System.out.println();
			System.out.print("���尪 : ");
			for(int i=0; i<4; i++) {
				System.out.print(arr[i] + " ");
			}
			 if( score >= 36) {
				 System.out.println();
				 System.out.println("������ �� �­����ϴ�. ������ �����մϴ�.");
				 break;
			 }
			System.out.println();
			System.out.println("���������� ���尪�� ��ġ���� �Է����ּ��� . ");
			int in = sc.nextInt()-1;
			if (in <0 || in > 3 ) {
				System.out.println("������ ������ ������ϴ�.");
				continue;
			}

			 if(arr[in] == cnt ) {
				 cnt++;
				 arr[in] =9;
				 score += 9;
				 System.out.println("���� ! ");
			 }
			 else { 
				 System.out.println("Ʋ�Ƚ��ϴ� ! ");
			 }
			 		 
		}
		

		
	}

}
