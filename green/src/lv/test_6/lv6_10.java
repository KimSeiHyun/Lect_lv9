package lv.test_6;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

class Ex11{
	final int SIZE = 9;	
	private int[] front = new int[SIZE];
	private int[] back  = new int[SIZE];	
	private int cnt = 1;
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	public void set() {
		int x = 0;
		while(x <this.SIZE) {
			int rNum = rn.nextInt(9)+1;
			int check = 0;
			for(int i=0; i<this.SIZE; i++) {
				if(this.front[i] ==rNum) check = 1;
			}
			if(check == 0 ) {
				front[x] = rNum;
				x++;
			}
		}
		x = 0;
		while(x <this.SIZE) {
			int rNum = rn.nextInt(9)+10;
			int check = 0;
			for(int i=0; i<this.SIZE; i++) {
				if(this.back[i] ==rNum) check = 1;
			}
			if(check == 0 ) {
				back[x] = rNum;
				x++;
			}
		}
	}
	
	public void print() {
		System.out.println("cnt  : " +cnt);
		System.out.println("front ");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(this.front[i] + " ");
			if(i %3 == 2) System.out.println();
		}System.out.println();
		
		System.out.println("back ");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(this.back[i] + " ");
			if(i %3 == 2) System.out.println();
		}System.out.println();
	}
	public void play() {
		System.out.println("작은수부터 차례대로 idx 입력 ");
		int idx = sc.nextInt();
		if(idx >= 0 && idx < this.SIZE ) {
			if(front[idx] == this.cnt && this.cnt < 10) {
				front[idx] = back[idx];
				cnt++;
			}
			if(front[idx] == this.cnt && this.cnt >= 10) {
				front[idx] = 0;
				cnt++;
			}
		}else System.out.println("인덱스 범위 확인 ");
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(this.cnt == 19) {
				System.out.println("game clear !! ");
				break;
			}
		}
	}
}

public class lv6_10 {

	public static void main(String[] args) {
		Ex11 e = new Ex11();
		e.run();

	}

}
