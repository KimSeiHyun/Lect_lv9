package lv.test_3;

import java.util.Scanner;

public class lv3_18s {

	public static void main(String[] args) {
		/*
		 * # �����̵�[1�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 4. {0, 0, 2, 0, 0, 0, 0};  ==> ���� ==> {0, 2, 0, 0, 0, 0, 0};
		 * 
		 */
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = -1;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.����  2.������");
		while(true) {
		for(int i=0; i<7; i++) {
			System.out.print(game[i] + " ");
		}System.out.println();
		
		int sel = sc.nextInt();
		
		
		if(sel == 1) {
			if(game[0] == 2) {
				System.out.println("���̻� �������� ����");
				continue;
			}
			for(int i=0; i<7; i++) {
				if(game[i] == 2) {
					game[i-1] = 2;
					game[i] = 0;
				}
			}
		}
		if(sel == 2) {
			if(game[6] == 2) {
				System.out.println("���̻� ���������� ����");
				continue;
			}
			for(int i=0; i<7; i++) {
				if(game[i] == 2) {
					game[i+1] = 2;
					game[i] = 0;
					break;
				}
			}
		}
			
			
		}//w

	}

}