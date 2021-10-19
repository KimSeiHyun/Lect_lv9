package lv6;

import java.util.Scanner;

class Ex003_10 {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[9];
	int turn = 1;
	int win = -1;
	void print() {
		for(int i=0; i<this.arr.length; i++) {
			if(this.arr[i] == 1) {
				System.out.print("[O] ");
			}
			else if(this.arr[i] == 2) {
				System.out.print("[X] ");
			}
			else System.out.print("[ ] ");
			if(i %3 == 2) {
				System.out.println();
			}
		}System.out.println();
	}
	
	void start() {
		while(true) {
			print();
			System.out.printf("p%d의 차례입니다.\n",this.turn);
			if(turn == 1) {
				p1();
			}
			else if(turn == 2) {
				p2();
			}
			
			if(win() != -1) {
				print();
				System.out.printf("p%d이 승리했습니다 .\n",this.turn);
				break;
			}
			this.turn = this.turn == 1 ? 2 : 1;
		}

	}
	
	void p1() {
		while(true) {
			System.out.println("1~9의 칸을 입력해주세요 . ");
			int sel = sc.nextInt()-1;
			int check = 0;
			if(sel >= 9 || sel <0) {
				System.out.println("지정된 범위 내에서 입력해주세요 . ");
				continue;
			}
			if(sel >= 0 && sel <9 && this.arr[sel] == 0) {
				this.arr[sel] = this.turn;
				check = 1;
			}else System.out.println("이미 선택된 칸입니다. 다시 입력해주세요 . ");
			if(check == 1) break;
		}
		
	}
	
	void p2() {
		while(true) {
			System.out.println("1~9의 칸을 입력해주세요 . ");
			int sel = sc.nextInt()-1;
			int check = 0;
			if(sel >= 9 || sel <0) {
				System.out.println("지정된 범위 내에서 입력해주세요 . ");
				continue;
			}
			if(sel >= 0 && sel <9 && this.arr[sel] == 0) {
				this.arr[sel] = this.turn;
				check = 1;
			}else System.out.println("이미 선택된 칸입니다. 다시 입력해주세요 . ");
			if(check == 1) break;
		}
	}
	
	int win() {
		int cnt = 0;
		//가로
		for(int i=0; i<this.arr.length; i+=3) {
			if(this.arr[i] == this.turn && this.arr[i+1] == this.turn && this.arr[i+2] == this.turn ) {
				this.win = this.turn;
			}
		}
		//세로
		for(int i=0; i<3; i++) {
			if(this.arr[i] == this.turn && this.arr[i+3] == this.turn && this.arr[i+6] == this.turn ) {
				this.win = this.turn;
			}
		}
		//대각/
		if(this.arr[2] == this.turn && this.arr[4] == this.turn && this.arr[6] == this.turn ) {
			this.win = this.turn;
		}	
		//대각\
		if(this.arr[0] == this.turn && this.arr[4] == this.turn && this.arr[8] == this.turn ) {
			this.win = this.turn;
		}	
		return win;
	}
	
	
	public void run() {
		start();
	}
}
public class Ex003_010 {

	public static void main(String[] args) {
		// 틱택토
		Ex003_10 ex = new Ex003_10();
		ex.run();

	}

}
