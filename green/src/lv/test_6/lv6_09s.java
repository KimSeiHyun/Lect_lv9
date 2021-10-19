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
		System.out.println("===ƽ����===");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(this.game[i][j].equals("0")) System.out.print("[ ] ");
				if(this.game[i][j].equals("1")) System.out.print("[O] ");
				if(this.game[i][j].equals("2")) System.out.print("[X] ");
			}System.out.println();
		}System.out.println("==========");
	}
	
	public void play() {
		System.out.printf("p%d�� �����Դϴ�.\n",this.turn);
		System.out.print("x��ǥ �Է� : ");
		int x = sc.nextInt();
		System.out.print("y��ǥ �Է� : ");
		int y = sc.nextInt();
		if(x >=0 && x < 3 && y >= 0 && y <3 ) {
			if(this.game[y][x].equals("0")) {
				this.game[y][x] = this.turn+"";
				endCheck();
				this.turn = this.turn == 2?1:2;
			}else System.out.println("�̹� ���õ� �ڸ��Դϴ� .");
			
			
		}else System.out.println("��ǥ���� Ȯ�� !! ");
	}
	
	public void endCheck() {
		//����
		for(int i=0; i<3; i++) {
			if(game[i][0].equals(this.turn+"") &&game[i][1].equals(this.turn+"") 
					&& game[i][2].equals(this.turn+"")) {
				this.win  = this.turn;
			}
		}
		//����
		for(int i=0; i<3; i++) {
			if(game[0][i].equals(this.turn+"") &&game[1][i].equals(this.turn+"") 
					&& game[2][i].equals(this.turn+"")) {
				this.win  = this.turn;
			}
		}
		//�밢\
		if(game[0][0].equals(this.turn+"") &&game[1][1].equals(this.turn+"") 
				&& game[2][2].equals(this.turn+"")) {
			this.win  = this.turn;
		}
		//�밢/
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
				System.out.printf("p%d�� �¸� !! ",this.win);
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
