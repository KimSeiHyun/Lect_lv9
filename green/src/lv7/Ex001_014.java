package lv7;

import java.util.Random;
import java.util.Scanner;

class GameArr {
	
	private int num;
	
	GameArr(int x) {
		this.num = x;
	}
	int getNum() {
		return this.num;
	}
	void setNum(int x) {
		this.num = x;
	}
}
class Play {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	GameArr arr[][] = new GameArr[4][4];
	int finishNum;
	int score;
	void set() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				this.arr[i][j] = new GameArr(0);
			}
		}
	}
	
	void print() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(this.arr[i][j].getNum() + "   ");
			}System.out.println("\n");
		}
		System.out.println("scroe : " + this.score);
	}
	
	void start() { //ó���� ������ġ�� ����2 2�� ��ġ 
		int cnt = 0;
		while(cnt < 2) {
			int temp1 = rn.nextInt(4);
			int temp2 = rn.nextInt(4);
			if(this.arr[temp1][temp2].getNum() == 0) {
				this.arr[temp1][temp2].setNum(2);
				cnt++;
			}
			
		}
	}
	
	void addNum() { //�������� ������ ������� ���� ���� 
		int x = 0;
		while(true) {
			int check = 0;
			int cnt = 0;
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					if(this.arr[i][j].getNum() != 0) {
						cnt++;
					}
				}
			}
			if(cnt == 16) break;
			int temp1 = rn.nextInt(4);
			int temp2 = rn.nextInt(4);
			int temp3 = rn.nextInt(5);
			if(temp3 != 0) x = 2; 
			if(temp3 == 0) x = 4;
			if(this.arr[temp1][temp2].getNum() == 0) {
				this.arr[temp1][temp2].setNum(x);
				System.out.printf("%d , %d ������ %d ���� .\n",temp1,temp2,x);
				break;
			}
		}
	}
	
	void up() { //���ڵ��� ������ ���Ұ� ������ ��
		upSort();
		for(int i=1; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(this.arr[i-1][j].getNum() == this.arr[i][j].getNum() ) {
					this.arr[i-1][j].setNum(this.arr[i-1][j].getNum()*2);
					this.arr[i][j].setNum(0);
					this.score += this.arr[i-1][j].getNum();
					if(this.arr[i-1][j].getNum() == 2048) this.finishNum = 2048;
				}
			}
		}
		upSort();
	

	}
	
	void upSort() { // ���� ���� 
		int x = 0;
		while(x < 3) {
			for(int i=1; i<4; i++) {
				for(int j=0; j<4; j++) {
					if(this.arr[i-1][j].getNum() == 0  && this.arr[i][j].getNum() != 0) {
						this.arr[i-1][j].setNum(this.arr[i][j].getNum());
						this.arr[i][j].setNum(0);
					}
				}
			}
			x++;
		}//while(x <3 )
	}
	
	void down() {
		downSort();
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				if(this.arr[i+1][j].getNum() == this.arr[i][j].getNum() ) {
					this.arr[i+1][j].setNum(this.arr[i+1][j].getNum()*2);
					this.arr[i][j].setNum(0);
					this.score += this.arr[i+1][j].getNum();
					if(this.arr[i+1][j].getNum() == 2048) this.finishNum = 2048;
				}
			}
		}
		downSort();
		
	}
	
	void downSort() {
		int x = 0;
		while(x < 3) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<4; j++) {
					if(this.arr[i+1][j].getNum() == 0  && this.arr[i][j].getNum() != 0) {
						this.arr[i+1][j].setNum(this.arr[i][j].getNum());
						this.arr[i][j].setNum(0);
					}
				}
			}
			x++;
		}//while(x <3 )
	}
	
	void left() {
		leftSort();
		for(int i=0; i<4; i++) {
			for(int j=1; j<4; j++) {
				if(this.arr[i][j-1].getNum() == this.arr[i][j].getNum() ) {
					this.arr[i][j-1].setNum(this.arr[i][j-1].getNum()*2);
					this.arr[i][j].setNum(0);
					this.score += this.arr[i][j-1].getNum();
					if(this.arr[i][j-1].getNum() == 2048) this.finishNum = 2048;
				}
			}
		}
		leftSort();
		
	}
	
	void leftSort() {
		int x = 0;
		while(x < 3) {
			for(int i=0; i<4; i++) {
				for(int j=1; j<4; j++) {
					if(this.arr[i][j-1].getNum() == 0  && this.arr[i][j].getNum() != 0) {
						this.arr[i][j-1].setNum(this.arr[i][j].getNum());
						this.arr[i][j].setNum(0);
					}
				}
			}
			x++;
		}//while(x <3 )
	}
	
	
	void right() {
		rightSort();
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				if(this.arr[i][j+1].getNum() == this.arr[i][j].getNum() ) {
					this.arr[i][j+1].setNum(this.arr[i][j+1].getNum()*2);
					this.arr[i][j].setNum(0);
					this.score += this.arr[i][j+1].getNum();
					if(this.arr[i][j+1].getNum() == 2048) this.finishNum = 2048;
				}
			}
		}
		rightSort();
	}
	
	void rightSort() {
		int x = 0;
		while(x < 3) {
			for(int i=0; i<4; i++) {
				for(int j=0; j<3; j++) {
					if(this.arr[i][j+1].getNum() == 0  && this.arr[i][j].getNum() != 0) {
						this.arr[i][j+1].setNum(this.arr[i][j].getNum());
						this.arr[i][j].setNum(0);
					}
				}
			}
			x++;
		}//while(x <3 )
	}
	
	void play () {
		System.out.println("8.��  2.��  4.��  6.��");
		int sel = sc.nextInt();
		if(sel == 8) {
			up();
		}
		if(sel == 2) {
			down();
		}
		if(sel == 4) {
			left();
		}
		if(sel == 6) {
			right();
		}
		addNum();
	}
	
	int finishOne() { // ����2048�� ����� �������ᰪ�� ���� . 
		return this.finishNum;
	}
	
	int finishTwo() { // ���� ������ ���ڰ� ���� ���� ���ڵ� ������ check���� ���Ϲ��� . 
		int check= 2;
		int cnt = 0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(this.arr[i][j].getNum() != 0) {
					cnt++;
				}
			}
		}
		if(cnt == 16) {
			check = 0;
		//up 
			for(int i=1; i<4; i++) {
				for(int j=0; j<4; j++) {
					if(this.arr[i-1][j].getNum() == this.arr[i][j].getNum() ) {
						check = 1;
					}
				}
			}
		//down
			for(int i=0; i<3; i++) {
				for(int j=0; j<4; j++) {
					if(this.arr[i+1][j].getNum() == this.arr[i][j].getNum() ) {
						check = 1;
					}
				}
			}
		//left
			for(int i=0; i<4; i++) {
				for(int j=1; j<4; j++) {
					if(this.arr[i][j-1].getNum() == this.arr[i][j].getNum() ) {
						check = 1;
					}
				}
			}
		//right
			for(int i=0; i<4; i++) {
				for(int j=0; j<3; j++) {
					if(this.arr[i][j+1].getNum() == this.arr[i][j].getNum() ) {
						check = 1;
					}
				}
			}
			
		}
		return check;
	}
	public void run() {
		set();
		start();
		
		while(true) {
			print();
			play();
			if(finishOne() == 2048) {
				System.out.println("game clear !! ");
				print();
				break;
			}
			if(finishTwo() == 0) {
				System.out.println("game over.");
				print();
				break;
			}
		}
	}
}
public class Ex001_014 {

	public static void main(String[] args) {
		Play p = new Play();
		p.run();

		
	}

}
