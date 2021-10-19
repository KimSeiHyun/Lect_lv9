package lv4;

import java.util.Scanner;

public class Ex02_03 {

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
		System.out.println("����1. �ε��� 2���� �Է¹޾� �� ���.");
		System.out.print("ù��° �ε����� �Է��ϼ��� .");
		int idx1 = sc.nextInt();
		System.out.print("�ι�° �ε����� �Է��ϼ��� .");
		int idx2 = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == arr[idx1][idx2]) {
					System.out.println(arr[i][j]);
				}
			}
		}
		
		System.out.println();
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println("����2. ���� �Է¹޾� �ε��� 2�� ���.");
		int num = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == num) {
					System.out.println(i + " , " + j );
				}
			}
		}
		
		System.out.println();
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max =0;
		int temp1 = 0;
		int temp2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if ( max < arr[i][j]) {
					max = arr[i][j];
					temp1 = i;
					temp2 = j;
				}
			}
		}
		System.out.println("����3. ���� ū ���� �ε��� 2�� ��� :\n" + temp1 + " , " + temp2);
		
		System.out.println();
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		System.out.println("����4. �� 2���� �Է¹޾� �� ��ü ");
		System.out.print("ù��° ���� �Է����ּ��� . ");
			num = sc.nextInt();
		System.out.print("�ι�° ���� �Է����ּ��� . ");
		int num2 = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == num) {
					a = i;
					b = j;
				}
				if(arr[i][j] == num2) {
					c = i;
					d = j;
				}
			}

		}
		
		arr[a][b] = num2;
		arr[c][d] = num;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}//clear

}
