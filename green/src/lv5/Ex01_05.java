package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex01_05 {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[1단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 예)
		 * 문제 : mysql
		 * 입력 : mydb
		 * 문제 : mysql
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : jsp
		 */
		String[] words = {"java", "mysql", "jsp", "spring"};
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while (x < 500) {//셔플
			int a = rn.nextInt(4);
			int b = rn.nextInt(4);
			String temp = words[a];
			words[a] = words[b];
			words[b] = temp;
			x++;
		}
		x = 0;
		for(int i=0; i<words.length; i++) {//셔플이 잘되었는지 여러번 출력확인. 
			System.out.print(words[i] + " ");
		}System.out.println();
		
		while(x<4) {//게임시작
			System.out.println("문제 : " +words[x]);
			System.out.print("입력 : ");
			String s = sc.next();
			if(words[x].equals(s)) {//입력한값이 맞출때만 x증가 
				x++;
			}
		}
		System.out.println("game clear ! ");

	}

}
