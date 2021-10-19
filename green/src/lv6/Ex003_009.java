package lv6;

import java.util.Scanner;

class Ex003_09 {
	Scanner sc = new Scanner(System.in);
	int arr[] = {0, 1, 0, 0, 0, 0, 0, 0, 1 ,0} ;
	int x = arr.length-1;
	int P = 8;
	
	
	void print() {
		arr[x] = P;
		for(int i=0; i<this.arr.length; i++) {
			if(this.arr[i] == 8) {
				System.out.print("옷 ");
			}
			else if(this.arr[i] == 1) {
				System.out.print("■ ");
			}
			else System.out.print("_ ");
		}System.out.println();
	}
	
	void move_break() {
		
		System.out.println("1.왼쪽   2.오른쪽  3.격파 ! ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			if(x>0 && this.arr[x-1] == 0) {
				arr[x] = 0;
				x--;
			}
		}
		else if(sel == 2) {
			if(x<this.arr.length-1 && this.arr[x+1] == 0) {
				arr[x] = 0;
				x++;
			}
		}
		else if(sel == 3) {
			if(x == 0 && this.arr[x+1] == 1) {
				this.arr[x+1] = 0;
			}
			else if (x == this.arr.length-1 && this.arr[x-1] == 1) {
				this.arr[x-1] = 0;
			}
			else if ( x >0 && x < this.arr.length-1) {
				if(this.arr[x-1] == 1 || this.arr[x+1] == 1) {
					this.arr[x-1] = 0;
					this.arr[x+1] = 0;
				}
			}
		}
		
		
	}
	


	
	public void run() {
		while(true) {
			print();
			move_break();
		}
	}
}
public class Ex003_009 {

	public static void main(String[] args) {
		/*
		 * # 숫자 이동하기 : 클래스 + 메서드
		 * 1. 숫자 8은 캐릭터이다.
		 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
		 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
		 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
		 */
		
		Ex003_09 ex = new Ex003_09();
		
		ex.run();
	}

}
