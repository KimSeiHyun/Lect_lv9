package lv.test_3;

import java.util.Scanner;

public class lv3_06 {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// ���� 1) ���� ����Ʈ�� ���� �Է��ϸ�   ��ȣ ��� 
		// ��) 51 ==> 2
		// ��) 10 ==> 0
		Scanner sc= new Scanner(System.in);
		System.out.println("����1");
		System.out.println("10,49,51,36,17�� �Է��ϸ� �ε��� ��� .");
		int num = sc.nextInt();
		for(int i=0; i<5; i++) {
			if(num == a[i] ) {
				System.out.println(i);
			}
		}
		
		
		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		System.out.println("����2");
		System.out.println("a�迭���� Ȧ���� b�迭�� ���� . ");
		for(int i=0; i<5; i++) {
			if(a[i] %2 == 1) {
				b[i] = a[i];
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
	    // 2�������� ���� �ٸ�
		// ��) c = [49, 51, 17, 0, 0]
		System.out.println("����3");
		int c[] = { 0,0,0,0,0 };
		for(int i=0; i<5; i++) {
			if(a[i] %2 == 1) {
				for(int j=0; j<5; j++) {
					if(c[j] == 0) {
						c[j] = a[i];
						break;
					}
				}
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(c[i] +" " );
		}
		System.out.println();
		
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		
		// ����4) �й��� �Է��ϸ� ���� ��� 
		// ��) 1001==>20 , 1003 ==> 54
		System.out.println("����4 ");
		int num1 = sc.nextInt();
		for(int i=0; i<6; i++) {
			if(num1 == arr[i]) {
				System.out.println(arr[i+1]);
			}
		}
		// ����5) ������ �Է��ϸ� �й� ��� 
		// ��) 20 ==> 1001 , 45 ==> 1002
		System.out.println("����5 ");
		int num2 = sc.nextInt();
		for(int i=0; i<6; i++) {
			if(num2 == arr[i]) {
				System.out.println(arr[i-1]);
			}
		}
		
	}

}
