package lv1;

import java.util.Scanner;
public class Ex10_3 {

	public static void main(String[] args) {
		/*
		 * # ATM[1�ܰ�] : ��ü�ϱ�
		 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
		 * 2. ���¹�ȣ�� ��ġ�ϸ�,
		 * 3. ��ü�� �ݾ��� �Է¹޴´�.
		 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
		 * 			myMoney   - ��ü�� �ݾ�
		 * 			yourMoney + ��ü�� �ݾ�
		 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
		 */
		// 1. �α��� 2. ����
		// �α��� -> 1. �Ա� 2. ��� 3. ��ȸ
		//
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myPw = 1111;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourPw = 2222;
		int yourMoney = 12000;
		System.out.println("--- Green ATM ---");
		System.out.println("1. �α��� 2. ���� ");
		System.out.println("-----------------");
		System.out.println("�޴�����: ");
		int sel = scan.nextInt();
		if (sel == 1) {
			int inputAcc = scan.nextInt();
			if (inputAcc == myAcc) {
				int inputPw = scan.nextInt();
				if (inputPw == myPw) {
					System.out.println("�α����� �Ǿ����ϴ�.");
					System.out.println("1.�Ա� 2.��� 3.��ü 4.��ȸ ");
					sel = scan.nextInt();
					if (sel == 1) {
						System.out.println("�Ա��� �ݾ��� �Է����ּ��� .");
						int inMoney = scan.nextInt();
						myMoney += inMoney ; 
						System.out.println("�Ա��� �Ǿ����ϴ�.");
					}

					else if (sel == 2) {
						System.out.println("����� �ݾ� �Է�");
						int inMoney = scan.nextInt();
						
					} 
					else if (sel == 3) {
						// �Է¹ޱ�
						System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
						inputAcc = scan.nextInt();
						// ����Ȯ��
						if (inputAcc == yourAcc) {
							// ��ü����
							int inputMoney = scan.nextInt();
							// ��ȿ�� �˻�
							if (inputMoney > myMoney) {
								System.out.println("�ܾ��� �����մϴ�!");
							} else {
//				System.out.println("��ü�Ϸ�, ���� �ܾ�: " + (myMoney - inputMoney));
								myMoney -= inputMoney; // myMoney = myMoney - inputMoney;
								// ���������� ( +=, -=, *=, /= )
								yourMoney += inputMoney;
								System.out.println("��ü�� ���������� �Ǿ����ϴ�!");
							}
						} else {
							System.out.println("�������� �ʴ� �����Դϴ�. ");
						}
					} else if (sel == 4) {
					} else {
					}
				}
			}
		} 
		else if (sel == 2) {
			
		} 
		else {
		}
	}
}