package lv1.test;

import java.util.Scanner;

public class Ex13_04 {

	public static void main(String[] args) {
		/*
		 * # ���θ� �ڷΰ���
		 * 
		 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� 
		 *      �ڷΰ��� ������������ �����Ƿ� ������ �� �����ҷ����Ѵ�.
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
		
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		int sel2 = 0;
		boolean a = true;

		while (a) {
			boolean b = true;
			System.out.println("-----------�ʰ���-----------");
			System.out.println("1. �����Ƿ�");
			System.out.println("2. �����Ƿ�");
			System.out.println("3. ����");
			System.out.println("---------------------------");
			System.out.println("��ȣ�� �Է����ּ��� ! ");
			sel = sc.nextInt();
			if (sel == 1) {
				while (b) {
					System.out.println("1) Ƽ����");
					System.out.println("2) ����");
					System.out.println("3) �ڷΰ���");
					sel2 = sc.nextInt();
					if (sel2 == 1) {
					} 
					else if (sel2 == 2) {
					} 
					else if (sel2 == 3) {
						b = false;
					}
					else {
						System.out.println("�߸��� ��ȣ�Դϴ� �ٽ� �Է����ּ��� .");
					}
				}
			}
				if (sel == 2) {
					while (b) {
						System.out.println("1) �����");
						System.out.println("2) ġ��");
						System.out.println("3) �ڷΰ���");
						sel2 = sc.nextInt();
						if (sel2 == 1) {
						} 
						else if (sel2 == 2) {
						} 
						else if (sel2 == 3) {
							b = false;
						}
						else {
							System.out.println("�߸��� ��ȣ�Դϴ� �ٽ� �Է����ּ��� .");
						}
					}

				}
				if (sel == 3) {
					a = false;
					System.out.println("�������� �ݽ��ϴ� .");

				} 
				else {
					System.out.println("�߸��� ��ȣ�Դϴ� �ٽ� �Է����ּ��� .");
				}
			}
			
}
	}

