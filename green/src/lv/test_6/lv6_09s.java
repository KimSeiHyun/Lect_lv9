package lv.test_6;

import java.util.Scanner;

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

class Ex10s{
	
	String[][] game = new String[3][3];
	Scanner sc= new Scanner(System.in);
	int turn = 1;
	int win = 0;		
	
	public void set() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				this.game[i][j] = "0";
			}
		}
	}
	
	public void print() {
		System.out.println("===틱택톡===");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(this.game[i][j].equals("0")) System.out.print("[ ] ");
				if(this.game[i][j].equals("1")) System.out.print("[O] ");
				if(this.game[i][j].equals("2")) System.out.print("[X] ");
			}System.out.println();
		}System.out.println("==========");
	}
	
	public void play() {
		System.out.printf("p%d의 차례입니다.\n",this.turn);
		System.out.print("x좌표 입력 : ");
		int x = sc.nextInt();
		System.out.print("y좌표 입력 : ");
		int y = sc.nextInt();
		if(x >=0 && x < 3 && y >= 0 && y <3 ) {
			if(this.game[y][x].equals("0")) {
				this.game[y][x] = this.turn+"";
				endCheck();
				this.turn = this.turn == 2?1:2;
			}else System.out.println("이미 선택된 자리입니다 .");
			
			
		}else System.out.println("좌표범위 확인 !! ");
	}
	
	public void endCheck() {
		//가로
		for(int i=0; i<3; i++) {
			if(game[i][0].equals(this.turn+"") &&game[i][1].equals(this.turn+"") 
					&& game[i][2].equals(this.turn+"")) {
				this.win  = this.turn;
			}
		}
		//세로
		for(int i=0; i<3; i++) {
			if(game[0][i].equals(this.turn+"") &&game[1][i].equals(this.turn+"") 
					&& game[2][i].equals(this.turn+"")) {
				this.win  = this.turn;
			}
		}
		//대각\
		if(game[0][0].equals(this.turn+"") &&game[1][1].equals(this.turn+"") 
				&& game[2][2].equals(this.turn+"")) {
			this.win  = this.turn;
		}
		//대각/
		if(game[0][2].equals(this.turn+"") &&game[1][1].equals(this.turn+"") 
				&& game[2][0].equals(this.turn+"")) {
			this.win  = this.turn;
		}
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(this.win != 0) {
				System.out.printf("p%d의 승리 !! ",this.win);
				break;
			}
		}
	}
}

public class lv6_09s {

	public static void main(String[] args) {
		Ex10s e = new Ex10s();
		e.run();
	}

}
