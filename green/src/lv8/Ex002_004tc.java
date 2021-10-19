package lv8;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//1 to 50

class Node1to502 {
	private int num;

	public Node1to502(int num) {
		this.num = num;
	}
	
	void printNode() {
		System.out.print(num + "\t");
	}
	public int getNum() {
		return this.num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

class Manager1to502 {
	Vector<Vector<Node1to502>> nodeList;
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int data[][] = null;
	final int SIZE = 5;
	int gameNum = 1;
	
	void setGame() {
		nodeList = new Vector<Vector<Node1to502>>(); //fornt 실 객체
		data = new int[this.SIZE][this.SIZE];   	//back 데이터
		
		int n = 1;
		for(int i=0; i<this.SIZE; i++) {
			Vector<Node1to502> temp = new Vector<Node1to502>();
			
			for(int j=0; j<this.SIZE; j++) {
				temp.add(new Node1to502(n));
				data[i][j] = n+this.SIZE*this.SIZE;
				n ++;
			}
			this.nodeList.add(temp);
		}
		shuffle();
	}
	
	private void shuffle() {
		for(int i=0; i<200; i++) {
			int r1 = rn.nextInt(this.SIZE);
			int r2 = rn.nextInt(this.SIZE);
			
			Node1to502 temp = this.nodeList.get(0).get(0);
			this.nodeList.get(0).set(0, this.nodeList.get(r1).get(r2));
			this.nodeList.get(r1).set(r2, temp);
			
			r1 = rn.nextInt(this.SIZE);
			r2 = rn.nextInt(this.SIZE);
			
			int tempNum = this.data[0][0];
			this.data[0][0] = this.data[r1][r2];
			this.data[r1][r2] = tempNum;
		}
	}
	void dataInit() {
		data = new int[SIZE][SIZE];
		int num = 1;
		for(int i = 0;  i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				data[i][j] = num;
				//System.out.println(num);
				num += 1;
			}
		}
	}
	void dataShuffle() {}
	// ...
	
	public void run() {
		setGame();
		while(!end()) {
			printMap();
			select();
		}
		printResult();
	}
	
	private void printResult() {
		System.out.println("game clear!!");
		
	}

	private boolean end() {
		if(this.gameNum > this.SIZE*this.SIZE) return true;
		return false;
	}
	private void select() {
		while(true) {
			System.out.print("Y : ");
			int y = sc.nextInt();
			System.out.print("X : ");
			int x = sc.nextInt();
			
			if(y < 0 || y>= this.SIZE  || x <0 || x >= this.SIZE) continue;
				
			if(this.gameNum == this.nodeList.get(y).get(x).getNum()) {
				flipNode(y , x);
			}
			break;
			
		}
		
		
	}

	private void flipNode(int y , int x ) {
		int num = this.data[y][x];
		this.nodeList.get(y).get(x).setNum(num);
		this.gameNum ++;
	}

	private void printMap() {
		for(int i=0; i<this.nodeList.size(); i++) {
			for(int j=0; j<this.nodeList.get(i).size(); j++) {
				this.nodeList.get(i).get(j).printNode();
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("back>>");
		for(int i=0; i<this.data.length; i++) {
			for(int j=0; j<this.data[i].length; j++) {
				System.out.print(this.data[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
	}
	
	
}

public class Ex002_004tc {

	public static void main(String[] args) {
		Manager1to502 game = new Manager1to502();
		game.run();

	}

}
