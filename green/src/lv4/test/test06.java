package lv4.test;

import java.util.Random;

public class test06 {

	public static void main(String[] args) {
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.
		 */
		
		// 시작 10:37
		// 종료 10:53 
		// 소요 00:16
		
		Random rn = new Random();
		int x = -1;
		
		int[][] lottoSet = new int[5][7];
		
		while(x <0) {
			
		for(int i=0; i<5; i++) {
			int cnt = 0;
			for(int j=0; j<7; j++) {
				int num = rn.nextInt(3)+1;
				lottoSet[i][j] = num;
				if(lottoSet[i][j] == 3) {
					cnt++;
				}
				if(lottoSet[i][j] != 3) {
					cnt = 0;
				}
				if(cnt == 3) {
					x = i;
					break;
				}
			}
			if(cnt == 3) {
				break;
			}
		}
		if(x == -1) {
			for(int i=0; i<5; i++) {
				for(int j =0; j<7; j++) {
					lottoSet[i][j] = 0;
				}
			}
			continue;
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				int num2 = rn.nextInt(2)+1;
				if(lottoSet[i][j] == 0) {
					lottoSet[i][j] = num2;
				}
			}
		}

		}
		
		System.out.println("로또가 당첨된 줄은 : " + (x+1)+"번째 줄 ! ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}

	}

}
