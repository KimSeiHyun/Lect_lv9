package lv8.test;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//시작 10:54
//종료 11:20
//소요 00:36

class Node{
	 private int front;
	 private int back;
	 
	 public Node(int front , int back) {
		 this.front = front;
		 this.back = back;
	 }
	 public int getFront() {
		 return this.front;
	 }
	 public int getBack() {
		 return this.back;
	 }
	 public void setBack(int back) {
		 this.back = back;
	 }
}

class MemoryGame{
	Vector<Node> nodeList = new Vector<>();
	
	private int data []; 
	private final int  SIZE = 10;
	private int cnt = 0;
	public static Scanner sc = new Scanner(System.in);
	public static Random rn = new Random();
	public void set() {
		int a = 1;
		for(int i=0; i<this.SIZE; i++) {
			Node x = new Node(a,0);
			if((i+1)%2 == 0) a++;
			this.nodeList.add(x);
		}
	}
	
	public void shuffle() {
		int x =0;
		while(x  <150) {
			int rIdx = rn.nextInt(this.SIZE);
			
			Node temp = this.nodeList.get(0);
			this.nodeList.set(0, this.nodeList.get(rIdx));
			this.nodeList.set(rIdx, temp);
			x++;
		}
	}
	
	public void print() {
		System.out.print("front : ");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(this.nodeList.get(i).getFront() + " ");
		}System.out.println();
		System.out.print("back  : ");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(this.nodeList.get(i).getBack() + " ");
		}System.out.println();
	}
	
	public void play() {
		System.out.println("같은 숫자의 인덱스를 입력 해주세요. ");
		System.out.print("첫번쨰 인덱스 : ");
		int idx1 = sc.nextInt();
		System.out.print("두번쨰 인덱스 : ");
		int idx2 = sc.nextInt();
		if(idx1 >= 0 && idx1 < this.SIZE && idx2>= 0 && idx2 <this.SIZE) {
			if(idx1 != idx2 && this.nodeList.get(idx1).getBack() == 0 && this.nodeList.get(idx2).getBack() == 0) {
				if(this.nodeList.get(idx1).getFront() == this.nodeList.get(idx2).getFront()) {
					this.nodeList.get(idx1).setBack(this.nodeList.get(idx1).getFront());
					this.nodeList.get(idx2).setBack(this.nodeList.get(idx2).getFront());
					this.cnt++;
				}
			}
			
		}
		
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

public class test004 {

	public static void main(String[] args) {
		MemoryGame e = new MemoryGame();
		e.run();

	}

}
