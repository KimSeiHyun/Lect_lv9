package lv.test_2;

import java.util.Scanner;

public class lv2_15s {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. �α���
		 * . �α��� �� �� �α��� �Ұ�
		 * . �α׾ƿ� ���¿����� �̿� ����
		 * 2. �α׾ƿ�
		 * . �α��� �� �̿밡��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
				System.out.println("���̵� �Է����ּ��� . ");
				int inAcc = sc.nextInt();
				if(inAcc == dbAcc1 || inAcc == dbAcc2 ) {
					System.out.println("��й�ȣ�� �Է����ּ��� . ");
					int inPw = sc.nextInt();
					if(inAcc == dbAcc1 && inPw == dbPw1 || inAcc == dbAcc2 && inPw == dbPw2) {
						System.out.println(inAcc +"�Բ��� �α����� �ϼ̽��ϴ�.");
						log = inAcc;
					}
					else {
						System.out.println("��й�ȣ�� Ȯ�����ּ��� . ");
					}
				}
				else {
					System.out.println("���̵� Ȯ�����ּ��� . ");
				}
				}
				else {
					System.out.println("�̹� �α��� �����Դϴ� .");
				}
				
			}
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
				}
				else {
					System.out.println("�α׾ƿ��� �Ǿ����ϴ�.");
					log = -1;
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}//w
		
		
	}

}
