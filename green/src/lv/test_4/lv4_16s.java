package lv.test_4;

import java.util.Scanner;

public class lv4_16s {

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
		
		System.out.println(" 0  1  2  3  4");
		for(int i=0; i<ladder.length; i++) {
			for(int j=0; j<ladder[i].length; j++) {
				if(ladder[i][j] == 0) {
					System.out.print(" │ ");
				}else if(ladder[i][j] == 1) {
					System.out.print(" ├─");
				}else if(ladder[i][j] == 2) {
					System.out.print("─┤ ");
				}
			}
			System.out.println();
		}
		System.out.println(" 0  1  2  3  4");
		
		System.out.println("사다리를 하나 골라주세요");
		int num = sc.nextInt();
		x = num;
		
		for(int i=0; i<ladder.length; i++) {
			if(ladder[y][x] == 0) {
				y++;
			}
			else if(ladder[y][x] == 1) {
				x++;
				y++;
			}
			else if(ladder[y][x] == 2) {
				x--;
				y++;
			}
		}
		System.out.println(menu[x]);

	}

}
