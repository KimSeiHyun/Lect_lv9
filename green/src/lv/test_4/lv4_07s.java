package lv.test_4;

public class lv4_07s {

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
		int max = 0;
		
		int temp = 0;
		
		for(int i=0; i<6; i++) {
			max = score[i];
			temp = 0;
			int idx = 0;
			int check = 0;
			for(int j=i; j<6; j++) {
				if(max < score[j]) {
					max = score[j];
					idx = j;
					check = 1;
				}
			}
			if(check == 1) {
			temp = score[i];
			score[i] = score[idx];
			score[idx] = temp;
			}
			
		}
		
			for(int i=0; i<6; i++) {
				System.out.print(score[i] + " ");
			}
		

		
	}

}
