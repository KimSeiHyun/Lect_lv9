package lv4;

import java.util.Scanner;

public class Ex03_08 {

	public static void main(String[] args) {
		
		//����1) 1~1.000.000(�鸸) ������ ���ڸ� �Է¹ް� ��� ���� ��� 
        //(�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
		// ��)  123 ==> 2
		// ��)  1234 ==> ¦���� �ڸ��̴�
		// ��)  1 ==> 1
		// ��)  1234567 ==> 4
		// ��Ʈ �ڸ����� ���ϰ� �迭�� ������� �ϳ��� ���� 
		// ��) ==> 123 ==> 3 ==> arr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		double num = sc.nextInt();
		double b = 10;
		int cnt = 0;
		double a = 0;
		while(t) {
			
			a = num/b;
			b *= 10;
			cnt++;
			System.out.println(a);
			if (a < 1) {
				break;
			}
		}
		System.out.println("�ڸ����� : " + cnt);
		if(cnt%2 == 0) {
			System.out.println(num + " �� ¦���� �ڸ����̴� .");
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr[] = new int[num];
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		if(num%2 == 0) {
//			System.out.println("¦���̴� . ");
//		}
//		System.out.println();
//		if(num%2 == 1) {
//		int a = num /2;
//		System.out.printf("�߰��� �ִ� ���ڴ� %d �̴� .",arr[a]);
//		}
	}

}
