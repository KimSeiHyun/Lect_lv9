package lv.test_6;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + �޼���
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */

class MemoryGame{
	
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// ������ ���� Ƚ��
	
	public void shuffle() {
		int x = 0;
		while(x < 150) {
			int rIdx = rn.nextInt(this.front.length);
			int temp = this.front[0];
			this.front[0] = this.front[rIdx];
			this.front[rIdx] = temp;
			x++;
		}
	}
	
	public void print() {
		System.out.print("front : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.front[i]  +" ");
		}System.out.println();
		System.out.print("back  : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.back[i]  +" ");
		}System.out.println();
	}
	
	public void selectCard() {
		System.out.print("ù���� ī�� (�ε���)�Է� : ");
		int sel1 = sc.nextInt();
		System.out.print("�ι��� ī�� (�ε���)�Է� : ");
		int sel2 = sc.nextInt();
		if(sel1 >= 0 && sel1 < this.front.length && sel2 >= 0 && sel2 < this.front.length) {
			if(sel1 != sel2 && this.front[sel1] == this.front[sel2] ) {
				if(this.back[sel1] == 1 && this.back[sel2] == 1) {
					System.out.println("�̹� ���� ī���Դϴ�.");
				}
				if(this.back[sel1] == 0 && this.back[sel2] == 0) {
					cnt++;
					this.back[sel1] = 1;
					this.back[sel2] = 1;
				}
				
			}else System.out.println("��.");
			
		}else System.out.println("�ε��� ���� Ȯ�� . ");
	}
	void run() {
		shuffle();
		while(true) {
			print();
			selectCard();
			if(this.cnt == 5) {
				System.out.println("game clear !! ");
				break;
			}
		}

	}
}

public class lv6_35 {

	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();
		mg.run();		
	}
}
