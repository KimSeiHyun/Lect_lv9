package lv.test_3;

import java.util.Scanner;

public class lv3_24 {

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
		Scanner sc = new Scanner(System.in);
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
					System.out.println("ȸ�������� �� ������ �����ϴ�.");
					continue;
				}
				int check = 0;
				System.out.println("���̵� �Է����ּ��� ");
				int inId = sc.nextInt();
				System.out.println("��й�ȣ�� �Է����ּ��� ");
				int inPw = sc.nextInt();
				for(int i=0; i<5; i++) {
					if(inId == ids[i]) {
						check = 1;
						System.out.println("�ߺ��� ���̵��Դϴ�.");
						break;
					}
				}
				
				if(check == 0) {
				for(int i=0; i<5; i++) {
					if(ids[i] == 0 && pws[i] == 0) {
						ids[i] = inId;
						pws[i] = inPw;
						cnt ++;
						break;
					}
				}
				}
				
			}
			else if(sel == 2) {
				System.out.println("���̵� �Է����ּ���.");
				int delId = sc.nextInt();
				for(int i=0; i<5; i++) {
					if(delId == ids[4]) {
						ids[4] = 0;
						pws[4] = 0;
						cnt --;
						break;
					}
					if(ids[i] == delId) {
						ids[i] = ids[i+1];
						pws[i] = pws[i+1];
						ids[i+1] = 0;
						pws[i+1] = 0;
						cnt--;
					}
					if(ids[i] == 0 ) {
						if(i == 4) {
							break;
						}
						ids[i] = ids[i+1];
						ids[i+1] = 0;
						pws[i] = pws[i+1];
						pws[i+1] = 0;
					}
				}
				
			}
			
		}//w

		
	}


}