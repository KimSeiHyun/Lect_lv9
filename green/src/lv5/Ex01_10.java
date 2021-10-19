package lv5;

import java.util.Scanner;

public class Ex01_10 {

	public static void main(String[] args) {
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
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = sc.nextLine();
		String temp[] = text.split(" ");
		int check = 0;
		String x = "";
		int y = 0;
		for(int i=0; i<temp.length;i ++) {
			if(word.equals(temp[i])) {
				check = 1;
				y = i;
			}
			if(i == temp.length-1) {
				x = word+".";
				if(x.equals(temp[temp.length-1])) {
					check = 2;
					y = i;
				}
			}
		}
		if(check == 1) {
			System.out.println("바꿀 단어입력 : ");
			String str = sc.next();
			temp[y] = str;
		}
		else if(check == 2) {
			System.out.println("바꿀 단어입력 : ");
			String str = sc.next();
			temp[y] = str+".";
			
		}
		else {
			System.out.println("일치하는 단어가 없습니다 . ");
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}

	}

}
