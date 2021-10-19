package lv4;

import java.util.Scanner;

public class Ex01_09 {

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
			System.out.println("1.�߰�\n2.����(�ε���)\n3.����(��)\n4.����");
			for(int i=0; i<cnt; i++) {
				System.out.print(datas[i] + " ");
			}
			System.out.println();
			System.out.println("cnt :" + cnt);
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("�߰��� ��");
				int data = sc.nextInt();
				if(cnt >0 ) {
					int temp[] = datas;
					datas = new int[cnt+1];
					for(int i=0; i<temp.length; i++) {
						datas[i] = temp[i];
					}
		
				}
				else {
					datas = new int[1];
				}
				datas[cnt] = data;
				cnt++;

			}
			
			else if(sel == 2) {
				if(cnt == 0) {
					System.out.println("������ �ε����� �����ϴ�.");
					continue;
				}
				System.out.print("������ ��(�ε���)");
				int idx = sc.nextInt();
				if(idx >= cnt || idx < 0) {
					System.out.println("�߸��� �ε��� �� �Դϴ� . ");
					continue;
				}
				int temp[] = datas;
				datas = new int[cnt-1];
				for(int i=0; i<temp.length; i++) {
					if(i== idx &&  idx == cnt-1) {
						for(int j =0; j<datas.length; j++) {
							datas[j] = temp[j];
						}
					}
					if( i == idx && idx  < cnt ) {

						for(int j=0; j<i; j++) {
							datas[j] = temp[j];
						}
						for(int k=i; k<datas.length; k++) {
							datas[k] = temp[k+1];
						}
					}
				}
				cnt--;				
			}
			else if(sel == 3) {
				if (cnt == 0) {
					System.out.println("������ ���� �����ϴ�.");
					continue;
				}
				int a = 0;
				System.out.println("������ �ε����� ���� �Է����ּ��� . ");
				int delNum = sc.nextInt();
				while (a <1) {
					int b = 0;
				int check = 0;
				for(int i =0; i<datas.length; i++) {
					if ( datas[i] != delNum) {
						check ++;
					}
				}
				if(check == cnt) {
					System.out.println("���� �� �Դϴ�.");
					break;
				}
				int temp[] = datas;
				datas = new int[cnt-1];
				for(int i=0; i<temp.length; i++) {
					if(temp[i] == delNum &&  i == cnt-1) {
						for(int j =0; j<datas.length; j++) {
							datas[j] = temp[j];
						}
					}
					if( temp[i] == delNum && i  < cnt ) {

						for(int j=0; j<i; j++) {
							datas[j] = temp[j];
						}
						for(int k=i; k<datas.length; k++) {
							datas[k] = temp[k+1];
						}
					}
				}
				cnt --;
				for(int i=0; i<datas.length; i++) {
					if( datas[i] == delNum) {
						b = 1;
					}
				}
				if( b == 1 ) {
					continue;
				}
				a++;
			}
			}
			else if(sel == 4) { //����
				if(cnt == 0) {
					System.out.println("������ ������ �����ϴ�.\n���� �ε����� �������ּ��� .");
					continue;
				}
				
				System.out.println("������ �ε��� ��ȣ�� �Է����ּ���.");
				int idx2 = sc.nextInt();
				System.out.println("������ ���� �Է����ּ��� . ");
				int num = sc.nextInt();
				
				int check =0;
				for(int i=0; i<datas.length; i++) {
					if (i != idx2) {
						check ++;
					}
				}
				if(check == cnt) {
					System.out.println("�ε��� ���� �ùٸ��� �ʽ��ϴ�.");
					continue;
				}
				
				int temp[] = datas;
				datas = new int[cnt+1];
				for(int i =0; i<temp.length; i++) {
					if ( i == idx2) {
						for(int j=0; j<i; j++) {
							datas[j] = temp[j];
						}
						datas[i] = num;
						for(int j=i+1; j<datas.length; j++) {
							datas[j] = temp[j-1];
						}
					}
				}
				cnt++;
			}

		}//clear

	}

}
