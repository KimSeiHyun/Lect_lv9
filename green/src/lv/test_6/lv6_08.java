package lv.test_6;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */



class Ex09{
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	private int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	private int[] back = new int[10];
	
	private int cnt = 0;		// 정답을 맞춘 횟수
	
	public void print() {
		System.out.print("front : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.front[i] + " ");
		}System.out.println();
		System.out.print("back  : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.back[i] + " ");
		}System.out.println();
	}
	public void shuffle() {
		int x = 0;
		while(x < 300) {
			int rIdx = rn.nextInt(10);
			int temp = this.front[0];
			this.front[0] = this.front[rIdx];
			this.front[rIdx] = temp;
			x++;
		}
	}
	public void play() {
		System.out.println("첫번쨰 카드의 인덱스 입력 : ");
		int idx1 = sc.nextInt();
		System.out.println("두번쨰 카드의 인덱스 입력 : ");
		int idx2 = sc.nextInt();
		if(idx1 >=0 && idx1 < this.front.length && idx2>=0 && idx2< this.front.length) {
			if(this.front[idx1] == this.front[idx2] && this.back[idx1] != 1 && this.back[idx2] != 1 ) {
				this.back[idx1] = 1;
				this.back[idx2] = 1;
			}else System.out.println("카드를 다시 확인해주세요");
			
		}else System.out.println("범위를 다시 확인해주세요 .");
	}
	public boolean end() {
		this.cnt = 0;
		for(int i=0; i<this.back.length; i++) {
			if(this.back[i] == 1) {
				this.cnt ++;
			}
		}
		if (this.cnt == 10) return true;
		return false;
	}
	public void run() {
		shuffle();
		while(!end()) {
			print();
			play();
		}
		System.out.println("game clear!! ");
	}
}

public class lv6_08 {

	public static void main(String[] args) {
		Ex09 e = new Ex09();
		e.run();
	}

}
