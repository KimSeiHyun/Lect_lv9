package lv3;

import java.util.Scanner;

public class Ex01_10tc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ���� 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// ��) 30 ==> b[] = {10,20,40,50,0};
		
		for(int i=0; i<5; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("�� �Է� : ");
		int data = sc.nextInt();
		int bIdx = 0; // �ε��� �и� .
		for(int i=0; i<5; i++) { // a�迭 ��ȯ
			if(a[i] != data) {
				b[bIdx] = a[i];
				bIdx ++;
			}
		}
		for(int i=0; i<5; i++) 
			System.out.print(b[i]+ " ");
		
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};

		System.out.println("\n�й� �Ǵ� ���� �Է� 1001,40,1002,65,1003,70");
		data = sc.nextInt();
		
		int delIdx = -1; // �й� ���� . 
		for(int i=0; i<6; i++) {
			if(data == c[i]) { // �ε��� i ���� ���� Ȧ¦ Ȯ��  > �ĺ� ���� .
				//�й�
				if (i % 2 == 0) {
					// i , i + 1
					delIdx = i;
				}
				//����
				else {
					// i , i - 1 
					delIdx = i-1;
				}
			}
		}
		
		//ó��
		int dIdx = 0;
		for(int i=0; i<6; i+=2) { // �й����� �� �������� +=2;
			if(i != delIdx) {
				d[dIdx] = c[i]; // �й� 
				d[dIdx+1] = c[i+1]; // ����
				dIdx += 2;
			}
		}
		//���
		for(int i = 0; i<6; i++) {
			System.out.print(d[i] + "  ");
		}

	}

}
