package lv4;

public class Ex01_08tc {

	public static void main(String[] args) {
		/*
		 * # ���� ���
		 * . ���� ������ �̸� ���
		 */
		
		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		
		for(int i=0; i<5; i++) {
			int max = score[i];
			int idx = i;
			for(int j=i; j<5; j++) {
				if(max < score[j]) {
					max = score[j];
					idx = j;
				}
			}
			
			int temp1 = score[i];
			score[i] = score[idx];
			score[idx] = temp1;
			
			String temp = name[i];
			name[i] = name[idx];
			name[idx] = temp;
			
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(name[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
