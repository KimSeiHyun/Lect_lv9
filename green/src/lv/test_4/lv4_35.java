package lv.test_4;

import java.util.Scanner;

public class lv4_35 {

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
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("�߰��� ī�װ� �Է� : ");
				String category = sc.next();
				int check = 0;
				for(int i=0; i<itemCount; i++) {
					if(category.equals(items[i][0])) check = 1;
				}
				if(check == 0) {
					itemCount++;
					items[itemCount-1][0] = category;
				}else System.out.println("�ߺ��� ī�װ��Դϴ�.");
			}
			else if(sel == 2) {
				System.out.print("�߰��� ī�װ� �Է� : ");
				String category = sc.next();
				int idx = -1;
				for(int i=0; i<itemCount; i++) {
					if(items[i][0].equals(category)) idx = i;
				}
				if(idx != -1 ) {
					System.out.print("�߰��� ������ �Է� : ");
					String item = sc.next();
					items[idx][1] += item+"/";
				}else System.out.println("ī�װ��� ã�� �� �����ϴ�.");
			}
			else if(sel == 3) {
				for(int i=0; i<itemCount; i++) {
					System.out.println(items[i][0] + "\t" + items[i][1]);
				}
			}
			
		}

	}

}