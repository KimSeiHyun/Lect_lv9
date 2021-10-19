package lv.test_7;

import java.util.Random;

//1개 게임만 당첨인 5개짜리 로또세트 완성

class Lotto {
	private Integer lotto[] = new Integer[7];
	
	public Lotto (Integer x ) {
		for(int i=0; i<this.lotto.length; i++) {
			this.lotto[i] = x;
		}
	}
	
	public int getLotto(int idx) {
		return this.lotto[idx];
	}
	
	public int getLottoSize() {
		return this.lotto.length;
	}
	
	public void setLotto(int idx , int num) {
		this.lotto[idx] = num;
	}
	
	
}

class LottoSet {
	public static Random rn = new Random();
	
	private Lotto arr[] = new Lotto[5];
	private int idx;
	public void set() {
		for(int i=0; i<arr.length; i++) {
				this.arr[i] = new Lotto(0);
		}
	}
	
	public void print( ) {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print((i+1)+": ");
			for(int j=0; j<this.arr[i].getLottoSize(); j++) {
				System.out.print(this.arr[i].getLotto(j) + " ");
			}System.out.println();
		}
		System.out.println("로또 당첨줄은 : " +this.idx);
	}
	
	public void ranNumSet() {
		
		while(true) {
			for(int i=0; i<this.arr.length; i++) {
				for(int j=0; j<this.arr[i].getLottoSize(); j++) {
					int rNum = rn.nextInt(5)+1;
					this.arr[i].setLotto(j, rNum);
				}
			}

			int check = 0;
			for(int i=0; i < this.arr.length; i++) {
				int cnt = 0;
				for(int j=0; j<this.arr[i].getLottoSize(); j++) {
					if(this.arr[i].getLotto(j) == 5) {
						cnt ++;
					}
					if(this.arr[i].getLotto(j) != 5) {
						cnt = 0;
					}
				}
				if(cnt == 3) {
					check ++;
					this.idx = i+1;
				}
			}
			
			if(check == 1) break;
			
			
			
		}
	}
	public void run() {
		set();
		ranNumSet();
		print();
	}
}

public class lv7_06 {

	public static void main(String[] args) {
		LottoSet game = new LottoSet();
		game.run();

	}
}