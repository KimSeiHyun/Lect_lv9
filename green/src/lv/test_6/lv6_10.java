package lv.test_6;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
 */

class Ex11{
	final int SIZE = 9;	
	private int[] front = new int[SIZE];
	private int[] back  = new int[SIZE];	
	private int cnt = 1;
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	public void set() {
		int x = 0;
		while(x <this.SIZE) {
			int rNum = rn.nextInt(9)+1;
			int check = 0;
			for(int i=0; i<this.SIZE; i++) {
				if(this.front[i] ==rNum) check = 1;
			}
			if(check == 0 ) {
				front[x] = rNum;
				x++;
			}
		}
		x = 0;
		while(x <this.SIZE) {
			int rNum = rn.nextInt(9)+10;
			int check = 0;
			for(int i=0; i<this.SIZE; i++) {
				if(this.back[i] ==rNum) check = 1;
			}
			if(check == 0 ) {
				back[x] = rNum;
				x++;
			}
		}
	}
	
	public void print() {
		System.out.println("cnt  : " +cnt);
		System.out.println("front ");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(this.front[i] + " ");
			if(i %3 == 2) System.out.println();
		}System.out.println();
		
		System.out.println("back ");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(this.back[i] + " ");
			if(i %3 == 2) System.out.println();
		}System.out.println();
	}
	public void play() {
		System.out.println("���������� ���ʴ�� idx �Է� ");
		int idx = sc.nextInt();
		if(idx >= 0 && idx < this.SIZE ) {
			if(front[idx] == this.cnt && this.cnt < 10) {
				front[idx] = back[idx];
				cnt++;
			}
			if(front[idx] == this.cnt && this.cnt >= 10) {
				front[idx] = 0;
				cnt++;
			}
		}else System.out.println("�ε��� ���� Ȯ�� ");
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(this.cnt == 19) {
				System.out.println("game clear !! ");
				break;
			}
		}
	}
}

public class lv6_10 {

	public static void main(String[] args) {
		Ex11 e = new Ex11();
		e.run();

	}

}
