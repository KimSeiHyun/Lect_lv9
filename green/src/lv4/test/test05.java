package lv4.test;

import java.util.Scanner;

public class test05 {

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
		
		// ���� 09:39
		// ���� 10:35 
		// �ҿ� 01:04
		
		
		Scanner sc = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int count = 0;
		String[] items = {"���", "�ٳ���", "����"};
		int log = -1;
		String id = "0";
		int idx = -1;
		
		
		while(true) {
		System.out.println("[MART]");
		System.out.println("[1]�� �� ��");
		System.out.println("[2]�α׾ƿ�");
		System.out.println("[3]��     ��");
		System.out.println("[4]��ٱ���");
		System.out.println("[0]��     ��");
		System.out.println("idx  : " + idx);
		System.out.println("log  : " + log);
		int sel = sc.nextInt();
		if(sel == 1) {
			if(log == -1) {
			System.out.println("���̵� �Է����ּ��� . ");
			String inId = sc.next();
			int check = -1;
			for(int i=0; i<3; i++) {
				if(ids[i].equals(inId)) {
					idx = i;
					log = i+1;
					check = 0;
				}
			}
			if(check == 0) {
				System.out.println("��й�ȣ�� �Է����ּ��� ");
				String inPw = sc.next();
				if(pws[idx].equals(inPw)) {
					System.out.println("�α����� �Ǿ����ϴ�. ");
				}
				else {
					System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ��� . ");
					idx = -1;
					log = -1;
				}
			}
			else {
				System.out.println("���� ���̵��Դϴ�. ");
			}
			}
			else {
				System.out.println("�̹� �α��� �����Դϴ�. ");
			}
		}
		if(sel == 2) {
			if(log != -1) {
				System.out.println("�α׾ƿ� �ƽ��ϴ� . ");
				log = -1;
				idx = -1;
			}
			else {
				System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
			}
			
		}
		if(sel == 3) {
			if(log != -1) {
			for(int i=0; i<3; i++) {
				System.out.print(i+1+")"+items[i] + "\n");
			}
			System.out.println("��ȣ�� �Է��� ��ٱ��Ͽ� �߰��ϼ��� ! ");
			int num = sc.nextInt()-1;
			if(num >= 0 && num <=2) {
				jang[count][0] = log;
				jang[count][1] = num;
				count++;
			}
			else {
				System.out.println("������ ��� �����Դϴ�. ");
			}
			
			}
			else {
				System.out.println("�α����� ���� ���ּ��� ");
			}
			
		}
		if(sel == 4) {
			if(log != -1) {
			for(int i =0; i<MAX_SIZE; i++) {
				if(jang[i][0] == log) {

					System.out.print(ids[idx]+"ȸ��     >" + items[jang[i][1]] + "����");

				System.out.println();
				}
			}
			}
			else {
				System.out.println("�α����� ���� ���ּ��� . ");
			}
			
		}
		if(sel == 0) {
			System.out.println("�����մϴ� . ");
			break;
		}


		}//w

	}

}
