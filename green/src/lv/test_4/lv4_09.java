package lv.test_4;

import java.util.Scanner;

public class lv4_09 {

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
			System.out.println("cnt = " + cnt);
			if(datas != null) {
			for(int i=0; i<datas.length; i++) {
				System.out.print(datas[i] + " ");
			}System.out.println();
			}
			System.out.println("1.�߰� \n2.����(�ε���) \n3.����(��) \n4.����");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("�߰��� ���� �Է����ּ��� .");
				int num = sc.nextInt();
				cnt++;
				if(cnt > 1) {
				int temp[] = datas;
				datas = new int[cnt];
				for(int i=0; i<temp.length; i++) {
					datas[i] = temp[i]; 
				}
				datas[cnt-1] = num;
				}
				else {
					datas= new int[cnt];
					datas[cnt-1] = num;
				}
			}
			if(sel == 2) {
				if(cnt > 0) {
				System.out.println("������ �ε��� ��ȣ�� �Է����ּ��� . ");
				int idx= sc.nextInt();
				if(idx < cnt ) {
				datas[idx] = 0;
				cnt--;
				for(int i=0; i<datas.length-1; i++) {
					if(datas[i] == 0) {
						datas[i] =datas[i+1];
						datas[i+1] = 0;
					}
				}
				int temp[] = datas;
				datas = new int[cnt];
				for(int i=0; i<datas.length; i++) {
					datas[i] = temp[i];
				}
				}
				else {
					System.out.println("�ε��� ������ ������ϴ�.");
				}
				}
				else {
					System.out.println("������ ���� �����ϴ�.");
				}
				
			}
			if(sel == 3) {
				if(cnt >0 ) {
					int cnt2 = 0;
					System.out.println("������ ���� �Է����ּ��� .");
					int num = sc.nextInt();
					for(int i=0; i<datas.length; i++) {
						if(datas[i] == num) {
							datas[i] = 0;
							cnt--;
						}
						if(datas[i] != num) {
							cnt2++;
						}
					}
					int x = 0;
					while(x<100) {
					for(int i=0; i<datas.length-1; i++) {
						if(datas[i] == 0) {
							datas[i] = datas[i+1];
							datas[i+1] = 0;
						}
					}
					x++;
					}
					int temp[] = datas;
					datas = new int[cnt];
					for(int i=0; i<datas.length; i++) {
						datas[i] = temp[i];
					}
					if(cnt2 == cnt) {
						System.out.println("���� �� ���� �������� �ʽ��ϴ�.");
						continue;
					}
				}
				else {
					System.out.println("������ ���� �����ϴ�.");
				}
			}
			if(sel == 4) {
				if(cnt >0) {
					System.out.println("������ �ε����� �ڸ��� �Է����ּ���  .");
					int idx = sc.nextInt();
					if(idx <= cnt -1) {
					System.out.println("������ ���� �Է����ּ���  .");
					int num = sc.nextInt();
					cnt++;
					int temp[] = datas;
					datas = new int[cnt];
					for(int i=0; i<= idx; i++) {
						datas[i] = temp[i];
					}
					for(int i=idx+1; i<temp.length; i++) {
						datas[i+1] = temp[i];
					}
					datas[idx+1] = num;
					}
					else {
						System.out.println("������ �ε����� ������ ������ϴ�.");
					}
				}
					
				else {
					System.out.println("������ ������ �����ϴ�. ");
				}
			}
			
			
		}//w
		

		
	}

}
