package lv.test_3;

import java.util.Scanner;

public class lv3_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		System.out.println("����1");
		System.out.println("�ε���1�� �Է����ּ��� .");
		int idx1 = sc.nextInt();
		System.out.println("�ε���2�� �Է����ּ��� .");
		int idx2 = sc.nextInt();
		int temp =0;
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i=0;i <5; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		System.out.println("����2");
		System.out.println("��1 �Է�");
		int num1 = sc.nextInt();
		System.out.println("��2 �Է�");
		int num2 = sc.nextInt();
		int x =0;
		int y =0;
		for(int i=0; i<5; i++) {
			if(arr[i] == num1) {
				x = i;
			}
			if(arr[i] == num2) {
				y = i;
			}
		}
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] +" ");
		}System.out.println();
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// �� 3) �й�1 �Է� : 1002 , �й�2 �Է� : 1003
		// {87, 45, 11, 98, 23}
		System.out.println("����3");
		System.out.println("�й�1 �Է����ּ��� .");
		int  a = sc.nextInt();
		System.out.println("�й�2 �Է����ּ��� .");
		int  b = sc.nextInt();
		x = 0;
		y = 0;
		for(int i =0; i<5; i++) {
			if(hakbuns[i] == a) {
				x = i;
			}
			if(hakbuns[i] == b) {
				y = i;
			}
		}
		temp = scores[x];
		scores[x] = scores[y];
		scores[y] = temp;
		
		for(int i=0; i<5; i++) {
			System.out.print(scores[i] + " ");
		}
		
		
		
	}

}
