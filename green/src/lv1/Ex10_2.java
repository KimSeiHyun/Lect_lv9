package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex10_2 {

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
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 302;
		int myMoney = 10000;
		
		int yourAcc = 333;
		int yourMoney = 5000;
		
		System.out.println("���¸� �Է����ּ���.");
		int yourAcc2 = sc.nextInt();
		if (yourAcc != yourAcc2) {
			System.out.println("���¹�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		if(yourAcc == yourAcc2) {
			System.out.println("�ݾ��� �Է����ּ��� . ");
			int myMoney2 = sc.nextInt();
			if (myMoney > myMoney2) {
				System.out.println("��ü����");
				System.out.println("myMoney = " + myMoney + "��");
				System.out.println("��ü�ұݾ� = " + myMoney2 + "��");
				myMoney -= myMoney2 ; // myMoney = myMoney - myMoney2;
				//���������� += , -= , *= , /=
				yourMoney += myMoney2 ; 
			//	System.out.println("���� �� myMony =" +  (myMoney - myMoney2) + "��");
				System.out.println("yourMoney = " + (yourMoney + myMoney2) + "��");
			}
			else if (myMoney < myMoney2) {
				System.out.println("��ü�Ұ���");
			}
			
			
		}
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		
		int id = 1234;
		int pw = 123123;
		
		int one = 0;
		int two = 0;
		int three = 0;
		
		System.out.println("���̵� �Է����ּ��� .");
		int inId = sc.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ��� .");
		int inPw = sc.nextInt(); 
		
		
		if(id == inId && pw == inPw) {
			System.out.println("�α��μ��� . ");
			System.out.println("���� �޴��� �����ϼ��� .");
			System.out.println("1.�Ա� 2.��� 3.��ȸ ");
			
		}
		else {
			System.out.println("�α��� ���� . ");
		}


	}

}
