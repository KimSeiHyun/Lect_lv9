package lv.test_6;

import java.util.Scanner;

//# 사다리 게임

class LadderGame {

	Scanner sc = new Scanner(System.in);

	int[][] ladder = { 
			{ 0, 0, 0, 0, 0 }, 
			{ 1, 2, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 },
			{ 1, 2, 0, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 0, 0, 0, 0 } 
	};

	int x = 0;
	int y = 0;

	String menu[] = {"우동","라면","김밥","참치","고기"};
	
	public void print() {
		for(int i=0; i<5; i++) {
			System.out.print("  "+ (i+1) + " ");
		}System.out.println();
		
		for(int i=0; i<this.ladder.length; i++) {
			System.out.print("  ");
			for(int j=0; j<this.ladder[i].length; j++) {
				if(this.ladder[i][j] == 0) System.out.print("┃   ");
				if(this.ladder[i][j] == 1) System.out.print("┣━━━");
				if(this.ladder[i][j] == 2) System.out.print("┃   ");
			}System.out.println();
		}
		
		System.out.print("  ");
		for(int i=0; i<5; i++) {
			System.out.print(this.menu[i] + " ");
		}System.out.println();
	}
	public void choice() {
		while(true) {
			System.out.println("1~5 사다리를 선택 ");
			int sel = sc.nextInt()-1;
			if(sel >= 0 && sel < 5) {
				this.x = sel;
				while(true) {
					if(this.y == this.ladder.length-1) return;
					if(this.ladder[y][x] ==0) {
						this.y++;
						continue;
					}else if(this.ladder[y][x] == 1) {
						this.x++;
						this.y++;
						continue;
					}else if(this.ladder[y][x] == 2) {
						this.x--;
						this.y++;
						continue;
					}
				}
				
			}else System.out.println("사다리 범위 확인 ! ");
		}
	}
	
	public void result() {
		System.out.println(this.menu[x]+"당첨 ! ");
	}
	public void run() {
		print();
		choice();
		result();
	}
	
}
public class lv6_39 {

	public static void main(String[] args) {
		LadderGame e = new LadderGame();
		e.run();

	}

}
