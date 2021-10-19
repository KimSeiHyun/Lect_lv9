package lv.test_6;

import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */


class Ex08s{
	private int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	
	public void print() {
		for(int i=0; i<this.game.length; i++) {
			if(this.game[i] == 0) System.out.print("_ ");
			if(this.game[i] == 1) System.out.print("■ ");
			if(this.game[i] == 2) System.out.print("옷 ");
		}System.out.println();
	}
	
	public void left() {
		for(int i=1; i<this.game.length; i++) {
			if(this.game[i] == 2 && this.game[i-1] == 0) {
				this.game[i] = 0;
				this.game[i-1] = 2;
				break;
			}
		}
	}
	
	public void right() {
		for(int i=0; i<this.game.length-1; i++) {
			if(this.game[i] == 2 && this.game[i+1] == 0) {
				this.game[i] = 0;
				this.game[i+1] = 2;
				break;
			}
		}
	}
	
	public void smash() {
		for(int i=1; i<this.game.length-1; i++) {
			if(this.game[i] == 2 && this.game[i+1] == 1) {
				this.game[i+1] = 0;
			}
			if(this.game[i] == 2 && this.game[i-1] == 1) {
				this.game[i-1] = 0;
			}
		}
	}
}
public class lv6_07s {

	public static void main(String[] args) {
		Ex08s e = new Ex08s();
		Scanner sc = new Scanner(System.in);
		while(true) {
			e.print();
			System.out.println("1.왼쪽이동   2.오른쪽이동  3.격파");
			int move = sc.nextInt();
			if(move == 1) {
				e.left();
			}
			if(move == 2) {
				e.right();
			}
			if(move == 3) {
				e.smash();
			}
		}
	}

}
