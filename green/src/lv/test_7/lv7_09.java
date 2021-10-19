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
	String shape[] = {"���̾�","��Ʈ","�����̵�","Ŭ�ι�"};
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
				System.out.print("p1�� ���� ī�� : " );
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
				System.out.print("p2�� ���� ī�� : " );
				this.card[r].printCard();
				this.card[r].setNumber(0);
				this.cnt++;
				x++;
			}
		}
	}
	
	public void compare() {
		if(this.p1 > this.p2 ) {
			System.out.println("p1�� �¸� . ");
			this.win1 ++;
		}
		else if(this.p1 < this.p2 ) {
			System.out.println("p2�� �¸� . ");
			this.win2 ++;
		}
		else {
			System.out.println("���º� !! ");
		}
		this.p1 = 0;
		this.p2 = 0;
	}
	public void play() {
		System.out.println("������ �����Ϸ��� �ƹ� ���ڳ� �Է��ϼ��� . ");
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
				System.out.println("���� ���� ! ");
				System.out.println("p1�� �¸�Ƚ�� : " +this.win1);
				System.out.println("p2�� �¸�Ƚ�� : " +this.win2);
				break;
			}
		}
	}
	
	
	
	
}

public class lv7_09 {

	public static void main(String[] args) {
		// ī����� 
		// 1) ī���� : ���̾� , ��Ʈ , �����̵� , Ŭ�ι�
		// 2) ����      :  1~10
		// 3) �� 40���� �ִ�. 
		// 4) 2�徿 �������� ���� , �� ī���� ������ ���� ū���� �̱��. (���������)
		CardGame e = new CardGame();
		e.run();
	}
}
