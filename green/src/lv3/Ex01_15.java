package lv3;

import java.util.Scanner;

public class Ex01_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 10, 20, 30, 40, 50 };
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		
		int idx = 0;
		int a = 0;
		System.out.println("����1: 0~4���� �Է����ּ��� . ");
		int inIdx = sc.nextInt();
		int inIdx2 = sc.nextInt();
		while(idx < 5) {
			if (inIdx >4 || inIdx  <0  ) {
				System.out.println("������ ��� �����Դϴ�.");
				break;
			}
			if (inIdx2 >4 || inIdx2  <0 ) {
				System.out.println("������ ��� �����Դϴ�.");
				break;
			}
			if ( idx == inIdx && inIdx >= 0 && inIdx <5) {
				a = arr[idx];
				arr[idx] = arr[inIdx2];
			}
			 if (idx == inIdx2 && inIdx2 >= 0 && inIdx2 <5) {
				arr[idx] = a;				
			}
			if(	inIdx == inIdx2 ) {
				System.out.println("�ߺ��� �����Դϴ�.");
				break;
			}
			idx ++;
		}
		
		for (int i =0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
//		int[] arr = { 10, 20, 30, 40, 50 };
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 40, 30, 20, 50}
		System.out.println();
		System.out.println("����2 : 10,20,30,40,50�߿� 2���� �Է����ּ��� .  ");
		int b = sc.nextInt();
		int c = sc.nextInt();
		int a2 = 0;
		for(int i=0; i<5; i++) {
			if (arr[i] == b) {
				a2 = arr[i];
				arr[i] = c;
			}
			if (arr[i] == c ) {
				arr[i] = a2;
			}
		}
			
		for (int i =0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// �� 3) �й�1 �Է� : 1002 , �й�2 �Է� : 1003
		// {87, 45, 11, 98, 23}

	}

}
