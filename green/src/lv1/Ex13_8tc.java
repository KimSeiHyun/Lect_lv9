package lv1;

public class Ex13_8tc {

	public static void main(String[] args) {
		/*
		 * # 369����[2�ܰ�]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */
		int n = 1;
		while(n <=50 ) {
			int ten = n / 10;
			int one = n % 10;
			int clap = 0;
			if (ten % 3 == 0 && ten != 0) {
				clap ++;
			}
			if (one % 3 == 0 && one != 0) {
				clap ++;
			}
			
			if( clap == 0) {
				System.out.println(n);
			}
			else {
				while (clap > 0) {
					System.out.print("¦");
					clap --;
				}
				System.out.println(); // �ٹٲ� 
			}
			
			n ++;
		}

	}

}
