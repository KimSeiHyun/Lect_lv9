package lv.test_3;

import java.util.Scanner;

public class lv3_34 {

	public static void main(String[] args) {
		/*
		 * # ȸ������ 
		 * 1. ����
		 * . ���̵� �� ��й�ȣ�� �Է¹޾� ����
		 * . ���̵� �ߺ��˻�
		 * 2. Ż��
		 * . ���̵� �� �Է¹޾� Ż��
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			for(int i=0; i<5; i++) {
				System.out.print(ids[i] + " ");
			}System.out.println();
			for(int i=0; i<5; i++) {
				System.out.print(pws[i] + " ");
			}System.out.println();
			System.out.println("1.����");
			System.out.println("2.Ż��");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(cnt == 5) {
					System.out.println("���̻� ȸ�������� �� �� �����ϴ�.");
					continue;
				}
				int check = 0;
				System.out.println("���̵� �Է����ּ��� ");
				int inId = sc.nextInt();
				for(int i=0; i<5; i++) {
					if(ids[i] == inId) {
						System.out.println("�ߺ��� ���̵��Դϴ�.");
						check = 1;
					}
				}
				if(check == 0) {
					System.out.println("��й�ȣ�� �Է����ּ��� ");
					int inPw = sc.nextInt();
					ids[cnt] = inId;
					pws[cnt] = inPw;
					cnt++;
				}
			}
			else if(sel == 2) {
				System.out.println("���̵� �Է����ּ��� . ");
				int id = sc.nextInt();
				int check = 0;
				for(int i=0; i<5;i ++) {
					if(ids[i] == id) {
						ids[i] = 0;
						pws[i] = 0;
						check = 1;
						cnt--;
					}
				}
				for(int i=0; i<cnt; i ++) {
					if(ids[i] == 0) {
						ids[i] = ids[i+1];
						pws[i] = pws[i+1];
						ids[i+1] = 0;
						pws[i+1] = 0;
					}
				}
				if (check == 0) {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
					continue;
				}
				
				
			}
			
		}//w

		
	}


}