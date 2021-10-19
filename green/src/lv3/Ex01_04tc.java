package lv3;

import java.util.Scanner;

public class Ex01_04tc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		
		// 유요한 학번의 성적을 출력하면 -> break
		while(true) {
			System.out.println("학번입력 : ");
			int num = sc.nextInt();
			
//			int check = 0; // 0 false , 1 true
			boolean check = false;
			int index = -1;
			// 검사 (hakbuns 배열에 존재하는가)
			for (int i=0; i<5; i++) {
				if(hakbuns[i] == num) {
					check = true;
					index = i;
				}
			}
			// check 변수 활용 -> 결과값 도출 . 
			if (check == true) {
				System.out.println(scores[index] + "점");
				break;
			}
			else {
				System.out.println("유요한 학번을 입력해주세요 . ");
			}
		}
		
		
		
		
		
		
		
		
	}

}
