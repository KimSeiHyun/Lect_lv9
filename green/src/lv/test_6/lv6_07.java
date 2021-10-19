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


class Ex08{
	private int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	private int x = 4;
	
	public void print() {
		for(int i=0; i<this.game.length; i++) {
			if(this.game[i] == 1) System.out.print("�� ");
			if(this.game[i] == 2) System.out.print("�� ");
			if(this.game[i] == 0) System.out.print("_ ");
		}System.out.println();
	}
	public void leftMove() {
		if(this.x >0 && this.game[x-1] == 0) {
			this.game[x-1] = 2;
			this.game[x] = 0;
			x--;
		}
	}
	public void rightMove() {
		if(this.x <this.game.length-1 && this.game[x+1] == 0) {
			this.game[x+1] = 2;
			this.game[x] = 0;
			x++;
		}
	}
	public void boom() {
		if(this.x > 0 && this.x <this.game.length-1) {
			if(this.game[x+1] == 1) {
				System.out.println("������ ���� ���� ! ");
				this.game[x+1] = 0;
			}
			if(this.game[x-1] == 1) {
				System.out.println("���� ���� ���� ! ");
				this.game[x-1] = 0;
			}
		}
	}
}
public class lv6_07 {

	public static void main(String[] args) {
		Ex08 e = new Ex08();
		Scanner sc = new Scanner(System.in);
		while(true ) {
			e.print();
			System.out.println("1.����  2.������  3.����");
			int sel = sc.nextInt();
			if(sel == 1) {
				e.leftMove();
			}
			if(sel == 2) {
				e.rightMove();
			}
			if(sel == 3) {
				e.boom();
			}
		}
	}

}
