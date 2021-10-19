package lv6;

import java.util.Scanner;

class Ex001_10 {
	int arr[][] =        {{0,0,0,0,0} , 
						  {1,1,0,1,1} ,
						  {0,0,1,1,0} ,
						  {1,1,0,0,0} ,
						  {0,1,1,0,0} ,
						  {0,0,1,1,0} ,
						  {1,1,0,0,0} ,
						  {0,0,0,1,1} ,
						  {0,0,0,1,1} ,
						  {0,0,0,0,0}};
	
	int x = 0;
	int y = 0;
}
public class Ex001_010 {

	public static void main(String[] args) {
		/*
		 * # 사다리 게임
		 * 1. 0을 만나면 아래로 내려간다.
		 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
		 * 3. x의 위치를 입력받고 사다리를 표현한다.

		 */
		
		Ex001_10 ex = new Ex001_10();
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<ex.arr.length; i++) {
			for(int j=0; j<ex.arr[i].length; j++) {
				System.out.print(ex.arr[i][j] + " ");
			}System.out.println();
		}
		System.out.print("출발할 줄을 골라주세요 (0~4) : ");
		int x = sc.nextInt();
		
		ex.x = x;
		while(true) {
			if(ex.arr[ex.y][ex.x] == 0) {
				ex.y++;
			}
			if(ex.arr[ex.y][ex.x] == 1) {
				if(ex.x == 0) {
					ex.x++;
				}
				else if (ex.x == 4) {
					ex.x--;
				}
				else {
					if(ex.arr[ex.y][ex.x-1] == 1) {
						ex.x--;
					}
					else if(ex.arr[ex.y][ex.x+1] == 1) {
						ex.x++;
					}
				}
				ex.y++;
			}
			
			if(ex.y == 9) {
				ex.arr[ex.y][ex.x] = 2; 
				System.out.printf("x는 %d줄에서 끝났습니다.\n",ex.x+1);
				break;
			}

			
		}//while(true)
		for(int i=0; i<ex.arr.length; i++) {
			for(int j=0; j<ex.arr[i].length; j++) {
				System.out.print(ex.arr[i][j] + " ");
			}System.out.println();
		}
		
	}

}
