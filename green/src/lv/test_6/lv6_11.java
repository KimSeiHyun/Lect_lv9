package lv.test_6;

import java.util.Scanner;
/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 */

class Ex14{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{0,0,1,1,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
	Scanner sc = new Scanner(System.in);
	public void print() {
		for(int i=0; i<5; i++) {
			System.out.print(" "+(i+1) + " ");
		}System.out.println();
		for(int i=0; i<this.ladder.length; i++) {
			for(int j=0; j<this.ladder[i].length; j++) {
				if(this.ladder[i][j] == 0 )System.out.print(" │ ");
				if(j != this.ladder[i].length-1 &&this.ladder[i][j] == 1 && this.ladder[i][j+1] == 1 )System.out.print(" ├─");
				if(j != 0 && this.ladder[i][j] == 1 && this.ladder[i][j-1] == 1)System.out.print("─┤ ");
			}System.out.println();
		}
	}
	
	public void choice() {
		System.out.println("번호를 입력해주세요 ");
		int sel = sc.nextInt()-1;
		if(sel >= 0 && sel < 5) {
			this.x = sel;
			while(true) {
				if(y == this.ladder.length-1) break;
				
				if(this.ladder[y][x] == 0) y++;
				if(x == 4 &&this.ladder[y][x] == 1 && this.ladder[y][x-1] == 1) {
					x--;
					y++;
					System.out.println("a");
					continue;
				}
				if(x == 0 &&this.ladder[y][x] == 1 && this.ladder[y][x+1] == 1) {
					x++;
					y++;
					System.out.println("b");
					continue;
				}
				if(x != 0 && x != 4 &&this.ladder[y][x] == 1) {
					if(this.ladder[y][x-1] == 1) {
						x --;
						y++;
						
						System.out.println("c");
						continue;
					}
					if(this.ladder[y][x+1] == 1) {
						System.out.println("d");
						x ++;
						y++;
						continue;
					}
					
				}
				
 			}
			System.out.println("x : "+x );
			result();
			
		}else System.out.println("번호를 다시 확인");
	}
	
	public void result() {
		System.out.println(this.menu[x]);
	}
	public void run() {
		print();
		choice();
		
	}
}
public class lv6_11 {

	public static void main(String[] args) {
		Ex14 e = new Ex14();
		e.run();

	}

}
