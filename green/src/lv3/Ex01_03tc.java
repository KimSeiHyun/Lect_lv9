package lv3;

import java.util.Scanner;

public class Ex01_03tc {

	public static void main(String[] args) {
		// �ε��� 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����� ���ϴ� �ε��� �Է� (0~4)");
		int idx = sc.nextInt();
		if(idx >= 0 && idx <5) {
			System.out.println(arr[idx]);
		}
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11 �ε��� : 1
		
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if(scores[i] == score) {
				System.out.println(i);
			}
		}
	}

}
