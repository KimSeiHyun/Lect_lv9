package lv.test_4;

import java.util.Scanner;

public class lv4_19 {

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
				System.out.println("�߰��� ī�װ��� �Է����ּ��� .");
				String x = sc.next();
				int check = 0;
				for(int i=0; i<items.length; i++) {
					for(int j=0; j<1; j++) {
						if(items[i][j].equals(x)) {
							check = 1;
						}
					}
				}
				if(check == 1) {
					System.out.println("�̹� �����ϴ� ī�װ��Դϴ�.");
				}else {
					items[cnt][0] = x;
					cnt++;
				}
				
			}
			else if(sel == 2) {
				System.out.println("�������� �߰��� ī�װ��� ���� �Է����ּ��� ");
				String x = sc.next();
				int check = 0;
				for(int i=0; i<cnt; i++) {
					if(items[i][0].equals(x)) {
						check = 1;
					}
				}
				if(check == 1) {
					System.out.println("�߰��� �������� �Է����ּ��� ");
					String x2 = sc.next();
					items[cnt-1][1] += x2+"/";
					
				}else {
					System.out.println("ī�װ��� �ٽ� Ȯ�����ּ��� . ");
				}
				
			}
			else if(sel == 3) {
				for(int i=0; i<cnt; i++) {
					for(int j= 0; j<2; j++) {
						if(items[i][j] != "") {
						System.out.print(items[i][j] + " ");
						}
					}
					System.out.println();
					
				}
			}
			
		}//w

		
	}

}
