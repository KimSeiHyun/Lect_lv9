package lv7;

import java.util.Random;
import java.util.Scanner;

class Card{
	String shape;
	int number;

	void printCard() {
		System.out.println(shape + " : " + number);
	}
}
class CardPlayer{
	Card card1;
	Card card2;
	int p1 = 0;
	int p1count = 0;
	int p2 = 0;
	int p2count = 0;
	int check[] = new int[40];
//	int money = 1000;

}

class CardGame {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	Card cards[] = new Card[40];
	CardPlayer p = new CardPlayer();
	int turn = 1;
	int cnt = 0;
	void set() {
		int x = 1;
		for(int i=0; i<this.cards.length; i++) { //다이아 하트 스페이드 클로버 1~10순서대로 삽입. 
			this.cards[i] = new Card();
			this.cards[i].number = x;
			x++;
			if(i %10 == 9)  x = 1;
			if(i>=0 && i < 10) {
				this.cards[i].shape = "다이아";
			}
			else if(i>= 10 && i <20) {
				this.cards[i].shape = "하트";
			}
			else if(i>=20 && i<30) {
				this.cards[i].shape = "스페이드";
			}
			else this.cards[i].shape = "클로버";
		}
		x = 0;
		while(x < 500) { // 셔플 
			int a = rn.nextInt(40);
			String temp1 = this.cards[0].shape;
			int temp2 = this.cards[0].number;
			this.	cards[0].shape = this.cards[a].shape;
			this.	cards[0].number = this.cards[a].number;
			this.	cards[a].shape = temp1;
			this.	cards[a].number = temp2;
			x++;
		}
		for(int i=0; i<p.check.length; i++) { //중복되지 않게 쓰려고 check배열을 만들어둠. -1로 인덱스0이 겹치지 않게 함 . 
			p.check[i] = -1;
		}
	}

	void playerPrint() { // 4장을뽑고 두수의 합 확인 
		System.out.println("p1 : "+p.p1);
		System.out.println("p2 : "+p.p2);
	}
	void finishPrint() { // 끝날시 각 플레이어가 총 몇회 승리했는지 출력, 
		System.out.println("p1의 승리횟수 : " +p.p1count);
		System.out.println("p2의 승리횟수 : " +p.p2count);
	}
	void draw() {
		System.out.printf("p%d의 차례입니다. 드로우 하려면 아무 숫자나 입력해주세요 . ",turn);
		int ppp = sc.nextInt();
		
		int x = 0;
		while(x < 2) { // 뽑은 카드는 check 배열에 차곡 차곡 입력해나가면서 중복으로 뽑히지 않게 체크함 . 
			int rNum = rn.nextInt(40);
			int check = 0;
			for(int i=0; i<p.check.length; i++ ) { 
				if(p.check[i] == rNum) {
					check = 1;
				}
			}
			if(check == 0) {
				int check2 = 0;
				for(int i=0; i<p.check.length; i++) {
					if(p.check[i] == -1) {
						p.check[i] = rNum;
						check2 = 1;
						cnt ++;
						System.out.printf("p%d이 뽑은 카드는 : %s  %d입니다.\n" ,turn,cards[rNum].shape,cards[rNum].number);
						x++;
						break;
					}
				}
				if(check2 == 1) {
					if(turn == 1) {
						p.p1 += cards[rNum].number;
					}
					if(turn == 2) {
						p.p2 += cards[rNum].number;
						
					}
				//	break;
				}
			}
		}
		

		
		
	}
	void winner() {
		if(p.p1 > p.p2) {
			System.out.println("p1의 승리 ! ");
			p.p1count ++;
		}
		else if(p.p1 < p.p2) {
			System.out.println("p2의 승리 ! ");
			p.p2count ++;
		}
		else System.out.println("무승부 !! ");
		p.p1 = 0;
		p.p2 = 0;

	}
	
	int finishCheck() {
		int x = 0;
		for(int i=0; i<p.check.length; i++) {
			if(p.check[i] != -1) {
				x ++;
			}
		}
		return x;
	}
	void run () {
		set();
		while(true) {
			draw();
			if(cnt %4 == 0) {
				playerPrint();
				winner();
			}
			turn = turn == 2 ? 1:2;
			if(finishCheck() == 40) {
				finishPrint();
				System.out.println("모든 카드를 소진했으므로 게임을 종료합니다.");
				break;
			}
		}
		
	}
}

public class Ex001_007 {

	public static void main(String[] args) {
		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 2장씩 나눠갖은 다음 , 각 카드의 숫자의 합이 큰쪽이 이긴다. (직접만들기)
		CardGame ex = new CardGame();
		ex.run();
		
	}
}