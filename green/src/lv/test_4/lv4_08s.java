package lv.test_4;

public class lv4_08s {

	public static void main(String[] args) {
		/*
		 * # ���� ���
		 * . ���� ������ �̸� ���
		 */
		
		String[] name = {"��ȫ�浿", "��迵", "���ڹ�ŷ", "�κ�ö", "���ް���"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		for(int i=0; i<5; i++) {
			int max = score[i];
			int temp = 0;
			int check = -1;
			int idx = -1;
			for(int j=i; j<5; j++) {
				if(max < score[j]) {
					max = score[j];
					idx = j;
					check = 1;
				}
			}
			if(check == 1 ) {
			temp = score[i];
			score[i] = score[idx];
			score[idx] = temp ;
			
			String str = name[i];
			name[i] = name[idx];
			name[idx] = str;
			
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(name[i] + " ");
		}System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(score[i] + "     ");
		}System.out.println();

		
	}

}
