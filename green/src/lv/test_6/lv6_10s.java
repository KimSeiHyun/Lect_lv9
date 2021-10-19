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

class Ex11s{
	final int SIZE = 9;	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];	
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	int cnt = 1;
	
	public void set() {
		int x = 0;
		while(x< this.SIZE) {
			int rNum = rn.nextInt(9)+1;
			int check = 0;
			for(int i=0; i<this.front.length; i++) {
				if(this.front[i] == rNum) check = 1;
			}
			if(check == 0 ) {
				this.front[x] = rNum;
				x ++;
			}
		}
		x = 0;
		while(x< this.SIZE) {
			int rNum = rn.nextInt(9)+10;
			int check = 0;
			for(int i=0; i<this.front.length; i++) {
				if(this.back[i] == rNum) check = 1;
			}
			if(check == 0 ) {
				this.back[x] = rNum;
				x ++;
			}
		}
	}
	
	
	public void print() {
		System.out.println("front");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(front[i] + " ");
			if(i%3 ==2 ) System.out.println();
		}System.out.println();
		System.out.println("back");
		for(int i=0; i<this.SIZE; i++) {
			System.out.print(back[i] + " ");
			if(i%3 ==2 ) System.out.println();
		}System.out.println();
	}
	
	public void play() {
		System.out.println("cnt : " +this.cnt);
		System.out.print("���������� ���ʴ�� �Է�(�ε���) : ");
		int idx = sc.nextInt();
		if(idx >=0 && idx < this.SIZE) {
			if(cnt < 10) {
				if(front[idx] == this.cnt) {
					this.front[idx] = this.back[idx];
					cnt++;
				}
				
			}else {
				if(front[idx] == this.cnt) {
					this.front[idx] = 0;
					cnt++;
				}
			}
			
		}else System.out.println("�ε��� ���� Ȯ��");
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(cnt == 19) {
				System.out.println("game clear !! ");
				break;
			}
		}
	}
}

public class lv6_10s {

	public static void main(String[] args) {
		Ex11s e = new Ex11s();
		e.run();

	}

}
