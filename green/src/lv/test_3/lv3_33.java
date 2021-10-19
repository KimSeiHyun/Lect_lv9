package lv.test_3;

import java.util.Scanner;

public class lv3_33 {

	public static void main(String[] args) {
		/* 
		 * # 틱택토
		 * === 틱택토 ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]인덱스 입력 : 6
		 * === 틱택토 ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]승리
		 * 
		 */
		int[] game = new int[9];
		Scanner sc = new Scanner(System.in);
		
		int turn = 1;
		int win = 0;
		while(true) {
		for(int i=0; i<9; i++) {
			if(game[i] == 1) {
				System.out.print("[O]");
			}
			if(game[i] == 2) {
				System.out.print("[X]");
			}
			if(game[i] == 0) {
				System.out.print("[ ] ");
			}
			if(i%3 == 2) {
				System.out.println();
			}
		}
		System.out.printf("%d턴의 차례입니다.",turn);
		int num = sc.nextInt()-1;
		if(game[num] != 0) {
			System.out.println("이미 고른 자리입니다.");
			continue;
		}
		game[num] = turn;
		
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
			System.out.printf("승자는 %d턴 입니다 .",turn);
			break;
		}

		turn = turn == 1? 2: 1;
		}//w

		
	}

}
