package lv4;

public class Ex03_01 {

	public static void main(String[] args) {
		// ���� ) ���� ������ �̸� ����
		String[] names = { "�ϱ��", "������", "������", "����ŷ", "�ٵ���" };


	
		for(int i =0; i<5; i++) { 
			String max = names[i];
			int idx = i;
			for(int j =i; j<5; j++) {
				if(max.compareTo(names[j]) > 0) {
					max = names[j];
					idx = j;
				}
			}
			String temp = names[i];
			names[i] = names[idx];
			names[idx] = temp;
		}

		for(int i =0; i<5; i++) {
			System.out.print(names[i] + " ");
		}
		

		
	}//clear


}
