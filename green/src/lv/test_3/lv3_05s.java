package lv.test_3;

import java.util.Scanner;

public class lv3_05s {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번을 입력받아 성적 출력 ");
		int num = sc.nextInt();
		int check = -1;
		for(int i=0; i<5 ; i++) {
			if(num == hakbuns[i]) {
				check = i;
			}
		}
		
		if(check == -1) {
			System.out.println("학번을 다시 확인해주세요 . ");
		}
		else {
			System.out.println(scores[check]);
		}
		
		
	}

}
