package lv5;

public class Ex01_03s {

	public static void main(String[] args) {
		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		String str = "��ö��/87,�̸���/42,�̿���/95";
		String[] name = new String[3];
		int[] score = new int[3];
		
		String s[] = str.split(",");
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
			
		}
		System.out.println();
		for(int i=0; i<s.length; i++) {
			String info[] = s[i].split("/");
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(name[i] + " ");
		}System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(score[i] + " ");
		}System.out.println();
		
		
	}

}
