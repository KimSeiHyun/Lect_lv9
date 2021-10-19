package lv3;

import java.util.Scanner;

public class Ex01_03tc {

	public static void main(String[] args) {
		// 인덱스 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1 성적 : 11점
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적 출력을 원하는 인덱스 입력 (0~4)");
		int idx = sc.nextInt();
		if(idx >= 0 && idx <5) {
			System.out.println(arr[idx]);
		}
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1
		
		System.out.println("성적 입력 : ");
		int score = sc.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if(scores[i] == score) {
				System.out.println(i);
			}
		}
	}

}
