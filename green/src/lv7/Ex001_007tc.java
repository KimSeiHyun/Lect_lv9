package lv7;

import java.util.Random;
import java.util.Scanner;

class Card2{
	String shape;
	int number;
	boolean fliped;
	void setCard(String shape, int number) {
		this.shape = shape;
		this.number = number;
	}
	void printCard() {
		System.out.println(shape + " : " + number);
	}
}
class CardPlayer2{
	Card2 cards[] = new Card2[2];
	int money = 1000;
}

class CardGame2 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	
	Card2 cards[] = new Card2[40];
	CardPlayer2 cardPlayers[];
	int players;
	int turn;
	
	int total[];
	int winCnt[];
	
	String shapeList[] = {"◆","♥","♠","♣"};
	
	void setGame() {
		System.out.print("참여인원 : ");
		int num = sc.nextInt();
		
		if(num > 1) {
			this.players = num;
			cardPlayers = new CardPlayer2[this.players]; // {null , null,,,}
			for(int i=0; i<this.cardPlayers.length; i++) {
				this.cardPlayers[i] = new CardPlayer2();
			}
			this.total = new int[this.players];
			this.winCnt = new int[this.players];
		}
		this.turn = 1; // 1~this.players
	}
	
	void setCards() {
		int shape = 0;
		for(int i=0; i<this.cards.length; i++) { // i : 0~39
			this.cards[i] = new Card2();
			this.cards[i].setCard(shapeList[shape], i%10+1);
			if(i%10 == 9) shape++;
		}
		shuffle();
	}
	
	void shuffle() {
		for(int i=0; i<5000; i++) {
			int r = rn.nextInt(this.cards.length);
			
			Card2 temp = this.cards[0];
			this.cards[0] = this.cards[r];
			this.cards[r] = temp;
		}
	}
	
	void printWoleCards() {
		for(int i=0; i<this.cards.length; i++) {
			System.out.printf("%s %d\n",this.cards[i].shape,this.cards[i].number);
		}
	}
	
	void flipCards() { // 게임 진행
		// 랜덤으로 뒤집히지 않은 카드를 2장씩 뽑기 . 
		this.cardPlayers[turn-1].cards = new Card2[2];
		for(int i=0; i<2; i++) {
			this.cardPlayers[turn-1].cards[i] = new Card2();
		}
		this.total[turn-1] = 0;
		int n = 0;
		while(n < 2) { 
			int r = rn.nextInt(this.cards.length);
			if(this.cards[r].fliped) continue;
			this.cards[r].fliped = true;
			
			this.cardPlayers[turn-1].cards[n].
			setCard(this.cards[r].shape, this.cards[r].number);
			this.cardPlayers[turn-1].cards[n].printCard();
			this.total[turn-1] += this.cards[r].number;
			
			n++;
		}
		System.out.println("--------------");
		if(this.turn == this.players) {
			checkWin();
		}
		this.turn = this.turn == this.players ? 1 : ++this.turn;
	}
	boolean end() {
		// 남은 카드 (fliped == false) < 참여인원 * 2 
		if(this.turn == 1) {
			int check = 0;
			for(int i=0; i<this.cards.length; i++ ) {
				if(!this.cards[i].fliped) check ++;
			}
			if(check < this.players * 2) return true;
			
		}
		return false;
	}
	
	void checkWin() {
		System.out.println("--------------");
		int max = 0;
		for(int i=0; i<this.total.length; i++) {
			if(max < this.total[i]) {
				max = this.total[i];
			}
		}
		for(int i=0; i<this.total.length; i++) {
			if(this.total[i] == max) {
				System.out.printf("p%d win!\n",i+1);
				this.winCnt[i] ++;
			}
		}
		System.out.println("--------------");
	}
	void finalWin() {
		int max = 0;
		
		for(int i=0; i<this.winCnt.length; i++) {
			if(max < this.winCnt[i]) {
				max = this.winCnt[i];
			}
		}
		for(int i=0; i<this.winCnt.length; i++) {
			if(max == this.winCnt[i]) {
				System.out.printf("p%d FINAL WIN !!!",i+1);
				
			}
		}
		
	}
	void run() {
		setGame();
		setCards();
//		printWoleCards();
		while(!end()) {
			// turn 번째 플레이어가 랜덤으로 > 카드 2장씩 뽑음 
			flipCards();

			// 카드 한벌(40장)이 모두 소진될 때까지 
			// 혹은 뽑을 카드쌍이 참여인원보다 적을때 종료 
		}
		// 승자 출력 
		finalWin();
	}
}
public class Ex001_007tc {

	public static void main(String[] args) {
		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 2장씩 나눠갖은 다음 , 각 카드의 숫자의 합이 큰쪽이 이긴다. (직접만들기)
				
		CardGame2 game = new CardGame2();
		game.run();
	}
}