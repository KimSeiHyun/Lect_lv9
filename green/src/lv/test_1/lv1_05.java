package lv.test_1;

import java.util.Scanner;

public class lv1_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("합 : " + (a + b));
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		int c = sc.nextInt();
		System.out.println(c%2 == 1);
		
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		
		int score = sc.nextInt();
		System.out.println(score>=60 && score <= 100);
	}

}
