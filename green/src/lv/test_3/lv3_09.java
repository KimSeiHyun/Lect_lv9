package lv.test_3;

import java.util.Scanner;

public class lv3_09 {

	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ���� 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// ��) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x = 0;
		for(int i=0; i<5; i++) {
			if(num != a[i]) {
				b[x] = a[i];
				x++;
			}
		}
		System.out.println("����1");
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + " ");
		}
		
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		int num2 = sc.nextInt();
		x = 0;
		for(int i=0; i<6; i+=2) {

			if(num2 != c[i]) {
				d[x] =c[i]; 
				d[x+1] = c[i+1];
				x+=2;
			}
		}
		System.out.println("����2");
		for(int i=0; i<6; i++) {
			System.out.print(d[i] + " ");
		}
		
		
	}

}
