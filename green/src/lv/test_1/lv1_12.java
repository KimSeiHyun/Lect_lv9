package lv.test_1;

import java.util.Scanner;

public class lv1_12 {

	public static void main(String[] args) {
		/*
		 * # ���� ��ȿ�� �˻�
		 * 1. ������ �Է¹޴´�.
		 * 2. ������  60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
		 * 3. ��, �Է¹��� ������ 
		 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
		 *    ��) ������  �߸� �Է��߽��ϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>=60 && score <= 100) {
			System.out.println("�հ� !! ");
		}
		if(score <60 && score >= 0 ) {
			System.out.println("���հ� !! ");
		}
		if(score >100 || score <0) {
			System.out.println("������ �߸� �Է��߽��ϴ�.");
		}

	}

}
