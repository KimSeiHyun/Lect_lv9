package lv.test_1;

import java.util.Scanner;

public class lv1_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("�� : " + (a + b));
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		int c = sc.nextInt();
		System.out.println(c%2 == 1);
		
		// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���
		
		int score = sc.nextInt();
		System.out.println(score>=60 && score <= 100);
	}

}
