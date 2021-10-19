package lv.test_6;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���ϱ� ����
 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
 * 2. 6���� �迭�� �ε����� 0���� 5������ ���� �� 3���� �ߺ� ���� ������ 
       �� �ε����� �� �� ���� ����Ѵ�. 
 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
*  ��)  4, 7, 5, 3, 2, 9  //   ����:  14   ==> �ε��� 3���� ��� ���� ���߸�ȴ�.  
    ����)  3,4,5 (�������� ����� ���� ���ü����ִ�)
 */

class Ex15s{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];	
	int total = 0;
	
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		int x = 0;
		while(x <6) {
			int rNum = rn.nextInt(10)+1;
			int check = 0;
			for(int i=0; i<this.game.length; i++) {
				if(this.game[i] == rNum) {
					check = 1;
				}
			}
			
			if(check == 0) {
				this.game[x]  = rNum;
				x++;
			}
		}
		
		x = 0;
		while(x < 3) {
			int rIdx = rn.nextInt(6);
			int check = 0;
			for(int i=0; i<3; i++) {
				if(this.idx[i] == rIdx) check = 1;
			}
			
			if(check == 0) {
				this.idx[x] = rIdx;
				this.total += this.game[rIdx];
				x++;
			}
		}
		for(int i=0; i<3; i++) {
			this.myIdx[i] = -1;
		}
	}
	
	public void print() {
		System.out.print("game  : ");
		for(int i=0; i<this.game.length; i++) {
			System.out.print(this.game[i] + " ");
		}System.out.println();
		System.out.print("idx   : ");
		for(int i=0; i<this.idx.length; i++) {
			System.out.print(this.idx[i] + " ");
		}System.out.println();
		System.out.print("myidx : ");
		for(int i=0; i<this.idx.length; i++) {
			System.out.print(this.myIdx[i] + " ");
		}System.out.println();
		System.out.println("total : "+this.total);
	}
	
	public void play() {
		System.out.println("�������� 3���� �ε����� ����ּ��� . ");
		int x = 0;
		while(x < 3) {
			System.out.printf("%d���� �ε��� :",x+1);
			int idx = sc.nextInt();
			int check = 0;
			if(idx >= 0 && idx < 6) {
				for(int i=0; i<3; i++) {
					if(this.myIdx[i] == idx) {
						check = 1;
					}
				}
				if(check == 0) {
					this.myIdx[x] = idx;
					x++;
				}else {
					System.out.println("�̹� ���õ� �ε����Դϴ�.");
				}
			}else System.out.println("�ε��� ���� Ȯ�� . ");
		}
	}
	
	public boolean end() {
		int temp = 0;
		for(int i=0; i<3; i++) {
			temp += this.game[this.myIdx[i]];
		}
		if(temp == this.total ) {
			return true;
		}
		else {
			for(int i=0; i<3; i++) {
				this.myIdx[i] = -1;
			}
			return false;
		}
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(end()) break;
		}
		System.out.println("game clear!");
	}
}

public class lv6_12s {

	public static void main(String[] args) {
		Ex15s e = new Ex15s();
		e.run();

	}

}
