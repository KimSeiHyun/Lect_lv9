package lv.test_4;

import java.util.Random;

public class lv4_21 {

	public static void main(String[] args) {
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
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
		System.out.println("��÷�� : " + (idx+1));
		
	}

}
