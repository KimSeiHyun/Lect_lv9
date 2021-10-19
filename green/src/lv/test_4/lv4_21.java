package lv.test_4;

import java.util.Random;

public class lv4_21 {

	public static void main(String[] args) {
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.
		 */
		int[][] lottoSet = new int[5][7];
		
		Random rn = new Random();
		int idx = 0;
		while(true) {
			int check = 0;
			int cnt = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<7; j++) {
					int rNum = rn.nextInt(5)+1;
					lottoSet[i][j] = rNum;
				}
			}
			for(int i=0; i<5; i++) {
				check = 0;
				for(int j=0; j<7; j++) {
					if(lottoSet[i][j] == 3) {
						check ++;
					}
					if(lottoSet[i][j] != 3) {
						check = 0;
					}
				}
				if(check == 3) {
					idx = i; 
					cnt ++;
				}
			}
			
			if(cnt == 1) break;
			

		}
		
		for(int i=0; i<lottoSet.length; i++) {
			for(int j=0; j<lottoSet[i].length; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}System.out.println();
		}
		System.out.println("당첨은 : " + (idx+1));
		
	}

}
