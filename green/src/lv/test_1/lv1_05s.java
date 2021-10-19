package lv.test_1;

import java.util.Scanner;

public class lv1_05s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.print("숫자1 입력 ");
		int a = sc.nextInt();
		System.out.print("숫자2 입력 ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("합 : " + sum);
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.print("숫자 1개 입력 : ");
		int c = sc.nextInt();
		System.out.println(c%2 == 1);
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();
		System.out.println(score >= 60 && score <= 100 );
	}

}
