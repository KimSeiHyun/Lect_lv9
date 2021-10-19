package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Ex001_002 {
	
	//클래스문제2
	public static void main(String[] args) {
		Ex04 ex = new Ex04();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		System.out.println("문제1");
		int sum = 0 ;
		double avr = 0 ;
		int cnt = 0;
		for(int i=0; i<5; i++) {
			int ranNum = rn.nextInt(100)+1;
			ex.scores[i] = ranNum;
			System.out.print(ex.scores[i] + " ");
			sum += ex.scores[i];
			if(ex.scores[i] >= 60) {
				cnt++;
			}
		}System.out.println();
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		System.out.println("문제2");
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +sum/5);
		System.out.println();
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		System.out.println("문제3");
		System.out.println("성적이 60이상인 학생 수 : " + cnt);
		System.out.println();
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.println("문제4");
		System.out.println("인덱스를 입력받아 성적 출력 : (0~4입력) " );
		int idx = sc.nextInt();
		System.out.println(ex.scores[idx]);
		System.out.println();
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.println("문제5");
		System.out.println("성적을 입력받아 인덱스 출력 : (1~100입력) ");
		int score = sc.nextInt();
		for(int i=0; i<5; i++) {
			if(ex.scores[i] == score) {
				System.out.println(i);
			}
		}
		System.out.println();
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		System.out.println("문제6\n학번을 입력받아 성적 출력 (1001~1005): ");
		int a = sc.nextInt();
		for(int i=0; i<5; i++) {
			if(a == ex.hakbuns[i]) {
				System.out.println(ex.scores[i]);
			}
		}System.out.println();
		
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.println("문제7\n학번을 입력받아 성적 출력 ,단 없는 학번 입력시 예외 처리 ");
		a = sc.nextInt();
		int check = 0;
		for(int i=0; i<5; i++) {
			if(a == ex.hakbuns[i]) {
				System.out.println(ex.scores[i]);
			}else check = 1;
		}
		if(check == 1) System.out.printf("%d 해당 학번은 존재하지 않습니다. \n" ,a);
		System.out.println();
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int max = 0;
		idx = -1; 
		for(int i=0; i<5; i++) {
			if(max < ex.scores[i]) {
				max = ex.scores[i];
				idx = i;
			}
		}
		System.out.println("문제8");
		System.out.println("1등학생의 학번  : " +ex.hakbuns[idx] );
		System.out.println("1등학생의 성적  : " +max  );
		

	}

}
