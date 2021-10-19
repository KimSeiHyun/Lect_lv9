package lv4;

import java.util.Scanner;

public class Ex03_04 {

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
		int count = 0;
		String[] items = {"사과", "바나나", "딸기"};
		int log = -1;
		String id = "0";
		int idx = -1;
		while(true) {
			System.out.println("-----------------");
			System.out.println("[MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			System.out.println("idx : " + idx);
			System.out.println("count :" + count);
			if(log == -1) {
				System.out.println("로그아웃 상태입니다.");
			}
			else {
				System.out.println(id+ "님이 로그인중입니다.");
			}
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if(sel == 1) {
				int check = -1;
				if(log == -1) {
				System.out.println("[1]로 그 인 ");
				System.out.print("아이디를 입력해주세요 . ");
				String inId = sc.next();
				System.out.print("비밀번호를 입력해주세요 . ");
				String inPw = sc.next();
				for(int i =0; i<3; i++) {
					if(ids[i].equals(inId) && pws[i].equals(inPw)) {
						check = 1;
					}
				}
				for(int i =0; i<3; i++) {
					if(ids[i].equals(inId) && pws[i].equals(inPw)) {
						System.out.println("로그인이 되었습니다.");
						id = inId;
						log = 1;
						idx = i;

					}

				}
				if(check == -1) {
				System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
				}
				}
				else {
					System.out.println("이미 로그인 상태입니다.");
				}
			}
			else if(sel == 2) {
				if(log == 1) {
					log = -1;
					idx = -1;
					System.out.println("로그아웃 되었습니다 .");
				}
				else { 
					System.out.println("이미 로그아웃 상태입니다.");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
				System.out.println("1)사과\n2)바나나\n3)딸기");
				
				int sel2 = sc.nextInt()-1;
				if( sel2 >=0 && sel2 <3) {
				jang[count][0] = idx;
				jang[count][1] = sel2;
				count ++;
				System.out.println(items[sel2]+"를 장바구니에 담았습니다.");
				}
				else {
					System.out.println("장바구니에 없는 번호입니다.");
				}
				}
				else {
					System.out.println("로그인을 먼저 해주세요 .");
				}
				
			}
			else if(sel == 4) {

				for(int i=0; i<count; i++) {
						for(int j =0; j <1; j++) {
							if(jang[i][0] == idx) {
							System.out.print(ids[idx] + "회원      >  ");
							}						
						}
						for(int j =1; j <2; j++) {
							if(jang[i][0] == idx) {
								int temp = jang[i][1]; 
								System.out.print(items[temp] + "구매");
								System.out.println();
							}						
						}
				}


			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}//clear

	}

}
