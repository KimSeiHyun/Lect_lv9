package lv4.test;

public class test01 {

	public static void main(String[] args) {
		/*
		 * # ���� ���
		 * . ���� ������ �̸� ���
		 */
		
		String[] name = {"��ȫ�浿", "��迵", "���ڹ�ŷ", "���κ�ö", "���ް���"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		
		// ���� 09:30
		// ���� 10:04
		// �ҿ� 00:34
		int idx = -1;
		int temp = 0 ;
		int x  = 0;
		int y = 0;
		String temp2 = "";
		while ( x < 5) {
			int max = 0 ;
		for(int i=x; i<5; i++) {
			if(max < score[i]) {
				max  = score[i];
				idx = i;
			}
		}
		
		temp = score[x];
		score[x] = score[idx];
		score[idx] = temp;
		
		temp2 = name[x];
		name[x] = name[idx];
		name[idx] = temp2;
		

		x ++;
		
		}//w

		for(int i=0; i<5 ;i++) {
			System.out.print(name[i] + "  ");
		}
		System.out.println();
		for(int i=0; i<5 ;i++) {
			System.out.print(score[i] + " \t");
		}

		
	}//c

}
