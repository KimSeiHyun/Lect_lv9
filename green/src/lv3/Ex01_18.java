package lv3;

import java.util.Scanner;

public class Ex01_18 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[1�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	  ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 4. {0, 0, 2, 0, 0, 0, 0};  ==> ���� ==> {0, 2, 0, 0, 0, 0, 0};
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		//			  0  1  2  3  4  5  6
		int player = -1;

		System.out.println();

		boolean t = true;
		int idx = 0;
		while (t) {
			System.out.println("1.����  2.������  3.����");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				for(int i=0; i<7; i++) {
					if(game[i] == 2) {
						player = i;
					}
					System.out.print(game[i] + "  ");
				}
				
			}
			if (sel == 2) {
				
			}
			if (sel == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
			else {
				System.out.println("�߸��� �����Դϴ� . ");
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
