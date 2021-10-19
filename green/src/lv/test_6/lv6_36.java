package lv.test_6;

import java.util.Scanner;

/*
 * # ���� �̵��ϱ� : Ŭ���� + �޼���
 * 1. ���� 8�� ĳ�����̴�.
 * 2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
 * 3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
 * 4. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.
 */

class NumberGame{
	
	Scanner sc = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	
	public void moveLeft() {
		if(this.player >0) {
			this.move[this.player] = 0;
			this.player --;
			this.move[this.player] = 8;
		}
	}
	
	public void moveRight() {
		if(this.player < this.move.length-1) {
			this.move[this.player] = 0;
			this.move[this.player+1] = 8;
			this.player++;
		}
	}
	
	public void print() {
		for(int i=0; i<this.move.length; i++) {
			if(this.move[i] == 0) System.out.print("_ ");
			if(this.move[i] == 8) System.out.print("�� ");
		}System.out.println();
	}
	public void run() {
		while(true) {
			print();
			System.out.println("1.����  2.������");
			int move = sc.nextInt();
			if(move == 1) moveLeft(); 
			if(move == 2) moveRight();
		}
	}
	
	
}

public class lv6_36 {

	public static void main(String[] args) {
		NumberGame e = new NumberGame();
		e.run();

	}

}
