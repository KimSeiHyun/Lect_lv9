package lv3;

import java.util.Scanner;

public class Ex01_25tc {

	public static void main(String[] args) {
		/*
		 * # ȸ������ 
		 * 1. ����
		 * . ���̵� �� ��й�ȣ�� �Է¹޾� ����
		 * . ���̵� �ߺ��˻�
		 * 2. Ż��
		 * . ���̵� �� �Է¹޾� Ż��
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] ids = {0, 0, 0, 0, 0}; // �ߺ� Ȯ�� �� ����ó�� . 
		int[] pws  = {0, 0, 0, 0, 0};
		
		int cnt = 0;
		boolean run = true;
		while(run) {
			System.out.println("cnt : " + cnt );
			for(int i =0; i<5; i++ ) {
				System.out.print(ids[i] + " ");
			}
			System.out.println();
			for(int i =0; i<5; i++ ) {
				System.out.print(pws[i] + " ");
			}
			System.out.println();
			
			System.out.println("1.����");
			System.out.println("2.Ż��");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			
			if(sel == 1) { // �迭 ��Ʈ�ѷ� ( �߰� ) 			
			System.out.print("������ ���̵� : ");
			int inputId = scan.nextInt();
			
			boolean  check = true;
			
			for(int i=0; i<cnt; i++) {
				if(ids[i] == inputId)	{
					check = false; 
					
				}
			
			}
			if(check == true) {
				System.out.print("��й�ȣ �Է� : ");
				int inputPw = scan.nextInt();
				
				ids[cnt] = inputId;
				pws[cnt] = inputPw;
				cnt ++;
				
				System.out.println("ȸ�������� ȯ���մϴ�/");
			}
			else {
				System.out.println("�̹� ������� ���̵��Դϴ� . ");
			}
		
			}
			
			
			else if(sel == 2) {
				System.out.print("Ż���� ���̵� �Է� : ");
				int inputId = scan.nextInt();
				
				int delIdx = -1;
				for(int i=0; i<5; i++) {//������ �ε����� ���� ã�� 
					if(ids[i] == inputId) {
						delIdx = i;
					}
				}
				
				if(delIdx != -1) {
					System.out.print("��й�ȣ �Է� ");
					int inputPw = scan.nextInt();
					
					if (pws[delIdx] == inputPw) {
						
						for(int i= delIdx; i<cnt-1; i++) {
							ids[i] = ids[i+1];
							pws[i] = pws[i+1];
						}
						ids[cnt-1] = 0;
						pws[cnt-1] = 0;
						cnt --;
//						ids[delIdx] = 0;
//						pws[delIdx] = 0;
//						cnt --;
					}
					else {
						System.out.println("ȸ�������� �ٽ� Ȯ�����ּ��� . ");
					}
				}
				else {
					System.out.println("ȸ�������� �ٽ� Ȯ�����ּ��� . ");
					
				}
				
			}
			
		}
		
		
		
		
		
	}

}
