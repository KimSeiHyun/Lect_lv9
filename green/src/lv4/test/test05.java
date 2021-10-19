package lv4.test;

import java.util.Scanner;

public class test05 {

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
		
		// 시작 09:39
		// 종료 10:35 
		// 소요 01:04
		
		
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
		System.out.println("[MART]");
		System.out.println("[1]로 그 인");
		System.out.println("[2]로그아웃");
		System.out.println("[3]쇼     핑");
		System.out.println("[4]장바구니");
		System.out.println("[0]종     료");
		System.out.println("idx  : " + idx);
		System.out.println("log  : " + log);
		int sel = sc.nextInt();
		if(sel == 1) {
			if(log == -1) {
			System.out.println("아이디를 입력해주세요 . ");
			String inId = sc.next();
			int check = -1;
			for(int i=0; i<3; i++) {
				if(ids[i].equals(inId)) {
					idx = i;
					log = i+1;
					check = 0;
				}
			}
			if(check == 0) {
				System.out.println("비밀번호를 입력해주세요 ");
				String inPw = sc.next();
				if(pws[idx].equals(inPw)) {
					System.out.println("로그인이 되었습니다. ");
				}
				else {
					System.out.println("비밀번호를 다시 확인해주세요 . ");
					idx = -1;
					log = -1;
				}
			}
			else {
				System.out.println("없는 아이디입니다. ");
			}
			}
			else {
				System.out.println("이미 로그인 상태입니다. ");
			}
		}
		if(sel == 2) {
			if(log != -1) {
				System.out.println("로그아웃 됐습니다 . ");
				log = -1;
				idx = -1;
			}
			else {
				System.out.println("이미 로그아웃 상태입니다.");
			}
			
		}
		if(sel == 3) {
			if(log != -1) {
			for(int i=0; i<3; i++) {
				System.out.print(i+1+")"+items[i] + "\n");
			}
			System.out.println("번호를 입력해 장바구니에 추가하세요 ! ");
			int num = sc.nextInt()-1;
			if(num >= 0 && num <=2) {
				jang[count][0] = log;
				jang[count][1] = num;
				count++;
			}
			else {
				System.out.println("범위를 벗어난 숫자입니다. ");
			}
			
			}
			else {
				System.out.println("로그인을 먼저 해주세요 ");
			}
			
		}
		if(sel == 4) {
			if(log != -1) {
			for(int i =0; i<MAX_SIZE; i++) {
				if(jang[i][0] == log) {

					System.out.print(ids[idx]+"회원     >" + items[jang[i][1]] + "구매");

				System.out.println();
				}
			}
			}
			else {
				System.out.println("로그인을 먼저 해주세요 . ");
			}
			
		}
		if(sel == 0) {
			System.out.println("종료합니다 . ");
			break;
		}


		}//w

	}

}
