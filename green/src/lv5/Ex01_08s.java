package lv5;

import java.util.Scanner;

public class Ex01_08s {

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
		
		//선생님께서 작성해주신 코드 . 
		// 27번째 코드를 잘 확인해서 가독성을 높이고  어떤 원리로 더 쉽게 접근했는지 확인하기 .
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
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
			System.out.println("숫자만 있다.");
		} else if (check == 0) {
			System.out.println("문자만 있다.");
		} else {
			System.out.println("둘 다 있다.");
		}
	}

}
