package lv.test_4;

import java.util.Scanner;

public class lv4_20s {

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
			System.out.println("log = " + log);
			System.out.println("[MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.print("id �Է� : ");
					String inId = sc.next();
					int check = 0;
					int idx = -1;
					for(int i=0; i<ids.length; i++) {
						if(inId.equals(ids[i])) {
							check = 1;
							idx = i;
						}
					}
					
					if(check == 1) {
						System.out.print("��й�ȣ �Է� : ");
						String inPw = sc.next();
						if(inPw.equals(pws[idx])) {
							log = idx;
							System.out.println("�α��� ���� ");
						}else System.out.println("��й�ȣ�� Ȯ�����ּ��� . ");
					}else System.out.println("���̵� Ȯ�����ּ���  ");
				}else System.out.println("�α׾ƿ��� ���� ���ּ��� . ");
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ�����");
				}else System.out.println("�α����� ���� ���ּ��� .");
			}
			else if(sel == 3) {
				if(log != -1) {
					for(int i=0; i<items.length; i++) {
						System.out.print(i+1 +") "+ items[i] + " ");
					}System.out.println();
					int sel2 = sc.nextInt()-1;
					if(sel2 >=0 && sel2 <3) {
						jang[cnt][0] = log;
						jang[cnt][1] = sel2;
						cnt++;
						System.out.println(items[sel2]+"�� ��ҽ��ϴ�.");
						
					}else System.out.println("��ȣ�� �ٽ� Ȯ�����ּ���");
					
					
				}else System.out.println("�α����� ���� ���ּ��� .");
			}
			 // 		{0, 1},				qwerȸ�� 			> �������
			else if(sel == 4) {
				if(log != -1) {
					for(int i=0; i<cnt; i++) {
						if(jang[i][0] == log) {
							System.out.printf("%sȸ��     >    %s����\n",ids[log],items[jang[i][1]]);
						}
					}
				}else System.out.println("�α����� ���� ���ּ��� .");
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}//while
	}

}
