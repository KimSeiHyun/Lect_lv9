package lv.test_7;

import java.util.Scanner;

class Tic {
	private int num;
	
	Tic (int num){
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

}

class Tictactoe {
	public static Scanner sc = new Scanner(System.in);
	private Tic arr[][] = new Tic[3][3];
	private int turn = 1;
	private int win = 0;
	
	public void set() {
		for(int i=0; i<this.arr.length; i++) {
			for(int j=0; j<this.arr[i].length; j++) {
				this.arr[i][j] = new Tic(0);
			}
		}
	}
	
	public void print( ) {
		System.out.println("====틱택톡====");
		for(int i=0; i<this.arr.length; i++) {
			for(int j=0; j<this.arr[i].length; j++) {
				if(this.arr[i][j].getNum() ==0) System.out.print("[ ] ");
				if(this.arr[i][j].getNum() ==1) System.out.print("[O] ");
				if(this.arr[i][j].getNum() ==2) System.out.print("[X] ");
			}System.out.println();
		}System.out.println("=============");
	}
	
	public void play() {
		System.out.printf("p%d의 차례입니다. \n",this.turn);
		System.out.print("y좌표 입력 : ");
		int  y = sc.nextInt();
		System.out.print("x좌표 입력 : ");
		int  x = sc.nextInt();
		if(y >=0 && y< this.arr.length && x >= 0 && x < this.arr.length) {
			if(this.arr[y][x].getNum() == 0) {
				this.arr[y][x].setNum(this.turn);
				winCheck();
				this.turn = this.turn == 2 ? 1 : 2;
			}else System.out.println("이미 선택된 자리입니다.");
			
		}else System.out.println("좌표의 범위 확인 !! ");
	}
	
	public void winCheck() {
		//가로
		for(int i=0; i<this.arr.length; i++) {
			if(this.arr[i][0].getNum() == this.turn
					&& this.arr[i][1].getNum() == this.turn
					&& this.arr[i][2].getNum() == this.turn) {
				this.win = this.turn;
			}
		}
		//세로
		for(int i=0; i<this.arr.length; i++) {
			if(this.arr[0][i].getNum() == this.turn
					&& this.arr[1][i].getNum() == this.turn
					&& this.arr[2][i].getNum() == this.turn) {
				this.win = this.turn;
			}
		}
		//대각\
		if(this.arr[0][0].getNum() == this.turn
				&& this.arr[1][1].getNum() == this.turn
				&& this.arr[2][2].getNum() == this.turn) {
			this.win = this.turn;
		}
		//대각/
		if(this.arr[0][2].getNum() == this.turn
				&& this.arr[1][1].getNum() == this.turn
				&& this.arr[2][0].getNum() == this.turn) {
			this.win = this.turn;
		}
		
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(this.win != 0 ) {
				System.out.printf("p%d의 승리 !! ",this.win);
				break;
			}
		}
	}


}

public class lv7_05 {

	public static void main(String[] args) {
		Tictactoe ttt = new Tictactoe();
		ttt.run();
		
	}
}