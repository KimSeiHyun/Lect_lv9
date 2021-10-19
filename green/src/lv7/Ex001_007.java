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
		for(int i=0; i<this.cards.length; i++) { //���̾� ��Ʈ �����̵� Ŭ�ι� 1~10������� ����. 
			this.cards[i] = new Card();
			this.cards[i].number = x;
			x++;
			if(i %10 == 9)  x = 1;
			if(i>=0 && i < 10) {
				this.cards[i].shape = "���̾�";
			}
			else if(i>= 10 && i <20) {
				this.cards[i].shape = "��Ʈ";
			}
			else if(i>=20 && i<30) {
				this.cards[i].shape = "�����̵�";
			}
			else this.cards[i].shape = "Ŭ�ι�";
		}
		x = 0;
		while(x < 500) { // ���� 
			int a = rn.nextInt(40);
			String temp1 = this.cards[0].shape;
			int temp2 = this.cards[0].number;
			this.	cards[0].shape = this.cards[a].shape;
			this.	cards[0].number = this.cards[a].number;
			this.	cards[a].shape = temp1;
			this.	cards[a].number = temp2;
			x++;
		}
		for(int i=0; i<p.check.length; i++) { //�ߺ����� �ʰ� ������ check�迭�� ������. -1�� �ε���0�� ��ġ�� �ʰ� �� . 
			p.check[i] = -1;
		}
	}

	void playerPrint() { // 4�����̰� �μ��� �� Ȯ�� 
		System.out.println("p1 : "+p.p1);
		System.out.println("p2 : "+p.p2);
	}
	void finishPrint() { // ������ �� �÷��̾ �� ��ȸ �¸��ߴ��� ���, 
		System.out.println("p1�� �¸�Ƚ�� : " +p.p1count);
		System.out.println("p2�� �¸�Ƚ�� : " +p.p2count);
	}
	void draw() {
		System.out.printf("p%d�� �����Դϴ�. ��ο� �Ϸ��� �ƹ� ���ڳ� �Է����ּ��� . ",turn);
		int ppp = sc.nextInt();
		
		int x = 0;
		while(x < 2) { // ���� ī��� check �迭�� ���� ���� �Է��س����鼭 �ߺ����� ������ �ʰ� üũ�� . 
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
						System.out.printf("p%d�� ���� ī��� : %s  %d�Դϴ�.\n" ,turn,cards[rNum].shape,cards[rNum].number);
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
			System.out.println("p1�� �¸� ! ");
			p.p1count ++;
		}
		else if(p.p1 < p.p2) {
			System.out.println("p2�� �¸� ! ");
			p.p2count ++;
		}
		else System.out.println("���º� !! ");
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
				System.out.println("��� ī�带 ���������Ƿ� ������ �����մϴ�.");
				break;
			}
		}
		
	}
}

public class Ex001_007 {

	public static void main(String[] args) {
		// ī����� 
		// 1) ī���� : ���̾� , ��Ʈ , �����̵� , Ŭ�ι�
		// 2) ����      :  1~10
		// 3) �� 40���� �ִ�. 
		// 4) 2�徿 �������� ���� , �� ī���� ������ ���� ū���� �̱��. (���������)
		CardGame ex = new CardGame();
		ex.run();
		
	}
}