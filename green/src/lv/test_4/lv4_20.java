package lv.test_4;

import java.util.Scanner;

public class lv4_20 {

	public static void main(String[] args) {
		/*
		 * # ���θ� [��ٱ���]
		 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
		 * 	1) ���
		 *  2) �ٳ���
		 *  3) ����
		 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
		 * 3. �α��� ȸ���� �ε��� ��ȣ�� �� ���� ù��° ���� �����Ѵ�.
		 * 4. �ش� ȸ���� ������ ��ǰ�� �ε��� ��ȣ�� �� ���� �ι�° ���� �����Ѵ�.
		 * ��)
		 * {
		 * 		{0, 1},				qwerȸ�� 			> �������
		 * 		{1, 2},				javakingȸ�� 		> �ٳ�������
		 * 		{2, 1},				abcdȸ��			> �������
		 * 		{0, 3},				qwerȸ��			> ���ⱸ��
		 * 		...
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int cnt = 0;
		
		String[] items = {"���", "�ٳ���", "����"};
		
		int log = -1;
		
		while(true) {
			
			System.out.println("[MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			System.out.println("cnt : " + cnt);
			System.out.println("log : " + log);
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
				System.out.println("���̵� �Է� : ");
				String id = sc.next();
				int check = 0;
				int x =0;
				for(int i=0; i<3; i++) {
					if(ids[i].equals(id)) {
						check = 1;
						x = i;
					}
				}
				if(check == 1) {
					int check2 = 0;
					System.out.println("��й�ȣ �Է� : ");
					String pw = sc.next();
						if(pws[x].equals(pw)) {
							check2 = 1;
							System.out.println(ids[x] +"���� �α��� �ϼ̽��ϴ�.");
							log = x+1;
						}
					if(check2 == 0) {
						System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ��� . ");
					}
				}else {
					System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
				}
				}
				else {
					System.out.println("�̹� �α��� �����Դϴ�.");
				}
				
				
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ��� �߽��ϴ�.");
				}else {
					System.out.println("�̹� �α׾ƿ� �����Դϴ�. ");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
				System.out.println("1.���\n2.�ٳ���\n3.����");
					int num = sc.nextInt()-1;
				if(num >=0 && num <3) {
					jang[cnt][0] = log; 
					jang[cnt][1] = num; 
					cnt++;
				}else {
					System.out.println("���θ���� ��ȣ�� �ٽ� Ȯ�����ּ��� .");
				}

				
				}else {
					System.out.println("�α����� ���� ���ּ��� ");
				}
				
			}
			else if(sel == 4) {
				if(log != -1) {
					for(int i=0; i<cnt; i++) {
						int check = 0;
						for(int j=0; j<2; j++) {
							if(jang[i][0] == log) {
								check = 1;
								System.out.print(ids[log-1]+"����   " + items[jang[i][1]] + " ����");
								break;
							}
						}
						if(check == 1) {
						System.out.println();
						}
					}
				}else {
					System.out.println("�α����� ���� ���ּ��� . ");
				}
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}//w

	}

}
