package lv3;

import java.util.Scanner;

public class Ex01_03 {
	public static void main(String[] args) {
		// �ε��� 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean t = true;
		System.out.println("����1: �ε����� �Է¹޾� ���� ���.");
		System.out.println("�ε����� �Է����ּ��� . 0~4 ");
		while (t) {
		n= sc.nextInt();
		if ( n >=0 && n <=4) {
		System.out.println(arr[n]);
		break;
		}
		else {
			System.out.println("������ ��� �����Դϴ�.");
		}
		}
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11 �ε��� : 1
		System.out.println("����2: ������ �Է¹޾� �ε��� ���.");
		int score = 0;
		score = sc.nextInt();
		
		for (int i=0; i<5; i++) {
			if (score == arr[i]) 
				System.out.println(i);
		}
		
		
		


}
}
