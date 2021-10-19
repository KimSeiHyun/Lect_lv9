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


class Ex08{
	private int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	private int x = 4;
	
	public void print() {
		for(int i=0; i<this.game.length; i++) {
			if(this.game[i] == 1) System.out.print("■ ");
			if(this.game[i] == 2) System.out.print("옷 ");
			if(this.game[i] == 0) System.out.print("_ ");
		}System.out.println();
	}
	public void leftMove() {
		if(this.x >0 && this.game[x-1] == 0) {
			this.game[x-1] = 2;
			this.game[x] = 0;
			x--;
		}
	}
	public void rightMove() {
		if(this.x <this.game.length-1 && this.game[x+1] == 0) {
			this.game[x+1] = 2;
			this.game[x] = 0;
			x++;
		}
	}
	public void boom() {
		if(this.x > 0 && this.x <this.game.length-1) {
			if(this.game[x+1] == 1) {
				System.out.println("오른쪽 벽돌 격파 ! ");
				this.game[x+1] = 0;
			}
			if(this.game[x-1] == 1) {
				System.out.println("왼쪽 벽돌 격파 ! ");
				this.game[x-1] = 0;
			}
		}
	}
}
public class lv6_07 {

	public static void main(String[] args) {
		Ex08 e = new Ex08();
		Scanner sc = new Scanner(System.in);
		while(true ) {
			e.print();
			System.out.println("1.왼쪽  2.오른쪽  3.격파");
			int sel = sc.nextInt();
			if(sel == 1) {
				e.leftMove();
			}
			if(sel == 2) {
				e.rightMove();
			}
			if(sel == 3) {
				e.boom();
			}
		}
	}

}
