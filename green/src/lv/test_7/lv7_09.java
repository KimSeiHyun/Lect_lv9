package lv.test_7;

import java.util.Random;
import java.util.Scanner;



class Card{
	private String shape;
	private int number;
	public Card(String shape , int number) {
		this.shape = shape;
		this.number = number;
	}
	public void printCard() {
		System.out.println(shape + " : " + number);
	}
	public String getShape() {
		return this.shape;
	}
	public int getNumber() {
		return this.number;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
class CardPlayer{
	Card card1;
	Card card2;
	int money = 1000;
}

class CardGame {
	public static Random rn = new Random();
	public static Scanner sc = new Scanner(System.in);
	String shape[] = {"다이아","하트","스페이드","클로버"};
	Card card[] = new Card[40];
	int p1;
	int p2;
	int win1;
	int win2;
	int cnt = 0;
	public void set() {
		for(int i=0; i<this.card.length; i++) {
			this.card[i] = new Card(shape[i%4],i%10+1);
		}
	}
	
	public void cardPrint() {
		for(int i=0; i<this.card.length; i++) {
			System.out.print(this.card[i].getShape()+"\t");
			System.out.print(this.card[i].getNumber()+"\t");
			if(i%4 == 3) System.out.println();
		}
	}
	
	public void shuffle() {
		int x = 0;
		while(x < 300) {
			int r = rn.nextInt(this.card.length);
			String temp1 = this.card[0].getShape();
			int temp2 = this.card[0].getNumber();
			
			this.card[0].setShape(this.card[r].getShape());
			this.card[0].setNumber(this.card[r].getNumber());
			
			this.card[r].setShape(temp1);
			this.card[r].setNumber(temp2);
			x ++; 
		}
		
	}
	
	public void drawP1() {
		int x = 0;
		while(x < 2) {
			int r = rn.nextInt(this.card.length);
			if(this.card[r].getNumber() != 0) {
				this.p1 += this.card[r].getNumber();
				System.out.print("p1이 뽑은 카드 : " );
				this.card[r].printCard();
				this.card[r].setNumber(0);
				this.cnt++;
				x++;
			}
		}
	}
	public void drawP2() {
		int x = 0;
		while(x < 2) {
			int r = rn.nextInt(this.card.length);
			if(this.card[r].getNumber() != 0) {
				this.p2 += this.card[r].getNumber();
				System.out.print("p2이 뽑은 카드 : " );
				this.card[r].printCard();
				this.card[r].setNumber(0);
				this.cnt++;
				x++;
			}
		}
	}
	
	public void compare() {
		if(this.p1 > this.p2 ) {
			System.out.println("p1의 승리 . ");
			this.win1 ++;
		}
		else if(this.p1 < this.p2 ) {
			System.out.println("p2의 승리 . ");
			this.win2 ++;
		}
		else {
			System.out.println("무승부 !! ");
		}
		this.p1 = 0;
		this.p2 = 0;
	}
	public void play() {
		System.out.println("게임을 진행하려면 아무 숫자나 입력하세요 . ");
		int qwrvqwrwqv = sc.nextInt();
		drawP1();
		drawP2();
		compare();
	}
	
	
	
	public void run() {
		set();
		shuffle();
		
		while(true) {
			cardPrint();
			play();
			if(this.cnt == 40) {
				System.out.println("게임 종료 ! ");
				System.out.println("p1의 승리횟수 : " +this.win1);
				System.out.println("p2의 승리횟수 : " +this.win2);
				break;
			}
		}
	}
	
	
	
	
}

public class lv7_09 {

	public static void main(String[] args) {
		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 2장씩 나눠갖은 다음 , 각 카드의 숫자의 합이 큰쪽이 이긴다. (직접만들기)
		CardGame e = new CardGame();
		e.run();
	}
}
