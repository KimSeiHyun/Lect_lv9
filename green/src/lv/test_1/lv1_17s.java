package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_17s {

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
		System.out.println("--------");
		System.out.println("�����ڸ��");
		System.out.println("coin�� ���� : " + coin);
		System.out.println("---------");
		System.out.println("������ �յ޸��� �������ּ��� . (0:��  1:��)");
		int sel = sc.nextInt();
		
		if(sel == 1 && coin == 1) {
			System.out.println("���� ! ������ �޸��̿����ϴ�. ");
		}
		if(sel == 0 && coin == 0) {
			System.out.println("���� ! ������ �ո��̿����ϴ�. ");
		}
		if(sel != coin ) {
			System.out.println("�� !");
		}

	}

}
