package lv.test_3;

import java.util.Scanner;

public class lv3_21 {

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
		Scanner sc = new Scanner(System.in);
		int[] game = new int[9];
		
		int turn = 1;
		int win = 0;
		while(true) {
		System.out.println("-----틱택토-----");
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
			System.out.println("1턴의 승리입니다.");
			break;
		}else if (win == 2){
			System.out.println("2턴의 승리입니다.");
			break;
		}
		System.out.printf("%d턴의 차례입니다.",turn);
		int x = sc.nextInt()-1;
		if(game[x] != 0) {
			System.out.println("이미 선택된 자리입니다.");
			continue;
		}
		if(turn == 1) {
			game[x] = 1;
		}
		else {
			game[x] = 2;
		}
		
		//가로
		for(int i=0; i<9; i+=3) {
			if(game[i] == 1 && game[i+1] == 1 && game[i+2] == 1) {
				win = 1;
			}
			if(game[i] == 2 && game[i+1] == 2 && game[i+2] == 2) {
				win = 2;
			}
		}
		//세로
		for(int i=0; i<3; i++) {
			if(game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) {
				win = 1;
			}
			if(game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) {
				win = 2;
			}
		}
		//대각선/
		if(game[2] == 1 && game[4] == 1 && game[6] == 1) {
			win = 1;
		}
		if(game[2] == 2 && game[4] == 2 && game[6] == 2) {
			win = 2;
		}
		
		//대각선\
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
