package lv4;

import java.util.Random;

public class Ex03_05 {

	public static void main(String[] args) {
		
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
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
			System.out.printf("%d��° ��÷!\n" , temp+1);
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j]+ " ");
			}
			System.out.println();
		}
	
	}//c

}
