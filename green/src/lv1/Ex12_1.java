package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		// �������� 1. ���������� 3�ܰ� 
				// ���� 9:28
				// ���� 9:30
				// �ҿ� 2�� 
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		/*
		 * # ���������� ����[2�ܰ�]��
		 *   if - else if �������� �����غ���.
		 *   ���� 0 ���� 1 �� 2
		 *   �� = a ��ǻ�� = com
		 *   ���� : 9:33
		 *   ���� : 9:40
		 *   �ҿ� : 7��
		 */ 
		

		System.out.println("���������� ���� !");
		System.out.println("������������ �Է��ϼ��� : ���� 0 , ���� 1 , �� 2");
		int me = sc.nextInt();
		int com = ran.nextInt(3);
		if ( me == com ) {
			System.out.println("���� !" );
		}
		else if (me == 0 && com == 1) {
			System.out.println("����!");
		}
		else if (me == 0 && com == 2) {
			System.out.println("�̰�� !");
		}
		else if (me == 1 && com == 0) {
			System.out.println(" �̰�� !");
		}
		else if (me == 1 && com == 2) {
			System.out.println("����!");
		}
		else if (me == 2 && com == 0) {
			System.out.println("�̰�� !");
		}
		else if (me == 2 && com == 1) {
			System.out.println("����!");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
			
		/*
		 * # Ȧ¦ ����
		 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
		 * 2. ����� ���� ���ڸ� �����ְ�,
		 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
		 * ���� : 9:41
		 * ���� : 9:45
		 * �ҿ�ð� : 4��
		 */
		
		int random = ran.nextInt(100)+1;
		System.out.println("Ȧ¦���� !");
		if (random %2 == 0  ) {
			System.out.println(random);
			System.out.println("¦���Դϴ� !");
		}
		else {
			System.out.println(random);
			System.out.println("Ȧ���Դϴ� .");
		}
			
		/*
		 * # ���� ����
		 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
		 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
		 * 3. ������ �յ޸��� ���ߴ� �����̴�.
		 * ���� : 9:47
		 * ���� : 9:59
		 * �ҿ�ð� : 12��
		 */
		
		System.out.println("���� �յ� ���߱� ���� ! ");
		System.out.println("���ڸ� �Է����ּ��� : �� : 0 , �� : 1");
		int coin = ran.nextInt(2);
		int incoin = sc.nextInt();
		
		if (coin == 1 && incoin == 1) {
			System.out.println("���� !");
		}
		else if (coin == 1 && incoin == 0) {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		else if (coin == 0 && incoin == 0) {
			System.out.println("���� ! ");
		}
		else if (coin == 0 && incoin == 1) {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		else {
			System.out.println("������ ��� �����Դϴ�. .");
		}
		
		/*
		 * # ���̱ⱸ �̿�����
		 * 1. Ű�� �Է¹޴´�.
		 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
		 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
		 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
		 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
		 *    ���� : 10 : 03
		 *    ���� : 10 : 11
		 *    �ҿ�ð� : 8��
		 */
			
		System.out.println("���̱ⱸ �̿����� !");
		System.out.println("�ڽ��� Ű�� �Է��ϼ��� !");
		int cm = sc.nextInt();
		
		
		if (cm > 120 ) {
			System.out.println("���̱ⱸ�� �̿��� �� �ֽ��ϴ�.");
		}
		else if ( cm < 120) {
		System.out.println("���̱ⱸ�� �̟G�Ұ�.");
		System.out.println("�θ�԰� �Բ� ���˳��� ?  yes : 1  , no : 0");
		int to = sc.nextInt();
		 if ( to == 1 ) {
			 System.out.println("���̱ⱸ ��� ���� !");
		 }
		 else {
			 System.out.println("���̱ⱸ �̿�Ұ� !");
		 }
		
		}
		
		/*
		 * # ������ ���[1�ܰ�]
		 * 1. �޴����� ����Ѵ�.
		 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
		 * 3. ������ �Է¹޴´�.
		 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
		 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 *  ���� : 10 : 12
		 *  ���� : 10 : 50
		 *  �ҿ� : 38�� ..
		 */
		
		int menu1 = 1000;
		int menu2 = 2000;
		int menu3 = 3000;
		int myMoney = 2100;
		System.out.println("----------�޴�----------");
		System.out.println("menu1 = " + menu1);
		System.out.println("menu2 = " + menu2);
		System.out.println("menu2 = " + menu2);
		System.out.println("----------�޴�----------");
		
		System.out.println("�ֹ��� �޴��� ������ �Է����ּ��� . .");
		System.out.println("1 = 1000�� , 2 = 2000�� , 3 = 3000��");
		int inMenu = sc.nextInt();
		int inMoney = sc.nextInt();
		int total = 0;
		
		if (inMenu == 1 ) {
			total = menu1;
		}
		else if (inMenu == 2) {
			total = menu2;
		}
		else if  (inMenu == 3) {
			total = menu3;
		}
		else {
			System.out.println("���� �޴��Դϴ�.");
		}
		

		if (total != 0  ) {
			if (inMenu == 1 && total < myMoney) {
				System.out.println("---------������--------");
				System.out.println("���� ���� = " + myMoney);
				System.out.println("menu1 �� ���� = " + menu1);
				System.out.println("���� �ܾ� = " + (myMoney - total));				
			}
			else if (inMenu == 2 && total < myMoney) {
				System.out.println("---------������--------");
				System.out.println("���� ���� = " + myMoney);
				System.out.println("menu2 �� ���� = " + menu2);
				System.out.println("���� �ܾ� = " + (myMoney - total));	
		}
			else if (inMenu == 3 && total < myMoney) {
				System.out.println("---------������--------");
				System.out.println("���� ���� = " + myMoney);
				System.out.println("menu3 �� ���� = " + menu3);
				System.out.println("���� �ܾ� = " + (myMoney - total));	
		}
			else {
				if ( total > myMoney) {
					System.out.println("������ �����մϴ�.");
				}
			}

	
		}

	}
}