package lv.test_2;

import java.util.Random;
import java.util.Scanner;

public class lv2_03s {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int score = 0;
		while (x <5 ) {
			int a = rn.nextInt(9)+1;
			int b = rn.nextInt(9)+1;
			int c = a*b;
			
			System.out.println(a + " x " + b + " = ?");
			
			System.out.println("정답을 입력해주세요 . ");
			int answer = sc.nextInt();
			
			if (answer == c ) {
				score += 20;
			}
			
			x++;
		}
		
		System.out.println("성적 : " + score);
	}

}
