package lv.test_6;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + ����
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */



class Ex09s{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// ������ ���� Ƚ��
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void print() {
		System.out.print("front : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(front[i] + " ");
		}System.out.println();
		System.out.print("back  : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(back[i] + " ");
		}System.out.println();
	}
	public void shuffle( ) {
		int x = 0;
		while(x < 150) {
			int r =rn.nextInt(front.length);
			int temp = this.front[0];
			this.front[0] = this.front[r];
			this.front[r] = temp;
			x++;
		}
	}
	public void play( ) {
		System.out.println("���� ���ڸ� �ΰ� ����ּ��� . (�ε��� �Է� ) ");
		System.out.print("ù�����ε���  : ");
		int sel1 = sc.nextInt();
		System.out.print("�ι����ε���  : ");
		int sel2 = sc.nextInt();
		if(sel1 >= 0 && sel1 < this.front.length && sel2 >= 0 && sel2 < this.front.length) {
			if(this.front[sel1] == this.front[sel2] && this.back[sel1] == 0 && this.back[sel2] == 0) {
				this.back[sel1] = 1;
				this.back[sel2] = 1;
				cnt++;
			}
			
		}else System.out.println("�ε��� ���� Ȯ��");
	
		
	}
	public void run() {
		shuffle();
		while(true) {
			print();
			play();
			if(this.cnt == 5) {
				System.out.println("game clear !! ");
				break;
			}
		}
	}
}

public class lv6_08s {

	public static void main(String[] args) {
		Ex09s e = new Ex09s();
		e.run();

	}

}
