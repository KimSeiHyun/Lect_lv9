package lv.test_1;

import java.util.Scanner;

public class lv1_13 {

	public static void main(String[] args) {
		/*
		 * # ���̱ⱸ �̿�����
		 * 1. Ű�� �Է¹޴´�.
		 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
		 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
		 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
		 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �Է����ּ��� . ");
		int x = sc.nextInt();
		
		if(x >= 120) {
			System.out.println("���̱ⱸ �̿밡�� ! ");
		}
		if(x < 120) {
			System.out.println("���̱ⱸ �Ұ��� ! ");
			System.out.println("�θ�԰� �Բ� ���˳��� ? (yes : 1 , no : 0)");
			int sel = sc.nextInt();
			if(sel == 1 ) {
				System.out.println("�θ�԰� �Բ����ż� �̿밡�� ! ");
			}
			if(sel == 0 ) {
				System.out.println("���̱ⱸ �̿� �Ұ��� . ");
			}
		}

	}

}
