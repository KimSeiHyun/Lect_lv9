package lv.test_1;

import java.util.Scanner;

public class lv1_05s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		System.out.print("����1 �Է� ");
		int a = sc.nextInt();
		System.out.print("����2 �Է� ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("�� : " + sum);
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.print("���� 1�� �Է� : ");
		int c = sc.nextInt();
		System.out.println(c%2 == 1);
		// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		System.out.println(score >= 60 && score <= 100 );
	}

}
