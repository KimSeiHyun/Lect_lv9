package lv.test_4;

import java.util.Scanner;

public class lv4_06s {

	public static void main(String[] args) {
		/*
		 * # ATM[4�ܰ�] : ��ü ��ɱ���
		 * 1. ȸ������
		 * . id�� pw�� �Է¹޾� ����
		 * . ���� �� �� 1000�� �ο�
		 * . id �ߺ�üũ
		 * 2. ȸ��Ż��
		 * . �α��νÿ��� �̿밡��
		 * 3. �α���
		 * . id�� pw�� �Է¹޾� �α���
		 * . �α׾ƿ� ���¿����� �̿밡��
		 * 4. �α׾ƿ�
		 * . �α��νÿ��� �̿밡��
		 * 5. �Ա�
		 * . �α��νÿ��� �̿밡��
		 * 6. ��ü
		 * . �α��νÿ��� �̿밡��
		 * 7. �ܾ���ȸ
		 * . �α��νÿ��� �̿밡��
		 */
		
		final int SIZE = 5;
		int id[] = new int[SIZE];
		int pw[] = new int[SIZE];
		int money[] = new int[SIZE];
		int log = -1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		while (true) {
			System.out.print("id ");
			for(int i=0; i<5; i++ ) {
				System.out.print(id[i] + " ");
			}System.out.println();
			System.out.print("pw ");
			for(int i=0; i<5; i++ ) {
				System.out.print(pw[i] + " ");
			}System.out.println();
			System.out.print("money ");
			for(int i=0; i<5; i++ ) {
				System.out.print(money[i] + " ");
			}System.out.println();
			System.out.println("cnt : " +cnt);
			System.out.println("log : " + log);
		System.out.println("1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n5.�Ա�\n6.��ü\n7.�ܾ���ȸ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			if(cnt == 5) {
				System.out.println("���̻� ȸ�������� �� �� �����ϴ�.");
				continue;
			}
			System.out.println("ȸ�������� ���̵� �Է����ּ��� . ");
			int check = 0;
			int inId = sc.nextInt();
			for(int i=0; i<5; i++) {
				if(id[i] == inId) {
					check = 1;
					System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
					break;
				}
			}
			if(check  == 0) {
				System.out.println("��й�ȣ�� �Է����ּ��� . ");
				int inPw = sc.nextInt();
				id[cnt] = inId;
				pw[cnt] = inPw;
				money[cnt] = 1000;
				cnt ++;
			}
		}
		if(sel == 2) {
			if(log != -1) {
			System.out.println("ȸ��Ż�� �� ���̵� �Է����ּ��� ");
			int outId = sc.nextInt();
			int check = 0;
			for(int i=0; i<5; i++) {
				if(id[i] == outId && log == outId) {
					id[i] = 0;
					pw[i] = 0;
					money[i] = 0;
					check = 1;
					cnt--;
					log = -1;
				}
				if(id[i] == 0 && i <=3) {
					id[i] = id[i+1];
					id[i+1] = 0;
					pw[i] = pw[i+1];
					pw[i+1] = 0;
					money[i] = money[i+1];
					money[i+1] = 0;

				}
			}
			if(check == 0) {
				System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
				continue;
			}
			}else {
				System.out.println("�α����� ���� ���ּ��� ");
			}
			
		}
		if(sel == 3) {
			if(log == -1) {
			System.out.println("�α����� ���̵� �Է����ּ��� .");
			int inId = sc.nextInt();
			int check = 0;
			for(int i=0; i<5; i++) {
				if(id[i] == inId && id[i] != 0) {
					check = 1;
					System.out.println("��й�ȣ�� �Է����ּ��� . ");
					int inPw = sc.nextInt();
					if(pw[i] == inPw) {
						System.out.println(inId + "���� �α��� �ϼ̽��ϴ�.");
						log = inId;
						temp = i;
						
					}
					if(pw[i] != inPw) {
						System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ��� . ");
					}
				}
			}
			if (check == 0) {
				System.out.println("���̵� �ٽ� Ȯ�����ּ��� .");
				continue;
			}
		}
			else {
				System.out.println("�̹� �α��� �����Դϴ�.");
				
			}
		}
		if(sel == 4) {
			if(log != -1) {
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
				log = -1;
			}else {
				System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
			}
			
		}
		if(sel == 5) {
			if(log != -1) {
				System.out.println("�Ա��� �ݾ��� �Է����ּ��� . ");
				int inMoney = sc.nextInt();
				for(int i=0; i<5; i++) {
					if(id[i] == log) {
						money[i] += inMoney;
					}
				}
			}else {
				System.out.println("�α����� ���� ���ּ��� .");
			}
			
		}
		if(sel == 6) {
			if (log != -1) {
				System.out.println("��ü�� ���̵� �Է����ּ��� . ");
				int inId = sc.nextInt();
				int check = 0;
				int x = 0;
				for(int i=0; i<5; i++) {
					if(id[i] == log) {
						x = i;
					}
				}
				for(int i =0; i<5; i++) {
					if(id[i] == inId) {
						check  = 1;
						System.out.println("��ü�� �ݾ��� �Է����ּ���.");
						int outMoney = sc.nextInt();
						if(money[x] > outMoney) {
							money[x] -= outMoney;
							money[i] += outMoney;
						}
						else {
							System.out.println("�ܾ��� �����մϴ�.");
						}
					}
				}
				if(check == 0) {
					System.out.println("���̵� Ȯ�����ּ��� .");
				}

			} else {
				System.out.println("�α����� ���� ���ּ��� .");
			}
		}
		if (sel == 7) {
			if (log != -1) {
				System.out.println("�ܾ��� : "+money[temp]);

			} else {
				System.out.println("�α����� ���� ���ּ��� .");
			}
		}

		}//w

		
	}

}