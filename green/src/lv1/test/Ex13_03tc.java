package lv1.test;

import java.util.Random;

public class Ex13_03tc {

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

		int cnt = 0;
		int total = 0;
		int avg = 0;
		int pass = 0;
		int max = 0;
		int top = 0;
		
		while (cnt < 10) {
			int score = rn.nextInt(100) +1;
			
			total += score;
			System.out.print(cnt+1 + "�� �л��� ���� : " + score + "��");
		
			if(score >= 60) {
				System.out.println("(�հ� !)");
				pass ++;
			}
			else {
				System.out.println("(���հ� !) ");
			}
			if (max < score) {
				max = score;
				top = cnt +1;
			}
			cnt ++;
		}
		
		System.out.println("total :" + total);
		System.out.println("avg:"+ total / 10);
		System.out.println("pass : " + pass);
		System.out.println("1�� : " + top + "�� �л� ," + max + "��");
	}

}
