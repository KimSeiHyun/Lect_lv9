package lv.test_1;

import java.util.Random;

public class lv1_24s {

	public static void main(String[] args) {
		/*
		 * # 369����[1�ܰ�]
		 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
		 * 2. �� ���� 369�� ������
		 * 	1) 2���̸�, ¦¦�� ���
		 *  2) 1���̸�, ¦�� ���
		 *  3) 0���̸�, �ش� ���ڸ� ���
		 * ��)
		 * 		33	 : ¦¦
		 * 		16	 : ¦
		 * 		 7	 : 7
		 */
		
		Random rn = new Random();
		
		int ranNum = rn.nextInt(50)+1;
		
		int x = ranNum / 10;
		int y = ranNum % 10;
		
		int cnt = 0;
		if(x == 3) {
			cnt ++;
		}
		if(y==3 || y==6 || y==9) {
			cnt ++;
		}
		
		if(cnt == 1) {
			System.out.println(ranNum + "¦");
		}
		else if(cnt == 2) {
			System.out.println(ranNum + "¦¦");
		}
		else {
			System.out.println(ranNum);
		}
		

	}

}
