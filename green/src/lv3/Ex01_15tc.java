package lv3;

import java.util.Scanner;

public class Ex01_15tc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int[] arr = { 10, 20, 30, 40, 50 };
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		System.out.println("����1");
		System.out.println("idx1:");
		int idx1 = sc.nextInt();
		System.out.println("idx2:");
		int idx2 = sc.nextInt();
		int temp = arr[idx1]; // ������
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		System.out.println("data1:");
		int data1 = sc.nextInt();
		System.out.println("data2:");
		int data2 = sc.nextInt();
		
		idx1 = -1;
		idx2 = -1;
		
		for(int i=0; i<5; i++) {
			if(data1 == arr[i]) {
				idx1 = 1;
			}
			if(data2 == arr[i]) { // ����μ��� else�� if�� ��������� 
								//�����;��� ����ϰ� �������� if�� ���� �и����ִ°� �� ������.
				idx2 = 1;
			}

		}
		if (idx1 != -1 && idx2 != -1) {
			temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;
		}
		

		
		for(int i =0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// �� 3) �й�1 �Է� : 1002 , �й�2 �Է� : 1003
		// {87, 45, 11, 98, 23}
		
		System.out.print("\n�й�1:");
		int num1 = sc.nextInt();
		System.out.print("�й�2:");
		int num2 = sc.nextInt();

		idx1 = -1;
		idx2 = -1;
		
		for(int i=0; i<5; i++) {
			if(hakbuns[i] == num1) {
				idx1= i;
			}
			if(hakbuns[i] == num2) {
				idx2= i;
			}
		}
		
		//������ü 
		temp = scores[idx1];
		scores[idx1] = scores[idx2] ;
		scores[idx2] = temp;
		
		//���
		
		for(int i=0; i<5; i++) {
			System.out.printf("%d�� : %d��\n",hakbuns[i],scores[i]);
		}
		
		

		
	}

}
