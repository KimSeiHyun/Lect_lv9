package lv.test_3;

import java.util.Scanner;

public class lv3_12s {

	public static void main(String[] args) {
		/*
		 * # �Ｎ���� 1. ���� 7�� �������� 3�� �����ϸ�, "��÷" ���.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int[] lotto = { 0, 7, 7, 7, 7, 0, 0, 0 };
		// int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};
		
		boolean run = true;

		System.out.println("1) ���� ���Ȯ��");
		System.out.print("�޴� ���� : ");
		int sel = sc.nextInt();
		int cnt = 0;
		if (sel == 1) {
			for(int i=0; i<lotto.length; i++) {
				if(lotto[i] == 7) {
					cnt ++;
				}
				if(lotto[i] == 0) {
					cnt = 0;
				}
				if(cnt ==3 ) {
					System.out.println("��÷ !! ");
					break;
				}
			}
		}
		if(cnt != 3) {
			System.out.println("�� ! ");
		}
		
		
	}

}
