package lv.test_4;

public class lv4_07 {

	public static void main(String[] args) {
		/*
		 * # �����ϱ�
		 * 1. �ε��� 0���� �������� �˻��Ѵ�.
		 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
		 * 3. �ε��� 1�����Ѵ�.
		 * 4. [1~3]�� ������ �ݺ��Ѵ�.
		 * ��)
		 * 10, 50, 30, 40, 80, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 40, 30, 10, 7
		 */
		
		int[] score = {10, 30, 40, 7, 80, 50};
		int x = 0;

			for(int i=0; i<6 ; i++) {
				int max = 0 ;
				int temp = 0;
				int a = 0;
				int b = 0;
				max = score[i];
				for(int j= i; j<6; j++) {
				if(max < score[j] ) {
					max = score[j];
					a = i;
					b = j;
				}
				}
				
				temp = score[a];
				score[a] = score[b];
				score[b] = temp;
				
			}
			x++;

		for(int i=0; i<6; i++) {
			System.out.print(score[i] + " ");
		}
	}

}
