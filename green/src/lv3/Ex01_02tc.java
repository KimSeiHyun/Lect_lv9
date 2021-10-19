package lv3;

import java.util.Random;

public class Ex01_02tc {

	public static void main(String[] args) {
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		Random rn = new Random();
		
		int score[] = new int[5]; // {0,0,0,0,0}
		double total = 0;
		double avg = 0;
		int pass = 0;
		for(int i=0; i<5; i++) {
			score[i] = rn.nextInt(100) +1;
			System.out.println(score[i]);
			total += score[i];
			if (score[i] >= 60) {
				pass++;
			}
		}
		avg = total / 5.0;
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)	
		System.out.println("total =" + total);
		System.out.println("avg = " + avg);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("pass : " + pass);
		
	}

}
