package lv.test_3;

import java.util.Scanner;

public class lv3_21 {

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
		int win = 0;
		while(true) {
		System.out.println("-----ƽ����-----");
		for(int i=0; i<9; i++) {
			if(game[i] == 0) {
			System.out.print("[ ]");
			}
			if(game[i] == 1) {
			System.out.print("[O]");
			}
			if(game[i] == 2) {
			System.out.print("[X]");
			}
			if(i%3 == 2) {
				System.out.println();
			}
		}
		if(win == 1) {
			System.out.println("1���� �¸��Դϴ�.");
			break;
		}else if (win == 2){
			System.out.println("2���� �¸��Դϴ�.");
			break;
		}
		System.out.printf("%d���� �����Դϴ�.",turn);
		int x = sc.nextInt()-1;
		if(game[x] != 0) {
			System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
			continue;
		}
		if(turn == 1) {
			game[x] = 1;
		}
		else {
			game[x] = 2;
		}
		
		//����
		for(int i=0; i<9; i+=3) {
			if(game[i] == 1 && game[i+1] == 1 && game[i+2] == 1) {
				win = 1;
			}
			if(game[i] == 2 && game[i+1] == 2 && game[i+2] == 2) {
				win = 2;
			}
		}
		//����
		for(int i=0; i<3; i++) {
			if(game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) {
				win = 1;
			}
			if(game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) {
				win = 2;
			}
		}
		//�밢��/
		if(game[2] == 1 && game[4] == 1 && game[6] == 1) {
			win = 1;
		}
		if(game[2] == 2 && game[4] == 2 && game[6] == 2) {
			win = 2;
		}
		
		//�밢��\
		if(game[0] == 1 && game[4] == 1 && game[8] == 1) {
			win = 1;
		}
		if(game[0] == 2 && game[4] == 2 && game[8] == 2) {
			win = 2;
		}
		
		turn = turn == 1? 2: 1;
		}//w

	}

}
