package lv2;

import java.util.Random;

public class Level_Test_3 {

	public static void main(String[] args) {
		/*
		 * # �����л�
		 * 1. 10ȸ �ݺ��� �Ѵ�.
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
		 * ---------------------------------------
		 * . ������(10��)�� ������ ����� ����Ѵ�.
		 * . �հ��� ���� ����Ѵ�.
		 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */
		//	���� : 10:43
		//	���� : 10:52
		//	�ҿ� : 9��
		
		Random ran = new Random();
		int a = 1 ;
		int pass = 0;
		int sum = 0;
		int avr = 0;
		int top = 0;
		int max = 0;
		
		while (a <= 10 ) {
			int score = ran.nextInt(100) +1;
			System.out.print(a + "��° �л� :" + score);
			if (score >= 60 ) {
				System.out.println("(�հ�) ");
				pass++;
			}
			else {
				System.out.println("(���հ�!)");
			}
			if (max < score) {
				max = score;
				top = a;
			}
			
			a++;
			
			sum += score;
			avr = sum/10;
		}
		
		System.out.println("�������� ����:" + sum );
		System.out.println("�������� ���:" + avr );
		System.out.println("�հ��ڼ� :" + pass);
		System.out.println("1�� �л��� ��ȣ �� ���� : " + top + "��°" + max + "��");

	}

}
