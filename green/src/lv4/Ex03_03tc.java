package lv4;

import java.util.Scanner;

public class Ex03_03tc {

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
		
		Scanner scan = new Scanner(System.in);
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int itemCount = 0;
		while(true) {
			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");
			System.out.print(": ");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.print("�߰��� ī�װ��� �Է� : " );
				String name = scan.next();
				
				int check = 1;
				for(int i=0; i<itemCount; i++) {
					if(name.equals(items[i][0])) {
						check = -1;
					}
				}
				if(check == 1) {
					items[itemCount][0] = name;
					itemCount ++;
				}
				else {
					System.out.println("�̹� �����ϴ� ī�װ��Դϴ�.");
				}
			}
			else if(sel == 2) {
				for(int i =0; i<itemCount; i++) {
					System.out.printf("%d) %s\n", i+1, items[i][0]);
				}
				System.out.print("ī�װ� ���� : ");
				int choice = scan.nextInt()-1;
				
				if(itemCount > 0 && choice >= 0 && choice < itemCount) {
					System.out.print("������ �Է� : ");
					String item = scan.next();
					
//					if(items[choice][1] != null) {
//						items[choice][1] = item;
//					}
//					else {
						items[choice][1] += item;	//					
//					}
					items[choice][1] += "/";	//
				}
			}
			else if(sel == 3) {
				for(int i =0; i<itemCount; i++) {
					System.out.printf("%s: %s\n", items[i][0], items[i][1]);
				}
			}
		}
	}

}
