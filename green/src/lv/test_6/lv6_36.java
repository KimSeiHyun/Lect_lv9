package lv.test_6;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGame{
	
	Scanner sc = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	
	public void moveLeft() {
		if(this.player >0) {
			this.move[this.player] = 0;
			this.player --;
			this.move[this.player] = 8;
		}
	}
	
	public void moveRight() {
		if(this.player < this.move.length-1) {
			this.move[this.player] = 0;
			this.move[this.player+1] = 8;
			this.player++;
		}
	}
	
	public void print() {
		for(int i=0; i<this.move.length; i++) {
			if(this.move[i] == 0) System.out.print("_ ");
			if(this.move[i] == 8) System.out.print("옷 ");
		}System.out.println();
	}
	public void run() {
		while(true) {
			print();
			System.out.println("1.왼쪽  2.오른쪽");
			int move = sc.nextInt();
			if(move == 1) moveLeft(); 
			if(move == 2) moveRight();
		}
	}
	
	
}

public class lv6_36 {

	public static void main(String[] args) {
		NumberGame e = new NumberGame();
		e.run();

	}

}
