package lv7;

import java.util.Random;
import java.util.Scanner;

//�渶

class Horse {
	// ���ָ� �� ����
	int arr[] = new int[20];
}

class Racing {
	// ���� ����
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	
	int horseX[] = new int[5];
	int check[] = new int[5];
	Horse horse[] = new Horse[5];
	int cnt = 1;
	void set() {
		for(int i=0; i<this.horse.length; i++) {
			this.horse[i] = new Horse();
		}
	}
	void play() {
		System.out.println("������ �����̷��� �ƹ��ų� �Է��ϼ��� . ");
		int qqq = sc.nextInt();
		move();
	}
	void move() {
		int x = 0;
		int check = 0;
		while(x <5 ) {
			if(this.horseX[x] <19) {
				this.horse[x].arr[this.horseX[x]] = 0; 									
			}


			int rNum = rn.nextInt(4); 
			if(this.horseX[x] ==19) {
				x++;
				continue;
			}
			if(this.horseX[x]+rNum <19) {
				this.horseX[x] += rNum;
				this.horse[x].arr[this.horseX[x]] = x+1; 	
				x++;
				continue;
			}
			if(this.horseX[x]+ rNum >= 19 && check == 0) {
				this.horseX[x] = 19;
				this.horse[x].arr[this.horseX[x]] = x+1; 	
				this.check[x] = cnt;
				cnt++;
				x++;
				check = 1;
			}
			
		}
	}
	void print() {
		for(int i=0; i<this.horse.length; i++) {
			for(int j=0; j<this.horse[i].arr.length; j++) {
				System.out.print(this.horse[i].arr[j] + " ");
			}System.out.println();
		}
		

		System.out.println("check");
		for(int i=0; i<5; i++) {
			System.out.print(check[i] + " ");
		}System.out.println();
	}
	
	int end() {

		return cnt;
	}
	public void run() {
		set();
		while(true) {
			print();
			if(end() == 6) {
				System.out.println("���� ���� !! ");
				break;
			}
			play();
		}
	}
}


public class Ex001_005 {

	public static void main(String[] args) {
		Racing game = new Racing();
		game.run();
		
		
	}

}
