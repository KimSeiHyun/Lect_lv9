package lv7;

import java.util.Scanner;

class Tic {
	// �׸� �� ĭ 
	int tic;
	
}

class Tictactoe {
	// ���� ����
	Tic tic[] = new Tic[9];
	Scanner sc = new Scanner(System.in);
	int turn = 1;
	void ticSet() {
		for(int i=0; i<this.tic.length; i++) {
			this.tic[i] = new Tic();
		}
	}
	
	void print() {
		System.out.println("====ƽ����====");
		for(int i=0; i<this.tic.length; i++) {
			if(this.tic[i].tic == 0) System.out.print("[ ] "); 
			else if(this.tic[i].tic == 1) System.out.print("[O] ");
			else if(this.tic[i].tic == 2) System.out.print("[X] ");
			if(i%3 == 2) System.out.println();
		}
	}
	void choice() {
		System.out.printf("p%d�� �����Դϴ� . " ,this.turn);
		while(true) {
			int idx = sc.nextInt();
			if(idx >= 0 && idx <= 8) {
				if(this.tic[idx].tic == 0) {
					this.tic[idx].tic = turn;
					break;
				}
				else {
					System.out.println("�̹� �� �ڸ��Դϴ�.");
				}
				
			}else System.out.println("������ ������ ������ϴ�.");
		}
		
		
	}
	
	int win() {
		int x = -1;
		//����
		for(int i=0; i<this.tic.length; i+=3) {
			if(this.tic[i].tic == this.turn && this.tic[i+1].tic == this.turn && this.tic[i+2].tic == this.turn) {
				x = turn;
			}
		}
		//����
		for(int i=0; i<3; i++) {
			if(this.tic[i].tic == this.turn && this.tic[i+3].tic == this.turn && this.tic[i+6].tic == this.turn) {
				x = turn;
			}
		}
		//�밢�� \
		if(this.tic[0].tic == this.turn && this.tic[4].tic == this.turn && this.tic[8].tic == this.turn) {
			x = turn;
		}
		//�밢�� / 
		if(this.tic[2].tic == this.turn && this.tic[4].tic == this.turn && this.tic[6].tic == this.turn) {
			x = turn;
		}
			
			
		return x;
	}
	public void run() {
		ticSet();
		while(true) {
			print();
			choice();
			if(win() != -1) {
				print();
				System.out.printf("p%d�� �̰���ϴ� !! \n",this.turn);
				break;
			}
			this.turn = this.turn == 1 ? 2 : 1;
		}
	}
}

public class Ex001_003 {

	public static void main(String[] args) {
		Tictactoe ttt = new Tictactoe();
		ttt.run();
		
	}
}