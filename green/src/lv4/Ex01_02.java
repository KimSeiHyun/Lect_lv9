package lv4;

import java.util.Scanner;

public class Ex01_02 {

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
		//			  0  1  2  3  4  5  6  7  8
		boolean t = true;
		int idx = 0 ;
		while(t) {
			for (int i=0; i<9; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			System.out.println("1.����   2.������    3.���� ����!");
			int move = sc.nextInt();
			
			if(move == 1) {
				
				for(int i=0; i<9; i++) {
					if ( game[0] == 2) {
						System.out.println("���̻� �������� ������ �� ����..");
						break;
					}
					if(game[i] == 2 && game[i-1] == 1) {
						System.out.println("������ �΋H���� ������ ..");
						continue;
					}
					if(game[i] == 2) {
						game[i-1] = 2;
						game[i] = 0;
						break;
					}
				}
			}
			
			if(move == 2) {
				for(int i=0; i<9; i++) {
					if(game[i] == 2 && game[i+1] == 1) {
						System.out.println("������ �΋H���� ������ ..");
						continue;
					}
					if ( game[8] == 2) {
						System.out.println("���̻� ���������� ������ �� ����..");
						break;
					}
					if(game[i] == 2) {
						game[i+1] = 2;
						game[i] = 0;
						break;
					}
				}
			}
			
			if(move == 3) {
				
				for(int i=0; i<9; i++) {
					if(game[i] == 1 && game[i-1] == 2) {
						game[i] = 0;
						System.out.println("������ �μ˴� !!! ");
					}

					else if(game[i] == 1 && game[i+1] == 2) {
						game[i] =0;
						System.out.println("������ �μ˴� !!!");
					}



				}
			}
			
			
		}//while
		
		
	}

}
