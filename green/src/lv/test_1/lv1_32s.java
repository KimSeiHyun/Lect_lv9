package lv.test_1;

import java.util.Scanner;

public class lv1_32s {

	public static void main(String[] args) {
		// ����) ��������3���� �Է¹ް� ������� 
		// ���� 1) 3������ ����� ������ ������ �ű��.
		// ���� 2) 3������ ����� 100~90 ==> A
		// ���� 3) 3������ ����� 89~80 ==> B
		// ���� 4) 3������ ����� 79~70 ==> C
		// ���� 5) 69����                      ==> ����� 
		// �߰�����) �������뺰�� ���ڸ��� 7�� �̻��� + ���ٴ´�. 
		// ��) 98 ==> A+
		// ��) 89 ==> B+
		// ��) 79 ==> C+
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ������ �Է����ּ��� .");
		int a = sc.nextInt();
		System.out.println("�ι�° ������ �Է����ּ��� .");
		int b = sc.nextInt();
		System.out.println("����° ������ �Է����ּ��� .");
		int c = sc.nextInt();
		
		int avr = (a+b+c)/3;
		System.out.println("��� : " + avr);
		if(avr >= 90 && avr <= 100) {
			if(avr%10 >= 7) {
				System.out.println("A+");
			}
			else {
				System.out.println("A");
			}
		}
		else if(avr >= 80 && avr < 90) {
			if(avr%10 >= 7) {
				System.out.println("B+");
			}
			else {
				System.out.println("B");
			}
		}
		else if(avr >= 70 && avr < 80) {
			if(avr%10 >= 7) {
				System.out.println("C+");
			}
			else {
				System.out.println("C");
			}
		}
		else {
			System.out.println("����� !! ");
		}

	}

}
