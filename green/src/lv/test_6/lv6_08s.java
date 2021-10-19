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



class Ex09s{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void print() {
		System.out.print("front : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(front[i] + " ");
		}System.out.println();
		System.out.print("back  : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(back[i] + " ");
		}System.out.println();
	}
	public void shuffle( ) {
		int x = 0;
		while(x < 150) {
			int r =rn.nextInt(front.length);
			int temp = this.front[0];
			this.front[0] = this.front[r];
			this.front[r] = temp;
			x++;
		}
	}
	public void play( ) {
		System.out.println("같은 숫자를 두개 골라주세요 . (인덱스 입력 ) ");
		System.out.print("첫번쨰인덱스  : ");
		int sel1 = sc.nextInt();
		System.out.print("두번쨰인덱스  : ");
		int sel2 = sc.nextInt();
		if(sel1 >= 0 && sel1 < this.front.length && sel2 >= 0 && sel2 < this.front.length) {
			if(this.front[sel1] == this.front[sel2] && this.back[sel1] == 0 && this.back[sel2] == 0) {
				this.back[sel1] = 1;
				this.back[sel2] = 1;
				cnt++;
			}
			
		}else System.out.println("인덱스 범위 확인");
	
		
	}
	public void run() {
		shuffle();
		while(true) {
			print();
			play();
			if(this.cnt == 5) {
				System.out.println("game clear !! ");
				break;
			}
		}
	}
}

public class lv6_08s {

	public static void main(String[] args) {
		Ex09s e = new Ex09s();
		e.run();

	}

}
