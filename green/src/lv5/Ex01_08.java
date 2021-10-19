package lv5;

import java.util.Scanner;

public class Ex01_08 {

	public static void main(String[] args) {
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
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
			System.out.println("숫자만 있다 ! ");
		}
		if(check2 == 1 && check1 == 0) {
			System.out.println("문자만 있다 ! ");
		}
		if(check1 == 1 && check2 == 1) {
			System.out.println("문자와 숫자가 섞여있다 ! ");
		}

		
	}

}
