package lv.test_3;

import java.util.Scanner;

public class lv3_04 {

	public static void main(String[] args) {
		// �ε��� 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };
		Scanner sc= new Scanner(System.in);
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��
		System.out.println("����1");
		System.out.println("�ε����� �Է��� ������ ����ϼ��� .");
		int num = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if(num ==i) {
				System.out.println(arr[i]);
			}
		}
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11 �ε��� : 1
		System.out.println("����2");
		System.out.println("������ �Է��� �ε����� ����ϼ��� .");
		int score = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if(score == arr[i]) {
				System.out.println(i);
			}
		}
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��
		
		System.out.println("����3");
		System.out.println("�й��� �Է��� ������ ����ϼ��� ");
		int x = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if(x == hakbuns[i]) {
				System.out.println(scores[i]);
			}
		}
		

		
	}

}
