package lv.test_6;

import java.util.Scanner;

//# ƽ����



class TicTacToe{
	
	Scanner sc = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 1;
	int win = 0;		// 1[turn1�¸�] 2[turn2�¸�]
	
	public void setArr() {
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<this.game[i].length; j++) {
				this.game[i][j] = "0";
			}
		}
	}
	
	public void play() {
		while(true) {
			System.out.printf("p%d�� �����Դϴ� .\n",this.turn);
			System.out.print("x��ǥ �Է� : ");
			int x = sc.nextInt();
			System.out.print("y��ǥ �Է� : ");
			int y = sc.nextInt();
			if(x >= 0 && x <this.game.length && y >= 0 && y <this.game[x].length) {
				if(this.game[y][x].equals("0")) {
					this.game[y][x] = this.turn+"";
					winCheck();
					this.turn = this.turn == 2 ? 1 : 2;
					break;
				}else System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
			}else System.out.println("�ε��� ������ Ȯ�����ּ��� . ");
		}	
	}
	
	public void winCheck() {
		String temp = this.turn+"";
		//����
		for(int i=0; i<3; i++) {
				if(this.game[i][0].equals(temp) && this.game[i][1].equals(temp)
						&& this.game[i][2].equals(temp)) {
					this.win = this.turn;
				}
		}
		//����
		for(int i=0; i<3; i++) {
			if(this.game[0][i].equals(temp) && this.game[1][i].equals(temp)
					&& this.game[2][i].equals(temp)) {
				this.win = this.turn;
			}
		}
		//�밢\
		if(this.game[0][0].equals(temp) && this.game[1][1].equals(temp)
				&& this.game[2][2].equals(temp)) {
			this.win = this.turn;
		}
		//�밢/
		if(this.game[0][2].equals(temp) && this.game[1][1].equals(temp)
				&& this.game[2][0].equals(temp)) {
			this.win = this.turn;
		}
	}
	
	
	public void print() {
		System.out.println("====ƽ����====");
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<this.game[i].length; j++) {
				if(this.game[i][j].equals("0")) System.out.print("[ ] ");
				if(this.game[i][j].equals("1")) System.out.print("[O] ");
				if(this.game[i][j].equals("2")) System.out.print("[X] ");
			}System.out.println();
		}System.out.println("=============");
	}
	
	public void run() {
		setArr();
		while(true) {
			print();
			play();
			if(this.win != 0) {
				System.out.printf("p%d�� �¸�!! ",this.win);
				break;
			}
		}
		
	}
	
}
public class lv6_37 {

	public static void main(String[] args) {
		TicTacToe e = new TicTacToe();
		e.run();

	}

}
