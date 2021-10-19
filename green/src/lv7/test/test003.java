package lv7.test;

import java.util.Scanner;

// ���۽ð� 12 : 50
// ����ð� 01 : 12
// �ҿ�ð� 00 : 22

class Map {
	private int x;
	
	int getX () {
		return this.x;
	}
	void setX(int x) {
		this.x = x;
	}
}
class TTT {
	Scanner sc = new Scanner(System.in);
	Map map[] = new Map[9];
	int turn = 1;
	int win;
	
	void set() {
		for(int i=0; i<this.map.length; i++) {
			this.map[i] = new Map();
		}
	}
	
	int play() {
		while(true) {
			System.out.printf("p%d�� �����Դϴ�.",this.turn);
			int sel = sc.nextInt();
			if(sel >= 0 && sel <9) {
				if(map[sel].getX() == 0) {
					map[sel].setX(this.turn);
					break;
				}else System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
				
				
			}else System.out.println("������ ������ϴ�.");
			
			
		}
		answer();
		this.turn = turn == 2? 1 : 2;
		
		return this.win;
	}
	
	void answer() {
		//����
		for(int i=0; i<this.map.length; i+=3) {
			if(this.map[i].getX()==this.turn && this.map[i+1].getX()==this.turn && 
					this.map[i+2].getX()==this.turn) {
				this.win = this.turn;
			}
		}
		//����
		for(int i=0; i<3; i++) {
			if(this.map[i].getX()==this.turn && this.map[i+3].getX()==this.turn && 
					this.map[i+6].getX()==this.turn) {
				this.win = this.turn;
			}
		}
		//�밢/
		if(this.map[2].getX()==this.turn && this.map[4].getX()==this.turn && 
				this.map[6].getX()==this.turn) {
			this.win = this.turn;
		}
		//�밢\
		if(this.map[0].getX()==this.turn && this.map[4].getX()==this.turn && 
				this.map[8].getX()==this.turn) {
			this.win = this.turn;
		}
	}
	void print() {
		System.out.println("===TTT===");
		for(int i=0; i<this.map.length; i++) {
			if(this.map[i].getX() == 1) {
				System.out.print("[O]");
			}
			else if(this.map[i].getX() == 2) {
				System.out.print("[X]");
			}
			else {
				System.out.print("[ ]");
			}
			if(i %3 == 2) System.out.println();
			
		}
		System.out.println("=========");
	}
	public void run() {
		set();
		while(true) {
			print();
			if(play() != 0) {	
				print();
				System.out.printf("p%d�� �¸�!!",this.win);
				break;
			}
		}
	}
}

public class test003 {

	public static void main(String[] args) {
		// ƽ����
		TTT t = new TTT();
		t.run();
	}

}
