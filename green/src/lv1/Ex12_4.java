package lv1;

import java.util.Random;

public class Ex12_4 {

	public static void main(String[] args) {
		/*
		 * # Ȧ¦ ����
		 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
		 * 2. ����� ���� ���ڸ� �����ְ�,
		 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
		 * ���� : 9:41
		 * ���� : 9:45
		 * �ҿ�ð� : 4��
		 */
		
		Random ran = new Random();
		
		int random = ran.nextInt(100)+1;
		System.out.println("Ȧ¦���� !");
		if (random %2 == 0  ) {
			System.out.println(random);
			System.out.println("¦���Դϴ� !");
		}
		else {
			System.out.println(random);
			System.out.println("Ȧ���Դϴ� .");
		}

	}

}
