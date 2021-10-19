package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex003_08 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int front[] = {1,1,2,2,3,3,4,4,5,5};
	int check[] = new int[this.front.length];
	
	void suffle() {
		int x = 0;
		while(x < 200) {
			int rNum = rn.nextInt(this.front.length-1);
			int temp = this.front[0];
			this.front[0] = this.front[rNum];
			this.front[rNum] = temp;
			x++;
		}
		
	}
	
	void print() {
		System.out.print("front  ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.front[i] + " ");
		}System.out.println();
		System.out.print("check  ");
		for(int i=0; i<this.front.length; i++) {
			System.out.print(this.check[i] + " ");
		}System.out.println();
	}
	
	void choice () {
		System.out.print("1~10ī���� ��ġ�� �Է�1 : ");
		int sel2 = sc.nextInt()-1;
		System.out.print("1~10ī���� ��ġ�� �Է�2 : ");
		int sel1 = sc.nextInt()-1;
		if(sel1 >= 0 && sel1 <=9 && sel2 >= 0 && sel2 <=9) {
			if(this.front[sel1] == this.front[sel2]) {
				this.check[sel1] = 1;
				this.check[sel2] = 1;
			}
			
		}else {
			System.out.println("������ ������ϴ�.");
		}
		System.out.println();
	}
	
	int cnt() {
		int cnt =0;
		
		for(int i=0; i<this.front.length; i++) {
			if(this.check[i] == 1) {
				cnt++;
			}
		}
		if(cnt == 10) {
			System.out.println("game clear !! ");
		}
		return cnt;
	}
	
	
	
	
	
	
	
	public void run() {
		suffle();
		
		while(true) {
			print();
			choice();
			if(cnt() == 10) break;
			
		}
		
	}
}

public class Ex003_008 {

	public static void main(String[] args) {
		
		/* Ŭ���� + �޼���
		 * # ���� ���� : Ŭ���� + �޼���
		 * 1. front �迭 ī�� 10���� ���´�.
		 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
		 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
		 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
		 */
		
		Ex003_08 ex = new Ex003_08();
		
		ex.run();
		
	}

}
