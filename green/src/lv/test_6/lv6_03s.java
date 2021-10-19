package lv.test_6;

import java.util.Random;
import java.util.Scanner;

class Ex04s {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class lv6_03s {

	public static void main(String[] args) {
		Ex04s e = new Ex04s();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		System.out.println("문제1");
		int sum = 0;
		int cnt = 0;
		for(int i=0; i<e.scores.length; i++) {
			int rNum = rn.nextInt(100)+1;
			e.scores[i] = rNum;
			sum += rNum;
			if(rNum >= 60) cnt ++;
			System.out.print(e.scores[i] + " ");
		}System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		System.out.println("문제2");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " +(double)sum/e.scores.length);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		System.out.println("문제3");
		System.out.println(cnt);
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.println("문제3");
		System.out.println("인덱스 입력 : ");
		int idx = sc.nextInt();
		System.out.println(e.scores[idx]);
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.println("문제5");
		System.out.println("성적 입력 : ");
		int score = sc.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] == score) System.out.println(i);
		}
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 92점
		System.out.println("문제6");
		System.out.println("학번 입력 : ");
		int h = sc.nextInt();
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == h) System.out.println(e.scores[i]);
		}
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.println("문제7");
		System.out.println("학번 입력 : ");
		h = sc.nextInt();
		int check = 0;
		int max = 0;
		idx = 0;
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == h) {
				System.out.println(e.scores[i]);
				check = 1;
			}
			if(max < e.scores[i] ) {
				max = e.scores[i];
				idx = i;
			}
		}
		if(check == 0) System.out.println("해당 학번은 존재하지 않습니다. ");
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		System.out.println("문제8");
		System.out.println("1등의 학번 : " +e.hakbuns[idx]);
		System.out.println("1등의 성적 : " +max);
	}

}