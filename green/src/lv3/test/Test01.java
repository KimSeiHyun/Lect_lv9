package lv3.test;

import java.util.Scanner;

public class Test01 {

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
		// ���� 01:41
		// ���� 02:02
		// �ҿ� 21��
		
		int arr[] = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		int money = 0 ;
		while (t) {
			System.out.println("------��ȭ��------");
			System.out.println("1.����");
			System.out.println("2.����");
			for(int i = 0; i<7; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("�����ؾߵ� �ݾ� : " + money);
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("���ϴ� �¼��� �Է����ּ���.(0~7)");
				int a = sc.nextInt();
			for(int i =0; i<7; i++) {
				if ( i == a) { 
					arr[i] ++;
					money += 12000;
				}
				if(arr[i] == 2) {
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ� .");
					arr[i] --;
					money -= 12000;
				}
			}
			}
			if ( sel == 2 ) {
				System.out.println("���Ÿ� �����մϴ� .");
				break; 
			}
			
			else {
				System.out.println("�߸��� �޴��Դϴ�.");
			}

		}
		
	}

}
