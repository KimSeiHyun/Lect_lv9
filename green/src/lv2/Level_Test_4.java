package lv2;

import java.util.Scanner;

public class Level_Test_4 {

	public static void main(String[] args) {
		/*
		 * # ���θ� �ڷΰ���
		 * 
		 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� 
		 *      �ڷΰ��� ������������ �����Ƿ� ������ �� �����Ϸ����Ѵ�.
		 * ��Ʈ) ���� ���� �ݺ����� �߰� ���ָ�ȴ�. 
		 * 1. �����Ƿ�
		 * 		1) Ƽ����
		 * 		2) ����
		 * 		3) �ڷΰ���
		 * 2. �����Ƿ�
		 * 		1) �����
		 * 		2) ġ��
		 * 		3) �ڷΰ���
		 * 3. ����
		 */
		//	���� : 10:56
		//	���� : 11:10
		//	�ҿ� : 14��
		
		
		Scanner sc = new Scanner(System.in);
		int sel = 0;
	
		
		boolean t = true;
		while (t) {
			System.out.println("------------�ڶ�-----------");
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			System.out.println("--------------------------");
		
		System.out.println("�޴��� ��ȣ�� �Է����ּ��� .");
		 sel = sc.nextInt();
		
		if (sel == 1) {

			while (t) {
				System.out.println("1.�����Ƿ�");
				System.out.println("    1)Ƽ����");
				System.out.println("    2)����");
				System.out.println("    3)�ڷΰ���");	
				sel = sc.nextInt();
				if (sel == 1 ) {
					continue;
				}
				else if ( sel == 2 ) {
					continue;
				}
				else if (sel == 3) {
					break;
				}
				else {
					System.out.println("�߸��� �޴��Է��Դϴ� .");
				}
			}
			
		}
		else if (sel == 2) {

			while (t) {
				System.out.println("1.����");
				System.out.println("    1)�����");
				System.out.println("    2)ġ��");
				System.out.println("    3)�ڷΰ���");	
				sel = sc.nextInt();
				if (sel == 1 ) {
					continue;
				}
				else if ( sel == 2 ) {
					continue;
				}
				else if (sel == 3) {
					break;
				}
				else {
					System.out.println("�߸��� �޴��Է��Դϴ� .");
				}
				
			}
		}
		else if (sel == 3) {
			System.out.println("���θ��� �����մϴ� .");
			break;
		}
		else {
			System.out.println("�߸��� �޴��Դϴ� . ");
		}
		}

	}

}
