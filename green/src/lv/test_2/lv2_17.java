package lv.test_2;

import java.util.Scanner;

public class lv2_17 {

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
					System.out.println("��й�ȣ�� �Է����ּ��� ");
					int inPw = sc.nextInt();
					if(inAcc == dbAcc1 && inPw == dbPw1 || inAcc == dbAcc2 && inPw == dbPw2) {
						System.out.println(inAcc+"�Բ��� �α����� �ϼ̽��ϴ�");
						log = inAcc;
					} else {
						System.out.println("��й�ȣ�� Ȯ�����ּ��� . ");
					}
				}
				else {
					System.out.println("���̵� Ȯ�����ּ��� . ");
				}
				}else {
					System.out.println("�̹� �α��� �����Դϴ�.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					log = -1;
				} else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
					System.out.println("�Ա��� �ݾ��� �Է����ּ��� . ");
					int inMoney = sc.nextInt();
					if(log == dbAcc1) {
						dbMoney1 += inMoney;
					}
					if(log == dbAcc2) {
						dbMoney2 += inMoney;						
					}
				}
				else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					System.out.println("����� �ݾ��� �Է����ּ��� . ");
					int outMoney = sc.nextInt();
					if(log == dbAcc1 && outMoney < dbMoney1) {
						dbMoney1 -= outMoney;
					}
					else if(log == dbAcc2 && outMoney < dbMoney2) {
						dbMoney2 -= outMoney;						
					}
					else {
						System.out.println("�ܾ��� �����մϴ� .");
					}
				}
				else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.println("��ü�� ���¸� �Է����ּ��� . ");
					int acc = sc.nextInt();
					System.out.println("��ü�� �ݾ��� �Է����ּ��� . ");
					int money = sc.nextInt();
					if(log == dbAcc1 && acc == dbAcc2  && money < dbMoney1) {
						dbMoney1 -= money;
						dbMoney2 += money;
					}
					else if(log == dbAcc2 && acc == dbAcc1 && money < dbMoney2) {
						dbMoney1 += money;
						dbMoney2 -= money;
					}else {
						System.out.println("���¹�ȣ���� �ܾ��� �ٽ� Ȯ�����ּ��� . ");
					}
				}
				else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if(sel == 6) {
				if(log != -1) {
					if(log == dbAcc1) {
						System.out.println(dbAcc1+"���� �ܾ��� : " + dbMoney1 + "�Դϴ�.");
					}
					else if(log == dbAcc2) {
						System.out.println(dbAcc2+"���� �ܾ��� : " + dbMoney2 + "�Դϴ�.");
					}
				}
				else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}


	}

}