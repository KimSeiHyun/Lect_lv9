package lv.test_3;

import java.util.Scanner;

public class lv3_07s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����1)  �ε���(���ȣ)�� �Է��ϸ� �����
		int a[] = { 10,20,30,40,50 };
		// ��) 3 ==> 40
		System.out.println("����1");
		int num = sc.nextInt();
		for(int i=0; i<5; i++) {
			if(num == i) {
				System.out.println(a[i]);
			}
		}
		
		// ����2) �Ʒ��迭�� ����ū�� ��� 
		int b[] = { 12,54,23,87,1 };
		// ��) 87
		int max = 0;
		for(int i=0; i<5; i++) {
			if(max < b[i]) {
				max = b[i];
			}
		}
		System.out.println("����2");
		System.out.println(max);
		
		

		// ����3) �Ʒ� �迭�� Ȧ���� ���� ��� 
		int c[] = { 12,54,23,87,1 };
		// ��) Ȧ���� ���� : 3
		System.out.println("����3");
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(c[i] %2 == 1) {
				cnt ++;
			}
		}
		System.out.println(cnt);

		// ����4) �Ʒ��迭�� �Ųٷ� ���� 
		int d[] = { 1,2,3,4,5 };
		int e[] = { 0,0,0,0,0 };
		//��)  ={5,4,3,2,1};
		System.out.println("����4");
		int temp =0;
		for(int i=4; i>=0; i--) {
			e[temp] = d[i];
			temp ++;
		}
		for(int i=0; i<5; i++) {
		System.out.print(e[i] + " ");	
		}
		

	}

}
