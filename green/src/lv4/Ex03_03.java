package lv4;

import java.util.Scanner;

public class Ex03_03 {

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
		
		Scanner sc = new Scanner(System.in);
		String[][] items = new String[100][2];
		items[0][0] = "사과";
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int cnt = 0;
		
		while(true) {
			System.out.println("cnt : " + cnt);
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			System.out.print(": ");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("카테고리를 입력해주세요 ");
				String s = sc.next();
				int check = 1;
				for(int i =0; i<cnt; i++) {
						if(s.equals(items[i][0])) {
							check = -1;
						}
				}
				
				if(check == 1) {
					items[cnt][0] = s;
					cnt++;
				}
				else {
					System.out.println("이미 있는 카테고리 입니다 .");
				}
			}
			else if(sel == 2) {
				System.out.println("카테고리 번호를 입력해주세요 . ");
				int cntNum = sc.nextInt()-1;
				if(cntNum >cnt-1 || cntNum <0) {
					System.out.println("잘못된 카테고리 번호입니다 .");
					continue;
				}
				System.out.println("아이템을 입력해주세요 .");
				String item = sc.next();
				items[cntNum][1] += item;
				items[cntNum][1] += "/";
				
			}
			else if(sel == 3) {
				
				
				for(int i=0; i<cnt; i++) {
					System.out.print("번호 " + (i+1) +" : ");
					for(int j=0; j<2; j++) {
						System.out.print( items[i][j] + " ");
					}
					System.out.println();
				}
			}
	
		}//clear
	
		
	}

}
