package lv.test_1;

import java.util.Scanner;

public class lv1_30 {

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
		System.out.println("Ű�� �Է����ּ��� ! ");
		int x = sc.nextInt();
		
		if(x >= 120 ) {
			System.out.println("���̱ⱸ �̿밡�� !! ");
		}else {
			System.out.println("���̱ⱸ �̿� �Ұ��� ! ");
			System.out.println("�� , �θ�԰� �Բ� ���˳��� ? yes:1  no:0");
			int y = sc.nextInt();
			if (y == 1) {
				System.out.println("���̱ⱸ �̿� ���� !! ");
			}
			else {
				System.out.println("���̱ⱸ �̿� �Ұ��� ..");
			}
		}
			
		
		
		
		
	}

}
