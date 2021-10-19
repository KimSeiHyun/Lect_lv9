package lv5;

import java.util.Scanner;

public class Ex01_09 {

	public static void main(String[] args) {
		/*
		 * # 단어 검색
		 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
		 * 2. 단어가 존재하면 true
		 *    단어가 없으면 false를 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = sc.next();
		//sc.next() 메서드는 공백을 기준으로 값을 가져와 주기 때문에
		//Life is 라고 입력해도 Life만 값이 저장됨.
		//Life is를 온전히 저장하고 싶으면
		//nextLine() 함수를 사용해야함 . 
		String temp[] = text.split(" ");
		int check = 1;
		System.out.println(temp.length-1);
		for(int i=0; i<temp.length; i++) {
			if(word.equals(temp[i])) {
				check = 0;
			}
			if(i == temp.length-1) {
				String x = word+".";
				if(x.equals(temp[temp.length-1])) {
					check = 0;
				}
			}
		}

		if(check == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	
	}

}
