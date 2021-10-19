package lv4;

import java.util.Scanner;

public class Ex02_06 {

	public static void main(String[] args) {
		/*
		 * # 사다리 게임
		 * 1. 인덱스 0~4를 하나선택한다. 
		 * 2. 숫자 0 을 만나면 그냥 아래로 내려간다.
		 * 3. 숫자 1 을 만나면 오른쪽으로 이동후 내려간다.
		 * 4. 숫자 2 를 만나면 완쪽으로 이동후 내려간다.
		 * 5. 오늘의 메뉴 출력 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String menu[] = {"떡라면" , "돈까스" ,"짜장면" , "쫄면" , "된장찌개"};
		
		
		int ladder[][]= {
			//   0 1 2 3 4 
				{0,0,0,0,0},	// 0 0 5 0 0
				{1,2,0,1,2},	// 0 0 5 0 0
				{0,1,2,0,0},	// 0 0 0 0 0
				{0,0,1,2,0},	// 0 0 0 0 0
				{1,2,0,0,0},	// 0 0 0 0 0
				{0,1,2,0,0},	// 0 0 0 0 0
				{1,2,0,0,0},	// 0 0 0 0 0
				{0,0,0,1,2},	// 0 0 0 0 0
				{0,0,0,0,0}}; 	// 0 0 0 0 0
				//[9][5]
		
		int x = 0; int y = 0;
		int temp = 0;
		int ladder2[][] = new int[9][5];
		for(int i=0; i<5; i++) {
			System.out.print(" " + (i+1) + " ");
		}
		System.out.println();
		for(int i=0; i<9; i++) {
			for(int j =0; j<5; j++) {
				if(ladder[i][j] == 0) {
					System.out.print(" │ ");
				}
				if(ladder[i][j] == 1) {
					System.out.print(" ├─");
					
				}
				if(ladder[i][j] == 2) {
					System.out.print("─┤ ");
					
				}
			}
			System.out.println();

		}
		System.out.println("사다리 게임 ! ");
		System.out.println("1~5사이의 번호를 입력해주세요 . ");
		int num = scan.nextInt()-1;
		
		for( y=0; y<9; y++) {
			for( x =0; x<5; x++) {
				if(y ==8 && ladder2[y][x] == temp) {
					System.out.println(menu[x]);
					break;
				}
				if( y == 0 && x == num) {
					temp = 5;
					ladder2[y+1][x] = temp;
				}
				if( ladder[y][x] == 1 && ladder2[y][x] == temp) {
					ladder2[y+1][x+1] = temp;
				}
				else if( ladder[y][x] == 2 && ladder2[y][x] == temp) {
					ladder2[y+1][x-1] = temp;										
				}
				else if( ladder[y][x] == 0 && ladder2[y][x] == temp) {
					ladder2[y+1][x] = temp;
				}
			}

		}

		
		
		
	} //clear

}
