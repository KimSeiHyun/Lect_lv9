package lv5;

import java.util.Scanner;

public class Ex01_08 {

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
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = sc.next();

		int check1 = 0;
		int check2 = 0;
		for(int i=0; i<text.length(); i++) {
			char a = text.charAt(i);
				int num = (int)a;
			char b = '9';
			int num2 = b;
				if(num <= b) {
					check1 = 1;
				}
				if(num > b) {
					check2 = 1;
				}
		}
		if(check1 == 1 && check2 == 0) {
			System.out.println("���ڸ� �ִ� ! ");
		}
		if(check2 == 1 && check1 == 0) {
			System.out.println("���ڸ� �ִ� ! ");
		}
		if(check1 == 1 && check2 == 1) {
			System.out.println("���ڿ� ���ڰ� �����ִ� ! ");
		}

		
	}

}
