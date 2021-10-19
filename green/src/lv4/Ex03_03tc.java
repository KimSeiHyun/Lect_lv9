package lv4;

import java.util.Scanner;

public class Ex03_03tc {

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
		
		Scanner scan = new Scanner(System.in);
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int itemCount = 0;
		while(true) {
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			System.out.print(": ");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.print("추가할 카테고리명 입력 : " );
				String name = scan.next();
				
				int check = 1;
				for(int i=0; i<itemCount; i++) {
					if(name.equals(items[i][0])) {
						check = -1;
					}
				}
				if(check == 1) {
					items[itemCount][0] = name;
					itemCount ++;
				}
				else {
					System.out.println("이미 존재하는 카테고리입니다.");
				}
			}
			else if(sel == 2) {
				for(int i =0; i<itemCount; i++) {
					System.out.printf("%d) %s\n", i+1, items[i][0]);
				}
				System.out.print("카테고리 선택 : ");
				int choice = scan.nextInt()-1;
				
				if(itemCount > 0 && choice >= 0 && choice < itemCount) {
					System.out.print("아이템 입력 : ");
					String item = scan.next();
					
//					if(items[choice][1] != null) {
//						items[choice][1] = item;
//					}
//					else {
						items[choice][1] += item;	//					
//					}
					items[choice][1] += "/";	//
				}
			}
			else if(sel == 3) {
				for(int i =0; i<itemCount; i++) {
					System.out.printf("%s: %s\n", items[i][0], items[i][1]);
				}
			}
		}
	}

}
