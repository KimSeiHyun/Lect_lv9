package lv6;

import java.util.Scanner;

class Ex001_08 {
	final int SIZE = 9;
	int arr[] = new int[SIZE];
	int turn = 1;
	int win = 0;
}
public class Ex001_008 {

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
		Ex001_08 ex = new Ex001_08();
		
		while(true) {
			System.out.println("===틱택토===");
			for(int i=0; i<ex.SIZE; i++) {
				if(ex.arr[i] == 0) {
					System.out.print("[ ]");
				}
				if(ex.arr[i] == 1) {
					System.out.print("[O]");
				}
				if(ex.arr[i] == 2) {
					System.out.print("[X]");
				}
				if(i%3 == 2) {
					System.out.println();
				}
				
			}
			if(ex.win != 0) {
				System.out.printf("p%d턴의 승리입니다 !! ",ex.win);
				break;
			}
			System.out.printf("p%d턴의 차례입니다. 인덱스를 입력해주세요 . ",ex.turn);
			int idx = sc.nextInt();
			if(ex.arr[idx] == 0) {
				ex.arr[idx] = ex.turn;
			}
			else if(ex.arr[idx] != 0) {
				System.out.println("이미 선택된 인덱스입니다 .");
				continue;
			}
			
			//가로
			for(int i=0; i<ex.SIZE; i+=3) {
				if(ex.arr[i] == ex.turn && ex.arr[i+1] == ex.turn && ex.arr[i+2] == ex.turn) {
					ex.win = ex.turn;
				}
			}
			//세로
			for(int i=0; i<3; i++) {
				if(ex.arr[i] == ex.turn && ex.arr[i+3] == ex.turn && ex.arr[i+6] == ex.turn) {
					ex.win = ex.turn;
				}
			}
			//대각선 \
			if(ex.arr[0] == ex.turn && ex.arr[4] == ex.turn && ex.arr[8] == ex.turn) {
				ex.win = ex.turn;
			}
			//대각선 /
			if(ex.arr[2] == ex.turn && ex.arr[4] == ex.turn && ex.arr[6] == ex.turn) {
				ex.win = ex.turn;
			}

			ex.turn = ex.turn == 1? 2:1;
		}//while(true)

	}

}
