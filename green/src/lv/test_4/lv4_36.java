package lv.test_4;

import java.util.Scanner;

public class lv4_36 {

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
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
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
				System.out.print("id �Է� : ");
				String id = sc.next();
				int idx = -1;
				for(int i=0; i<ids.length; i++) {
					if(ids[i].equals(id)) idx = i;
				}
				if(idx != -1) {
					System.out.print("pw �Է� : ");
					String pw = sc.next();
					if(pws[idx].equals(pw)) {
						log = idx;
					}else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}else System.out.println("���̵� ã�� �� �����ϴ�.");
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
				}else System.out.println("�α����� ���� ���ּ��� . ");
			}
			else if(sel == 3) {
				if(log != -1) {
					for(int i=0; i<items.length; i++) {
						System.out.println("[" + (i+1)+"]  " + items[i]);
					}
					System.out.println("���Ͻô� �������� ��ȣ�� �Է����ּ��� . ");
					int num = sc.nextInt()-1;
					jang[count][0] = log;
					jang[count][1] = num;
					count++;
				}else System.out.println("�α����� ���� ���ּ��� . ");
			}
			else if(sel == 4) {
				if(log != -1) {
					for(int i=0; i<count; i++) {
						System.out.println(ids[jang[i][0]] +"   >>>>>    "   + items[jang[i][1]] + "����");
					}
				}else System.out.println("�α����� ���� ���ּ��� . ");
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}



	}

}