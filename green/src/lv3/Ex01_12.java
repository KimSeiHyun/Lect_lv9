package lv3;

import java.util.Scanner;

public class Ex01_12 {

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

				Scanner scan = new Scanner(System.in);
				
				int[] seat = new int[7];
				boolean run = true;
				int cnt = 0;
				while(run) {
					System.out.println("=��ȭ��=");
					System.out.println("1.�¼�����");
					System.out.println("2.����");
					System.out.println("�޴� ���� : ");
					System.out.println("========");
					System.out.println("�ѱ޾� :" +cnt*12000);
					int sel = scan.nextInt();
					if(sel == 1) {
						
						System.out.println("�¼����� : 0~7");
						int index = scan.nextInt();
						for (int i=0; i<7; i ++) {		

							if ( index == i) {
								seat[i] += 1;
								cnt++;
							}
							if ( seat[i] == 2) {
								seat[i] -= 1;
								cnt --;
								System.out.println("�̹� ����� �ڸ��Դϴ�.");
							}


							 if (index > 7) {
								System.out.println("�߸��� �����Դϴ�.");
								break;
							}

						}

					}
					else if(sel == 2) {
						System.out.println("Ƽ������ �����մϴ�.");
						run = false;
					}		

					for( int i=0; i<7; i++) {
						System.out.print(seat[i]+ "  ");
					}
				}

		
	}
}
