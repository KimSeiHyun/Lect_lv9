package lv.test_3;

import java.util.Scanner;

public class lv3_31 {

	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼�����
		 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
		 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
		 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
		 * 4. �� �¼��� ���� ������ 12000���̴�.
		 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
		 * ��)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * �¼����� : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
		 * ----------------------
		 * ����� : 24000��
		 */
		Scanner sc = new Scanner(System.in);		
		int[] seat = new int[7];
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			for(int i=0; i<seat.length; i++) {
				System.out.print(seat[i] + " ");
			}System.out.println();
			System.out.println("=��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				
				System.out.println("������ �¼��� �������ּ��� .");
				int x = sc.nextInt();
				if(seat[x] == 1) {
					System.out.println("�̹� ����� �ڸ��Դϴ�.");
					continue;
				}
				seat[x] = 1;
				cnt ++;
			}
			else if(sel == 2) {
				System.out.println("���� : "+cnt *12000);
				run = false;
			}
		}//w

		
	}

}
