package lv6;

import java.util.Random;
import java.util.Scanner;

class Test3 {
Random rn = new Random();
Scanner sc = new Scanner(System.in);
	void ranNum(int[] scores) {
		int x = 0;
		while(true) {
		int rNum = rn.nextInt(100)+1;
		int check =0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] == rNum) {
				check = 1;
			}
		}
		if(check == 0 ) {
			scores[x] = rNum;
			x++;
		}
		if(x == 5) {
			System.out.println("문제1. scores배열에 랜덤값 저장");
			for(int i=0; i<scores.length; i++) {
				System.out.print(scores[i] + " ");
			}System.out.println();
			break;
		}
		}
		
	}//ranNum
	
	void total_avr(int scores[]) {
		int total = 0;
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("문제2. 전교생의 총점과 평균 출력");
		System.out.println("total : " + total);
		System.out.println("avr : " + total/scores.length);
	}
	void pass(int scores[]) {
		System.out.println("문제3 . 성적이 60이상이면 합격, 합격생수 출력");
		int cnt = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + "\t");
			if(scores[i] >= 60 ) {
				System.out.println("(합격 !) ");
				cnt++;
			}
			else System.out.println("(불합격 !)");
		}
		System.out.println("cnt : " + cnt);
	}
	void printScore(int hakbuns[],int scores[]) {
		
		System.out.println("문제4. 인덱스를 입력받아 성적 출력 ");
		System.out.print("인덱스 입력 : ");
		int idx = sc.nextInt();
		System.out.println("성적 : " + scores[idx]);
		
		System.out.println("문제5. 성적을 입력받아 인덱스 출력. ");
		System.out.print("성적 입력 : ");
		int x = sc.nextInt();
		for(int i=0; i<scores.length; i++) {
			if(x == scores[i]) {
				System.out.println("인덱스 : " + i);
			}
		}
		
		System.out.println("문제6. 학번을 입력받아 성적 출력");
		System.out.print("학번 입력 : ");
		x = sc.nextInt();
		int check = 0;
		for(int i=0; i<hakbuns.length; i++) {
			if(hakbuns[i] == x) {
				System.out.println("score : " + scores[i]);
			}
		}
		System.out.println("문제7. 학번을 입력받아 성적 출력 (예외처리)");
		x = sc.nextInt();
		for(int i=0; i<hakbuns.length; i++) {
			if(hakbuns[i] == x) {
				System.out.println("score : " + scores[i]);
				check = 1;
			}
		}
		if(check == 0) System.out.println("학번을 다시 확인해주세요 . ");
	}
	
	void max (int hakbuns[],int scores[]) {
		System.out.println("문제8. 1등학생의 학번과 성적 출력");
		int max = 0;
		int idx = -1;
		for(int i=0; i<5; i++) {
			if(max < scores[i]) {
				max = scores[i];
				idx = i;
			}
		}
		System.out.println("1등 학생의 학번 : " + hakbuns[idx]);
		System.out.println("1등 학생의 성적 : " + scores[idx]);
	}
	
	
}

public class Ex003_005 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		
		Test3 test = new Test3();
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		test.ranNum(scores);
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		test.total_avr(scores);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		test.pass(scores);
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		test.printScore(hakbuns,scores);
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1

		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점

		
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		
		
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		test.max(hakbuns, scores);
	}

}
