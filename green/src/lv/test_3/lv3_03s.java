package lv.test_3;

import java.util.Random;

public class lv3_03s {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random rn = new Random();
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		System.out.println("문제1");
		int sum = 0;
		int avr = 0 ;
		int cnt = 0;
		for(int i=0; i<5; i++) {
			int num = rn.nextInt(100)+1;
			arr[i] = num;
		}		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
			if(arr[i] >= 60) {
				cnt ++;
			}
		}
		System.out.println();
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		System.out.println("문제2");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/5);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("문제3");
		System.out.println("60점 이상인 학생 수 : " + cnt );
		
	}

}
