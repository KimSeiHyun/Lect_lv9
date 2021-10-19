package lv7.test;

//시작시간 01 : 13
//종료시간 01 : 55
//소요시간 00 : 42

import java.util.Random;

class Lotto {
	private int arr[] = new int[7];
	int x = this.arr.length;
	

	void arrPrint() {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
	
	int getArr(int x ) {
		return arr[x];
	}
	
	void insertRan(int x , int y) {
		arr[x] = y;
	}

}

class Set {
	Random rn = new Random();
	Lotto lotto[] = new Lotto[5];
	int cnt = 0;
	int answer = 0;
	int idx = 0;
	void set () {
		for(int i=0; i<this.lotto.length; i++) {
			this.lotto[i] = new Lotto();
		}
	}
	
	void insert() {
		for(int i=0; i<this.lotto.length; i++) {
			for(int j=0; j<this.lotto[i].x; j++) {
				int rNum = rn.nextInt(5)+1;
				this.lotto[i].insertRan(j, rNum);
			}
		}
	}
	
	void print() {
		for(int i=0; i<this.lotto.length; i++) {
			System.out.print(i+1 +"번 ");
			this.lotto[i].arrPrint();
		}
		System.out.printf("5가 연속으로 3번 있는 로또는 %d번째 입니다 ! ",idx+1);
	}
	
	void review() {
		while(true) {
		for(int i=0; i<this.lotto.length; i++) {
			for(int j=0; j<this.lotto[i].x; j++) {
				if(this.lotto[i].getArr(j) == 5) {
					this.cnt ++;
				}
				if(this.lotto[i].getArr(j) != 5) {
					this.cnt = 0;
				}
			}
			if(this.cnt >=3) {
				this.answer ++;
				this.idx = i;
				break;
			}
			this.cnt = 0;
		}
		
		if(this.answer == 1) {
			break;
		}
		else {
			answer = 0;
			insert();
		}
		}
	}
	public void run () {
		set();
		insert();
		review();
		print();
	}
}
public class test004 {

	public static void main(String[] args) {
		//1개 게임만 당첨인 5개짜리 로또세트 완성
		Set s = new Set();
		s.run();
	}

}
