package lv6;

import java.util.Random;

class Ex003_06 {
	Random rn = new Random();
	int answer[] = {1, 3, 4, 2, 5};
	int hgd[] = new int[5];
	String s[] = new String[5];
	
	void suffle(int hgd[]) {
		int x = 0;
	//	while(true) {
			for(int i=0; i<5; i++) {
				int rNum = rn.nextInt(5)+1;
				hgd[i] = rNum;
			}
	//	}
	}
	
	void answer(int a[], int b[]) {

		for(int i=0; i<5; i++) {
			if(answer[i] == hgd[i]) {
				s[i] = "O";
			}else {
				s[i] = "X";
			}
		}
	}

	void print(int a[], int b[]) {
		
		System.out.print("answer \t");
		for(int i=0; i<5; i++) {
			System.out.print(answer[i] + " ");
		}System.out.println();
		
		System.out.print("hgd \t");
		for(int i=0; i<5; i++) {
			System.out.print(hgd[i] + " ");
		}System.out.println();
		
		System.out.print("정오표 \t");
		for(int i=0; i<5; i++) {
			System.out.print(s[i] + " ");
		}System.out.println();
	}
	
	void score() {
		int sum = 0;
		for(int i=0; i<5; i++) {
			if(s[i].equals("O")) {
				sum += 20;
			}
		}
		System.out.println("성적 : " + sum);
	}
	
	
	void run() {
		suffle(hgd);
		answer(answer,hgd);
		print(answer,hgd);
		score();
	}
	
	
	

}
public class Ex003_006 {

	public static void main(String[] args) {
		Ex003_06 ex = new Ex003_06();

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
		ex.run();
		
	}

}
