package lv3;

import java.util.Scanner;

public class Ex01_22tc {

	public static void main(String[] args) {
		/* 
		 * # ƽ����
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]�ε��� �Է� : 6
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]�¸�
		 * 
		 */
		//0  1  2
		//3  4  5
		//6  7  8 
		
		int[] game = new int[9];
		Scanner sc = new Scanner(System.in);
				
		int win = 0; // 1 : p1 / 2 : p2 
		
		int turn = 1; // 1 2 1 2 ....
		while (true) {
			//��� 
			
			for(int i=0; i<9; i++) {
				if(game[i] == 1) {
					System.out.print("O ");
					
				}
				else if (game[i] == 2) {
					System.out.print("X ");
					
				}
				else {
					System.out.print(i+1 + " ");
				}
				if (i %3 == 2 ) {
					System.out.println();
				}
			}
			System.out.printf("player%d ��ǥ�Է� : ", turn);
			int idx = sc.nextInt()-1;
			
			if(game[idx] != 0) {
				System.out.println("�̹� ������ ��ǥ�Դϴ�.");
			}
			else {
				game[idx] = turn; // 1or2
				if(turn == 1) {
					turn++;
				}
				else {
					turn --;
				}
			}
			
			
			//����
			int who = turn == 1 ? 2 : 1; // turn�� ����
			for (int i = 0; i < 9; i += 3) {
				int cnt = 0;
				for (int j = 0; j < 3; j++) {
					if (game[i + j] == who) {
						cnt++;
					}
				}
				if (cnt == 3) {
					win = who;
				}
			}
			
			//����
			for (int i = 0; i < 3; i++) {
				int cnt = 0;
				for (int j = 0; j < 3; j++) {
					if (game[i + j * 3] == who) {
						cnt++;
					}
				}
				if (cnt == 3) {
					win = who;
				}
			}
			
			//�밢�� ( �����ʿ��� ���� ) 
			int cnt = 0;
			for(int i=0; i<9; i+=3+1) {
				if(game[i] == who) {
					cnt ++;
				}
			}
			if(cnt == 3) {
				win = who;
			}
			//3+1�̶�� ����� ������ ���� �� ������ 3 * 3 ������ 
			//�ʵ尡 Ŀ���� Ŀ������ ���ڷθ� ǥ���ϸ� �����ϱ� ���� .
			// �׷��� 3 �̶�� ������ ���⼱ �������� �ʾ�����
			// �ʵ尡 Ŀ���� Ŀ������ 3�̶�� ���ڵ� Ŀ���ٵ�
			// Ư�� ������ �����ϰ� �ϸ� ���� .
			
			//�밢�� (���ʿ��� ������ )
			
			cnt = 0 ;
			for(int i=3-1; i<9; i+=3-1) {
				if(game[i] == who) {
					cnt ++;
				}
			}
			if(cnt == 3 ) {
				win = who;
			}
			
			

			
			// ��������
			if(win == 1) {
				System.out.println("player1 �¸� !");
				break;
			}
			if(win == 2) {
				System.out.println("player2 �¸� !");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
