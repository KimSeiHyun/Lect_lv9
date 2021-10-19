package lv1;

import java.util.Random;
import java.util.Scanner;

public class EX13_3tc {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int score = 0;
//		int count = 0; // 중요 !!!!!! 변화하면 안되는 변수는 반드시 반복문 밖에 !

		while (n < 5) {
			int num1 = ran.nextInt(8) + 2; // 2~9
			int num2 = ran.nextInt(10) + 1; // 1~10
			int result = num1 * num2; // 정답
			System.out.println(num1 + " x " + num2 + " =?");
			int answer = sc.nextInt(); // 답변
			// 정답 또는 땡
			if (answer == result) {
				System.out.println("정답!");
//				count++;
				score += 20;
			} else {
				System.out.println("땡 .");
			}
			// 정답 -> 개수를 카운트 or 점수 누적
			n++;
		}
		//성적 산출 . 
//		System.out.println("점수 :" + (count*20));
		System.out.println("점수 :" + score + "점");
// 이 문제에서 점수를 나타내는 방법 2가지 .
// 첫번째 : count 처럼 표기 .
// 두번째 : score 처럼 표기 . 
	}

}
