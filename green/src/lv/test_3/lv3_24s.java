package lv.test_3;

import java.util.Scanner;

public class lv3_24s {

	public static void main(String[] args) {
		/*
		 * # ȸ������ 
		 * 1. ����
		 * . ���̵� �� ��й�ȣ�� �Է¹޾� ����
		 * . ���̵� �ߺ��˻�
		 * 2. Ż��
		 * . ���̵� �� �Է¹޾� Ż��
		 */
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			
			for(int i=0; i<5 ; i++) {
				System.out.print(ids[i] + " ");
			}System.out.println();
			for(int i=0; i<5 ; i++) {
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
				System.out.println("���̵� �Է����ּ��� . ");
				int inId = sc.nextInt();
				for(int i=0; i<5; i++) {
					if(inId == ids[i]) {
						check =1;
					}
				}
				if(check == 0) {
					ids[cnt] = inId;
					System.out.println("��й�ȣ�� �Է����ּ��� . ");
					int inPw = sc.nextInt();
					pws[cnt] = inPw;
					cnt++;
				}
				else {
					System.out.println("�ߺ��� ���̵��Դϴ�.");
				}
			}
			else if(sel == 2) {
				System.out.println("Ż���� ���̵� �Է����ּ��� . ");
				int id = sc.nextInt();
				int check = 0;
				for(int i=0; i<5; i++) {
					if(id == ids[i]) {
						ids[i] = 0;
						pws[i] = 0;
						check = 1;
						cnt --;
					}
				}
				for(int i=0; i<cnt; i++) {
					if(ids[i] == 0 && pws[i] == 0) {
						ids[i] = ids[i+1];
						pws[i] = pws[i+1];
						ids[i+1] = 0;
						pws[i+1] = 0;
					}
				}
				if (check == 0) {
					System.out.println("���̵� �������� �ʽ��ϴ� . ");

				}


			}
			
		}//ww

		
	}


}