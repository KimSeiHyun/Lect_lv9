package lv3;

import java.util.Scanner;

public class Ex01_03_01 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�й��� �Է����ּ��� . ");
		int inHakbuns = sc.nextInt();
		for (int h =0; h<5; h++ ) {

			if (inHakbuns == hakbuns[h]) {
				System.out.println(hakbuns[h] + "�� ������ :" + scores[h] + " �Դϴ�.");


			}

		}
		
	}

}
