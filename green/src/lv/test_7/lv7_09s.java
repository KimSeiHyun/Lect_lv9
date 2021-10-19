package lv.test_7;

import java.util.Random;
import java.util.Scanner;

class Cards{
	private String shape;
	private int number;
	public Cards (String shape , int number) {
		this.shape = shape;
		this.number = number;
	}
	
	public void printCard() {
		System.out.print(shape + "\t" + number + " ");
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getShape() {
		return this.shape;
	}
	public int getNumber() {
		return this.number;
	}
}
class CardPlayers{
	Card card1;
	Card card2;
	int money = 1000;
}

class CardGames {
	public static Random rn = new Random();
	public static Scanner sc = new Scanner(System.in);
	private String shape[] = {"하트","다이아","클로버","스페이드"};
	private Cards card[] = new Cards[40];
	private int p1;
	private int p2;
	private int win1;
	private int win2;
	private int cnt;
	
	public void set() {
		for(int i=0; i<this.card.length; i++) {
			if(i < 10) card[i] = new Cards(shape[0],i%10+1);
			if(i >= 10 && i < 20) card[i] = new Cards(shape[1],i%10+1);
			if(i >= 20 && i < 30) card[i] = new Cards(shape[2],i%10+1);
			if(i >= 30 && i < 40) card[i] = new Cards(shape[3],i%10+1);
		}
	}
	
	public void shuffle() {
		int x = 0;
		while(x < 150) {
			int r = rn.nextInt(this.card.length);
			String temp1 = this.card[0].getShape();
			int temp2 = this.card[0].getNumber();
			
			this.card[0].setShape(this.card[r].getShape());
			this.card[0].setNumber(this.card[r].getNumber());
			this.card[r].setShape(temp1);
			this.card[r].setNumber(temp2);
			x++;
		}
	}
	
	public void print() {
		for(int i=0; i<this.card.length; i++) {
			this.card[i].printCard();
			if(i%5 ==4 )System.out.println();
		}
	}
	
	public void drawP1() {
		int x = 0;
		while(x < 2) {
			int r = rn.nextInt(this.card.length);
			if(this.card[r].getNumber() != 0) {
				System.out.print("p1이 뽑은 카드는 : ");
				this.card[r].printCard();
				System.out.println();
				this.p1 += this.card[r].getNumber();
				this.card[r].setNumber(0);
				x++;
				this.cnt++;
			}
		}
	}
	public void drawP2() {
		int x = 0;
		while(x < 2) {
			int r = rn.nextInt(this.card.length);
			if(this.card[r].getNumber() != 0) {
				System.out.print("p2이 뽑은 카드는 : ");
				this.card[r].printCard();
				System.out.println();
				this.p2 += this.card[r].getNumber();
				this.card[r].setNumber(0);
				x++;
				this.cnt++;
			}
		}
		
	}
	
	public void compare() {
		if(this.p1 > this.p2 ) {
			System.out.println("p1의 승리 ! ");
			this.win1 ++;
		}
		else if(this.p1 < this.p2 ) {
			System.out.println("p2의 승리 ! ");
			this.win2 ++;
		}else System.out.println("무승부 !! ");
		this.p1 = 0;
		this.p2 = 0;
	}
	
	public void play() {
		System.out.println("카드를 뽑으려면 아무 숫자 입력 ");
		int asdasd = sc.nextInt();
		drawP1();
		drawP2();
		compare();
	}
	public void run() {
		set();
		shuffle();
		while(true) {
			print();
			play();
			if(this.cnt == this.card.length) {
				System.out.println("게임 종료 ! ");
				System.out.println("p1의 총 승리횟수 : " +this.win1);
				System.out.println("p2의 총 승리횟수 : " +this.win2);
				break;
			}
		}
	}
	
}
public class lv7_09s {

	public static void main(String[] args) {
		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 2장씩 나눠갖은 다음 , 각 카드의 숫자의 합이 큰쪽이 이긴다. (직접만들기)
			CardGames e = new CardGames();
			e.run();
	}
}
