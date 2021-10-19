package lv4;

import java.util.Scanner;

public class Ex03_03 {

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
		
		Scanner sc = new Scanner(System.in);
		String[][] items = new String[100][2];
		items[0][0] = "���";
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int cnt = 0;
		
		while(true) {
			System.out.println("cnt : " + cnt);
			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");
			System.out.print(": ");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("ī�װ��� �Է����ּ��� ");
				String s = sc.next();
				int check = 1;
				for(int i =0; i<cnt; i++) {
						if(s.equals(items[i][0])) {
							check = -1;
						}
				}
				
				if(check == 1) {
					items[cnt][0] = s;
					cnt++;
				}
				else {
					System.out.println("�̹� �ִ� ī�װ� �Դϴ� .");
				}
			}
			else if(sel == 2) {
				System.out.println("ī�װ� ��ȣ�� �Է����ּ��� . ");
				int cntNum = sc.nextInt()-1;
				if(cntNum >cnt-1 || cntNum <0) {
					System.out.println("�߸��� ī�װ� ��ȣ�Դϴ� .");
					continue;
				}
				System.out.println("�������� �Է����ּ��� .");
				String item = sc.next();
				items[cntNum][1] += item;
				items[cntNum][1] += "/";
				
			}
			else if(sel == 3) {
				
				
				for(int i=0; i<cnt; i++) {
					System.out.print("��ȣ " + (i+1) +" : ");
					for(int j=0; j<2; j++) {
						System.out.print( items[i][j] + " ");
					}
					System.out.println();
				}
			}
	
		}//clear
	
		
	}

}
