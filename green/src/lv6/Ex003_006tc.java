package lv6;

import java.util.Random;
import java.util.Scanner;

class OMR {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int answer[] = {3,3,2,1,4};
	int hgd[];
	
	void randomMark() {
		this.hgd = new int[this.answer.length];
		for(int i=0; i<this.answer.length; i++) {
			int rNum = rn.nextInt(5)+1;
			this.hgd[i] = rNum;
		}
	}
	
	char[] checkMark(int arr[]) {
		char[] resultCard = new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == this.answer[i]) {
				resultCard[i] = 'O';
			}
			else {
				resultCard[i] = 'X';
			}
		}
		return resultCard;
	}
	
	void printCard(char arr[]) {
		for(int i=0; i<this.hgd.length; i++) {
			System.out.print(hgd[i] + " ");
		}System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	
		
		}
	
	int resultScore() {
		int score = 0;
		for(int i=0; i<this.hgd.length; i++) {
			if(this.hgd[i] == this.answer[i]) {
				score += 20;
			}
		}
		return score;
		
	}
	public void run() {
		

		//답안작성(랜덤)
		randomMark();
		//정답체크(성적산출)
		printCard(checkMark(this.hgd));
		//정오표출력
		System.out.println(resultScore());
		
	}
	
}
public class Ex003_006tc {

	public static void main(String[] args) {
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
		OMR omr = new OMR();
		omr.run();
	}

}
