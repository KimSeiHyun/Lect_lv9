package lv3.test;

import java.util.Scanner;

public class Test03 {

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
		// 시작 09:11
		// 종료 10:45
		// 소요 1시간34분
		
		int arr[] = new int[9];
		int turn = 1;
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		
		System.out.println("----틱택토----");
		for(int i =0; i<9; i++) {
			if ( arr[i] == 0) {
				System.out.print("[ ]");
			}
			if (i%3 ==  2) {
				System.out.println();
			}		
		}
		while (t) {
			

			System.out.printf("player%d의 차례입니다.1~9까지 숫자를 입력해주세요 . " , turn);
			int player = sc.nextInt()-1;	
			if(player > 8 ) {
				System.out.println("범위를 벗어난 숫자입니다.");
				continue;
			}
			if(player < 0 ) {
				System.out.println("범위를 벗어난 숫자입니다.");
				continue;
			}
			if (arr[player] != 0 && turn == 1) {
				System.out.println("이미 사용된 숫자입니다");
				turn = 2;
			}
			else if (arr[player] != 0 && turn == 2) {
				System.out.println("이미 사용된 숫자입니다");
				turn = 1;
			}
			if(turn == 1) {
				arr[player] = 1;
				turn++;
			}
			else if ( turn == 2){
				arr[player] = 2;
				turn--;
			}
			

			for(int i =0; i<9; i++) {
				if ( arr[i] == 0) {
					System.out.print("[ ]");
				}
				else if (arr[i] == 1) {
					System.out.print("[O]");
				}
				else if (arr[i] == 2) {
					System.out.print("[X]");
				}
				if (i%3 ==  2) {
					System.out.println();
				}		
			}

			for(int i=0; i<9; i+=3) {
				if(arr[i] == 1 && arr[i+1] == 1 & arr[i+2] == 1) {
					System.out.println("player1의 승리입니다.");
					t = false;
				}
			}
			for(int i=0; i<3; i++) {
				if(arr[i] == 1 && arr[i+3] == 1 & arr[i+6] == 1) {
					System.out.println("player1의 승리입니다.");
					t = false;
				}
			}
			for(int i=0; i<1; i++) {
				if(arr[i] == 1 && arr[i+4] == 1 & arr[i+8] == 1) {
					System.out.println("player1의 승리입니다.");
					t = false;
				}
			}
			for(int i=2; i<3; i++) {
				if(arr[i] == 1 && arr[i+2] == 1 & arr[i+4] == 1) {
					System.out.println("player1의 승리입니다.");
					t = false;
				}
			}
			
			for(int i=0; i<9; i+=3) {
				if(arr[i] == 2 && arr[i+1] == 2 & arr[i+2] == 2) {
					System.out.println("player2의 승리입니다.");
					t = false;
				}
			}
			for(int i=0; i<3; i++) {
				if(arr[i] == 2 && arr[i+3] == 2 & arr[i+6] == 2) {
					System.out.println("player2의 승리입니다.");
					t = false;
				}
			}
			for(int i=0; i<1; i++) {
				if(arr[i] == 2 && arr[i+4] == 2 & arr[i+8] == 2) {
					System.out.println("player2의 승리입니다.");
					t = false;
				}
			}
			for(int i=2; i<3; i++) {
				if(arr[i] == 2 && arr[i+2] == 2 & arr[i+4] == 2) {
					System.out.println("player2의 승리입니다.");
					t = false;
				}
			}

		
		}
		

		
	}

}
