package lv.test_4;

import java.util.Random;

public class lv4_37 {

	public static void main(String[] args) {
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
		 */
		int[][] lottoSet = new int[5][7];
		Random rn = new Random();
		int idx = -1;
		while(true) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<7; j++) {
					int r = rn.nextInt(7)+1;
					lottoSet[i][j] = r;
				}
			}
			
			int count = 0;
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<7; j++) {
					if(lottoSet[i][j] == 7) {
						cnt ++;
					}
					if(lottoSet[i][j] != 7) {
						cnt = 0;
					}
					if(cnt == 3) {
						idx = i;
						count ++;
					}
				}
			}
			if(count == 1) {
				break;				
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}System.out.println();
		}
		
		System.out.println("��÷���� : " +(idx+1));
	}

}
