package lv5.test;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		//시작시간 11 : 50
		//종료시간 12 : 04
		//소요시간 00 : 14
		/*
		 * # 단어 교체하기(replace)
		 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
		 * 2. 교체해주는 기능을 구현한다.
		 * 예)
		 * 		Life is too short.
		 * 		변경하고 싶은 단어입력 : Life
		 * 		바꿀 단어입력 : Time
		 * 
		 * 		Time is too short.
		 */
		Scanner sc = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
		
		while(true) {
		String temp[] = text.split(" ");
		temp[temp.length-1] = temp[temp.length-1].substring(0,temp[temp.length-1].length()-1);
		System.out.println("변경하고 싶은 단어 입력 : ");
		String str = sc.next();
		for(int i=0; i<temp.length; i++) {
			if(str.equals(temp[i])) {
				System.out.println("바꿀 단어 입력 : ");
				String str2 = sc.next();
				temp[i] = str2;
			}
		}
		text = "";
		for(int i=0; i<temp.length; i++) {
			if(i == temp.length-1) {
				text += temp[i]+".";
				break;
			}
			text += temp[i]+" ";
		}System.out.println();

		System.out.println(text);
		}

		
	}

}
