package lv1;
import java.util.Scanner;
public class Ex12_7 {

	public static void main(String[] args) {
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
		Scanner sc = new Scanner(System.in);
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
