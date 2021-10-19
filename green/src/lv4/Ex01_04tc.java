package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex01_04tc {

	public static void main(String[] args) {
		/*
		 * # 숫자 야구 게임
		 * 1. me에 1~9 사이의 숫자 3개를 저장
		 *    (단, 중복되는 숫자는 저장 불가)
		 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
		 * 3. 숫자와 자리가 같으면 		strike += 1
		 *    숫자만 같고 자리가 틀리면 	ball += 1
		 * 예)
		 * 정답 : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		int[] com = {1, 7, 3};
		int[] me = new int[3];	
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean win = false;
		
		while(!win) {
			int strike = 0;
			int ball = 0;
			//출력
			for(int i=0; i<3; i++) {
				System.out.print(com[i] + " ");
			}
			for(int i=0; i<3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.println();
			
			//입력
			for(int i=0; i<3; i++) {
				System.out.printf("숫자%d : " , i+1);
				int num = sc.nextInt();
				
				int check  = 1;
				for(int j=0; j<3; j++) {
					if(me[j] == num) {
						check = -1;
					}
				}
				
				if(check == 1) {
					me[i] = num;
				}
				else {
					System.out.println("중복값 입력 불가 .");
					i --;
				}				
			}
			
			//검사
			for(int i=0; i<3; i++) { // com 배열 기준
				for(int j=0; j<3; j++) {
					if(com[i] == me[j]) {
						if(i == j ) {
							strike ++;
						}
						else {
							ball ++;
							
						}
					}
				}
				
			}
			
			//종료조건
			if(strike == 3) {
				System.out.println("gmae clear ! ");
				win =true;
			}
			
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
