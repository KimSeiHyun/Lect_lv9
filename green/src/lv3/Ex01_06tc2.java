package lv3;

import java.util.Scanner;

public class Ex01_06tc2 {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// ���� 1) ���� ����Ʈ�� ���� �Է��ϸ�   ��ȣ ��� 
		// ��) 51 ==> 2
		// ��) 10 ==> 0
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			System.out.println((a[i] + "  "));
		}
		System.out.println("\n�� �Է� : ");
		int data = sc.nextInt();
		
		for(int i = 0; i<5; i++) { // i : 0~4 (index)
			if (data == a[i]) {
				System.out.println("�ε��� : " + i);
			}
		}

		
		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		
		for (int i = 0; i<5; i++) { // a �迭�� ��ü���� ��ĵ . 
			if(a[i] %2 == 1) { //�ε��� i�� �״�� ��� > b�迭�� �� ����. 
				b[i] =a[i] ; 
			}
		}
		// b�迭�� ��� . 
		for (int i = 0 ; i <5; i++) {
			System.out.println(b[i] + " ");
		}
		
		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
	    // 2�������� ���� �ٸ�
		// ��) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		
		int cIdx = 0; // c �迭�� ù��° �ε����� �ʱⰪ���� �������� �� . 
					  
		
		for (int i = 0; i<5; i++) { // a �迭�� ��ü���� ��ĵ . 
			if(a[i] %2 == 1) { // �ε��� i���� �״�� ����� �� ���� . 
				c[cIdx] = a[i] ; 
				cIdx++;
			}
		}
		// c�迭�� ��� . 
		System.out.println("����3");
		for (int i = 0 ; i <5; i++) {
			System.out.println(c[i] + " ");
		}
		
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		// ����4) �й��� �Է��ϸ� ���� ��� 
		// ��) 1001==>20 , 1003 ==> 54
		System.out.println("�й��Է� : ");
		
		int num = sc.nextInt();
		
		for(int i = 0; i<6; i+=2) {
			if ( num == arr[i]) {
				System.out.printf("%d�� �л��� ������ %d�� �Դϴ�.", arr[i], arr[i+1]);
			}
		}
		
		
		
		// ����5) ������ �Է��ϸ� �й� ��� 
		// ��) 20 ==> 1001 , 45 ==> 1002

	}

}