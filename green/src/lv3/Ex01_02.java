package lv3;

import java.util.Random;

public class Ex01_02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Random ran = new Random();
		int score = ran.nextInt(100)+1;
		int n = 0 ;
		int sum = 0;
		int avr = 0;
		int cnt = 0;
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		System.out.println("문제1 : 5개의 정수 저장");
		for (n =0; n <5; n++) {
			score = ran.nextInt(100)+1;
			arr[n] += score;
			sum += score;
			System.out.print(arr[n]);
			if (arr[n] >= 60) {
				System.out.println("(합격!)");
				cnt ++ ; 
			}
			else {
				System.out.println();
			}
		}
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		avr = sum /n;
		System.out.println("문제2 : 총점과 평균 출력.");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avr);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		System.out.println("문제3 : 합격생 수 출력.");
		System.out.println("합격생 수 :" + cnt);
		
		
	}

}
