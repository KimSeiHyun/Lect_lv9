package lv7.test;

import java.util.Random;
import java.util.Scanner;

//���۽ð� 01 : 57
//����ð� 02 : 36
//�ҿ�ð� 00 : 39

class Horse {
	private int arr[] = new int[20];
	int x = arr.length;
	
	int getArr(int x ) {
		return arr[x];
	}
	void setArr(int x , int y) {
		arr[x] = y;
	}
}

class Play {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	Horse line[] = new Horse[5];
	int check[] = new int[5];
	int total[] = new int[5];
	int turn = 0;
	int cnt = 1;
	void set() {
		for(int i=0; i<this.line.length; i++) {
			line[i] = new Horse();
		}
	}
	
	void play() {
		System.out.print("�����ϰ� �����ø� �ƹ� ���ڳ� �Է����ּ��� ");
		int pwqer = sc.nextInt();
		int check2 = 0;
		for(int i=0; i<line.length; i++) {
			for(int j=0; j<line[i].x; j++) {
				int rNum = rn.nextInt(5);
				if(this.turn == 0) {
					line[i].setArr(rNum, i+1);
					this.total[i] += rNum;
					break;
				}
				else {
					if(line[i].getArr(j) == i+1) {
						if(j < 19) {
							if(j + rNum >= 19 && check2 == 0) {
								line[i].setArr(j, 0);
								line[i].setArr(19, i+1);
								this.total[i] = 19;
								this.check[i] = cnt;
								cnt++;
								check2 ++;
								break;
							}
							else if (j + rNum < 19) {
								line[i].setArr(j, 0);
								line[i].setArr(j+rNum, i+1);
								this.total[i] += rNum;
								break;
								
							}
							
						}
					}
				}
			}
		}
		
		this.turn ++;
	}
	void print() {
		for(int i=0; i<this.line.length; i++) {
			System.out.print(i+1+"��) ");
			for(int j=0; j<this.line[i].x; j++) {
				System.out.print(this.line[i].getArr(j)+ " ");
			}System.out.println();
		}
		System.out.print("total :");
		for(int i=0; i<5; i++) {
			System.out.print(total[i] + " ");
		}System.out.println();
		System.out.print("check :");
		for(int i=0; i<5; i++) {
			System.out.print(check[i] + " ");
		}System.out.println();
	}
	public void run () {
		set();
		while(true) {
			print();
			if(this.cnt ==6) {
				System.out.println("���� ���� !! ");
				break;
			}
			play();
		}
	}
}
public class test005 {

	public static void main(String[] args) {
		//�渶
		Play p = new Play();
		p.run();
	}

}
