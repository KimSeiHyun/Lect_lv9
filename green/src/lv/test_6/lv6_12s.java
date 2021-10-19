package lv.test_6;

import java.util.Random;
import java.util.Scanner;

/*
 * # 더하기 게임
 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
 * 2. 6개의 배열의 인덱스를 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 
       그 인덱스의 값 의 합을 출력한다. 
 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
*  예)  4, 7, 5, 3, 2, 9  //   문제:  14   ==> 인덱스 3개를 골라서 합을 맞추면된다.  
    정답)  3,4,5 (여러가지 경우의 수가 나올수는있다)
 */

class Ex15s{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];	
	int total = 0;
	
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		int x = 0;
		while(x <6) {
			int rNum = rn.nextInt(10)+1;
			int check = 0;
			for(int i=0; i<this.game.length; i++) {
				if(this.game[i] == rNum) {
					check = 1;
				}
			}
			
			if(check == 0) {
				this.game[x]  = rNum;
				x++;
			}
		}
		
		x = 0;
		while(x < 3) {
			int rIdx = rn.nextInt(6);
			int check = 0;
			for(int i=0; i<3; i++) {
				if(this.idx[i] == rIdx) check = 1;
			}
			
			if(check == 0) {
				this.idx[x] = rIdx;
				this.total += this.game[rIdx];
				x++;
			}
		}
		for(int i=0; i<3; i++) {
			this.myIdx[i] = -1;
		}
	}
	
	public void print() {
		System.out.print("game  : ");
		for(int i=0; i<this.game.length; i++) {
			System.out.print(this.game[i] + " ");
		}System.out.println();
		System.out.print("idx   : ");
		for(int i=0; i<this.idx.length; i++) {
			System.out.print(this.idx[i] + " ");
		}System.out.println();
		System.out.print("myidx : ");
		for(int i=0; i<this.idx.length; i++) {
			System.out.print(this.myIdx[i] + " ");
		}System.out.println();
		System.out.println("total : "+this.total);
	}
	
	public void play() {
		System.out.println("증복없이 3개의 인덱스를 골라주세요 . ");
		int x = 0;
		while(x < 3) {
			System.out.printf("%d번쨰 인덱스 :",x+1);
			int idx = sc.nextInt();
			int check = 0;
			if(idx >= 0 && idx < 6) {
				for(int i=0; i<3; i++) {
					if(this.myIdx[i] == idx) {
						check = 1;
					}
				}
				if(check == 0) {
					this.myIdx[x] = idx;
					x++;
				}else {
					System.out.println("이미 선택된 인덱스입니다.");
				}
			}else System.out.println("인덱스 범위 확인 . ");
		}
	}
	
	public boolean end() {
		int temp = 0;
		for(int i=0; i<3; i++) {
			temp += this.game[this.myIdx[i]];
		}
		if(temp == this.total ) {
			return true;
		}
		else {
			for(int i=0; i<3; i++) {
				this.myIdx[i] = -1;
			}
			return false;
		}
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(end()) break;
		}
		System.out.println("game clear!");
	}
}

public class lv6_12s {

	public static void main(String[] args) {
		Ex15s e = new Ex15s();
		e.run();

	}

}
