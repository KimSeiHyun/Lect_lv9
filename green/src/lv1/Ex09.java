package lv1;

import java.util.Scanner;



public class Ex09 {

	public static void main(String[] args) {
		// ������ �����ֱ� ( scope )
		// {} �߰�ȣ : ������ ���۰� �� 
		
		int a = 10;
		if(true) {
			int b= 20;
			
			if(true) {
				int c = 30 ;

				System.out.println(a); // 10
				System.out.println(b); // 20
				System.out.println(c); // 30
			}
				System.out.println(a); // 10
				System.out.println(b); // 20
			//	System.out.println(c); // c cannot be resolved to a variable
									   // c ������ ������ ���. �ٽ�c�� ����Ϸ��� ���ϴ� ���� ���� 
									   // c ������ �ٽ� �ʱ�ȭ . int c = 100;
		}
			System.out.println(a);
//				System.out.println(b);
//				System.out.println(c);
			
			/*
			 * # ������ ���[1�ܰ�]
			 * 1. �޴����� ����Ѵ�.
			 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
			 * 3. ������ �Է¹޴´�.
			 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
			 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
			 */
			
			Scanner sc = new Scanner(System.in);
			
			int price1 = 8700;
			int price2 = 6200;
			int price3 = 1500;
			System.out.println("=== �Ե����� ===");
			System.out.println("1.�Ұ�� ���� : " + price1 + "��");
			System.out.println("2.����  ���� : " + price2 + "��");
			System.out.println("3.��     �� : " + price3 + "��");
			
			System.out.print("�޴����� : ");
			int sel = sc.nextInt();
			
			System.out.println("�����Է� : ");
			int cash = sc.nextInt();
			// case�� 3���� . 
			int total = 0;
			
			if(sel == 1 ) {
				total = price1;
			}
			else if(sel == 2 ) {
				total = price2;
			}
			else if (sel == 3) {
				total = price3;
			}
			else { // �������� �ʴ� �޴��� ���� ����ó�� . 
				System.out.println("�������� �ʴ� �޴��Դϴ� . ");
			}
			
			// total �� cash �� �񱳸��ؼ� �Ž����� Ȯ��. 
			if(total != 0 ) { // 1~3������ �����Ѱ�� 
				if (total > cash)
					System.out.println("������ �����մϴ�.");
			} else {
				//������ ���. 
				//������ �޴��� ���� ǥ�ø� > �Ž����� ���. 
				System.out.println("---- �� �� �� ----");
				if(sel == 1) {
					System.out.println("�Ұ����� 1�� " + price1 + "��");
				}else if (sel == 2 ) {
					System.out.println("������� 1�� " + price2 + "��");
				} else {
					System.out.println("�ݶ� 1�� " + price3 + "��");
				}
				System.out.println("�Ž����� :" + (cash - total)  + "��");
				System.out.println("-----------------");
			}
			}
			

	}

	
	



