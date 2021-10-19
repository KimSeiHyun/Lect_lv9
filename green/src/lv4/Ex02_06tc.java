package lv4;

import java.util.Scanner;

public class Ex02_06tc {

	public static void main(String[] args) {
		/*
		 * # 사다리 게임
		 * 1. 인덱스 0~4를 하나선택한다. 
		 * 2. 숫자 0 을 만나면 그냥 아래로 내려간다.
		 * 3. 숫자 1 을 만나면 오른쪽으로 이동후 내려간다.
		 * 4. 숫자 2 를 만나면 완쪽으로 이동후 내려간다.
		 * 5. 오늘의 메뉴 출력 
		 */
		
		Scanner sc = new Scanner(System.in);
		String menu[] = {"떡라면" , "돈까스" ,"짜장면" , "쫄면" , "된장찌개"};
		int choice[] = new int[menu.length];
		int ladder[][]= {
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,0,0},
				{0,1,2,0,0},
				{1,2,0,0,0},
				{0,0,0,1,2},
				{0,0,0,0,0}};
		int x = 0; int y = 0;
		
		while(true) {
			//print
			for(int i=0; i<ladder[0].length; i++) {
				System.out.print(" " + (i+1) + " ");
			}
			System.out.println();
			for( y=0; y<ladder.length; y++) {
				for(int xx = 0; xx<ladder[y].length; xx++) {
					if(ladder[y][xx] == 0) {
						System.out.print(" │ ");
					}
					else if(ladder[y][xx] == 1) {
						System.out.print(" ├─");
						
					}
					else if(ladder[y][xx] == 2) {
						System.out.print("─┤ ");
						
					}
				}
				System.out.println();
	
		}

			for(int i=0; i<5; i++) {
				if(choice[i] == 0) {
					System.out.print(" 0 ");
				}
				else {
					System.out.print(menu[1]);
				}
			}
		
		//실행
		System.out.print("\n번호선택[1~5] : ");
		int sel = sc.nextInt()-1;
		
		if(sel >= 0 && sel < ladder.length) {
			x = sel;
		
			//이동
			for(y=0; y<ladder.length; y++) {
				if(ladder[y][x] == 1) {
					x ++;
				}
				else if(ladder[y][x] == 2 ) {
					x --;
				}
			}
		
			// 결과 위치
		System.out.println(menu[x]);
		choice[x] = 1; // 선택완료 
		
		
		
		
		
		}
		
		}
		
		
	}

}
