package lv4;

import java.util.Scanner;

public class Ex01_06 {

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
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		int cnt = 0;
		int log = -1;
		while (t) {
			System.out.println("---------------------");
			System.out.print("id    : ");
			for(int i=0; i<SIZE; i++) {
				System.out.print(id[i] + " ");
			}
			System.out.println();
			System.out.print("pw    : ");
			for(int i=0; i<SIZE; i++) {
				System.out.print(pw[i] + " ");
			}
			System.out.println();
			System.out.print("money : ");
			for(int i=0; i<SIZE; i++) {
				System.out.print(money[i] + " ");
			}
			System.out.println();
			if(log == -1) {
				System.out.println("�α׾ƿ� �����Դϴ�.");
			}
			else {
				System.out.printf("%d���� �α��� ���Դϴ�.",log);
			}
			System.out.println();
			System.out.println("---------ATM---------");
			System.out.println("1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n8.����");
			System.out.println("---------------------");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				int check = 1;
				if(cnt == 5) {
					System.out.println("���̻� ȸ�������� �� �� �����ϴ�. ");
					continue;
				}
				System.out.println("ȸ�������� ���̵� �Է����ּ��� . ");
				int inId = sc.nextInt();
				for(int i=0; i<SIZE; i++) {
					if(id[i] == inId) {
						check = -1;
					}
				}
				System.out.println("ȸ�������� ��й�ȣ�� �Է����ּ��� . ");
				int inPw = sc.nextInt();
				if(check == 1) {
					id[cnt] = inId;
					pw[cnt] = inPw;
					money[cnt] += 1000;
					cnt++;
				}
				else {
					System.out.println("�̹� ȸ�����Ե� ���̵��Դϴ�.");
				}
			}
			
			else if (sel == 2) {
				if( log == -1) {
					System.out.println("�α����� ���� ���ּ��� .");
					continue;
				}
				if(cnt == 0) {
					System.out.println("ȸ��Ż�� �� ���̵� �����ϴ� . ");
					continue;
				}
				int check = 1;
				int j = 0;
				System.out.println("ȸ��Ż�� �� ���̵� �Է����ּ��� . ");
				int delId = sc.nextInt();
				System.out.println("ȸ��Ż�� �� ��й�ȣ�� �Է����ּ��� .");
				int delPw = sc.nextInt();
				for(int i=0; i<cnt; i++) {
					if(id[i] == delId && pw[i] == delPw && log == id[i]) {
						check = -1;
						j = i;
					}
				}
				if (check == -1) {
					for(int i =j; i<cnt-1; i++) {
						id[i] = id[i+1];
						pw[i] = pw[i+1];
						money[i] = money[i+1];
					}
					id[cnt-1] = 0;
					pw[cnt-1] = 0;
					money[cnt-1] = 0;
					cnt --;
					log = -1;
				}
				else {
					System.out.println("ȸ�������� Ʋ�Ƚ��ϴ� . ");
				}
			}
			
			else if (sel == 3) {
				
				if( log == -1) {
				System.out.println("�α��� �� ���̵� �Է����ּ��� . ");
				int onId = sc.nextInt();
				System.out.println("�α��� �� ��й�ȣ�� �Է����ּ��� . ");
				int onPw = sc.nextInt();
				
				for(int i=0; i<SIZE; i++) {
					if(id[i] == onId && pw[i] == onPw) {
						log = onId;
					}
				}
				}
				else {
					System.out.println("�̹� �α��� ���Դϴ�.");
					continue;
				}
			}
			else if (sel == 4) {
				if(log != -1) {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					log = -1;
				}
				else {
					System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
				}
			}
			else if (sel == 5) {
				if(log == -1) {
					System.out.println("�α����� ���� ���ּ��� .");
					continue;
				}
				System.out.println("�Ա��� ���̵� �Է����ּ��� . ");
				int inId2 = sc.nextInt();
				
				for(int i=0; i<SIZE; i++) {
					if(id[i] == inId2) {
						System.out.println("�Ա��� �ݾ��� �Է����ּ��� . ");
						int inMoney = sc.nextInt();
						money[i] += inMoney; 
					}
				}
				for(int i=0; i<SIZE; i++) {
					if(id[i] != inId2) {
						System.out.println("���̵� Ȯ�����ּ���/.");
						break;
					}
				}
				
				
			}
			else if (sel == 6) {
				if(log == -1) {
					System.out.println("�α����� ���� ���ּ��� .");
					continue;
				}
				System.out.println("��ü�� ���̵� �Է����ּ���.");
				int inId2 = sc.nextInt();
				
				for(int i=0; i<SIZE; i++) {
					if(id[i] == inId2) {
						System.out.println("��ü�� �ݾ��� �Է����ּ��� ");
						int inMoney = sc.nextInt();
						money[i] += inMoney;						
						for(int j =0; j<SIZE; j++) {
							if( money[j] < inMoney) {
								System.out.println("�ܾ��� �����մϴ�.");
								break;
							}
						if(id[j] == log && money[j] > inMoney) {
							money[j] -= inMoney;
						}

					}
				}
				}
				for(int i=0; i<SIZE; i++) {
					if(id[i] != inId2) {
						System.out.println("���̵� Ȯ�����ּ���/.");
						break;
					}
				}
			}
			else if (sel == 7) {
				if (log == -1) {
					System.out.println("�α����� ���� ���ּ��� .");
					continue;
				}
				for(int i=0; i<SIZE; i++) {
					if(id[i] == log) {
					System.out.printf("���� %d���� �ܾ��� : %d�� �Դϴ�. ", log,  money[i]);
				}
				}
				System.out.println();
			}
			else if (sel == 8) {
				System.out.println("�����մϴ�");
				break;
			}
			
		}//while
		

	}

}
