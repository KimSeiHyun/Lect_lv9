package lv1;

public class Ex13_1 {

	public static void main(String[] args) {
		// ����1) 1~10���� �ݺ��� 5~9 ���
		int a =  1;
		System.out.println("����1");
		while ( a < 11 ) {
			
			a++;
			if (a > 4 && a < 10)

			System.out.println(a);
			}	
		// ����1) 5, 6, 7, 8, 9
		
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		int b = 10 ;
		System.out.println("����2");
		while ( b > 0 ) {
			b --;
			if ( b < 7 && b > 2)
				System.out.println(b);
		}
		// ����2) 6, 5, 4, 3
		// ����3) 1~10���� �ݺ��� ¦���� ���
		System.out.println("����3");
		int c = 1;
		while ( c < 11 ) {
			c ++;
			if (c %2 == 0 ) {
				System.out.println(c);
			}
		}
		// ����3) 2, 4, 6, 8, 10

	}

}
