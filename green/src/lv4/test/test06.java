package lv4.test;

import java.util.Random;

public class test06 {

	public static void main(String[] args) {
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
		 */
		
		// ���� 10:37
		// ���� 10:53 
		// �ҿ� 00:16
		
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
		
		System.out.println("�ζǰ� ��÷�� ���� : " + (x+1)+"��° �� ! ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}

	}

}
