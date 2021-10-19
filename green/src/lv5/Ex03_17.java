package lv5;

import java.util.Scanner;

public class Ex03_17 {

	public static void main(String[] args) {
		//�����̵��ǰ���
		int game[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,0}
				};
		int yx [][] = new int[10000][2];
		//����1) 0 �� �÷��̾��̴� 
		// 1) left 2)right 3)up 4)down 5)�ǰ���
		//��ȣ�� �Է¹ް� �ش���ġ�� �̵� ==> �̵��Ҷ� ���� ���� ��ȯ�Ѵ�. 
		// ��) 1 ==> 
		/*
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}		
		 */
		//����2) ��ȭ  ==> ��ĭ��ĭ�̵��Ҷ����� yx �� �迭�� �̵��Ѱ�θ� �����ߴٰ� 
		// 5���Է½� ==> �Դ���� �ǵ��ư��� �Ѵ�. 
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			for(int i=0; i<game.length; i++) {
				for(int j=0; j<game[i].length; j++) {
					System.out.print(game[i][j]  + " ");
				}
				System.out.println();
			}
			for(int i=0; i<cnt; i++) {
				for(int j=0; j<2; j++) {
					System.out.print(yx[i][j] + " ");
				}
				System.out.println();
			}System.out.println();
			System.out.println("cnt : " + cnt);
			System.out.println("1.left    2.right   3.up   4.down   5.�ǰ���");
			int sel = sc.nextInt();
			if(sel == 1) {
				for(int i=0; i<4; i++) {
					for(int j=1; j<4; j++) {
						if(game[0][0] == 0) break;
						if(game[i][j] == 0) {
							int temp = game[i][j-1];
							game[i][j-1]  = 0;
							game[i][j] = temp;
							yx[cnt][0] = i;
							yx[cnt][1] = j;
							cnt++;
							break;
						}
						if(game[i][0] == 0) {
							int temp = game[i-1][3];
							game[i-1][3] = 0;
							game[i][0] = temp;
							yx[cnt][0] = i;
							yx[cnt][1] = 0;
							cnt++;
							break;
						}
					}
				}
			}
			else if (sel == 2) {
				for(int i=0; i<4; i++) {
					int check = 0;
					for(int j=0; j<3; j++) {
						if(game[3][3] == 0) break;
						if(game[i][j] == 0) {
							int temp = game[i][j+1];
							game[i][j+1]  = 0;
							game[i][j] = temp;
							check = 1;
							yx[cnt][0] = i;
							yx[cnt][1] = j;
							cnt++;
							break;
						}
						if(game[i][3] == 0) {
							int temp = game[i+1][0];
							game[i+1][0] = 0;
							game[i][3] = temp;
							check = 1;
							yx[cnt][0] = i;
							yx[cnt][1] = 3;
							cnt++;
							break;
						}
					}
					if(check == 1) break;
				}
			}
			else if (sel == 3) {
				for(int i=1; i<4; i++) {
					for(int j=0; j<4; j++) {
						if(game[i][j] == 0) {
							int temp = game[i-1][j];
							game[i-1][j] = 0;
							game[i][j] = temp;
							yx[cnt][0] = i;
							yx[cnt][1] = j;
							cnt++;
						}
					}
				}
				
			}
			else if (sel == 4) {
				for(int i=0; i<3; i++) {
					int check = 0;
					for(int j=0; j<4; j++) {
						if(game[i][j] == 0) {
							int temp = game[i+1][j];
							game[i+1][j] = 0;
							game[i][j] = temp;
							check = 1;
							yx[cnt][0] = i;
							yx[cnt][1] = j;
							cnt++;
							break;
						}
					}
					if(check == 1) break;
				}
			}
			else if (sel == 5) {
				if(cnt > 0 ) {
				int a = yx[cnt-1][0];
				int b = yx[cnt-1][1];
				int temp = game[a][b];
				
				for(int i=0; i<4; i++) {
					int check = 0;
					for(int j=0; j<4; j++) {
						if(game[i][j] == 0) {
							game[a][b] = 0;
							game[i][j] = temp;
							yx[cnt-1][0] = 0;
							yx[cnt-1][1] = 0;
							cnt --;
							check = 1;
							break;
						}
					}
					if(check == 1) break;
				}
				}
			}
			

			
		}//while

	}

}
