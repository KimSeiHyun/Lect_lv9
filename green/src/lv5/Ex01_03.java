package lv5;

public class Ex01_03 {

	public static void main(String[] args) {
		//���ڿ�2��������
		
		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		String str = "��ö��/87,�̸���/42,�̿���/95";
		String[] name = new String[3];
		int[] score = new int[3];
		int x = 0;
		String s[] = str.split(",");
		String s2[][]  = new String[3][2]; 
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		
		}
		for(int i=0; i<s2.length; i++) {
			for(int j=0; j<s2[i].length; j++) {
				System.out.println(s2[i][j]);
			}
			
		}
		
		String s3[];
		while(x<3) {//���� ���� �и��Ͽ� ���� 
		s3 = s[x].split("/");
		name[x] = s3[0];
		score[x] = Integer.parseInt(s3[1]);
		
		x++;
		}//w
		
		//���� 
		for(int i=0; i<3; i++) {
			System.out.print(name[i] + " ");
		}System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(score[i] + " ");
		}System.out.println();

		
	}

}
