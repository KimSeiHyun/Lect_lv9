package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex01_20 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
		 * 2. ������ ���߸� back�� �ش� ���ڸ� ������,
		 *    back�� ��� ���� ä������ ������ ����ȴ�.
		 * ��)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * �Է�1 : 0
		 * �Է�2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		// ����(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			i += 1;
		}


		
		boolean t = true;
		while (t) {

			for(int j=0; j<10; j++) {
				System.out.print(front[j] + " ");
			}
			System.out.println();
			for(int i2=0; i2<10; i2++) {
				System.out.print(back[i2] + " ");
			}
			System.out.println();
			System.out.print("�ε����� �Է� 1: ");
			int sc1 =sc.nextInt();
			System.out.print("�Ե����� �Է� 2: ");
			int sc2 =sc.nextInt();
			
			if (front[sc1] == front[sc2]) {
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
