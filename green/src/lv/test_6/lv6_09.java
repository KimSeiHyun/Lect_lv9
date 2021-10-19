package lv.test_6;

import java.util.Scanner;

/* 
 * # ƽ����
 * === ƽ���� ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]�ε��� �Է� : 6
 * === ƽ���� ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]�¸�
 * 
 */

class Ex10{
	
	String[][] game = new String[3][3];
	
	private int turn = 1;
	private int win = 0;		
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				game[i][j] = "0";
			}
		}
	}
	public void print() {
		System.out.println("===ƽ����===");
		for(int i=0; i<this.game.length; i++) {
			for(int j=0; j<3; j++) {
				if(this.game[i][j].equals("0")) System.out.print("[ ] ");
				if(this.game[i][j].equals("1")) System.out.print("[O] ");
				if(this.game[i][j].equals("2")) System.out.print("[X] ");
			}System.out.println();
		}System.out.println("===========");
	}
	public void play ( ) {
		System.out.printf("p%d�� �����Դϴ�.\n",this.turn);
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("y : ");
		int y = sc.nextInt();
		if(game[y][x].equals("0")) {
			game[y][x] = this.turn+"";
			end();
			this.turn = this.turn == 2 ? 1 : 2;
		}else System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
	}
	
	public void end() {
		String temp = this.turn+"";
		//����
		for(int i=0; i<3; i++) {
				if(this.game[i][0].equals(temp) && this.game[i][1].equals(temp)&& this.game[i][2].equals(temp)) {
					this.win = this.turn;
				}
		}
		//����
		for(int i=0; i<3; i++) {
			if(this.game[0][i].equals(temp) && this.game[1][i].equals(temp)&& this.game[2][i].equals(temp)) {
				this.win = this.turn;
			}
	}
		//�밢\
		if(this.game[0][0].equals(temp) && this.game[1][1].equals(temp)&& this.game[2][2].equals(temp)) {
			this.win = this.turn;
		}
		//�밢/
		if(this.game[0][2].equals(temp) && this.game[1][1].equals(temp)&& this.game[2][0].equals(temp)) {
			this.win = this.turn;
		}
		
		
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(this.win != 0 ) break;
		}
		System.out.printf("p%d�� �¸�!! ",this.win);
	}
}

public class lv6_09 {

	public static void main(String[] args) {
		Ex10 e = new Ex10();
		e.run();

	}

}
