package lv.test_4;

import java.util.Random;

public class lv4_21s {

	public static void main(String[] args) {
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.
		 */
		int[][] lottoSet = new int[5][7];
		Random rn = new Random();
		
		while(true) {
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<7; j++) {
					int rNum = rn.nextInt(5)+1;
					lottoSet[i][j] = rNum;
				}
			}
			int check = 0;
			int cnt = 0;
			for(int i=0; i<5; i++) {
				cnt = 0;
				for(int j=0; j<7; j++) {
					if(lottoSet[i][j] == 3) {
						cnt++;
					}
					if(lottoSet[i][j] != 3) {
						cnt = 0;
					}
				}
				if(cnt == 3) {
					check ++;
				}
			}
			
			if(check == 1) break;
			
			
			
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}System.out.println();
		}
	}

}
