package lv.test_4;

import java.util.Random;

public class lv4_21s {

	public static void main(String[] args) {
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
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
