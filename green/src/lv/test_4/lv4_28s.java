package lv.test_4;

import java.util.Scanner;

public class lv4_28s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
		};

		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;

		int turn = 1;

		int win = 0;

		boolean run = true;
		while (run) {
			for(int i=0; i<omok.length; i++) {
				for(int j=0; j<omok[i].length; j++) {
					if(omok[i][j] == 1) System.out.print("�� ");
					if(omok[i][j] == 2) System.out.print("�� ");
					if(omok[i][j] == 0) System.out.print(omok[i][j] + " ");
				}
				System.out.println();
			}
			if(win != 0) {
				System.out.printf("p%d�� �¸�!! ",win);
				break;
			}
			System.out.printf("p%d�� �����Դϴ�.\n",turn);
			System.out.print("y��ǥ �Է� : ");
			int y = sc.nextInt();
			System.out.print("x��ǥ �Է� : ");
			int x = sc.nextInt();
			if(x >= 0 && x < size && y >= 0 && y <size) {
				if(omok[y][x] != 0) {
					System.out.println("�̹� ���õ��ڸ��Դϴ�.");
					continue;
				}
				if(omok[y][x] == 0) omok[y][x] = turn;
				
			}else {
				System.out.println("������ ������ϴ�.");
				continue;
			}
			
			//����
			for(int i=0; i<size; i++) {
				for(int j=0; j<size-4; j++) {
					int cnt = 0;
					for(int k=j; k<j+5; k++) {
						if(j ==0 ) {
							if(omok[i][k] == turn&& omok[i][j+5] != turn)
							cnt ++;
						}else if(j == size-5 ) {
							if(omok[i][k] == turn && omok[i][j-1] != turn)
							cnt ++;
						}else {
							if(omok[i][j-1] != turn && omok[i][j+5] != turn && omok[i][k] == turn) {
								cnt++;
							}
								
						}
						if(omok[i][k] != turn ) cnt = 0;
						if(cnt == 5) win = turn;
					}
				}
			}
			//����
			for(int i=0; i<size-4; i++) {
				for(int j=0; j<size; j++) {
					int cnt = 0;
					for(int k=i; k<i+5; k++) {
						if(i ==0 ) {
							if(omok[k][j] == turn&& omok[i+5][j] != turn)
							cnt ++;
						}else if(i == size-5 ) {
							if(omok[k][j] == turn && omok[i-1][j] != turn)
							cnt ++;
						}else {
							if(omok[i-1][j] != turn && omok[i+5][j] != turn && omok[k][j] == turn) {
								cnt++;
							}
						}
						if(omok[k][j] != turn ) cnt = 0;
						if(cnt == 5) win = turn;
					}
				}
			}
			
			//�밢\
			for(int i=0; i<size-4; i++) {
					int cnt = 0;
					for(int k=i; k<i+5; k++) {
						if(i ==0 ) {
							if(omok[k][k] == turn&& omok[i+5][i+5] != turn)
							cnt ++;
						}else if(i == size-5 ) {
							if(omok[k][k] == turn && omok[i-1][i-1] != turn)
							cnt ++;
						}else {
							if(omok[i-1][i-1] != turn && omok[i+5][i+5] != turn && omok[k][k] == turn) {
								cnt++;
							}
						}
						if(omok[k][k] != turn ) cnt = 0;
						if(cnt == 5) win = turn;
					}
			}
			//�밢/
			for(int i=0; i<size-4; i++) {
				int cnt = 0;
				for(int k=i; k<i+5; k++) {
					if(i ==0 ) {
						if(omok[k][9-k] == turn&& omok[5][4] != turn)
						cnt ++;
					}else if(i == size-5 ) {
						if(omok[k][9-k] == turn && omok[4][5] != turn)
						cnt ++;
					}else {
						if(omok[i-1][9-i] != turn && omok[i+5][9-i] != turn && omok[k][9-k] == turn) {
							cnt++;
						}
					}
					if(omok[k][9-k] != turn ) cnt = 0;
					if(cnt == 5) win = turn;
				}
		}
			turn = turn == 2 ? 1 : 2 ;
		}
 
	


	}

}