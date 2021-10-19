package lv.test_4;

import java.util.Scanner;

public class lv4_36 {

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
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		
		while(true) {
			System.out.println("log = " + log);
			System.out.println("[MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("id 입력 : ");
				String id = sc.next();
				int idx = -1;
				for(int i=0; i<ids.length; i++) {
					if(ids[i].equals(id)) idx = i;
				}
				if(idx != -1) {
					System.out.print("pw 입력 : ");
					String pw = sc.next();
					if(pws[idx].equals(pw)) {
						log = idx;
					}else System.out.println("비밀번호가 틀렸습니다.");
				}else System.out.println("아이디를 찾을 수 없습니다.");
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
				}else System.out.println("로그인을 먼저 해주세요 . ");
			}
			else if(sel == 3) {
				if(log != -1) {
					for(int i=0; i<items.length; i++) {
						System.out.println("[" + (i+1)+"]  " + items[i]);
					}
					System.out.println("원하시는 아이템의 번호를 입력해주세요 . ");
					int num = sc.nextInt()-1;
					jang[count][0] = log;
					jang[count][1] = num;
					count++;
				}else System.out.println("로그인을 먼저 해주세요 . ");
			}
			else if(sel == 4) {
				if(log != -1) {
					for(int i=0; i<count; i++) {
						System.out.println(ids[jang[i][0]] +"   >>>>>    "   + items[jang[i][1]] + "구입");
					}
				}else System.out.println("로그인을 먼저 해주세요 . ");
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}



	}

}