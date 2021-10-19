package lv7.test;

import java.util.Random;
import java.util.Scanner;

//시작시간 02 : 40
//종료시간 04 : 04
//소요시간 01 : 24

class Player {
	private int total;
	private int  win;
	int getTotal () {
		return total;
	}
	int getWin () {
		return win;
	}
	void setTotal (int x) {
		total += x;
	}
	void zeroTotal () {
		total = 0;
	}
	void setWin() {
		this.win ++;
	}
}
class Card {
	private String shape[] = new String[40];
	private int num[] = new int[40];
	int x = num.length;
	void cardSet(int a , String b , int c) {
		shape[a] = b;
		num[a] = c;
	}
	
	void print() {
		for(int i=0; i<num.length; i++) {
			System.out.print(shape[i]);
			System.out.print(num[i]+"\t");
			if(i%10 ==9)System.out.println();
		}System.out.println();
	}
	String getShape(int x) {
		return shape[x];
	}
	int getNum(int x) {
		return num[x];
	}

}

class CardGame {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	Player player[];
	Card c = new Card();
	int turn = 1;
	int max;
	int cnt = 0;
	void playerSet() {
		System.out.println("시작인원을 몇명으로 정하시겠습니까? 적정인원 : 2~4명");
		while(true) {
		int sel = sc.nextInt();
		if(sel >= 2 && sel <= 4) {
			player = new Player[sel];
			for(int i=0; i<sel; i++) {
				player[i] = new Player();
			}
			this.max = sel;
			break;
		}
		else {
			System.out.println("적정인원 범위 내에서 입력해주세요 . ");
		} 
		}
	}
	
	void cardSet() {
		int x = 1;
		for(int i=0; i<c.x; i++) {
			if(x == 11) {
				x = 1;
			}
			if(i <10) {
				c.cardSet(i, "하트", x);
			}
			else if (i >= 10 && i<20) {
				c.cardSet(i, "스페이스", x);
			}
			else if (i >= 20 && i<30) {
				c.cardSet(i, "클로버", x);
			}
			else if (i >= 30 && i<40) {
				c.cardSet(i, "다이아", x);
			}
			x++;
		}
	}
	
	void shuffle() {
		int x = 0;
		while(x < 300) {
			int rIdx = rn.nextInt(40);
			String temp1 = c.getShape(0);
			int temp2 = c.getNum(0);
			c.cardSet(0, c.getShape(rIdx), c.getNum(rIdx));
			c.cardSet(rIdx, temp1, temp2);
			x++;
		}
	}
	
	void play() {
		System.out.println("카드를 드로우 하려면 아무 숫자나 입력 : ");
		int sadasd = sc.nextInt();
		int x = 0;
		while(x < 2) {
			int rIdx = rn.nextInt(40);
			if(c.getShape(rIdx) != null) {
				this.player[this.turn-1].setTotal(c.getNum(rIdx));
				System.out.printf("p%d이 뽑은 카드 : %s  %d\n",this.turn , c.getShape(rIdx),c.getNum(rIdx));
				c.cardSet(rIdx, null, 0);
				x++;
				
			}
		
		}
		System.out.printf("p%d의 total : %d\n",this.turn,this.player[this.turn-1].getTotal());

		this.turn ++;
		if(this.turn == this.max+1) {
			this.turn = 1;
		}
	}
	
	void winner() {
		int max = 0;
		int idx = -1;
		for(int i=0; i<this.max; i++) {
			if(this.player[i].getTotal() > max) {
				max = this.player[i].getTotal();
				idx = i;
			}
			this.player[i].zeroTotal();
		}
		this.cnt += this.max*2;
		player[idx].setWin();
		System.out.printf("p%d의 승리 ! \n",idx+1);
	}
	
	void winprint() {
		System.out.println("최종결과 ");
		for(int i=0; i<this.max; i++) {
			System.out.printf("p%d의 총 승리 횟수 : %d\n",i+1,this.player[i].getWin());
		}
	}
	public void run () {
		playerSet();
		cardSet();
		shuffle();
		while(true) {
			c.print();
			play();
			if(this.turn == 1) {
				winner();
			}
			if(c.x-cnt < this.max*2) {
				System.out.println("더이상 진행할수잇는 카드의 수가 맞지 않으므로 게임을 종료합니다.");
				winprint();
				break;
			}
		}
	}
}
public class test006 {

	public static void main(String[] args) {
		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 2장씩 나눠갖은 다음 , 각 카드의 숫자의 합이 큰쪽이 이긴다. (직접만들기)
		
		CardGame c = new CardGame();
		c.run();
	}

}
