package lv.test_6;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame{
	
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
	
	public void shuffle() {
		int x = 0;
		while(x < 150) {
			int rIdx = rn.nextInt(this.front.length);
			int temp = this.front[0];
			this.front[0] = this.front[rIdx];
			this.front[rIdx] = temp;
			x++;
		}
	}
	
	public void print() {
		System.out.print("front : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.front[i]  +" ");
		}System.out.println();
		System.out.print("back  : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.back[i]  +" ");
		}System.out.println();
	}
	
	public void selectCard() {
		System.out.print("첫번쨰 카드 (인덱스)입력 : ");
		int sel1 = sc.nextInt();
		System.out.print("두번쨰 카드 (인덱스)입력 : ");
		int sel2 = sc.nextInt();
		if(sel1 >= 0 && sel1 < this.front.length && sel2 >= 0 && sel2 < this.front.length) {
			if(sel1 != sel2 && this.front[sel1] == this.front[sel2] ) {
				if(this.back[sel1] == 1 && this.back[sel2] == 1) {
					System.out.println("이미 맞춘 카드입니다.");
				}
				if(this.back[sel1] == 0 && this.back[sel2] == 0) {
					cnt++;
					this.back[sel1] = 1;
					this.back[sel2] = 1;
				}
				
			}else System.out.println("땡.");
			
		}else System.out.println("인덱스 범위 확인 . ");
	}
	void run() {
		shuffle();
		while(true) {
			print();
			selectCard();
			if(this.cnt == 5) {
				System.out.println("game clear !! ");
				break;
			}
		}

	}
}

public class lv6_35 {

	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();
		mg.run();		
	}
}
