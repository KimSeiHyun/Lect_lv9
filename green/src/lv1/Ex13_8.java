package lv1;

public class Ex13_8 {

	public static void main(String[] args) {
		/*
		 * # 369����[2�ܰ�]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */
		boolean b = true;
		int a = 1;
		String str = "¦";
		
		while (a <= 50 ) {
			if (a % 3 == 0) {
				System.out.println("¦");
			}
			if (a / 10 == 3 && a % 3 == 0) {
				
				System.out.println("¦¦");
				
			}
			a++;

		}
	}
}
