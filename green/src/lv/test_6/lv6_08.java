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



class Ex09{
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	private int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	private int[] back = new int[10];
	
	private int cnt = 0;		// ������ ���� Ƚ��
	
	public void print() {
		System.out.print("front : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.front[i] + " ");
		}System.out.println();
		System.out.print("back  : ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.back[i] + " ");
		}System.out.println();
	}
	public void shuffle() {
		int x = 0;
		while(x < 300) {
			int rIdx = rn.nextInt(10);
			int temp = this.front[0];
			this.front[0] = this.front[rIdx];
			this.front[rIdx] = temp;
			x++;
		}
	}
	public void play() {
		System.out.println("ù���� ī���� �ε��� �Է� : ");
		int idx1 = sc.nextInt();
		System.out.println("�ι��� ī���� �ε��� �Է� : ");
		int idx2 = sc.nextInt();
		if(idx1 >=0 && idx1 < this.front.length && idx2>=0 && idx2< this.front.length) {
			if(this.front[idx1] == this.front[idx2] && this.back[idx1] != 1 && this.back[idx2] != 1 ) {
				this.back[idx1] = 1;
				this.back[idx2] = 1;
			}else System.out.println("ī�带 �ٽ� Ȯ�����ּ���");
			
		}else System.out.println("������ �ٽ� Ȯ�����ּ��� .");
	}
	public boolean end() {
		this.cnt = 0;
		for(int i=0; i<this.back.length; i++) {
			if(this.back[i] == 1) {
				this.cnt ++;
			}
		}
		if (this.cnt == 10) return true;
		return false;
	}
	public void run() {
		shuffle();
		while(!end()) {
			print();
			play();
		}
		System.out.println("game clear!! ");
	}
}

public class lv6_08 {

	public static void main(String[] args) {
		Ex09 e = new Ex09();
		e.run();
	}

}
