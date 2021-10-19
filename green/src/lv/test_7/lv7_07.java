package lv.test_7;

import java.util.Random;
import java.util.Scanner;

//경마

class Horse {
	// 경주마 한 마리
	private Integer horse[] = new Integer[20];
	
	public Horse(int x) {
		for(int i=0; i<this.horse.length; i++) {
			this.horse[i] = x;
		}
	}
	
	public int getHorse(int idx) {
		return this.horse[idx];
	}
	
	public int getSize() {
		return this.horse.length;
	}
	
	public void setHorse(int idx , Integer x) {
		this.horse[idx] = x;
	}
}

class Racing {
	
	private Horse arr[] = new Horse[5];
	private int total[] = new int[5];
	private int check[] = new int[5];
	private int count = 1;
	public static Scanner sc = new Scanner(System.in);
	public static Random rn = new Random();
	public void set() {
		for(int i=0; i<this.arr.length; i++) {
			this.arr[i] = new Horse(0);
		}
	}
	
	public void print() {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print((i+1) + " : ");
			for(int j=0; j<this.arr[i].getSize(); j++) {
				System.out.print(this.arr[i].getHorse(j) + " ");
			}System.out.println();
		}
		
		System.out.print("total : ");
		for(int i=0; i<this.total.length; i++) {
			System.out.print(this.total[i] + " ");
		}System.out.println();
		System.out.print("check : ");
		for(int i=0; i<this.total.length; i++) {
			System.out.print(this.check[i] + " ");
		}System.out.println();
	}
	
	public void play() {
		System.out.print("말들을 움직이려면 아무 숫자나 입력 : ");
		int asdasd = sc.nextInt();
		int check = 0;
		for(int i=0; i<this.arr.length; i++) {
				int rNum = rn.nextInt(5);
				
				if(rNum + this.total[i] < 19) {
					this.arr[i].setHorse(this.total[i], 0);
					this.total[i] += rNum;
					this.arr[i].setHorse(this.total[i], i+1);
					continue;
				}
				if(check == 1 && this.total[i] != 19 && rNum + this.total[i] >= 19) {
					this.arr[i].setHorse(this.total[i], 0);
					this.total[i] = 18;
					this.arr[i].setHorse(this.total[i], i+1);
				}
				if(check == 0 &&this.total[i] != 19 && rNum + this.total[i] >= 19) {
					this.arr[i].setHorse(this.total[i], 0);
					this.total[i] = 19;
					this.arr[i].setHorse(this.total[i], i+1);
					this.check[i] = this.count;
					count++;
					check = 1;
				}
		}
	}
	public void run() {
		set();
		while(true) {
			print();
			play();
			if(this.count == 6) {
				print();
				System.out.println("game clear !! ");
				break;
			}
		}
	}
	
}

public class lv7_07 {

	public static void main(String[] args) {
		Racing game = new Racing();
		game.run();
 
	}

}