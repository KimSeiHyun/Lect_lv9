package lv.test_4;

import java.util.Scanner;

public class lv4_16s {

	public static void main(String[] args) {
		/*
		 * # ��ٸ� ����
		 * 1. �ε��� 0~4�� �ϳ������Ѵ�. 
		 * 2. ���� 0 �� ������ �׳� �Ʒ��� ��������.
		 * 3. ���� 1 �� ������ ���������� �̵��� ��������.
		 * 4. ���� 2 �� ������ �������� �̵��� ��������.
		 * 5. ������ �޴� ��� 
		 */
		Scanner sc = new Scanner(System.in);
		String menu[] = {"�����" , "���" ,"¥���" , "�̸�" , "�����"};
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,0,0},
				{0,1,2,0,0},
				{1,2,0,0,0},
				{0,0,0,1,2},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		
		System.out.println(" 0  1  2  3  4");
		for(int i=0; i<ladder.length; i++) {
			for(int j=0; j<ladder[i].length; j++) {
				if(ladder[i][j] == 0) {
					System.out.print(" �� ");
				}else if(ladder[i][j] == 1) {
					System.out.print(" ����");
				}else if(ladder[i][j] == 2) {
					System.out.print("���� ");
				}
			}
			System.out.println();
		}
		System.out.println(" 0  1  2  3  4");
		
		System.out.println("��ٸ��� �ϳ� ����ּ���");
		int num = sc.nextInt();
		x = num;
		
		for(int i=0; i<ladder.length; i++) {
			if(ladder[y][x] == 0) {
				y++;
			}
			else if(ladder[y][x] == 1) {
				x++;
				y++;
			}
			else if(ladder[y][x] == 2) {
				x--;
				y++;
			}
		}
		System.out.println(menu[x]);

	}

}
