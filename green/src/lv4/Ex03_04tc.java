package lv4;

import java.util.Scanner;

public class Ex03_04tc {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 [장바구니]
		 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
		 * 	1) 사과
		 *  2) 바나나
		 *  3) 딸기
		 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
		 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
		 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
		 * 예)
		 * {
		 * 		{0, 1},				qwer회원 			> 사과구매
		 * 		{1, 2},				javaking회원 		> 바나나구매
		 * 		{2, 1},				abcd회원			> 사과구매
		 * 		{0, 3},				qwer회원			> 딸기구매
		 * 		...
		 * }
		 */
		
		Scanner scan = new Scanner(System.in);
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int count = 0;
		String[] items = {"사과", "바나나", "딸기"};
		int log = -1;
		while(true) {
			System.out.println("[MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					System.out.println("id : ");
					String id = scan.next();
					System.out.println("pw : ");
					String pw = scan.next();
					//string 함수비교할떄는 == 대입연사자대신 equals 함수를 꼭 쓰기! 
					for(int i=0; i<ids.length; i++) {
						if(id.equals(ids[i]) && pw.equals(pws[i])) {
							log = i;
							System.out.printf("%s 회원님 반갑습니다.\n", ids[log]);
							
						}
					
				}
				}
				else {
					System.out.println("이미 로그인 상태입니다 . ");
				}
				if(log == -1) {
					System.out.println("회원정보를 확인하세요 . ");
				}
			}
			else if(sel == 2) {
				if(log != -1 ) {
					log = -1;
					System.out.println("로그아웃 완료 ! ");
				}
				else {
					System.out.println("이미 로그아웃 된 상태입니다 . ");
				}
			}
			else if(sel == 3) { // 쇼핑 
				if( log != -1) {
					while(true) {
					for(int i =0; i<items.length; i++) {
						System.out.printf("%d) %s\n", i+1, items[i]);
					}
					System.out.println("0) 뒤로가기");
					System.out.print("상품선택  : ");
					int item = scan.nextInt()-1;
					
					if(item == -1) {
						break;
					}
					if(item >= 0 && item < items.length ) {
						//장바구니에 넣기 
						jang[count][0] = log;
						jang[count][1] = item;
						count ++;
					}
				}
				}
				else {
					System.out.println("로그인을 해주세요 . ");
				}
			}
			else if(sel == 4) {
				//카운트 역할을 하는 임시배열 persnal
				int persnal[] = new int[items.length]; 
				if(log != -1) {
					for(int i=0; i<count; i++) {
						if(jang[i][0] == log) {
							persnal[jang[i][1]] ++;
						}
					}
					
					for(int i=0; i<persnal.length; i++) {
						if(persnal[i] >0) {
							System.out.print(items[i] + ": "); // 상품명
							System.out.println(persnal[i] + "개"); // 개수 
						}
					}
				}
				else {
					System.out.println("로그인을 해주세요 ! ");
				}
				
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
