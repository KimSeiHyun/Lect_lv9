package lv.test_4;

import java.util.Scanner;

public class lv4_02 {

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
		
		
		while(true) {
		for(int i =0; i<game.length; i++) {
			System.out.print(game[i] + " ");
		}System.out.println();
		System.out.println("1.왼쪽   2.오른쪽   3.돌부수기 ");
		int sel = sc.nextInt();
		if(sel == 1) {
			
			for(int i=0; i<game.length; i++) {
				if(game[0] == 2) {
					break;
				}
				if(game[i] == 2 && game[i-1] == 1) {
					System.out.println("벽때무넹 못간당 ");
					break;
				}
				if(game[i] == 2) {
					game[i-1] =2;
					game[i] = 0;
				}
			}
		}
		if(sel == 2) {
			for(int i=0; i<game.length; i++) {
				if(game[8] == 2) {
					break;
				}
				if(game[i] == 2 && game[i+1] == 1) {
					System.out.println("벽때무넹 못간당 ");
					break;
				}
				if(game[i] == 2) {
					game[i+1] =2;
					game[i] = 0;
					break;
				}
			}
		}
		if(sel == 3) {
			for(int i=1; i<game.length-1; i++) {
				if(game[i] == 2 && game[i-1] == 1) {
					game[i-1] = 0;
					System.out.println("벽돌을 부쉇당 ");
				}
				if(game[i] == 2 && game[i+1] == 1) {
					game[i+1] = 0;
					System.out.println("벽돌을 부쉇당 ");
				}
			}
		}
		
		
		
		}//w
		

		
	}

}
