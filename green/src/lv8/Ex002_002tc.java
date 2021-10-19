package lv8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Tictactoe2{
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Vector<Integer>> tic = new ArrayList<>();
	int turn = 1;
	
	public void setGame() {
		for(int i=0; i<3; i++) {
			Vector<Integer> temp = new Vector<Integer>();
			for(int j=0; j<3; j++) {
				temp.add(0);
			}
			tic.add(temp);
		}

	}
	
	public void run() {
		setGame();
		while(!end()) {
			printGame();
			select();
		}
		printWinner();
		
	}
	
	private void printWinner() {
		System.out.printf("p%d win !! ",this.turn == 1 ? 2 : 1);
	}
	
	private boolean end () {
		boolean win = false;
		int turn = this.turn == 1? 2 : 1;
		//가로
		win = win ? win : checkHori(turn);
		//세로
		win = win ? win : checkVerti(turn);
		//대각\
		win = win ? win : checkDiag(turn);
		//대각/
		win = win ? win : checkInverse(turn);
		
		
		return win;
	}
	private boolean checkInverse(int turn) {
		int cnt = 0;
		for(int i=0; i<this.tic.size(); i++) {
			if(this.tic.get(i).get(this.tic.get(i).size()-i-1) == turn) cnt++;
		}
		if(cnt == 3) return true;
		
		
		return false;
	}

	private boolean checkDiag(int turn) {
		int cnt = 0;
		for(int i=0; i<this.tic.size(); i++) {
			if(this.tic.get(i).get(i) == turn) cnt ++;
		}
		if(cnt == 3) return true;
		return false;
	}

	private boolean checkVerti(int turn) {
		for(int i=0; i<this.tic.size(); i++) {
			int cnt = 0;
			for(int j=0; j<this.tic.get(i).size(); j++) {
				if(this.tic.get(j).get(i) == turn) cnt ++;
			}
			if(cnt == 3) return true;
		}
		return false;
	}

	private boolean checkHori(int turn) {
		for(int i=0; i<this.tic.size(); i++) {
			int cnt = 0;
			for(int j=0; j<this.tic.get(i).size(); j++) {
				if(this.tic.get(i).get(j) == turn) cnt ++;
			}
			if(cnt == 3) return true;
		}
		return false;
	}

	private void select() {
		while(true) {
			System.out.printf("p%d Y : ", this.turn);
			int y = sc.nextInt();
			System.out.printf("p%d X : ", this.turn);
			int x = sc.nextInt();
			if( y < 0 || y >= this.tic.size() || x<0 || x>= this.tic.get(0).size() ||
					this.tic.get(y).get(x) != 0) {
				continue;
			}
			
			//mark
			this.tic.get(y).set(x, this.turn);
			this.turn = this.turn == 1 ? 2 : 1 ;
			break;
		}
		
	}
	private void printGame() {
		for(int i=0; i<this.tic.size(); i++) {
			for(int j=0; j<this.tic.get(i).size(); j++) {
				if(this.tic.get(i).get(j) == 1) {
					System.out.print("[O] ");
				}
				else if(this.tic.get(i).get(j) == 2) {
					System.out.print("[X] ");
				}
				else {
					System.out.print("[ ] ");
				}
			}
			System.out.println();
		}
	}
	
}

public class Ex002_002tc {

	public static void main(String[] args) {
		Tictactoe2 game = new Tictactoe2();
		game.run();

		
	}
}