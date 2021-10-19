package lv8;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//1 to 50

class Node1to50 {
	private  int num;
	
	public Node1to50(int num) {
		this.num = num;
	}
	public int get() {
		return this.num;
	}
	public void set(int num) {
		this.num = num;
	}
	void printNode() {
		System.out.print(num + "\t");
	}
}

class Manager1to50 {
	Vector<Vector<Node1to50>> nodeList = new Vector<>();
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int data[][];
	int cnt = 1;
	final int SIZE = 5;
	
	public void set() {
		for(int i=0; i<10; i++) {
			Vector<Node1to50> temp = new Vector<Node1to50>();
			for(int j=0; j<this.SIZE; j++) {
				Node1to50 a = new Node1to50(0);
				temp.add(a);
			}
			nodeList.add(temp);
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
		dataShuffle();
		for(int i=0; i<5; i++) {
			for(int j=0; j<this.nodeList.get(i).size(); j++) {
				this.nodeList.get(i).get(j).set(data[i][j]);
	//			Node1to50 a = new Node1to50(data[i][j]);
	//			this.nodeList.get(i).set(j, a);
			} 
		}
		
		for(int i = 0;  i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				data[i][j] = num;
				//System.out.println(num);
				num += 1;
			}
		}
		dataShuffle();
		for(int i=5; i<this.nodeList.size(); i++) {
			for(int j=0; j<this.nodeList.get(i).size(); j++) {
				Node1to50 a = new Node1to50(data[i-5][j]);
					this.nodeList.get(i).set(j, a);
			} 
		}
		
	}
	
	void dataShuffle() {
		int x = 0;
		while(x < 150) {
			int rIdx1 = rn.nextInt(5);
			int rIdx2 = rn.nextInt(5);
			
			int temp = data[0][0];
			data[0][0] = data[rIdx1][rIdx2];
			data[rIdx1][rIdx2] = temp;
			x++;
		}
	}
	public void play() {
		System.out.println("작은수 부터 차례대로 (x,y)좌표를 입력해나가세요.   . ");
		System.out.print("x : (1~5)");
		int x = sc.nextInt()-1;
		System.out.print("y : (1~5)");
		int y = sc.nextInt()-1;
		
		if(x >= 0 && x < this.nodeList.get(0).size()
				&& y >= 0 && y < this.nodeList.get(0).size()) {
			if(this.cnt < 26) {
				if(this.nodeList.get(x).get(y).get() == this.cnt) {
					this.cnt ++;
					this.nodeList.get(x).get(y).set(this.nodeList.get(x+5).get(y).get());
				}	
			}else {
				if(this.nodeList.get(x).get(y).get() == this.cnt) {
					this.cnt ++;
					this.nodeList.get(x).get(y).set(0);
				}	
			}
			
			
		}else System.out.println("범위를 제대로 확인해주세요 . ");
	}
	
	public void print() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<this.nodeList.get(i).size(); j++) {
				System.out.print(this.nodeList.get(i).get(j).get()+ "\t");				
			}System.out.println();
		}
		
		

	}
	public void run() {
		set();
		dataInit();
		while(true) {
			System.out.println("cnt : " + cnt);
			print();
			play();
			if(this.cnt == 51) {
				System.out.println("game clear !! ");
				break;
			}
		}
	}
}


public class Ex002_004 {

	public static void main(String[] args) {
		Manager1to50 m = new Manager1to50();
		m.run();
	}

}
