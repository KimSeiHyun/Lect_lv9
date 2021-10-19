package lv8;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//기억력 게입 (카드 뒤집기)

class Node{
	int front;
	int back;
	
	public  Node(int front , int back) {
		this.front = front;
		this.back = back;
	}
}

class MemoryGame{
	Vector<Node> nodeList = new Vector<>();
	int data []; 
	final int  SIZE = 10;
	int cnt = 0;
	Scanner sc= new Scanner(System.in);
	Random rn = new Random();
	
	public void set() {
		int x = 1;
		for(int i=0; i<this.SIZE; i++) {
			Node a = new Node(x,0);
			nodeList.add(a);	
			if((i+1)%2 ==0) x ++;
		}
		System.out.println("node.list.size : " +nodeList.size());
	}
	
	public void shuffle() {
		int x = 0;
		while(x < 150) {
			int rIdx = rn.nextInt(10);
			
			int temp = this.nodeList.get(0).front;
			this.nodeList.get(0).front = this.nodeList.get(rIdx).front;
			this.nodeList.get(rIdx).front = temp;
			
			x++;
		}
	}
	
	public void print() {
		System.out.print("front : ");
		for(int i=0; i<this.nodeList.size(); i++) {
			System.out.print(this.nodeList.get(i).front + " ");
		}System.out.println();
		System.out.print("back  : ");
		for(int i=0; i<this.nodeList.size(); i++) {
			System.out.print(this.nodeList.get(i).back + " ");
		}System.out.println();
	}
	
	public void play () {
		System.out.println("같은 숫자가 있는 카드를 골라주세요 . (1~10)");
		int selIdx1 = sc.nextInt()-1;
		int selIdx2 = sc.nextInt()-1;
		if(selIdx1 >= 0 && selIdx1 < 10 && selIdx2 >= 0 && selIdx2 < 10 ) {
			if(selIdx1 != selIdx2) {
				if(this.nodeList.get(selIdx1).front == this.nodeList.get(selIdx2).front
						&& this.nodeList.get(selIdx1).back == 0 && this.nodeList.get(selIdx2).back == 0) {
					this.nodeList.get(selIdx1).back = this.nodeList.get(selIdx1).front;
					this.nodeList.get(selIdx2).back = this.nodeList.get(selIdx2).front;
					cnt++;
				}
				
			}else System.out.println("같은 카드는 고를수 없습니다.");
			
		}else System.out.println("범위를 벗어난 숫자입니다.");
	}
	public void run() {
		set();
		shuffle();
		while(true) {
			print();
			play();
			if(this.cnt == 5) {
				System.out.println("game clear !! ");
				print();
				break;
			}
		}
	}
}

public class Ex002_003 {

	public static void main(String[] args) {
		MemoryGame m = new MemoryGame();
		m.run();
	}

}
