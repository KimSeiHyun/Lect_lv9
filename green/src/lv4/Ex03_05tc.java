package lv4;

import java.util.Random;

public class Ex03_05tc {

	public static void main(String[] args) {
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
		 */
		
		int[][] lottoSet = new int[5][7];
		int result[] = new int[lottoSet.length];
		Random rn = new Random();
		
		boolean win = false;
		for(int i=0; i<lottoSet.length; i++) {
			int cnt = 0;
			for(int j=0; j<lottoSet[i].length; j++) {
				int num = rn.nextInt(2); // 0 -> 0 , 1 -> 3

				if(num == 1) {
					lottoSet[i][j] = 3;
					cnt ++;
				}
				else {
					lottoSet[i][j] = 0;				
					cnt = 0;
				}
				if(cnt == 3) {
					//��÷ �߰� ! 
					if(win == false) { // ù ����
						win = true;
						result[i] = 1;
					}
					else { // �ߺ� ��÷ -> �ٽ� �̱�
						i --;
						break; // i��° ��÷���� �� �ο� ���� . 
					}
				}
			}
			if(win == false && i == lottoSet.length-1) { // ��÷���� �ϳ��� ���� ��� 
				i --;
			}
		}
		
		// ���
		for(int i=0; i<lottoSet.length; i++) {
			for(int j=0; j<lottoSet[i].length; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}
			if(result[i] ==1) {
				System.out.print(" <-");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
