package lv4;

import java.util.Scanner;

public class Ex01_09tc {

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
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("�߰��� ��");
				int data = sc.nextInt();
				
				if(cnt > 0) { // ������ ���� �����ϴ� ���
					int temp[] = datas;		// {1,2,3}
					datas = new int[cnt+1]; // {0,0,0,0}
					for(int i=0; i<temp.length; i++) {
						datas[i] = temp[i];
					}
				}
				else { // ó�� �� ��� .  
					datas = new int[1];
				}
				datas[cnt] = data; //������ �ε����� �� ���� . 
				cnt ++;
			}
			else if(sel == 2) {
				
			}
			else if(sel == 3) {
				
			}
			else if(sel == 4) {
				
			}
			
		}//whiel 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
