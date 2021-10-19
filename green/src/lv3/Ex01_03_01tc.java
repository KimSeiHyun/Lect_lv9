package lv3;

import java.util.Scanner;

public class Ex01_03_01tc {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력해주세요 . ");
		int inHakbuns = sc.nextInt();
		
		int idx = -1; // 인덱스 정보를 갖는 변수는 -> 초기화를 할 때 , 0으로 하면 안됨 . 
		for (int h =0; h<5; h++ ) {

			if (inHakbuns == hakbuns[h]) {
				idx = h;
			}
		}
		if (idx != -1) { // 이 if문을 안쓰면 out bound 오류 출력되면서 실행이 중단.
			System.out.println(scores[idx]);
		}
		
	}

}
