package lv4;

public class Ex03_01tc {

	public static void main(String[] args) {
		// ���� ) ���� ������ �̸� ����
		String[] names = { "������", "���", "����", "����", "���" };

		String a = "��";
		String b = "��";
		String c = "��";
		
		System.out.println(a.compareTo(b)); // ���� > a�� b���� ���̴�.
		System.out.println(b.compareTo(c)); // ��� > b�� c���� ���̴� . 
		System.out.println(a.compareTo(c)); // 0   > a�� c��  ����.
		
		for(int i=0; i<names.length; i++) {
			String first = names[i];
			int idx = i;
			for(int j =i; j<names.length; j++) {
				if(first.compareTo(names[j]) > 0) { // i��° ���� ������ �� �ڷ� �����ϴ� ���
					first = names[j];
					idx = j;
				}
			}
			
			String temp = names[i];
			names[i] = names[idx];
			names[idx] = temp;
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
