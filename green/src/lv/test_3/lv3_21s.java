package lv.test_3;

import java.util.Scanner;

public class lv3_21s {

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
		Scanner sc = new Scanner(System.in);
		int[] game = new int[9];
		int turn = 1;
		int win= 0;
		while(true) {
		System.out.println("-----ƽ����------");
		for(int i=0; i<9; i++) {
			if(game[i] == 1) {
				System.out.print("[O]");
			}
			if(game[i] == 2) {
				System.out.print("[X]");
			}
			if(game[i] == 0) {
				System.out.print("[ ]");
			}
			if(i%3 == 2) {
				System.out.println();
			}
		}System.out.println();
		
		System.out.printf("%d���� �����Դϴ� ",turn);
		int x = sc.nextInt()-1;
		int check = 0;
		if(game[x] != 0) {
			check = 1;
		}
		if(check == 1)  {
			System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
			continue;
		}
		game[x] = turn;
		
		for(int i=0; i<9; i+=3) {
			if(game[i] == turn && game[i+1] == turn && game[i+2] == turn) {
				win = turn;
			}
		}
		for(int i=0; i<3; i++) {
			if(game[i] == turn && game[i+3] == turn && game[i+6] == turn) {
				win = turn;
			}
		}
		if(game[2] == turn && game[4] == turn && game[6] == turn) {
			win = turn;
		}
		if(game[0] == turn && game[4] == turn && game[8] == turn) {
			win = turn;
		}
		

		if(win != 0) {
			System.out.printf("%d���� �¸��Դϴ� ! ",turn);
			break;
		}
		turn = turn == 1? 2 : 1;
		
		}//w

	}

}
