package lv4.test;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		/*
		 * # ���θ� [������]
		 * 1. ī�װ��� �������� �Է¹޾� �Ʒ��� ���ÿ� ���� �����Ѵ�.
		 * 2. ī�װ��� �� ���� ù��° ���� �����Ѵ�.
		 * 3. �������� �� ���� �ι�° ���� �����Ѵ�.
		 *    ��, �������� �������� �߰��� �� �ֵ��� ������(/)�� �����ڷ� �������ش�.
		 * ��)
		 * {
		 * 		{"����", "���/����/"},
		 * 		{"����", "Ȩ����/�ɸ���/"},
		 * 		{"����", "�ݶ�/"},
		 * 		{"����", "�Ұ��/"}
		 * 		...
		 * } 
		 */
		
		// ���� 08:20
		// ���� 09:37 
		// �ҿ� 01:17
		
		Scanner sc = new Scanner(System.in);
		String[][] items = new String[100][2];
		items[0][0] = "���";
		for(int i=0; i<items.length; i++) {
			items[i][0] = " ";
			items[i][1] = " ";
		}
		String temp = " ";
		int cnt = 0;
		while(true) {
		System.out.println("[������ ���]");
		System.out.println("[1]ī�װ� ����");
		System.out.println("[2]�� �� ��  ����");
		System.out.println("[3]��üǰ�� ���");
		
		int sel = sc.nextInt();
		
		if ( sel == 1) {
			System.out.print("�߰��� ī�װ� �Է� : ");
			String s = sc.next();
			int check = 0;
			for(int i=0; i<items.length; i++) {
				for(int j=0; j<2; j++) {
					if(items[i][j].equals(s)) {
						check = -1;
					}
				}
			}
			if(check == 0) {
				items[cnt][0] =s;
				cnt++;
			}
			else {
				System.out.println("�̹� �ִ� ī�װ��Դϴ�");
			}
		}
		if ( sel == 2) {
			System.out.print("� ī�װ��� �߰��Ͻðڽ��ϱ�  : ");
			String s1 = sc.next();
			int check = 0;
			int a = 0;
			for(int i=0; i<items.length; i++) {
				for(int j =0; j<2; j++) {
					if(items[i][j].equals(s1)) {
						a = i;
						check = 1;
					}
				}
			}
			if(check == 1) {
			System.out.print("�߰��� ������ �Է� : ");
			String s = sc.next();
				items[a][1] += s+"/";
			}
			else {
				System.out.println("�߸��� ī�װ��Դϴ�.");
			}

			
		}
		if ( sel == 3) {
			for(int i=0; i<items.length; i++) {
				for(int j=0; j<2; j++) {
					if(items[i][j].equals(temp)) {
					}
					else {
						System.out.print(items[i][j]  + " " );
						
					}
				}
				if(items[i][0].equals(temp)) {
				}
				else {
					System.out.println();
					
				}
		}
		}

		}//w

	}

}
