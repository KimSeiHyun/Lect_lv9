package lv.test_7;

import java.util.Random;

//1개 게임만 당첨인 5개짜리 로또세트 완성

class Lottos {
	private int lotto[] = new int [7];
	
	public Lottos(int idx , int x) {
		this.lotto[idx] = x;
	}
	
	public int getSize() {
		return this.lotto.length;
	}
	public void setLotto(int idx , int x) {
		this.lotto[idx] = x;
	}
	public int getLotto(int idx) {
		return this.lotto[idx];
	}
	public void print() {
		for(int i=0; i<this.lotto.length; i++) {
			System.out.print(this.lotto[i] + " ");
		}System.out.println();
	}
}

class LottoSets {
	Lottos arr[] = new Lottos[5];
	public static Random rn = new Random();
	int idx = -1;
	public void set() {
		for(int i=0; i<this.arr.length; i++) {
			this.arr[i] = new Lottos(0,0);
		}
		while(true) {
			for(int i=0; i<this.arr.length; i++) {
				for(int j=0; j<this.arr[i].getSize(); j++) {
					int r = rn.nextInt(7)+1;
					this.arr[i].setLotto(j, r);
				}
			}
			int check = 0;
			for(int i=0; i<this.arr.length; i++) {
				int cnt = 0;
				for(int j=0; j<this.arr[i].getSize(); j++) {
					if(this.arr[i].getLotto(j) == 7) cnt ++;
					if(this.arr[i].getLotto(j) != 7) cnt = 0;
				}
				if(cnt == 3) {
					this.idx = i;
					check ++;
				}
			}
			if(check == 1) break;
		}
	}
	
	public void print() {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print((i+1) + " : ");
			this.arr[i].print();
		}
		System.out.println("7이 연속으로 3번 나온 당첨된 줄은 : "+(idx+1));
	}
	public void run() {
		set();
		print();
	}
}

public class lv7_06s {

	public static void main(String[] args) {
		LottoSets game = new LottoSets();
		game.run();

	}
}