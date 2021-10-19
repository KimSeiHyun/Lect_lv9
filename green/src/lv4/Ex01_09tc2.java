package lv4;

import java.util.Scanner;

public class Ex01_09tc2 {

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
		
		while (true) {
			System.out.println("cnt : " + cnt);
			if(datas != null) {
				for(int i =0; i<datas.length; i++) {
					System.out.print(datas[i] + " ");
				}
				System.out.println();
			}
			System.out.println("1. �߰�");
			System.out.println("2. ����(�ε���)");
			System.out.println("3. ����(��)");
			System.out.println("4. ����");
			System.out.print("�޴� : ");
			int sel = sc.nextInt();
			
			if(sel ==1 ) {
				System.out.print("�߰��� �� �Է� : ");
				int data = sc.nextInt();
				
				int temp[] = datas;
				datas = new int[cnt+1];
				if(cnt >0) {
					for(int i=0; i<temp.length; i++) { // �� �ø��� 
						datas[i] = temp[i];
					}
				}
				datas[cnt] = data;
				cnt++;
			}
			
			else if(sel == 2) {
				System.out.print("������ �ε��� �Է� : ");
				int delIdx = sc.nextInt();
				
				if(datas != null && delIdx >= 0 && delIdx < cnt ) {
					if(cnt == 1) {
						datas = null;
					}
					else {
						int temp[] = datas;
						datas = new int[cnt-1];
						
						int idx=0; // datas�� �ε��� 
						for(int i =0; i<temp.length; i++) {
							if(i != delIdx) {
								datas[idx] = temp[i];
								idx ++;
							}
						}
					}
					cnt --;
				}
			}
			
			else if(sel == 3) {
				if(datas != null) {
				System.out.print("������ �� �Է� : ");
				int delData = sc.nextInt();
				
				int delCnt = 0;
				for(int i=0; i<datas.length; i++) {
					if(delData == datas[i]) {
						delCnt ++;
					}
				}
				
				int temp[] = datas;
				datas = new int[cnt-delCnt];
				
				int idx = 0;
				for(int i=0; i<temp.length; i++) {
					if(temp[i] != delData) {
						datas[idx] = temp[i];
						idx ++;
					}
				}
				cnt -= delCnt;
				//temp == null; // temp�� �޸� ���� > �������� (G.C �����ϱ� ���� ) 
				// [�ڹ��� ������� ���� �ڵ����� ��������]
				}
				else {
					System.out.println("�����ϴ� ���� �����ϴ� . ");
				}
			}
			else if(sel == 4) {
				System.out.println("������ �ε��� �Է� :");
				int idx = sc.nextInt();
				
				if(datas != null && idx >= 0 && idx < cnt-1) {
					System.out.println("������ �� �Է� : ");
					int data = sc.nextInt();
					
					int temp[] = datas;
					datas = new int[cnt+1];
					
					for(int i=0; i<temp.length; i++) {
						if(i < idx) {
							datas[i] = temp[i];
						}
						else {
							datas[i+1] = temp[i];
						}
					}
					datas[idx] = data;
					cnt++;
				}
			}
			
			
		}//while 

		
	}

}
