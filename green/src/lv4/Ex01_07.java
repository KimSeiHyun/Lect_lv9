package lv4;

public class Ex01_07 {

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
		
		int[] score = {10, 50, 30, 40, 80, 7};
		
		int k = 0;
		int j2 = 0;
		
		for(int i =0; i<6; i++) {
			int max = 0;
			for(int j=i; j<6; j++) {
				if (max < score[j]) {
					max = score[j];
					j2 = j;
				}
			}
			k = score[i];
			score[i] = max ;
			score[j2] = k;
		}

		
		for(int i=0; i<6; i++) {
			System.out.print(score[i] + " ");
		}
		
	}

}
