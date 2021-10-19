package lv3;

import java.util.Scanner;

public class Ex01_05tc {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		Scanner sc = new Scanner(System.in);
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		// 최대값 구하기  >  배열 문제 . 
		
		int max = 0;
		int idx = -1;
		for(int i=0; i<5; i++) {
			if(scores[i] > max) {
				max = scores[i]; // max값 갱신 . 
				idx = i;
			}
		}
		System.out.println("1등 학생은 : " + hakbuns[idx] + "번 ");
		System.out.println("max : " + max);

	}

}
