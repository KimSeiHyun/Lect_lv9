package lv.test_2;

import java.util.Scanner;

public class lv2_16s {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. �Ա�
		 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
		 * 2. ���
		 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
		 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
		 * 3. ��ü
		 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
		 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
		 * . ��ü �� yourMoney �ܾ� ����
		 * 4. ��ȸ
		 * . myMoney�� yourMoney �ܾ� ��� ���
		 */
		
		Scanner sc = new Scanner(System.in);

		int myAcc = 1111;
		int myMoney = 50000;

		int yourAcc = 2222;
		int yourMoney = 70000;

		boolean run = true;
		while (run) {

			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("�Ա��� �ݾ��� �Է����ּ��� . ");
				int inMoney = sc.nextInt();
				myMoney += inMoney;
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ� .");
			} 
			else if (sel == 2) {
				System.out.println("����� �ݾ��� �Է����ּ��� . ");
				int outMoney = sc.nextInt();
				if(outMoney > myMoney ) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
					myMoney -= outMoney;
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				}
			} 
			else if (sel == 3) {
				System.out.println("��ü�� ���¹�ȣ�� �Է����ּ��� . ");
				int inAcc = sc.nextInt();
				if(inAcc == yourAcc) {
					System.out.println("��ü�� �ݾ��� �Է����ּ��� . ");
					int money = sc.nextInt();
					if(money > myMoney ) {
						System.out.println("��ü�� �ݾ��� �����մϴ�.");
					}
					else {
						yourMoney += money;
						myMoney -= money;
					}
				}
				else {
					System.out.println("���¹�ȣ�� �ٽ� Ȯ�����ּ��� . ");
				}
			} 
			else if (sel == 4) {
				System.out.println("myMoney :" + myMoney);
				System.out.println("yourMoney :" + yourMoney);
			} 
			else if (sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}

}
