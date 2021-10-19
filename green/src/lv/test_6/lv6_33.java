package lv.test_6;

import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
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
class ScoreMng{
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 2};		// 모범답안
	int[] me = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
	
	public void inAnswer() {
		for(int i=0; i<me.length; i++) {
			this.me[i] = ran.nextInt(5)+1;
		}
	}
	
	public void print() {
		System.out.print("omr  : ");
		for(int i=0; i<this.omr.length; i++) {
			System.out.print(this.omr[i] + " ");
		}System.out.println();
		System.out.print("me   : ");
		for(int i=0; i<this.omr.length; i++) {
			System.out.print(this.me[i] + " ");
		}System.out.println();
	}
	public void OXprint() {
		String temp[] = new String[this.omr.length];
		System.out.print("OX   : ");
		for(int i=0; i<temp.length; i++) {
			if(this.omr[i] == this.me[i]) {
				temp[i] = "O";
				this.score += 20;
				System.out.print(temp[i] + " ");
			}
			else {
				temp[i] = "X";
				System.out.print(temp[i] + " ");
			}
		}System.out.println();
		System.out.println("score : " + score);
	}
	void run() {
		inAnswer();
		print();
		OXprint();
	}
	
}

public class lv6_33 {

	public static void main(String[] args) {
		ScoreMng sm = new ScoreMng();
		sm.run();


	}
}