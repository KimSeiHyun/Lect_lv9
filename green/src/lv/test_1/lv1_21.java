package lv.test_1;

import java.util.Scanner;

public class lv1_21 {

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
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");
		
		System.out.println("��ü�� ���¹�ȣ�� �Է����ּ��� . ");
		int inAcc = sc.nextInt();
		if(inAcc == yourAcc) {
			System.out.println("��ü�� �ݾ��� �Է����ּ��� .");
			int inMoney = sc.nextInt();
			if(inMoney > myMoney) {
				System.out.println("��ü �Ұ��� .");
			}
			if(inMoney < myMoney) {
				System.out.println("��ü ���� .");
				yourMoney += inMoney;
				myMoney -= inMoney;
				System.out.println("��ü�� �ݾ�");
				System.out.println("myMoney = " + myMoney + "��");
				System.out.println("yourMoney = " + yourMoney + "��");
			}
		}

	}

}
