package lv.test_2;

import java.util.Random;

public class lv2_22 {

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
		
		int a = 1;
		int sum = 0;
		int cnt = 0;
		int max = 0;
		int y = 0;
		while(a <=10) {
			int score = rn.nextInt(100)+1;
			if( max < score) {
				max = score;
				y = a;
			}
			System.out.print(a+"��° �л��� ���� : " + score);
			if(score>=60) {
				System.out.print("(�հ�!!)");
				cnt ++;
				
			}
			sum += score;
			System.out.println();
			a++;
		}//w
		int avr = sum/10;
		System.out.println("���� : " + sum + "  ��� : " + avr);
		System.out.println("�հ��� �� : "+ cnt );
		System.out.println("1���� ��ȣ�� ���� : " + y+"��°  " +max +"��");
	}

}
