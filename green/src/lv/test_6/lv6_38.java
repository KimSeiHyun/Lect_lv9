package lv.test_6;

import java.util.Random;
import java.util.Scanner;

// 1to50
class SpeedGame {

	Scanner sc = new Scanner(System.in);
	Random rn = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];
	int cnt = 1;
	public void ranNumSet() {
		int x = 0;
		while(x < 9) {
			int rNum = rn.nextInt(9)+1;
			int check = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(this.front[i][j] == rNum) check = 1;
				}
			}
			if(check ==0) {
				int check2 = 0;
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						if(this.front[i][j] == 0) {
							this.front[i][j] = rNum;
							check2 = 1;
							x++;
							break;
						}
					}
					if(check2 == 1) break;
				}
				
			}
		}
		
		x = 0;
		while(x < 9) {
			int rNum = rn.nextInt(9)+10;
			int check = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(this.back[i][j] == rNum) check = 1;
				}
			}
			if(check ==0) {
				int check2 = 0;
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						if(this.back[i][j] == 0) {
							this.back[i][j] = rNum;
							check2 = 1;
							x++;
							break;
						}
					}
					if(check2 == 1) break;
				}
				
			}
		}
	}
	
	public void print() {
		System.out.println("front");
		for(int i=0; i<3 ;i++) {
			for(int j=0; j<3; j++) {
				System.out.print(this.front[i][j] + " ");
			}System.out.println();
		}System.out.println();
		System.out.println("back");
		for(int i=0; i<3 ;i++) {
			for(int j=0; j<3; j++) {
				System.out.print(this.back[i][j] + " ");
			}System.out.println();
		}System.out.println();
	}
	
	public void play() {
		System.out.println("1부터 차례대로 입력해나가기(인덱스를입력해서) . ");
		System.out.print("x좌표 입력 : ");
		int x = sc.nextInt();
		System.out.print("y좌표 입력 : ");
		int y = sc.nextInt();
		if(x >= 0 && x < 3 && y >= 0 && y < 3) {
			if(this.cnt < 10) {
				if(this.front[y][x] == this.cnt) {
					this.front[y][x] = this.back[y][x];
					this.cnt++;
				}
			}else {
				if(this.front[y][x] == this.cnt) {
					this.front[y][x] = 0;
					this.cnt++;
				}
			}
			
		}else System.out.println("범위 확인 . ");
	}
	public void run() {
		ranNumSet();
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
public class lv6_38 {

	public static void main(String[] args) {
		SpeedGame e = new SpeedGame();
		e.run();

	}

}
