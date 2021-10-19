package lv3;

import java.util.Scanner;

public class Ex01_03_01 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력해주세요 . ");
		int inHakbuns = sc.nextInt();
		for (int h =0; h<5; h++ ) {

			if (inHakbuns == hakbuns[h]) {
				System.out.println(hakbuns[h] + "의 점수는 :" + scores[h] + " 입니다.");


			}

		}
		
	}

}
