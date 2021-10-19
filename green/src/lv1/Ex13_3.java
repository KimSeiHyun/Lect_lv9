package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex13_3 {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int a = 1;
		int score = 0;

		while (a <= 5) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(10) + 1;
			System.out.println(x + "*" + y + "= ?");
			int answer = x * y;
			int myAnswer = sc.nextInt();
			if (answer == myAnswer) {
				System.out.println("정답입니다 .");
				score += 20;
			} else if (answer != myAnswer) {
				System.out.println("틀렸습니다.");
			}

			a++;
		}
		System.out.println("점수 : " + score + "점.");
	}

}
