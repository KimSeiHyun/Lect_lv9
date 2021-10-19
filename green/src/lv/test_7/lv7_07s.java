package lv.test_7;

import java.util.Random;
import java.util.Scanner;

//경마

class Horses {
	private int horse[] = new int[20];
	
	public Horses(int x) {
		for(int i=0; i<horse.length; i++) {
			this.horse[i] = 0;
		}
	}
	
	public int getSize() {
		return this.horse.length;
	}
	public void setHorse(int idx , int x) {
		this.horse[idx] = x;
	}
	
	public int getHorse(int idx) {
		return this.horse[idx];
	}
}

class Racings {
	public static Random rn = new Random(); 
	public static Scanner sc = new Scanner(System.in);
	private Horses arr[] = new Horses[5];
	private int total[] = new int[5];
	private int check[] = new int[5];
	private int cnt = 1;
	
	public void set() {
		for(int i=0; i<arr.length; i++) {
			this.arr[i] = new Horses(0);
		}
	}
	
	public void print() {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print((i+1) + " : ");
			for(int j=0; j<this.arr[i].getSize(); j++) {
				System.out.print(this.arr[i].getHorse(j)+ " ");
			}System.out.println();
		}
		System.out.print("total : ");
		for(int i=0; i<this.total.length; i++) {
			System.out.print(this.total[i] + " ");
		}System.out.println();
		System.out.print("check : ");
		for(int i=0; i<this.check.length; i++) {
			System.out.print(this.check[i] + " ");
		}System.out.println();
	}
	
	public void play() {
		System.out.print("진행하려면 아무 숫자나 입력 : ");
		int asdasdasda = sc.nextInt();
		int x = 0;
		int check = 0;
		while(x < 5) {
			int r = rn.nextInt(5);
			if(r + this.total[x] < 19) {
				this.arr[x].setHorse(this.total[x], 0);
				this.total[x] += r;
				this.arr[x].setHorse(this.total[x], x+1);
			}
			else if (check == 0 &&r + this.total[x] >= 19 && this.total[x] != 19) {
				this.arr[x].setHorse(this.total[x], 0);
				this.total[x] = 19;
				this.arr[x].setHorse(this.total[x], x+1);
				this.check[x] = this.cnt;
				this.cnt ++;
				check = 1;
			}
			x++;
			
			
		}
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(this.cnt == 6) {
				print();
				System.out.println("게임 종료 ! ");
				break;
			}
		}
	}
	// 게임 구현
}

public class lv7_07s {

	public static void main(String[] args) {
		Racings game = new Racings();
		game.run();
 
	}

}