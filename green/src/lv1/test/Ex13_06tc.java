package lv1.test;

import java.util.Scanner;

public class Ex13_06tc {

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
		while(true) {
			
			if (log != -1) {
				if (log ==1 ) {
					System.out.println("1111ȸ������ �α������Դϴ�.");
				}
				else if (log == 2 ) {
					System.out.println("2222ȸ������ �α������Դϴ�.");
				}
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
				if( log == -1) {
					System.out.println("id : ");
					int inputId = sc.nextInt();
					System.out.println("pw : ");
					int inputPw = sc.nextInt();
					//�α���Ȯ��
					if(inputId == dbAcc1 && inputPw == dbPw1) {
						System.out.println("1111ȸ���� �ݰ����ϴ�.");
						log = 1;
						
					}
					else if (inputId == dbAcc2 && inputPw == dbPw2) {
						System.out.println("2222ȸ���� �ݰ����ϴ�.");
						log = 2;
				}
				else {
					System.out.println("�̹� �α��� �Ǿ��ֽ��ϴ�. ");
				}
			}
			else { 
				System.out.println("�̹� �α��� �Ǿ��ֽ��ϴ�.");
			}
			}
			else if(sel == 2) {
				if(log == -1 ) {
					System.out.println("�α����� ���� ���ּ��� !");
				}
				else {
					System.out.println("�α׾ƿ��� �߽��ϴ�.");
						log = -1; //
					}
			}
			else if(sel == 3) {
				if(log == -1 ) {
					System.out.println("�α����� ���� ���ּ��� !");
			}
				else {
					System.out.println("�Ա��� �ݾ� : ");
					int inputMoney = sc.nextInt();
					if(inputMoney > 0) {
					if (log == 1) {
						dbMoney1 += inputMoney;
				}
					else if (log == 2) {
						dbMoney2 += inputMoney;
					}
					}
					else {
						System.out.println("������ ���� �Է��c�ּ��� .");
					}
				}
			
			}
			else if(sel == 4) {
				if(log == -1 ) {
					System.out.println("�α����� ���� ���ּ��� !");
			}
				else {
					//���� �ܾ� 
					if(log == 1) {
						System.out.println("���� �ܾ� : " + dbMoney1 + "��");
			}
					else if (log == 2) {
						System.out.println("���� �ܾ� : " + dbMoney2 + "��");
					}
					System.out.println("����� �ݾ� �Է� : ");
					int outMoney = sc.nextInt();
					
					if (log == 1) {
						if(outMoney > dbMoney1) {
						System.out.println("�ܾ��� �����մϴ�.");	
						}
						else {
							System.out.println("����� �Ϸ�Ǿ����ϴ�.");
							dbMoney1 -= outMoney;
						}
						
						if (log == 2) {
							if(outMoney > dbMoney2) {
							System.out.println("�ܾ��� �����մϴ�.");	
							}
							else {
								System.out.println("����� �Ϸ�Ǿ����ϴ�.");
								dbMoney2 -= outMoney;
							}
					}
					
				}
				
			else if(sel == 5) {
				if(log == -1 ) {
					System.out.println("�α����� ���� ���ּ��� !");
			}
				else {
					System.out.println("������ ���� �Է�");
					int reAcc = sc.nextInt();
					System.out.println("��ü�� �ݾ� �Է�");
					int reMoney = sc.nextInt();
					
					if (log == 1 && reAcc != dbAcc1) {
						if(reAcc == dbAcc2) {
							if(reMoney <= dbMoney1) {
								reAcc += reMoney;
								dbMoney1 -= reMoney;
							}
						}
					}
					else if (log == 2 && reAcc != dbAcc2) {
						if(reAcc == dbAcc1) {
							if(reMoney <= dbMoney2) {
								reAcc += reMoney;
								dbMoney2 -= reMoney;
							}
						}
					}
				}
				
			}
			
			else if(sel == 6) {
				if(log == -1 ) {
					System.out.println("�α����� ���� ���ּ��� !");
			}
				else {
					if(log == 1) {
						System.out.println("���� �ܾ� : " + dbMoney1 + "��");
			}
					else if (log == 2) {
						System.out.println("���� �ܾ� : " + dbMoney2 + "��");
					}
				}
				
			}
			
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
		
				}
			
			}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		}
		}
	}
