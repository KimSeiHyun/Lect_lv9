package lv4;

import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[2단계]
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	  숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
		 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
		 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] game = {0, 1, 0, 0, 2, 0, 0, 1, 0};
		//			  0  1  2  3  4  5  6  7  8
		boolean t = true;
		int idx = 0 ;
		while(t) {
			for (int i=0; i<9; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			System.out.println("1.왼쪽   2.오른쪽    3.벽돌 격파!");
			int move = sc.nextInt();
			
			if(move == 1) {
				
				for(int i=0; i<9; i++) {
					if ( game[0] == 2) {
						System.out.println("더이상 왼쪽으로 움직일 수 없다..");
						break;
					}
					if(game[i] == 2 && game[i-1] == 1) {
						System.out.println("벽돌에 부딫혔다 아프다 ..");
						continue;
					}
					if(game[i] == 2) {
						game[i-1] = 2;
						game[i] = 0;
						break;
					}
				}
			}
			
			if(move == 2) {
				for(int i=0; i<9; i++) {
					if(game[i] == 2 && game[i+1] == 1) {
						System.out.println("벽돌에 부딫혔다 아프다 ..");
						continue;
					}
					if ( game[8] == 2) {
						System.out.println("더이상 오른쪽으로 움직일 수 없다..");
						break;
					}
					if(game[i] == 2) {
						game[i+1] = 2;
						game[i] = 0;
						break;
					}
				}
			}
			
			if(move == 3) {
				
				for(int i=0; i<9; i++) {
					if(game[i] == 1 && game[i-1] == 2) {
						game[i] = 0;
						System.out.println("벽돌을 부셧다 !!! ");
					}

					else if(game[i] == 1 && game[i+1] == 2) {
						game[i] =0;
						System.out.println("벽돌을 부셧다 !!!");
					}



				}
			}
			
			
		}//while
		
		
	}

}
