package lv.test_4;

import java.util.Scanner;

public class lv4_09s {

	public static void main(String[] args) {
		/*
		 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)
		 * 1. �߰�
		 * . ���� �Է¹޾� ���������� �߰�
		 * 2. ����(�ε���)
		 * . �ε����� �Է¹޾� �ش� ��ġ�� �� ����
		 * 3. ����(��)
		 * . ���� �Է¹޾� ����
		 * . ���� �� �Է� �� ����ó��
		 * 4. ����
		 * . �ε����� ���� �Է¹޾� ����
		 */

		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int[] datas = null;
		
		while(true) {
			if(datas != null) {
				for(int i=0; i<cnt; i++) {
					System.out.print(datas[i] + " ");
				}System.out.println();
			}
		System.out.println("cnt : "+ cnt);
		System.out.println("1.�߰�\n2.����(�ε���)\n3.����(��)\n4.����");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			System.out.println("�߰��Ұ��� �Է����ּ��� . ");
			int num = sc.nextInt();
			if(cnt == 0) {
				cnt++;
				datas = new int[cnt];
				datas[cnt-1] = num;
			}
			else {
				cnt++;
				int temp[] = datas;
				datas = new int[cnt];
				for(int i=0; i<temp.length; i++) {
					datas[i] = temp[i];
				}
				datas[cnt-1] = num;
			}
		}
		if(sel == 2) {
			if(cnt != 0) {
				int x = 0;
				int check = -1;
				System.out.println("������ �ε����� �Է����ּ���");
				int idx = sc.nextInt();
				for(int i=0; i<datas.length; i++) {
					if(i == idx) {
						x = i;
						check = 1;
					}
				}
				if (check == 1) {
					datas[x] = 0;
					cnt --;
					int temp[] = datas;
					datas = new int[cnt];
					int y = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i] != 0) {
							datas[y] = temp[i];
							y++;
						}
					}
				}
				else {
					System.out.println("�ε����� �ٽ� Ȯ�����ּ���");
					continue;
				}
			}
			else {
				System.out.println("�����Ұ��� �����ϴ�.");
			}
		}
		if(sel == 3) {
			if(cnt != 0) {
				System.out.println("�����Ұ��� �Է����ּ��� ");
				int num = sc.nextInt();
				int check = -1;
				for(int i=0; i<datas.length; i++) {
					if(datas[i] == num) {
						datas[i] = 0;
						cnt --;
						check = 1;
					}
				}
				if(check == 1) {
					int temp[] = datas;
					datas = new int[cnt];
					int y = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i] != 0) {
							datas[y] = temp[i];
							y++;
						}
					}
				}
				else {
					System.out.println("������ ���� �ٽ� Ȯ�����ּ��� . ");
				}
				
			}
			else {
				System.out.println("�����Ұ��� �����ϴ�.");
			}
			
		}
		if(sel == 4) {
			if(cnt != 0) {
				System.out.println("������ �ε����� �Է����ּ��� . ");
				int idx = sc.nextInt();
				if(idx >= 0 && idx <cnt) {
					System.out.println("������ ���� �Է����ּ��� ");
					int num = sc.nextInt();
					int temp[] = datas;
					cnt ++;
					datas = new int[cnt];
					datas[idx] = num;
					int y = 0;
					for(int i=0; i<datas.length; i++) {
						if(datas[i] == 0) {
							datas[i] = temp[y];
							y++;
						}
						else {
							y--;
							
						}
					}
				}
				else {
					System.out.println("�ε����� ������ �ٽ� Ȯ�����ּ��� . ");
				}
			}
			else {
				System.out.println("������ ������ �����ϴ�.");
			}
		}


		}//w
		

	}

}
