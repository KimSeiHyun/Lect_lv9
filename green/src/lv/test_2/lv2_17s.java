package lv.test_2;

import java.util.Scanner;

public class lv2_17s {

	public static void main(String[] args) {
		/*
		 * # ATM[����]
		 * 1. �α���
		 * . �α��� �� �� �α��� �Ұ�
		 * . �α׾ƿ� ���¿����� �̿� ����
		 * 2. �α׾ƿ�
		 * . �α��� �� �̿밡��
		 * 3. �Ա�
		 * . �α��� �� �̿밡��
		 * 4. ���
		 * . �α��� �� �̿밡��
		 * 5. ��ü
		 * . �α��� �� �̿밡��
		 * 6. ��ȸ
		 * . �α��� �� �̿밡��
		 * 7. ����
		 */
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;						// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			System.out.println("------------------------");
			if(log == -1) {
				System.out.println("���� �α׾ƿ� �����Դϴ�.");
			}
			else {
				System.out.println(log +"���� �α��� ���Դϴ�.");
			}
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("���̵� �Է����ּ��� . ");
					int inAcc = sc.nextInt();
					if(inAcc == dbAcc1 || inAcc == dbAcc2) {
						System.out.println("��й�ȣ�� �Է����ּ��� . ");
						int inPw = sc.nextInt();
						if(inAcc == dbAcc1 && inPw == dbPw1 || inAcc == dbAcc2 && inPw == dbPw2) {
							System.out.println(inAcc+"�Բ��� �α��� �ϼ̽��ϴ�.");
							log = inAcc;
						}
						else {
							System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ��� . ");
						}
					}
					else {
						System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
					}
				}
				else{
					System.out.println("�̹� �α��� �����Դϴ� . ");
				}
				
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ� �߽��ϴ� .");
				}
				else {
					System.out.println("�̹� �α׾ƿ� �����Դϴ�. ");
				}
				
			}
			else if(sel == 3) {
				if(log != -1) {
					System.out.println("�Ա��� �ݾ��� �Է����ּ��� .");
					int inMoney = sc.nextInt();
					if(log == dbAcc1) {
						dbMoney1 += inMoney;
						System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
					}
					if(log == dbAcc2) {
						dbMoney2 += inMoney;
						System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
					}
				}
				else {
					System.out.println("�α��� �� �̿밡���մϴ�.");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					System.out.println("����� �ݾ��� �Է����ּ��� . ");
					int outMoney = sc.nextInt();
					if(log == dbAcc1 && outMoney < dbMoney1) {
						dbMoney1 -= outMoney;
						System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					}
					else if(log == dbAcc1 && outMoney < dbMoney2) {
						dbMoney2 -= outMoney;
						System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					}
					else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}
				else {
					System.out.println("�α��� �� �̿밡���մϴ�.");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.println("��ü�� ���¹�ȣ�� �Է����ּ��� . ");
					int inAcc = sc.nextInt();
					System.out.println("��ü�� �ݾ��� �Է����ּ��� .");
					int money = sc.nextInt();
					if(log == dbAcc1 && inAcc == dbAcc2 && money < dbMoney1) {
						dbMoney2 += money;
						dbMoney1 -= money;
						System.out.println("��ü�� �Ϸ�Ǿ����ϴ�.");
					}
					else if(log == dbAcc2 && inAcc == dbAcc1 && money < dbMoney2) {
						dbMoney1 += money;
						dbMoney2 -= money;
						System.out.println("��ü�� �Ϸ�Ǿ����ϴ�.");
					}
					else {
						System.out.println("���¹�ȣ�� �ݾ��� �ٽ� Ȯ�����ּ��� .");
					}
				}
				else {
					System.out.println("�α��� �� �̿밡���մϴ�.");
				}
			}
			else if(sel == 6) {
				if(log != -1) {
					if(log == dbAcc1) {
						System.out.println(dbAcc1+"���� �ܾ��� : " + dbMoney1 + "�� �Դϴ�.");
					}
					if(log == dbAcc2) {
						System.out.println(dbAcc2+"���� �ܾ��� : " + dbMoney2 + "�� �Դϴ�.");
					}
				}
				else {
					System.out.println("�α��� �� �̿밡���մϴ�.");
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}


	}

}