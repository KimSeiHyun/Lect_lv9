package lv.test_4;

import java.util.Scanner;

public class lv4_13s {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}System.out.println();
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.println("����1");
		System.out.println("ù��° �ε��� �Է�");
		int idx1 = sc.nextInt();
		System.out.println("�ι�° �ε��� �Է�");
		int idx2 = sc.nextInt();
		System.out.println(arr[idx1][idx2]);
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println("����2");
		System.out.println("�ε��� ���� ������ ���� �Է�");
		int num = sc.nextInt();
		int x = 0;
		int y = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == num) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println("�ε���1 : " + x );
		System.out.println("�ε���2 : " + y );
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(max < arr[i][j] ) {
					max = 0;
					x = i;
					y = j;
				}
			}
		}
		System.out.println("����3");
		System.out.println("���� ū ���� �ε��� 2�� ");
		System.out.println(x + " " + y);
		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.println("����5");
		System.out.println("ù���� �� �Է�");
		int a = sc.nextInt();
		System.out.println("�ι��� �� �Է�");
		int b = sc.nextInt();
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == a) {
					x1 = i;
					x2 = j;
				}
				if(arr[i][j] == b) {
					x3 = i;
					x4 = j;
				}
			}
		}System.out.println();
		int temp = arr[x1][x2];
		arr[x1][x2] = arr[x3][x4];
		arr[x3][x4] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}System.out.println();

	}

}
