package lv7;

import java.util.Scanner;

class User{
	String id;
	int pw;
	
}



public class Ex001_006 {

	public static void main(String[] args) {
		
		int max = 10;
		int cnt = 0;
		User[] user = new User[max];
		for(int i=0; i<user.length; i++) {
			user[i] = new User();
		}
		/*
    1. ȸ������
    2. ȸ��Ż��
    3. ��ü���
    */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("cnt : " + cnt);
			System.out.println("1.ȸ������\n2.ȸ��Ż��\n3.��ü���\n");
			int sel = sc.nextInt();
			if(cnt < 10) {
				if(sel == 1) {
					System.out.println("���̵� �Է� : ");
					String inId = sc.next();
					int check = 0;
					for(int i=0; i<cnt; i++) {
						if(user[i].id.equals(inId)) {
							check = 1;
						}
					}
					if(check == 0) {
						System.out.println("��й�ȣ �Է� : ");
						int inPw = sc.nextInt();
						user[cnt].id = inId;
						user[cnt].pw = inPw;
						cnt ++;
					}
					else if(check == 1) {
						System.out.println("�ش� ���̵�� �̹� �����մϴ�.");
					}
				
			}
			}
			else {
				System.out.println("���̻� ȸ�������� �� �� �����ϴ�.");
			}
			if(sel == 2) {
				if(cnt >0) {
				System.out.println("ȸ��Ż���� ���̵� �Է� : ");
				String delId = sc.next();
				int check = 0;
				int idx = -1;
				for(int i=0; i<cnt; i++) {
					if(user[i].id.equals(delId)) {
						check = 1;
						idx = i;
					}
				}
				if(check == 1) {
					System.out.println("ȸ��Ż���� ���̵��� ��й�ȣ �Է� : ");
					int delPw = sc.nextInt();
					if( delPw == user[idx].pw) {
						System.out.println("ȸ��Ż�� ���� ");
						user[idx].id = null;
						user[idx].pw = 0;
						cnt --;
					}
					for(int i=0; i<user.length-1; i++) {
						if(user[i].id == null) {
							user[i].id = user[i+1].id;
							user[i+1].id = null;
							user[i].pw = user[i+1].pw;
							user[i+1].pw = 0;
						}
					}
				}
				else {
					System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
				}
				}else System.out.println("ȸ��Ż���� ���̵� �����ϴ�");
			}
			if(sel == 3) {
				for(int i=0; i<user.length; i++) {
					System.out.print(user[i].id + "\t");
				}System.out.println();
				for(int i=0; i<user.length; i++) {
					System.out.print(user[i].pw + "\t");
				}System.out.println();
			}
		}
		
	}
}