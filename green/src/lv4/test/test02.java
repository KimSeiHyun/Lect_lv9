package lv4.test;

import java.util.Scanner;

public class test02 {

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
		
		// ���� 10:07
		// ���� 10:48
		// �ҿ� 00:39
		
		while(true) {
			if(datas != null) {
				for(int i=0; i<datas.length; i++) {
					System.out.print(datas[i] + " ");
				}System.out.println();	
			}
			System.out.println("1.�߰�");
			System.out.println("2.����(�ε���)");
			System.out.println("3.����(��)");
			System.out.println("4.����");
			System.out.println("cnt = " + cnt);
			System.out.println("�޴��� �������ּ��� . ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("�߰� �� ���� �Է����ּ��� . ");
				int num = sc.nextInt();
				if(cnt == 0) {
					cnt ++;
					datas = new int[cnt];
					datas[cnt-1] = num;
				}
				else {
					cnt ++;
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
				System.out.println("������ ��(�ε���)�� �Է����ּ��� . ");
					int num = sc.nextInt();
					for(int i = 0; i<datas.length; i++) {
						if(i == num) {
							datas[i] = 0;
							cnt--;
						}
					}
					int temp[] = datas;
					datas = new int[cnt];
					
					for(int i=0; i<temp.length-1; i++) {
						if(temp[i] == 0) {
							temp[i] = temp[i+1];
							temp[i+1] = 0;
						}
					}
					for(int i=0; i<datas.length; i++) {
						datas[i] = temp[i];
					}
				}
				else {
					System.out.println("�����Ұ��� �����ϴ� . ");
				}
				
			}
			if(sel == 3) {
				if(cnt != 0) {
					System.out.println("������ ���� �Է����ּ��� . ");
					int num = sc.nextInt();
					for(int i = 0; i<datas.length; i++) {
						if(datas[i] == num) {
							datas[i] = 0;
							cnt--;
						}
				}
					int temp[] = datas;
					datas = new int[cnt];
				int x= 0;
				while(x <temp.length ) {
					for(int i=0; i<temp.length-1; i++) {
						if(temp[i] == 0) {
							temp[i] = temp[i+1];
							temp[i+1] = 0;
						}
					}
					x++;
				}
					for(int i=0; i<datas.length; i++) {
						datas[i] = temp[i];
					}
				}
				else  {
					System.out.println("������ ���� �����ϴ� .");
				}
				
			}
			if(sel == 4) {
				if(cnt != 0) {
				System.out.println("������ ��ġ(�ε���)�Է� . ");
				int num = sc.nextInt();
				System.out.println("������ ���� �Է����ּ��� . ");
				int num2 = sc.nextInt();
				for(int i=0; i<datas.length; i++) {
					if(num == i) {
						cnt ++ ;
					}
				}
				int temp[] = datas;
				datas = new int[cnt];
				
				for(int i=0; i<temp.length;i ++) {
					if(i <=num) {
						datas[i] = temp[i];
					}
					if(i > num) {
						datas[i+1] = temp[i];
					}
				}
				datas[num+1] = num2;
				}else {
					System.out.println("������ ������ �����ϴ�.");
				}
				
			}

		}//w
		
		
	}
	}

