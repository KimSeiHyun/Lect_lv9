package lv6;

import java.util.Random;

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}

public class Ex001_004 {

	public static void main(String[] args) {
		/*
		 * # OMR카드 : 클래스 + 변수
		 * 1. 배열 answer는 시험문제의 정답지이다.
		 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
		 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
		 * 4. 한 문제당 20점이다.
		 * 예)
		 * answer = {1, 3, 4, 2, 5}
		 * hgd    = {1, 1, 4, 4, 3}
		 * 정오표     = {O, X, O, X, X}
		 * 성적        = 40점
		 */
		String O = "O";
		String X = "X";
		String 정오표[] = new String[5];
		Ex06 ex = new Ex06();
		Random rn = new Random();
		
		int x = 0;
		while(x < 5) {
			int rNum = rn.nextInt(5)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				if(rNum == ex.hgd[i]) {
					check = 1;
				}
			}
			if(check == 0) {
				ex.hgd[x] = rNum;
				x++;
			}
			
		}
		
		for(int i=0; i<5; i++) {
			if(ex.answer[i] == ex.hgd[i]) {
				정오표[i] = O;
				ex.cnt ++;
			}else 정오표[i] = X;
		}
		ex.score = ex.cnt*20;
		for(int i=0; i<5; i++) {
			System.out.print(ex.answer[i] + " ");
		}System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(ex.hgd[i] + " ");
		}System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(정오표[i] + " ");
		}System.out.println();
		
		System.out.println("성적 : " + ex.score);

		
	}

}
