package lv1.test;

import java.util.Random;

public class Ex13_03 {

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

		Random ran = new Random();
		
		int a = 1;
		int score = 0;
		int sum = 0;
		double avr = 0;
		int pass = 0;
		int max = 0;
		int top = 0;
		while (a <= 10) {
			score = ran.nextInt(100) +1;
			System.out.print(a+ "��° �л�" + "�� ���� : " +  score);
			if ( score >= 60) {
				System.out.println("(�հ�) ");
				pass ++;
				}
			else {
				System.out.println("(���հ�) ");
			}

			if (max < score) {
				max = score;
				top = a;
			}

		
			sum += score;
			avr = sum / a;
			a++;
			
		}
		System.out.println("���� : " +sum);
		System.out.println("��� : " +avr);
		System.out.println("�հ��� �� :" + pass);
		System.out.println("1���� ��ȣ�� ���� : " + top+ "�� �л� " + "," + max + "��");
	}

}
