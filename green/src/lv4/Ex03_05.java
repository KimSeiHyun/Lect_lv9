package lv4;

import java.util.Random;

public class Ex03_05 {

	public static void main(String[] args) {
		
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.
		 */
		
		int[][] lottoSet = new int[5][7];
		
		Random rn = new Random();
		
		boolean t = true;
		int check = 0;
		int temp =0;
		while(check == 0) {
		for(int i=0; i<5; i++) {
			int cnt = 0;
			if(check == 1) {
				break;
			}
			for(int j=0; j<7; j++) {
				int ran = rn.nextInt(3)+1;
				lottoSet[i][j] = ran;
				if(lottoSet[i][j] == 3) {
					cnt ++;
				}
				if(lottoSet[i][j] != 3) {
					cnt = 0;
				}
				if(cnt == 3) {
					temp = i;
					check = 1;
					break;
				}		
			}
		}
		for(int i=0; i<5; i++) {
			for(int j =0; j<7; j++) {
				int ran2 = rn.nextInt(2)+1;
				if(lottoSet[i][j] ==0) {
					lottoSet[i][j] = ran2;
				}
			}
		}
		}//w

		if(check == 1) {
			System.out.printf("%d번째 당첨!\n" , temp+1);
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j]+ " ");
			}
			System.out.println();
		}
	
	}//c

}
