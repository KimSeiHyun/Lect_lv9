package lv4;

import java.util.Scanner;

public class Ex03_08v2 {

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
		int num = sc.nextInt();
		double b = 10;
		double cnt = 0;
		double a = 0;
		while(t) {
			
			a = num/b;
			b *= 10;
			cnt++;
			if (a < 1) {
				break;
			}
		}
		int arr[] = new int[(int)cnt];
		System.out.println("�ڸ����� : " + cnt);
		while (t) {
			double x2 = a*10;
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(a*10)%10;
				a *= 10;
			}
			break;
		}
		int y = (int)cnt/2;
		if(cnt %2 == 0) {
			System.out.println(num + "�� ¦���Դϴ�.");
		}
		else {
		System.out.println(num + "�� �ڸ����� ��� ���ڴ� :" + arr[y] );
		}
		
		
	}//c

}
