package lv6;

import java.util.Random;

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// ������
	int[] hgd = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
}

public class Ex001_004 {

	public static void main(String[] args) {
		/*
		 * # OMRī�� : Ŭ���� + ����
		 * 1. �迭 answer�� ���蹮���� �������̴�.
		 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
		 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
		 * 4. �� ������ 20���̴�.
		 * ��)
		 * answer = {1, 3, 4, 2, 5}
		 * hgd    = {1, 1, 4, 4, 3}
		 * ����ǥ     = {O, X, O, X, X}
		 * ����        = 40��
		 */
		String O = "O";
		String X = "X";
		String ����ǥ[] = new String[5];
		Ex06 ex = new Ex06();
		Random rn = new Random();
		
		int x = 0;
		while(x < 5) {
			int rNum = rn.nextInt(5)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				if(rNum == ex.hgd[i]) {
					check = 1;
				}
			}
			if(check == 0) {
				ex.hgd[x] = rNum;
				x++;
			}
			
		}
		
		for(int i=0; i<5; i++) {
			if(ex.answer[i] == ex.hgd[i]) {
				����ǥ[i] = O;
				ex.cnt ++;
			}else ����ǥ[i] = X;
		}
		ex.score = ex.cnt*20;
		for(int i=0; i<5; i++) {
			System.out.print(ex.answer[i] + " ");
		}System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(ex.hgd[i] + " ");
		}System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(����ǥ[i] + " ");
		}System.out.println();
		
		System.out.println("���� : " + ex.score);

		
	}

}
