package lv1;

import java.util.Scanner;

public class Ex12_8 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		// ���۽ð� : 10 : 54
		// ����ð� : 11 : 30
		// �ҿ�ð� : 36��.
		
		System.out.println("���� ���� �Ϻ��� ������ �Է��ϼ���.");
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int ja = sc.nextInt();
		
		int avr = (kr+en+ja) /3;
		if (avr >= 90 && avr < 97 ) {
			System.out.println(avr + "=A");
		}
		else if ( avr >= 97 && avr < 101) {
			System.out.println(avr + "=A+");
		}
		else if (avr >= 80 && avr  < 87 ) {
			System.out.println(avr + "=B");
		}
		else if ( avr >= 87 && avr < 90) {
			System.out.println(avr + "=B+");
		}
		else if (avr >= 70 && avr < 77 ) {
			System.out.println(avr + "=C");
		}
		else if (avr >= 77 && avr < 80 )
			System.out.println(avr + "=C+");
		else if (avr < 70 ){
			System.out.println(avr +"=�����");
		}
		else {
			System.out.println("�߸��� �����Դϴ� .");
		}
		

	}

}
