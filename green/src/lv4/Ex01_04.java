package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex01_04 {

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
		
		int i = 0 ;
		
		while(i<3) {
			int rNum = rn.nextInt(9)+1;		
			int check = -1;
			
			for(int j =0; j<3; j++) {
				if(rNum == com[j]) {
					check = i;
				}
			}
			if(check == -1) {
				com[i] = rNum;
				i++;
			}
		}
		
		boolean t = true;
		int ball = 0;
		int strike = 0;
		while(t) {

		System.out.print("com : ");
		for(i =0; i<3; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		
		System.out.print("me  : ");
		for(i =0; i<3; i++) {
			System.out.print(me[i] + " ");
		}
		System.out.println();
		System.out.println("strike : " + strike);
		System.out.println("ball   : " + ball);
		if( strike == 3) {
			System.out.println("3진 아웃 게임이 종료됩니다.");
			break;
		}
		strike = 0;
		ball = 0;
		me = new int[3];	
		for(i = 0; i<3; i++) {
			System.out.printf("%d번쨰숫자" ,i+1);
			int inMe = sc.nextInt();
			int check = 1;
			
			for(int j =0; j<3; j++) {
			if(me[j] == inMe) {
				check = -1;
			}
			}
			
			if(inMe >0 && inMe <10 && check == 1) {
				me[i] = inMe;
			}
			else {
				System.out.println("범위를 벗어난 숫자이거나 중복된 값입니다.");
				i--;
			}
		}
		
		for(i =0; i<3; i++) {
			if ( com[i] == me[i]) {
				strike ++;
			}
			for(int j=0; j<3; j++) {
				if ( i != j && com[i] == me[j]) {
					ball ++;
				}
			}
		}

		}
		
	
	}

}
