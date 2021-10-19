package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex003_11 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int SIZE = 9;
	int front[] = new int[SIZE];
	int back[] = new int[SIZE];
	
	void shuffle() {
		int x = 0;
		while(true) {
			int rNum = rn.nextInt(9)+1;
			int check = 0;
			for(int i=0; i<this.SIZE; i++) {
				if(this.front[i] == rNum) {
					check = 1;
				}
			}
			if(check == 0) {
				this.front[x] = rNum;
				x++;
			}
			if(x == 9) {
				break;
			}
		}
		x = 0;
		while(true) {
			int rNum = rn.nextInt(9)+10;
			int check = 0;
			for(int i=0; i<this.SIZE; i++) {
				if(this.back[i] == rNum) {
					check = 1;
				}
			}
			if(check == 0) {
				this.back[x] = rNum;
				x++;
			}
			if(x == 9) {
				break;
			}
		}
	}
	void print () {
		System.out.println("front");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(this.front[i] + " ");
			if(i %3 == 2) System.out.println();
		}
		System.out.println("back");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(this.back[i] + " ");
			if(i %3 == 2) System.out.println();
		}
	}
	
	void start() {
		int cnt = 1;
		while(true) {
			print();
			System.out.println("cnt : " +cnt);
			System.out.print("제일 작은수의 위치를 차례대로 입력 : ");
			int sel = sc.nextInt()-1;
			if(cnt <10 ) {
				if(sel >= 0 && sel<this.SIZE &&this.front[sel] == cnt) {
					this.front[sel] = this.back[sel];
					cnt++;
				}
			}
			else {
				if(sel >= 0 && sel<this.SIZE &&this.front[sel] == cnt) {
					this.front[sel] = 0;
					cnt++;
				}
			}
			if(cnt == 19) {
				System.out.println("game clear !! ");
				break;
			}
		}
	}
	
	
	public void run() {
		shuffle();
		start();
	}
}
public class Ex003_011 {

	public static void main(String[] args) {
		// 1 to 50
		Ex003_11 ex = new Ex003_11();
		ex.run();
	}

}
