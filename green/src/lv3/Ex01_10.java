package lv3;

import java.util.Scanner;

public class Ex01_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ���� 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// ��) 30 ==> b[] = {10,20,40,50,0};
		
		System.out.println("����1 : 10,20,30,40,50�� �ϳ��� �Է����ּ��� . ");
		int intA = sc.nextInt();;
		int bIdx = 0;
		for (int i=0; i<5; i++) {
			if ( intA != a[i]) {
				b[bIdx] = a[i];
				bIdx++;
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + "  ");
		}
		
		
		
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};

		int dIdx = 0;
		int dIdx2 = 0;
		System.out.println();
		System.out.println("����2: 1001, 1002, 1003,�߿� �ϳ��� �Է����ּ���.");
		int intC = sc.nextInt();
		for (int i=0; i<6; i++ ) {
			if (intC != c[i] ) {
				d[dIdx] = c[i];
				dIdx++;			
			}
		}
		
		for (int i=0; i<6; i++ ) {
			System.out.print(d[i]+ "  ");
		}
		
		
		
	}
}
