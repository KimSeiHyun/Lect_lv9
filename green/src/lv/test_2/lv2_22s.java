package lv.test_2;

import java.util.Random;

public class lv2_22s {

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
		Random rn = new Random();
		
		int x = 1;
		int sum = 0;
		int avr = 0;
		int cnt = 0;
		int max = 0;
		int y = 0;
		while (x <=10) {
			int score = rn.nextInt(100)+1;
			if (max <score ) {
				max = score;
				y = x ;
			}
			sum += score;
			System.out.print(x + "���� ���� : " + score);
			if(score >= 60 ) {
				System.out.print("(�հ�!!)");
				cnt ++;
			}
			System.out.println();
			x++;
		}//w
		avr = sum / 10;
		System.out.println("�������� ���� : "+sum);
		System.out.println("�������� ��� : "+avr);
		System.out.println("�հ��� �� : " + cnt + "��");
		System.out.println("1�� �л��� ��ȣ�� ���� : " +y + "��° "+ max + "��");
		
		
	}

}
