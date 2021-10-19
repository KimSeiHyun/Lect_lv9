package lv.test_4;

import java.util.Scanner;

public class lv4_20 {

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
		Scanner sc = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int cnt = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		
		while(true) {
			
			System.out.println("[MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			System.out.println("cnt : " + cnt);
			System.out.println("log : " + log);
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
				System.out.println("아이디 입력 : ");
				String id = sc.next();
				int check = 0;
				int x =0;
				for(int i=0; i<3; i++) {
					if(ids[i].equals(id)) {
						check = 1;
						x = i;
					}
				}
				if(check == 1) {
					int check2 = 0;
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();
						if(pws[x].equals(pw)) {
							check2 = 1;
							System.out.println(ids[x] +"님이 로그인 하셨습니다.");
							log = x+1;
						}
					if(check2 == 0) {
						System.out.println("비밀번호를 다시 확인해주세요 . ");
					}
				}else {
					System.out.println("아이디를 다시 확인해주세요 . ");
				}
				}
				else {
					System.out.println("이미 로그인 상태입니다.");
				}
				
				
			}
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃을 했습니다.");
				}else {
					System.out.println("이미 로그아웃 상태입니다. ");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
				System.out.println("1.사과\n2.바나나\n3.딸기");
					int num = sc.nextInt()-1;
				if(num >=0 && num <3) {
					jang[cnt][0] = log; 
					jang[cnt][1] = num; 
					cnt++;
				}else {
					System.out.println("쇼핑목록의 번호를 다시 확인해주세요 .");
				}

				
				}else {
					System.out.println("로그인을 먼저 해주세요 ");
				}
				
			}
			else if(sel == 4) {
				if(log != -1) {
					for(int i=0; i<cnt; i++) {
						int check = 0;
						for(int j=0; j<2; j++) {
							if(jang[i][0] == log) {
								check = 1;
								System.out.print(ids[log-1]+"님이   " + items[jang[i][1]] + " 구매");
								break;
							}
						}
						if(check == 1) {
						System.out.println();
						}
					}
				}else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}//w

	}

}
