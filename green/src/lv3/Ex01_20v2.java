package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex01_20v2 {

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
		Scanner scan = new Scanner(System.in);
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
		
		while(true) {
		//���
		System.out.print("ī���ȣ: ");
		for(int j=0; j<10; j++) {
			System.out.print(j+1 + " ");
		}
		System.out.println();
		System.out.print("ī���ǰ�: ");
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();
		System.out.print("����ī��: ");
		for(int j=0; j<10; j++) {
			System.out.print(back[j] + " ");
		}
		
		//�Է�
		System.out.print("\nī���ȣ �Է�1 : ");
		int idx1 = scan.nextInt() -1; // �ε����� ��ȯ 
		System.out.print("\nī���ȣ �Է�2 : ");
		int idx2 = scan.nextInt() -1; // �ε����� ��ȯ 

		if(back[idx1] != 0) {
			System.out.println("�̴̹��� ���� ī���Դϴ�.");
			continue;
		}
		if ( idx1 == idx2 ) {
			System.out.println("���� ī�带 ���� �ȵǿ�!");
		}
		else {
			// ī���� ���� �˻� (��ġ�ϴ°� )
			if (front[idx1] == front[idx2]) {
				System.out.println("������!");
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];

			}
			else {
				System.out.println("�� ");
			}
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
