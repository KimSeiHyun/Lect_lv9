package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_04 {

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
		
		
		while(true) {
			int x = 0;
			int cnt = 0;
			int cnt2 = 0;
			while(x<3) {
				int check = 0;
				int num = rn.nextInt(9)+1;
				for(int i=0; i<3; i++) {
					if(me[i] == num) {
						check = 1;
					}
				}
				if(check == 0 ) {
					me[x] = num;
					x++;
				}
			}//w
			for(int i=0; i<3; i++) {
				if(com[i] == me[i]) {
					cnt2 ++;
				}
				for(int j=0; j<3; j++ ) {
					if(me[i] == com[j]) {
						cnt ++;
					}
				}
			}
			for(int i=0; i<3; i++) {
				System.out.print(com[i] + " ");
			}System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(me[i] + " ");
		}System.out.println();
		System.out.printf("%db , %ds\n" ,cnt,cnt2);
		if(cnt2 == 3) {
			System.out.println("3strike !! ");
			break;
		}
		}//w2
		

	}

}
