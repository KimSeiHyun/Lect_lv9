package lv3.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		/*
		 * # ȸ������ 
		 * 1. ����
		 * . ���̵� �� ��й�ȣ�� �Է¹޾� ����
		 * . ���̵� �ߺ��˻�
		 * 2. Ż��
		 * . ���̵� �� �Է¹޾� Ż��
		 */
		
		// ���� 10:46
		// ���� 10:56
		// �ҿ� 12�ð�10��
		
		int id[] = new int[5];
		int pw[] = new int[5];
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		
		while (t) {
			System.out.println("cnt : " + cnt);
			System.out.print("id : ");
			for(int i=0; i<5; i++) {
				System.out.print(id[i] + " ");
			}
			System.out.println();
			System.out.print("pw : ");
			for(int i=0; i<5; i++) {
				System.out.print(pw[i] + " ");
			}
			System.out.println();
			System.out.println("#ȸ������ . \n1.���� \n2.Ż�� \n3.����");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				int check = 1;
				System.out.println("���̵� �Է����ּ��� . ");
				int inId = sc.nextInt();
				System.out.println("��й�ȣ�� �Է����ּ��� . ");
				int inPw = sc.nextInt();
				
				for(int i =0; i<cnt; i++) {
					if(id[i]==inId) {
						check = -1;
					}
				}
				
				if(check == 1) {
					id[cnt] = inId;
					pw[cnt] = inPw;
					cnt++;
				}
				else {
					System.out.println("�̹� ȸ�����Ե� ���̵��Դϴ�.");
				}

			 }
			
			else if(sel == 2) {
				int check = 1;
				System.out.println("���̵� �Է����ּ��� . ");
				int delId = sc.nextInt();
				System.out.println("��й�ȣ�� �Է����ּ��� . ");
				int delPw = sc.nextInt();
				
				for(int i=0; i<cnt; i++) {
					if(id[i] == delId ) {
						check = -1;
					}
				}
				if(check == -1) {
					for(int i =0; i<cnt-1; i++) {
						id[i] = id[i+1];
						pw[i] = pw[i+1];
					}
					id[cnt-1] = 0;
					pw[cnt-1] = 0;
					cnt--;
					
				}
				else {
					System.out.println("���� ȸ�������Դϴ� .");
				}

			}
			else if(sel == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
	
		}
		
	}
}
	


