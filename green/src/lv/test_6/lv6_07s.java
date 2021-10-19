package lv.test_6;

import java.util.Scanner;

/*
 * # �����̵�[3�ܰ�] : Ŭ���� + ����
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
 * ��) 
 *  0 0 0 0 0 0 0 2 
 *  ����(1) ������(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */


class Ex08s{
	private int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	
	public void print() {
		for(int i=0; i<this.game.length; i++) {
			if(this.game[i] == 0) System.out.print("_ ");
			if(this.game[i] == 1) System.out.print("�� ");
			if(this.game[i] == 2) System.out.print("�� ");
		}System.out.println();
	}
	
	public void left() {
		for(int i=1; i<this.game.length; i++) {
			if(this.game[i] == 2 && this.game[i-1] == 0) {
				this.game[i] = 0;
				this.game[i-1] = 2;
				break;
			}
		}
	}
	
	public void right() {
		for(int i=0; i<this.game.length-1; i++) {
			if(this.game[i] == 2 && this.game[i+1] == 0) {
				this.game[i] = 0;
				this.game[i+1] = 2;
				break;
			}
		}
	}
	
	public void smash() {
		for(int i=1; i<this.game.length-1; i++) {
			if(this.game[i] == 2 && this.game[i+1] == 1) {
				this.game[i+1] = 0;
			}
			if(this.game[i] == 2 && this.game[i-1] == 1) {
				this.game[i-1] = 0;
			}
		}
	}
}
public class lv6_07s {

	public static void main(String[] args) {
		Ex08s e = new Ex08s();
		Scanner sc = new Scanner(System.in);
		while(true) {
			e.print();
			System.out.println("1.�����̵�   2.�������̵�  3.����");
			int move = sc.nextInt();
			if(move == 1) {
				e.left();
			}
			if(move == 2) {
				e.right();
			}
			if(move == 3) {
				e.smash();
			}
		}
	}

}
