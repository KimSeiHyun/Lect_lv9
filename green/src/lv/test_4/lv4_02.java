package lv.test_4;

import java.util.Scanner;

public class lv4_02 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[2�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	  ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] game = {0, 1, 0, 0, 2, 0, 0, 1, 0};
		
		
		while(true) {
		for(int i =0; i<game.length; i++) {
			System.out.print(game[i] + " ");
		}System.out.println();
		System.out.println("1.����   2.������   3.���μ��� ");
		int sel = sc.nextInt();
		if(sel == 1) {
			
			for(int i=0; i<game.length; i++) {
				if(game[0] == 2) {
					break;
				}
				if(game[i] == 2 && game[i-1] == 1) {
					System.out.println("�������� ������ ");
					break;
				}
				if(game[i] == 2) {
					game[i-1] =2;
					game[i] = 0;
				}
			}
		}
		if(sel == 2) {
			for(int i=0; i<game.length; i++) {
				if(game[8] == 2) {
					break;
				}
				if(game[i] == 2 && game[i+1] == 1) {
					System.out.println("�������� ������ ");
					break;
				}
				if(game[i] == 2) {
					game[i+1] =2;
					game[i] = 0;
					break;
				}
			}
		}
		if(sel == 3) {
			for(int i=1; i<game.length-1; i++) {
				if(game[i] == 2 && game[i-1] == 1) {
					game[i-1] = 0;
					System.out.println("������ �Κb�� ");
				}
				if(game[i] == 2 && game[i+1] == 1) {
					game[i+1] = 0;
					System.out.println("������ �Κb�� ");
				}
			}
		}
		
		
		
		}//w
		

		
	}

}
