package lv1.test;

import java.util.Scanner;

public class Ex13_06 {

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
		boolean a = true;
		while(a) {
			System.out.println("----------ATN---------");
			
			if(log != -1) {
				if ( log == 1  ) {
					System.out.println("1111���� �α��� ���Դϴ� .");
				}
				else if ( log == 2 ) {
					System.out.println("2222���� �α��� ���Դϴ�.");
				}
			}
			System.out.println("1. �α���");
			System.out.println("2. �α׾ƿ�");
			System.out.println("----------------------");
			System.out.println("3. �Ա�");
			System.out.println("4. ���");
			System.out.println("5. ��ü");
			System.out.println("6. ��ȸ");
			System.out.println("7. ����.");
			
			
			int sel = sc.nextInt();
			
			if (sel == 1) {
				if ( log == -1) {
					//�α��ΰ���
					System.out.println("��й�ȣ�� �Է����ּ��� . ");
					System.out.println("��й�ȣ :");
					int inPw = sc.nextInt();
					if (inPw == dbPw1 ) {
						System.out.println("�α����� ����ó�� �Ǿ����ϴ�.");
						log = 1;
					}

				    if (inPw == dbPw2) {
						System.out.println("�α����� ����ó�� �Ǿ����ϴ�.");
						log = 2;
						}
					else {
						System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ��� . ");
					}
					
				}
				else {
					System.out.println("�̹� �α��� �Ǿ� �ֽ��ϴ� .");
				}
			}
			else  if (sel == 2 ) {
				
				if (log == -1) {
					System.out.println("�̹� �α׾ƿ� �߽��ϴ� .");
				}
				else {
					System.out.println("�α׾ƿ��� �Ǿ����ϴ� .");
					log = -1;
				}
			}
			else if (sel == 3) {
				System.out.println("3. �Ա�");	
				if (log == 1 || log ==2) {
					System.out.println("�Ա��� �ݾ��� �Է����ּ��� . ");
					int inMoney = sc.nextInt();
					if (log == 1) {
						dbMoney1 += inMoney;
					}
					if (log == 2) {
						dbMoney2 += inMoney;

					}

				}
				else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if (sel == 4 ) {
				// ���
				System.out.println("4. ���");	
				if (log == 1 || log ==2) {
					System.out.println("����� �ݾ��� �Է����ּ��� . ");
					int outMoney = sc.nextInt();
					if (log == 1 && dbMoney1 > outMoney) {
						dbMoney1 -= outMoney;
					}
					else if (log == 1 && dbMoney1 < outMoney) {
						System.out.println("�ݾ��� �����մϴ�.");
					}
					if (log == 2 && dbMoney2 > outMoney) {
						dbMoney2 -= outMoney;
					}
					else if (log == 2 && dbMoney2 < outMoney) {
						System.out.println("�ݾ��� �����մϴ�.");
					}
				}
				else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if (sel == 5 ) {
				// ��ü 
				System.out.println("5. ��ü");
				if (log == 1 || log == 2) {
					System.out.println("������ ���¸� �Է����ּ��� . ");
					int inAcc = sc.nextInt();
					if (inAcc != dbAcc1) {
						System.out.println("���¹�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
					if (inAcc != dbAcc2) {
						System.out.println("���¹�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
					System.out.println("�α׾ƿ� �˴ϴ� .");
					log = -1;
					if (log == 1 || log == 2) {
						System.out.println("������ �ݾ��� �Է����ּ��� . ");
						int outMoney = sc.nextInt();
						if (inAcc == dbAcc2 && dbMoney1 >outMoney) {

							dbMoney1 -= outMoney;
							dbMoney2 += outMoney;
						}
						else if (log == 1&& inAcc == dbAcc2 && dbMoney1 <outMoney) {
							System.out.println("�ݾ��� �����մϴ� .");
						}
						if (inAcc == dbAcc1 && dbMoney2 >outMoney) {
							dbMoney2 -= outMoney;
							dbMoney1 += outMoney;
						}
						else if (log == 2 & inAcc == dbAcc1&& dbMoney2 <outMoney) {
							System.out.println("�ݾ��� �����մϴ� .");
						}


						
					}
				}
				else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}

			}
			else if (sel == 6 ) {
				// ��ȸ 
				if ( log == 1 ) {
					System.out.println(dbMoney1);
				}
				if ( log == 2) {
					System.out.println(dbMoney2);
				}
				else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if (sel == 7) {
				// ���� 
				System.out.println("ATM�� �����մϴ�.");
				a = false;
			}
			
			System.out.println("���� : " + dbMoney1);
			System.out.println("���� : " + dbMoney2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
