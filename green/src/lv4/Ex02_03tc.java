package lv4;

import java.util.Scanner;

public class Ex02_03tc {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		Scanner sc = new Scanner(System.in);
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		
		System.out.print("data1:");
		int data =sc.nextInt();
		System.out.print("data1:");
		int data2 = sc.nextInt();
		
		int idx1 = -1;
		int idx2 = -1;
		int idx3 = -1;
		int idx4 = -1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] ==data) {
					idx1 = i;
					idx2 = j;
				}
				if(arr[i][j] == data2) {
					idx3 = i;
					idx4 = j;
					
				}
			}
		}
		
		int temp = arr[idx1][idx2];
		arr[idx1][idx2] = arr[idx3][idx4];
		arr[idx3][idx4] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}

		}
		
		

	}

}
