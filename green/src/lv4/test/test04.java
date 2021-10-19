package lv4.test;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 [관리자]
		 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
		 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
		 * 3. 아이템은 각 행의 두번째 열에 저장한다.
		 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
		 * 예)
		 * {
		 * 		{"과일", "사과/포도/"},
		 * 		{"과자", "홈런볼/쪼리퐁/"},
		 * 		{"음료", "콜라/"},
		 * 		{"육류", "소고기/"}
		 * 		...
		 * } 
		 */
		
		// 시작 08:20
		// 종료 09:37 
		// 소요 01:17
		
		Scanner sc = new Scanner(System.in);
		String[][] items = new String[100][2];
		items[0][0] = "사과";
		for(int i=0; i<items.length; i++) {
			items[i][0] = " ";
			items[i][1] = " ";
		}
		String temp = " ";
		int cnt = 0;
		while(true) {
		System.out.println("[관리자 모드]");
		System.out.println("[1]카테고리 관리");
		System.out.println("[2]아 이 템  관리");
		System.out.println("[3]전체품목 출력");
		
		int sel = sc.nextInt();
		
		if ( sel == 1) {
			System.out.print("추가할 카테고리 입력 : ");
			String s = sc.next();
			int check = 0;
			for(int i=0; i<items.length; i++) {
				for(int j=0; j<2; j++) {
					if(items[i][j].equals(s)) {
						check = -1;
					}
				}
			}
			if(check == 0) {
				items[cnt][0] =s;
				cnt++;
			}
			else {
				System.out.println("이미 있는 카테고리입니다");
			}
		}
		if ( sel == 2) {
			System.out.print("어떤 카테고리에 추가하시겠습니까  : ");
			String s1 = sc.next();
			int check = 0;
			int a = 0;
			for(int i=0; i<items.length; i++) {
				for(int j =0; j<2; j++) {
					if(items[i][j].equals(s1)) {
						a = i;
						check = 1;
					}
				}
			}
			if(check == 1) {
			System.out.print("추가할 아이템 입력 : ");
			String s = sc.next();
				items[a][1] += s+"/";
			}
			else {
				System.out.println("잘못된 카테고리입니다.");
			}

			
		}
		if ( sel == 3) {
			for(int i=0; i<items.length; i++) {
				for(int j=0; j<2; j++) {
					if(items[i][j].equals(temp)) {
					}
					else {
						System.out.print(items[i][j]  + " " );
						
					}
				}
				if(items[i][0].equals(temp)) {
				}
				else {
					System.out.println();
					
				}
		}
		}

		}//w

	}

}
