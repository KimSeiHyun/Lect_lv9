package lv8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Tictactoe{
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Vector<Integer>> tic = new ArrayList<>();
	int turn = 1;
	int win = 0;
	public void set() {
		for(int i=0; i<3; i++) {
			Vector<Integer> temp = new Vector<Integer>();
			for(int j=0; j<3; j++) {
				temp.add(0);
			}
			tic.add(temp);
		}

	}
	public void print() {
		System.out.println("------------");
		for(int i=0; i<tic.size(); i++) {
			for(int j=0; j<tic.get(i).size(); j++) {
				if(tic.get(i).get(j) == 1) {
					System.out.print("[O] ");
				}
				else if(tic.get(i).get(j) == 2) {
					System.out.print("[X] ");
				}else System.out.print("[ ] ");
			}System.out.println();
		}
		System.out.println("------------");
		
	}
	
	public void play() {
		while(true) {
			System.out.printf("p%d의 차례입니다 .\n",turn);
			System.out.print("x좌표 입력 : ");
			int x = sc.nextInt();
			System.out.print("y좌표 입력 : ");
			int y = sc.nextInt();
			if(x>= 0 && x < 3 && y >= 0 && y< 3) {
				if(tic.get(x).get(y) == 0) {
					tic.get(x).set(y, turn);
					break;
				}else {
					System.out.println("이미 선택된 좌표입니다.");
				}
			}else {
				System.out.println("좌표의 범위를 다시 확인해주세요 . ");
			}
			
		}
		
	}
	
	public void winnerCheck() {
		//가로
		for(int i=0; i<3; i++) {
			if(tic.get(i).get(0) == turn && tic.get(i).get(1) == turn 
					&& tic.get(i).get(2) == turn ) {
				win = turn;
			}
		}
		//세로
		for(int i=0; i<3; i++) {
			if(tic.get(0).get(i) == turn && tic.get(1).get(i) == turn 
					&& tic.get(2).get(i) == turn ) {
				win = turn;
			}
		}
		//대각\
		int cnt = 0 ;
		for(int i=0; i<3; i++) {
			if(tic.get(i).get(i) == turn) {
				cnt ++;
			}
		}
		if(cnt == 3) win = turn;
		//대각/
		cnt = 0 ;
		for(int i=0; i<3; i++) {
			if(tic.get(i).get(2-i) == turn) {
				cnt ++;
			}
		}
		if(cnt == 3) win = turn;
	}
	
	public void run() {
		set();
		while(true) {
			print();
			play();
			winnerCheck();
			if(win != 0) {
				System.out.printf("p%d의 승리 !! \n",turn);
				print();
				break;
			}
			
			this.turn = this.turn == 2 ? 1 : 2;
		}
	}
	
}

public class Ex002_002 {

	public static void main(String[] args) {
	

		Tictactoe game = new Tictactoe();
		game.run();

		


	}

}
