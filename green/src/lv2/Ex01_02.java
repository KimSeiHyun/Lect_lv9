package lv2;

public class Ex01_02 {

	public static void main(String[] args) {
		// ���� 2) 1���� 10���� �ݺ���, 5~9���� ���
		// ���� 2) 5, 6, 7, 8, 9
		int c = 1;
		int d = 1;
		System.out.println("����2 while");
		while (c <= 10) {
			if (c > 4 && c < 10) {
			System.out.println(c);
			}
			c++;
		}
		System.out.println("����2 for");
		for(d =1; d <=10; d++) {
			if (d > 4 && d < 10) {
				System.out.println(d);
			}
		}

	}

}
