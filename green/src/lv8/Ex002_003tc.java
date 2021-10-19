package lv8;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//기억력 게입 (카드 뒤집기)

class Node2{
	private int number;
	private boolean fliped;
	
	public Node2(int num) {
		this.number = num;
	}
	
	public int getNumber() {
		return this.number;
	}
	public boolean getFliped() {
		return fliped;
	}
	
	public void setFliped() {
		this.fliped = true;
	}
}

class MemoryGame2{
	Vector<Node2> nodeList = new Vector<>();
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	int data []; 
	final int  SIZE = 10;
	int score = 100;
	
	void setCards() {
		int n = 1;
		for(int i=0; i<this.SIZE; i++) {
			this.nodeList.add(new Node2(n));
			if(i %2 == 1) n++;
		}
		shuffleCards();
	}
	private void shuffleCards() {
		for(int i=0; i<150; i++) {
			int r = rn.nextInt(this.SIZE);
			
			Node2 temp = this.nodeList.get(0);
			this.nodeList.set(0, this.nodeList.get(r));
			this.nodeList.set(r, temp);
		}
		
	}
	
	private void select() {
		while(true) {
			System.out.print("idx1 : ");
			int idx1 = sc.nextInt();
			System.out.print("idx2 : ");
			int idx2 = sc.nextInt();
			if(idx1 == idx2 || this.nodeList.get(idx1).getFliped()) {
				System.out.println("카드선택을 다시 해주세요 . ");
				continue;
			}
			if(this.nodeList.get(idx1).getNumber() != this.nodeList.get(idx2).getNumber()) {
				System.out.println("땡");
				if(this.score > 0) {
					this.score -= 5;
				}
				continue;
			}
			flipCards(idx1,idx2);
			break;
		}
	}
	private void flipCards(int idx1, int idx2) {
		this.nodeList.get(idx1).setFliped();
		this.nodeList.get(idx2).setFliped();
		
	}
	public void run() {
		setCards();
		while(!end()) {
			printCards();
			select();
		}
		printResult();
	}
	
	private void printResult() {
		System.out.printf("game clear !! score : %d점",this.score);
		
	}
	private void printCards() {
		for(int i=0; i<this.nodeList.size(); i++) {
			if(this.nodeList.get(i).getFliped()) {
				System.out.print(this.nodeList.get(i).getNumber());
			}
			else {
				System.out.print("■ ");
			}
		}System.out.println();
	}
	private boolean end() {
		int check = 0;
		for(int i=0; i<nodeList.size(); i++) {
			if(!nodeList.get(i).getFliped()) {
				check ++;
			}
		}
		if(check == 0) return true;
		return false;
	}
}

public class Ex002_003tc {

	public static void main(String[] args) {
		MemoryGame2 m = new MemoryGame2();
		m.run();

	}

}
