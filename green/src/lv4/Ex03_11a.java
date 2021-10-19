package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex03_11a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		int[][] map = new int[SIZE][SIZE];
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		// �� ��ġ
		System.out.print(">>>��ġ�� ���� ������ �Է��ϼ��� : ");
		int cnt =0;
		wallCount = sc.nextInt();
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++ ) {
				if(map[i][j] ==0) {
					map[i][j] = 1; 
					cnt++;
				}
				if(cnt == wallCount) {
					break;
				}
			}
			if(cnt == wallCount) {
				break;
			}
		}
		
		// �� ��ġ
			cnt = 0;
			for(int i=0; i<7; i++) {
				for(int j=0; j<7; j++ ) {
					if(map[i][j] == 0) {
						map[i][j] = 2;
						cnt ++;
					}
					if(cnt == 1) {
						break;
					}
				}
				if(cnt == 1) {
					break;
				}			
			}
			
			
		// ��� ��ġ
			cnt = 0;
			for(int i=0; i<7; i++) {
				for(int j=0; j<7; j++ ) {
					if(map[i][j] == 0) {
						map[i][j] = 3;
						cnt ++;
					}
					if(cnt == 1) {
						break;
					}
				}
				if(cnt == 1) {
					break;
				}			
			}

		
		// �÷��̾� ��ġ	
			cnt = 0;
			for(int i=0; i<7; i++) {
				for(int j=0; j<7; j++ ) {
					if(map[i][j] == 0) {
						map[i][j] = 4;
						cnt ++;
					}
					if(cnt == 1) {
						break;
					}
				}
				if(cnt == 1) {
					break;
				}			
			}
			
		//��ġ�Ȱ͵� ����
			int t2= 0;
			while (t2 < 1) {
			int t = 0;
			while (t < 50) {
				int temp = 0;			
				int a = rn.nextInt(7); // 2 
				int b = rn.nextInt(7); // 3 
				int c = rn.nextInt(7); // 6 
				int d = rn.nextInt(7); // 6 
				temp = map[a][b];
				map[a][b] = map[c][d];
				map[c][d] = temp;
				t++;
			}
			for(int i=1; i<5; i++) {
				for(int j=1; j<5; j++ ) {
					if(map[i][j] == 2 
							&& map[j-1][i] != 1 && map[j+1][i] != 1
							&& map[i-1][j] != 1 && map[i+1][j] != 1) {
						t2 = 1;
					}
				}
			}
			}
			
		// ���� ����
			int win =0;
			int temp = 0; 
		while(true) {
			int check = -1;
			// ȭ�� ���
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<7; j++) {
					if(map[i][j] == 1) {
						System.out.print("�� ");
					}
					if(map[i][j] == 2) {
						System.out.print("�� ");
					}
					if(map[i][j] == 3) {
						System.out.print("�� ");
					}
					if(map[i][j] == 4) {
						System.out.print("�� ");
					}
					if(map[i][j] == 0) {
						System.out.print("* ");
					}
				}
				System.out.println();
			}
			//finish
			if (win == 1) {
				System.out.println("game clear ! ");
				break;
			}
			win =0;
			System.out.println("1.��  2.��  3.��  4.��");
			int move = sc.nextInt();
			if(temp == 0) { // temp ������ �÷��̾ ��븦 ���������� ��밡 ������� �ʱ����� temp ��� .
			if(move == 1) {//��
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++ ) {
						if(map[0][j] == 4) {
							break;
						}
						if(map[i][j] == 4  && map[i-1][j] == 1) {
							break;
						}
						if(map[0][j] == 2 && map[1][j] == 4) {
							break;
						}
						if(map[i][j] == 4 && map[i-1][j] == 2 && map[i-2][j] == 1) {
							break;
						}
						if(map[i][j] == 4 && map[i-1][j] == 3) {
							temp = 3;
						}
						if(map[i][j] == 4 && map[i-1][j] == 2 && map[i-2][j] == 3 ) {
							win = 1;
						}
						if(map[i][j] == 4 && map[i-1][j] == 2 ) {
							map[i-2][j] = 2;
							map[i-1][j] = 4;
							map[i][j] = 0;
						}
						if(map[i][j] == 4) {
							map[i-1][j] =4;
							map[i][j] = 0;
						}
					}
				}

			}
			if(move == 2) {//��
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++ ) {
						if(map[6][j] == 4) {
							break;
						}
						if(map[i][j] == 4  && map[i+1][j] == 1) {
							break;
						}
						if(map[6][j] == 2 && map[5][j] == 4) {
							break;
						}
						if(map[i][j] == 4 && map[i+1][j] == 2 && map[i+2][j] == 1) {
							break;
						}
						if(map[i][j] == 4 && map[i+1][j] == 3) {
							temp = 3;
						}
						if(map[i][j] == 4 && map[i+1][j] == 2 && map[i+2][j] == 3 ) {
							win = 1;
						}
						if(map[i][j] == 4 && map[i+1][j] == 2 ) {
							map[i+2][j] = 2;
							map[i+1][j] = 4;
							map[i][j] = 0;
							check = 1;
							break;
						}
						if(map[i][j] == 4) {
							map[i+1][j] =4;
							map[i][j] = 0;
							check = 1;
							break;
						}
					}
					if(check == 1) {
						break;
					}
				}
			}
			if(move == 3) {//��
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++ ) {
						if(map[i][0] == 4) {
							break;
						}
						if(map[i][j] == 4  && map[i][j-1] == 1) {
							break;
						}
						if(map[i][0] == 2 && map[i][1] == 4) {
							break;
						}
						if(map[i][j] == 4 && map[i][j-1] == 2 && map[i][j-2] == 1) {
							break;
						}
						if(map[i][j] == 4 && map[i][j-1] == 3) {
							temp = 3;
						}
						if(map[i][j] == 4 && map[i][j-1] == 2 && map[i][j-2] == 3 ) {
							win = 1;
						}
						if(map[i][j] == 4 && map[i][j-1] == 2 ) {
							map[i][j-2] = 2;
							map[i][j-1] = 4;
							map[i][j] = 0;
						}
						if(map[i][j] == 4) {
							map[i][j-1] =4;
							map[i][j] = 0;
						}

					}
				}
			}
			if(move == 4) {//��
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++ ) {
						if(map[i][6] == 4) {
							break;
						}
						if(map[i][j] == 4  && map[i][j+1] == 1) {
							break;
						}
						if(map[i][6] == 2 && map[i][5] == 4) {
							break;
						}
						if(map[i][j] == 4 && map[i][j+1] == 2 && map[i][j+2] == 1) {
							break;
						}
						if(map[i][j] == 4 && map[i][j+1] == 3) {
							temp = 3;
						}
						if(map[i][j] == 4 && map[i][j+1] == 2 && map[i][j+2] == 3 ) {
							win = 1;
						}
						if(map[i][j] == 4 && map[i][j+1] == 2 ) {
							map[i][j+2] = 2;
							map[i][j+1] = 4;
							map[i][j] = 0;
							check = 1;
							break;
						}
						if(map[i][j] == 4) {
							map[i][j+1] =4;
							map[i][j] = 0;
							check = 1;
							break;
						}
					}
					if(check == 1) {
						break;
					}
				}
			}
			if(temp != 0) {
				continue;
			}
			}
			if(temp != 0) {// temp ������ �÷��̾ ��븦 ���������� ��밡 ������� �ʱ����� temp ��� .
			if(move == 1) {//��
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++ ) {
						if(map[0][j] == 4) {
							break;
						}
						if(map[i][j] == 4  && map[i-1][j] == 1) {
							break;
						}
						if(map[0][j] == 2 && map[1][j] == 4) {
							break;
						}
						if(map[i][j] == 4 && map[i-1][j] == 2 && map[i-2][j] == 1) {
							break;
						}
						if(map[i][j] == 4 && map[i-1][j] == 2 && map[i-2][j] == 3 ) {
							win = 1;
						}
						if(map[i][j] == 4 && map[i-1][j] == 2 ) {
							map[i-2][j] = 2;
							map[i-1][j] = 4;
							map[i][j] = 3;
							temp=0;
						}
						if(map[i][j] == 4) {
							map[i-1][j] =4;
							map[i][j] = 3;
							temp = 0;
						}
					}
				}
			}
			if(move == 2) {//��
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++ ) {
						if(map[6][j] == 4) {
							break;
						}
						if(map[i][j] == 4  && map[i+1][j] == 1) {
							break;
						}
						if(map[6][j] == 2 && map[5][j] == 4) {
							break;
						}
						if(map[i][j] == 4 && map[i+1][j] == 2 && map[i+2][j] == 1) {
							break;
						}
						if(map[i][j] == 4 && map[i+1][j] == 2 && map[i+2][j] == 3 ) {
							win = 1;
						}
						if(map[i][j] == 4 && map[i+1][j] == 2 ) {
							map[i+2][j] = 2;
							map[i+1][j] = 4;
							map[i][j] = 3;
							temp = 0;
							check = 1;
							break;
						}
						if(map[i][j] == 4) {
							map[i+1][j] =4;
							map[i][j] = 3;
							temp = 0;
							check = 1;
							break;
						}
					}
					if(check == 1) {
						break;
					}
				}
			}
			if(move == 3) {//��
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++ ) {
						if(map[i][0] == 4) {
							break;
						}
						if(map[i][j] == 4  && map[i][j-1] == 1) {
							break;
						}
						if(map[i][0] == 2 && map[i][1] == 4) {
							break;
						}
						if(map[i][j] == 4 && map[i][j-1] == 2 && map[i][j-2] == 1) {
							break;
						}
						if(map[i][j] == 4 && map[i][j-1] == 2 && map[i][j-2] == 3 ) {
							win = 1;
						}
						if(map[i][j] == 4 && map[i][j-1] == 2 ) {
							map[i][j-2] = 2;
							map[i][j-1] = 4;
							map[i][j] = 3;
							temp=0;
						}
						if(map[i][j] == 4) {
							map[i][j-1] =4;
							map[i][j] = 3;
							temp=0;
						}

					}
				}
			}
			if(move == 4) {//��
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++ ) {
						if(map[i][6] == 4) {
							break;
						}
						if(map[i][j] == 4  && map[i][j+1] == 1) {
							break;
						}
						if(map[i][6] == 2 && map[i][5] == 4) {
							break;
						}
						if(map[i][j] == 4 && map[i][j+1] == 2 && map[i][j+2] == 1) {
							break;
						}
						if(map[i][j] == 4 && map[i][j+1] == 2 && map[i][j+2] == 3 ) {
							win = 1;
						}
						if(map[i][j] == 4 && map[i][j+1] == 2 ) {
							map[i][j+2] = 2;
							map[i][j+1] = 4;
							map[i][j] = 3;
							check = 1;
							temp = 0;
							break;
						}
						if(map[i][j] == 4) {
							map[i][j+1] =4;
							map[i][j] = 3;
							check = 1;
							temp = 0;
							break;
						}
					}
					if(check == 1) {
						break;
					}
				}
			}
			}
		}//c
		
	}

}
