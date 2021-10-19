package lv4;

import java.util.Scanner;

public class Ex03_04 {

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
		int count = 0;
		String[] items = {"���", "�ٳ���", "����"};
		int log = -1;
		String id = "0";
		int idx = -1;
		while(true) {
			System.out.println("-----------------");
			System.out.println("[MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			System.out.println("idx : " + idx);
			System.out.println("count :" + count);
			if(log == -1) {
				System.out.println("�α׾ƿ� �����Դϴ�.");
			}
			else {
				System.out.println(id+ "���� �α������Դϴ�.");
			}
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if(sel == 1) {
				int check = -1;
				if(log == -1) {
				System.out.println("[1]�� �� �� ");
				System.out.print("���̵� �Է����ּ��� . ");
				String inId = sc.next();
				System.out.print("��й�ȣ�� �Է����ּ��� . ");
				String inPw = sc.next();
				for(int i =0; i<3; i++) {
					if(ids[i].equals(inId) && pws[i].equals(inPw)) {
						check = 1;
					}
				}
				for(int i =0; i<3; i++) {
					if(ids[i].equals(inId) && pws[i].equals(inPw)) {
						System.out.println("�α����� �Ǿ����ϴ�.");
						id = inId;
						log = 1;
						idx = i;

					}

				}
				if(check == -1) {
				System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
				}
				}
				else {
					System.out.println("�̹� �α��� �����Դϴ�.");
				}
			}
			else if(sel == 2) {
				if(log == 1) {
					log = -1;
					idx = -1;
					System.out.println("�α׾ƿ� �Ǿ����ϴ� .");
				}
				else { 
					System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
				System.out.println("1)���\n2)�ٳ���\n3)����");
				
				int sel2 = sc.nextInt()-1;
				if( sel2 >=0 && sel2 <3) {
				jang[count][0] = idx;
				jang[count][1] = sel2;
				count ++;
				System.out.println(items[sel2]+"�� ��ٱ��Ͽ� ��ҽ��ϴ�.");
				}
				else {
					System.out.println("��ٱ��Ͽ� ���� ��ȣ�Դϴ�.");
				}
				}
				else {
					System.out.println("�α����� ���� ���ּ��� .");
				}
				
			}
			else if(sel == 4) {

				for(int i=0; i<count; i++) {
						for(int j =0; j <1; j++) {
							if(jang[i][0] == idx) {
							System.out.print(ids[idx] + "ȸ��      >  ");
							}						
						}
						for(int j =1; j <2; j++) {
							if(jang[i][0] == idx) {
								int temp = jang[i][1]; 
								System.out.print(items[temp] + "����");
								System.out.println();
							}						
						}
				}


			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}

		}//clear

	}

}
