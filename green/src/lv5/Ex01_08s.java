package lv5;

import java.util.Scanner;

public class Ex01_08s {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� �� ���ڰ˻�
		 * ��) adklajsiod
		 * 	     ���ڸ� �ִ�.
		 * ��) 123123
		 *    ���ڸ� �ִ�.
		 * ��) dasd12312asd
		 *    ���ڿ� ���ڰ� �����ִ�.
		 */
		
		//�����Բ��� �ۼ����ֽ� �ڵ� . 
		// 27��° �ڵ带 �� Ȯ���ؼ� �������� ���̰�  � ������ �� ���� �����ߴ��� Ȯ���ϱ� .
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = sc.next();
		
		int check = 0;
		for (int i = 0; i < text.length(); i++) {
			int x = (int) text.charAt(i);
			if (x >= (int) '0' && x <= (int) '9') {
				check++;
			}
		}
		// print
		if (check == text.length()) {
			System.out.println("���ڸ� �ִ�.");
		} else if (check == 0) {
			System.out.println("���ڸ� �ִ�.");
		} else {
			System.out.println("�� �� �ִ�.");
		}
	}

}
