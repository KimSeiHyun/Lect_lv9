package lv3;

import java.util.Scanner;

public class Ex01_03 {
	public static void main(String[] args) {
		// 인덱스 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1 성적 : 11점
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean t = true;
		System.out.println("문제1: 인덱스를 입력받아 성적 출력.");
		System.out.println("인덱스를 입력해주세요 . 0~4 ");
		while (t) {
		n= sc.nextInt();
		if ( n >=0 && n <=4) {
		System.out.println(arr[n]);
		break;
		}
		else {
			System.out.println("범위를 벗어난 숫자입니다.");
		}
		}
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1
		System.out.println("문제2: 성적을 입력받아 인덱스 출력.");
		int score = 0;
		score = sc.nextInt();
		
		for (int i=0; i<5; i++) {
			if (score == arr[i]) 
				System.out.println(i);
		}
		
		
		


}
}
