package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_29 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
		 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
		 * 3. ������ �յ޸��� ���ߴ� �����̴�.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int coin = rn.nextInt(2);
		
		System.out.println("������ �� �޸��� �����ּ��� ! 0.��  1.��");
		int x = sc.nextInt();
		
		if(x == coin ) {
			System.out.println("���� ! ");
		}
		else {
			System.out.println("�� ! ");
		}
		
		
	}

}
