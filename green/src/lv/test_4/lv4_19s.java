package lv.test_4;

import java.util.Scanner;

public class lv4_19s {

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
		
		int cnt = 0;
		
		while(true) {

			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");
			
			System.out.print(": ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("�߰��� ī�װ� �Է� :");
				String str = sc.next();
				int check =0 ;
				for(int i=0; i<cnt; i++) {
					if(items[i][0].equals(str)) {
						check = 1;
					}
				}
				if(check == 0) {
					items[cnt][0] = str;
					cnt++;
				}else System.out.println("�̹� �����ϴ� ī�װ��Դϴ�.");
				
			}
			else if(sel == 2) {
				System.out.println("�������� �߰��� ī�װ� �Է� : ");
				String k = sc.next();
				int check = 0;
				int idx = 0;
				for(int i=0; i<cnt; i++) {
					if(items[i][0].equals(k)) {
						check = 1;
						idx = i;
					}
				}
				if(check == 1) {
					System.out.println("�߰��� ������ �Է� : ");
					String item = sc.next();
					items[idx][1] += item+"/";
					
				}else System.out.println("�Է��� ī�װ��� ã���� �����ϴ� .");
				
			}
			else if(sel == 3) {
				for(int i=0; i<cnt; i++) {
					for(int j=0; j<2; j++) {
						System.out.print(items[i][j] + " ");
					}System.out.println();
				}
			}
			
		}//while
	}

}
