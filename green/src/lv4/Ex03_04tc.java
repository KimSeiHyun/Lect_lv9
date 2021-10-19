package lv4;

import java.util.Scanner;

public class Ex03_04tc {

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
		
		Scanner scan = new Scanner(System.in);
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int count = 0;
		String[] items = {"���", "�ٳ���", "����"};
		int log = -1;
		while(true) {
			System.out.println("[MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					System.out.println("id : ");
					String id = scan.next();
					System.out.println("pw : ");
					String pw = scan.next();
					//string �Լ����ҋ��� == ���Կ����ڴ�� equals �Լ��� �� ����! 
					for(int i=0; i<ids.length; i++) {
						if(id.equals(ids[i]) && pw.equals(pws[i])) {
							log = i;
							System.out.printf("%s ȸ���� �ݰ����ϴ�.\n", ids[log]);
							
						}
					
				}
				}
				else {
					System.out.println("�̹� �α��� �����Դϴ� . ");
				}
				if(log == -1) {
					System.out.println("ȸ�������� Ȯ���ϼ��� . ");
				}
			}
			else if(sel == 2) {
				if(log != -1 ) {
					log = -1;
					System.out.println("�α׾ƿ� �Ϸ� ! ");
				}
				else {
					System.out.println("�̹� �α׾ƿ� �� �����Դϴ� . ");
				}
			}
			else if(sel == 3) { // ���� 
				if( log != -1) {
					while(true) {
					for(int i =0; i<items.length; i++) {
						System.out.printf("%d) %s\n", i+1, items[i]);
					}
					System.out.println("0) �ڷΰ���");
					System.out.print("��ǰ����  : ");
					int item = scan.nextInt()-1;
					
					if(item == -1) {
						break;
					}
					if(item >= 0 && item < items.length ) {
						//��ٱ��Ͽ� �ֱ� 
						jang[count][0] = log;
						jang[count][1] = item;
						count ++;
					}
				}
				}
				else {
					System.out.println("�α����� ���ּ��� . ");
				}
			}
			else if(sel == 4) {
				//ī��Ʈ ������ �ϴ� �ӽù迭 persnal
				int persnal[] = new int[items.length]; 
				if(log != -1) {
					for(int i=0; i<count; i++) {
						if(jang[i][0] == log) {
							persnal[jang[i][1]] ++;
						}
					}
					
					for(int i=0; i<persnal.length; i++) {
						if(persnal[i] >0) {
							System.out.print(items[i] + ": "); // ��ǰ��
							System.out.println(persnal[i] + "��"); // ���� 
						}
					}
				}
				else {
					System.out.println("�α����� ���ּ��� ! ");
				}
				
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
