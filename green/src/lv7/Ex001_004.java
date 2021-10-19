package lv7;

import java.util.Random;

//1�� ���Ӹ� ��÷�� 5��¥�� �ζǼ�Ʈ �ϼ�

class Lotto {
	int arr[] = new int[7];
	
}

class LottoSet {
	Random rn = new Random();
	Lotto lotto[] = new Lotto[5];
	int cnt = 0;
	int idx = -1;
	void set() {
		for(int i=0; i<this.lotto.length; i++) {
			lotto[i] = new Lotto();
			for(int j=0; j<this.lotto[i].arr.length; j++) {
				int rNum = rn.nextInt(5)+1;
				this.lotto[i].arr[j] = rNum;
			}
		}
	}
	
	void print() {
		for(int i=0; i<this.lotto.length; i++) {
			System.out.println(i+1 + "��° �ζ�");
			for(int j=0; j<this.lotto[i].arr.length; j++) {
				System.out.print(this.lotto[i].arr[j] + " ");
			}System.out.println();
		}
	}
	
	int check() {
		int check = 0;
		for(int i=0; i<this.lotto.length; i++) {
			cnt = 0;
			for(int j=0; j<this.lotto[i].arr.length; j++) {
				if(this.lotto[i].arr[j] == 5) {
					cnt ++;
				}
				else cnt = 0;
			}
			if(cnt >= 3) {
				check ++;
				this.idx = i;
			}
		}

		return check;

	}
	
	void answer() {
		System.out.printf("5�� �������� 3�� ����ִ� �ζǴ� %d��° �Դϴ� . ",this.idx+1);
	}
	
	public void run() {
	//	set();
		while(true) {
			set();
			if(check() == 1) {
				break;
			}
		}
		print();
		answer();
	}
	
}

public class Ex001_004 {

	public static void main(String[] args) {
		LottoSet game = new LottoSet();
		game.run();

	}
}