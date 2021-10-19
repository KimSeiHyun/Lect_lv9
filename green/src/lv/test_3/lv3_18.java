package lv.test_3;

import java.util.Scanner;

public class lv3_18 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[1단계]
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
		 * 4. {0, 0, 2, 0, 0, 0, 0};  ==> 왼쪽 ==> {0, 2, 0, 0, 0, 0, 0};
		 * 
		 */
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = -1;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
		}
		Scanner sc = new Scanner(System.in);
		while (true) {
			for(int i=0; i<game.length; i++) {
				System.out.print(game[i] + " ");
			}System.out.println();
		System.out.println("1.왼쪽  2.오른쪽");
		int sel = sc.nextInt();
		for(int i=0; i<game.length; i++) {
			if(sel == 1 && game[i] == 2) {
				if(game[0] == 2) {
					System.out.println("더이상 왼쪽으로 갈 수 없습니다.");
					break;
				}
				game[i-1] = 2;
				game[i] = 0;
			}
			if(sel == 2 && game[i] == 2) {
				if(game[6] == 2) {
					System.out.println("더이상 오른쪽으로 갈 수 없습니다.");
					break;
				}
				game[i+1] = 2;
				game[i] = 0;
				break;
			}
		}
		
		}//w
		
	}

}
