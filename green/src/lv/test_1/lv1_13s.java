package lv.test_1;

import java.util.Scanner;

public class lv1_13s {

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
		
		int x = sc.nextInt();
		
		if(x >= 120) {
			System.out.println("���̱ⱸ �̿� ���� !! ");
		}
		if(x < 120 ) {
			System.out.println("Ű�� �۾Ƽ� ���̱ⱸ �̿� �Ұ��� .. ");
			System.out.println("������ �θ�԰� �Բ� ���˳��� ? (yes : 1 , no :0)");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("���̱ⱸ �̿� ���� !! ");
			}
			if(sel == 0) {
				System.out.println("���̱ⱸ �̿� �Ұ��� �� ");
			}
		}
	}

}
