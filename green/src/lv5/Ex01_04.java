package lv5;

import java.util.Scanner;

public class Ex01_04 {

	public static void main(String[] args) {
		/*
		 * # 끝말잇기 게임
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */
		
		Scanner sc = new Scanner(System.in);
		String start = "자전거";
		
		while(true) {
		
		System.out.println("제시어 : " + start);
		System.out.print("입력 : ");
		String str = sc.next();
		int max = 0;
		for(int i=0; i<start.length(); i++) {
			if(max <i) {
				max = i;
			}
		}
		if(start.charAt(max)==str.charAt(0)) {
			start = str;				
		}else {
			System.out.println("제시어의 마지막 글자랑 입력한 숫자의 첫번째 글자가 맞지 않습니다.");
		}
		}//w

	}

}
