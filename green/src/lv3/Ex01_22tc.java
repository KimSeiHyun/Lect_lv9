package lv3;

import java.util.Scanner;

public class Ex01_22tc {

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
		//0  1  2
		//3  4  5
		//6  7  8 
		
		int[] game = new int[9];
		Scanner sc = new Scanner(System.in);
				
		int win = 0; // 1 : p1 / 2 : p2 
		
		int turn = 1; // 1 2 1 2 ....
		while (true) {
			//출력 
			
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
			System.out.printf("player%d 좌표입력 : ", turn);
			int idx = sc.nextInt()-1;
			
			if(game[idx] != 0) {
				System.out.println("이미 선택한 좌표입니다.");
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
			
			
			//가로
			int who = turn == 1 ? 2 : 1; // turn을 반전
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
			
			//세로
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
			
			//대각선 ( 오른쪽에서 왼쪽 ) 
			int cnt = 0;
			for(int i=0; i<9; i+=3+1) {
				if(game[i] == who) {
					cnt ++;
				}
			}
			if(cnt == 3) {
				win = who;
			}
			//3+1이라고 써놓은 이유는 지금 이 예제는 3 * 3 이지만 
			//필드가 커지면 커질수록 숫자로만 표기하면 복잡하기 때문 .
			// 그래서 3 이라는 변수를 여기선 지정하지 않았지만
			// 필드가 커지면 커질스록 3이라는 숫자도 커질텐데
			// 특정 변수로 지정하고 하면 편함 .
			
			//대각선 (왼쪽에서 오른쪽 )
			
			cnt = 0 ;
			for(int i=3-1; i<9; i+=3-1) {
				if(game[i] == who) {
					cnt ++;
				}
			}
			if(cnt == 3 ) {
				win = who;
			}
			
			

			
			// 종료조건
			if(win == 1) {
				System.out.println("player1 승리 !");
				break;
			}
			if(win == 2) {
				System.out.println("player2 승리 !");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
