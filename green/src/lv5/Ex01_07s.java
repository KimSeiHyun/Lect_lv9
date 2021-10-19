package lv5;

import java.util.Scanner;

public class Ex01_07s {

	public static void main(String[] args) {
		//문자열비교문제
		/*
		 * # 문자열 비교
		 * . equals() 메서드 사용없이 문자의 일치여부 비교
		 * 예)
		 * 코끼리
		 * 입력 = 티라노사우루스
		 * 출력 = false
		 */
		
		Scanner sc = new Scanner(System.in);
		String name = "코끼리";
		System.out.println("제시어 : " + name);
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = sc.next();
		int cnt = 0;

		for(int i=0; i<name.length(); i++) { //같은 위치의 글자가 일치하면 cnt ++
			int a = name.charAt(i);
			int num1 = a;
			int b = myName.charAt(i);
			int num2 = b;
			if(num1 == num2) {
				cnt ++;
			}
		}
		if(cnt == myName.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
