package lv2;

public class Ex01_04 {

	public static void main(String[] args) {
		// ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
		// ���� 4) 1, 2, 7, 8, 9, 10
		
		int a = 1;
		int b = 1;
		
		System.out.println("����4 while");
		while (a <= 10) {
			if ( a <3 || a >=7)
				System.out.println(a);
			a++;
		}
		System.out.println("����4 for");
			for( b=1; b <=10; b++) {
				if ( b <3 || b >= 7) {
					System.out.println(b);
				}
			}
		
	}

}
