package lv5;

import java.util.Scanner;

public class Ex01_07 {

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
		
		//Ex01_07s 에서 푼 해답이 최적화 정답 . 
		
		Scanner sc = new Scanner(System.in);
		String name = "코끼리";
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = sc.next();
		int sum = 0;
		int sum2 = 0;
		int cnt = 0;
		for(int i=0; i<name.length(); i++) {//각 글자를 숫자로 변환해 합산 
			char a = name.charAt(i);
			int num = a;
			sum += num;
		}
		for(int i=0; i<myName.length(); i++) { //각 글자를 숫자로 변환해 합산 
			char a = myName.charAt(i);
			int num = a;
			sum2 += num;
		}
		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);
		for(int i=0; i<name.length(); i++) { //끼코리 로 정답을 적어도 true 가 되는걸 예외시킴 . 
			char a = name.charAt(i);
			int num1 = a;
			char b = myName.charAt(i);
			int num2 = b;
			if(num1 == num2) {
				cnt++;
			}
		}
		if(sum== sum2 && cnt == name.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
