package lv.test_4;

import java.util.Scanner;

public class lv4_30 {

	public static void main(String[] args) {
		// 옷이 이동숫자를 입력받을때마다 이동 하는데 
		// 외각으로만 이동 아래그림참조 
		Scanner sc = new Scanner(System.in);
		/*
		 * # 나만의 마블
		 * 옷 □ □ □ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		 //입력 ==> 3 
		
		/*
		 * # 나만의 마블
		 * □ □ □ 옷 □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		 //입력 ==> 3 
		
		/*
		 * # 나만의 마블
		 * □ □ □ □ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ 옷 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		int arr[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			if(i != 0 && i != 4) {				
				for(int j=1; j<4; j++) {
					arr[i][j] = 1;
				}
			}
		}
		arr[0][0] = 2;
		int y = 0;
		int x = 0;
		while(true) {
			System.out.println("x : " + x);
			System.out.println("y : " + y);
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(arr[i][j] == 0) System.out.print("□ ");
					if(arr[i][j] == 1) System.out.print("■ ");
					if(arr[i][j] == 2) System.out.print("옷 ");
				}System.out.println();
			}
			
			System.out.print("몇칸을 이동할지 입력 : (1~3)");
			int move = sc.nextInt();
			if(move >0 && move <4) {
				if(y == 0 && x <4) {
					if(move + x < 5) {
						arr[y][x+move] = 2;
						arr[y][x] = 0;
						x = x+move;
						continue;
					}else if(move+x >=5){
						arr[y+(x-4+move)][4] = 2;
						arr[y][x] = 0;
						y = (x-4+move);
						x = 4;
						continue;
					}
				}
				if(x == 4 && y < 4) {
					if(move + y < 5) {
						System.out.println("a");
						arr[y+move][x] = 2;
						arr[y][x] = 0;
						y = y+move;
					}else if(move+y >=5){
						System.out.println("b");
						arr[4][x-(y-4+move)] = 2;
						arr[y][x] = 0;
						x = x-(y-4+move);
						y = 4;
						continue;
					}
				}
				if(y == 4 && x > 0) {
					if(x - move >= 0) {
						arr[y][x-move] = 2;
						arr[y][x] = 0;
						x = x-move;
						continue;
					}else if(x - move < 0){
						arr[(x+4-move)][0] = 2;
						arr[y][x] = 0;
						y = (x+4-move);
						x = 0;
						continue;
					}
				}
				if(x == 0 && y > 0) {
					if(y - move >= 0) {
						System.out.println("a");
						arr[y-move][x] = 2;
						arr[y][x] = 0;
						y = y-move;
						continue;
					}else if(y - move < 0){
						System.out.println("b");
						arr[0][move-y] = 2;
						arr[y][x] = 0;
						x = move-y;
						y = 0;
						continue;
					}
				}
				
			}else System.out.println("범위를 다시 확인.");
			
		}//while
		
		
		
		
	}

}
