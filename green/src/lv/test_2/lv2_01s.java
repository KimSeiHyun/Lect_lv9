package lv.test_2;

public class lv2_01s {

	public static void main(String[] args) {
		// ����1) 1~10���� �ݺ��� 5~9 ���
		// ����1) 5, 6, 7, 8, 9
		System.out.println("����1");
		int a = 1;
		while (a <=10) {
			if(a>=5 && a<=9) {
				System.out.print(a + " ");
			}
			a++;
		}
		System.out.println();
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		// ����2) 6, 5, 4, 3
		System.out.println("����2");
		a = 10;
		while (a>=1) {
			if(a>=3 && a<=6) {
				System.out.print(a + " ");
			}
			a--;
		}
		System.out.println();
		// ����3) 1~10���� �ݺ��� ¦���� ���
		// ����3) 2, 4, 6, 8, 10
		System.out.println("����3 ");
		a =1 ;
		while (a <=10) {
			if(a%2 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
	}

}
