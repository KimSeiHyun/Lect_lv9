package lv3;

import java.util.Scanner;

public class Ex01_13 {

	public static void main(String[] args) {
		/*
		 * # �Ｎ���� 1. ���� 7�� �������� 3�� �����ϸ�, "��÷" ���.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int[] lotto = { 0, 0, 0, 7, 7, 0, 7, 7 };
		// int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};
		boolean run = true;
		System.out.println("1) ���� ���Ȯ��");
		System.out.print("�޴� ���� : ");
		int sel = scan.nextInt();
		while(run) {	
		if (sel == 1) {
			for (int i = 0; i<5; i++) {
				if ( lotto[i] == 7) {
					i++;
					if( lotto[i] ==7 ) {
						i ++;
						if (lotto[i] ==7) {
							System.out.println("��÷ . ");
							run = false;
						}
						else {
							System.out.println("��!");
							run = false;
						}
					}
				}


			}


		}
		else {
			System.out.println("�����մϴ� .");
			run = false;
		}
		}
	}

}
