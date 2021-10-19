package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex003_08 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int front[] = {1,1,2,2,3,3,4,4,5,5};
	int check[] = new int[this.front.length];
	
	void suffle() {
		int x = 0;
		while(x < 200) {
			int rNum = rn.nextInt(this.front.length-1);
			int temp = this.front[0];
			this.front[0] = this.front[rNum];
			this.front[rNum] = temp;
			x++;
		}
		
	}
	
	void print() {
		System.out.print("front  ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.front[i] + " ");
		}System.out.println();
		System.out.print("check  ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.check[i] + " ");
		}System.out.println();
	}
	
	void choice () {
		System.out.print("1~10카드의 위치를 입력1 : ");
		int sel2 = sc.nextInt()-1;
		System.out.print("1~10카드의 위치를 입력2 : ");
		int sel1 = sc.nextInt()-1;
		if(sel1 >= 0 && sel1 <=9 && sel2 >= 0 && sel2 <=9) {
			if(this.front[sel1] == this.front[sel2]) {
				this.check[sel1] = 1;
				this.check[sel2] = 1;
			}
			
		}else {
			System.out.println("범위를 벗어났습니다.");
		}
		System.out.println();
	}
	
	int cnt() {
		int cnt =0;
		
		for(int i=0; i<this.front.length; i++) {
			if(this.check[i] == 1) {
				cnt++;
			}
		}
		if(cnt == 10) {
			System.out.println("game clear !! ");
		}
		return cnt;
	}
	
	
	
	
	
	
	
	public void run() {
		suffle();
		
		while(true) {
			print();
			choice();
			if(cnt() == 10) break;
			
		}
		
	}
}

public class Ex003_008 {

	public static void main(String[] args) {
		
		/* 클래스 + 메서드
		 * # 기억력 게임 : 클래스 + 메서드
		 * 1. front 배열 카드 10장을 섞는다.
		 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
		 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
		 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
		 */
		
		Ex003_08 ex = new Ex003_08();
		
		ex.run();
		
	}

}
