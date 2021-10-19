package lv8.test;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//시작 12:00
//종료 12:45
//소요 00:45

class Node1to50 {
	private int num;
	
	public Node1to50(int num) {
		this.num = num;
	}
	public int getNum () {
		return this.num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

class Manager1to50 {
	Vector<Vector<Node1to50>> nodeList = new Vector<Vector<Node1to50>>();
	public static Random rn = new Random();
	public static Scanner sc = new Scanner(System.in);
	private int data[][];
	private final int SIZE = 5;
	private int cnt = 1;
	public void dataInit() {
		data = new int[SIZE][SIZE];
		int num = 1;
		for(int i = 0;  i < 5; i++) {
			for(int j = 0; j < SIZE; j++) {
				data[i][j] = num;
			//	System.out.println(num);
				num += 1;
			}
		}
		dataShuffle();
	}
	public void dataInit2() {
		data = new int[SIZE][SIZE];
		int num = 26;
		for(int i = 0;  i < 5; i++) {
			for(int j = 0; j < SIZE; j++) {
				data[i][j] = num;
				//	System.out.println(num);
				num += 1;
			}
		}
		dataShuffle();
	}
	public void dataShuffle() {
		int x = 0;
		while(x < 150) {
			int rIdx1 = rn.nextInt(this.SIZE);
			int rIdx2 = rn.nextInt(this.SIZE);
			int temp = this.data[0][0];
			this.data[0][0] = this.data[rIdx1][rIdx2];
			this.data[rIdx1][rIdx2] = temp;
			x++;
		}
		
	}
	
	public void set() {
		for(int i=0; i<this.SIZE; i++) {
			Vector<Node1to50> temp = new Vector<Node1to50>();
			for(int j=0; j<this.SIZE ; j++) {
				Node1to50 a = new Node1to50(0);
				temp.add(a);
			}
			this.nodeList.add(temp);
		}
		
		
		for(int i=0; i<this.SIZE; i++) {
			for(int j=0; j<this.SIZE; j++ ) {
				Node1to50 a = new Node1to50(data[i][j]);
				this.nodeList.get(i).get(j).setNum(data[i][j]);
			}
		}
		
	}
	
	public void play() {
		System.out.println("작은수부터 차례대로 입력해나가세요 . ");
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("y : ");
		int y = sc.nextInt();
		if(x >=0 && x <this.SIZE && y >=0 && y <this.SIZE) {
			if(this.nodeList.get(y).get(x).getNum() == this.cnt && this.cnt < 26) {
				this.cnt ++;
				this.nodeList.get(y).get(x).setNum(this.data[x][y]);
			}
			if(this.nodeList.get(y).get(x).getNum() == this.cnt && this.cnt >= 26) {
				this.cnt ++;
				this.nodeList.get(x).get(x).setNum(0);
			}
			
		}
	}
	public void print() {
		for(int i=0; i<this.SIZE ;i++) {
			for(int j=0; j<this.SIZE; j++) {
				System.out.print(this.nodeList.get(i).get(j).getNum()+"\t");
			}System.out.println();
		}System.out.println();
	}
	public void run() {
		dataInit();
		set();
		dataInit2();
		while(true) {
			System.out.println("cnt : "+this.cnt);
			print();
			play();
			if(this.cnt == 51) {
				System.out.println("game clear !! ");
				break;
			}
		}
	}
}

public class test006 {

	public static void main(String[] args) {
		Manager1to50 e = new Manager1to50();
		e.run();

	}

}
