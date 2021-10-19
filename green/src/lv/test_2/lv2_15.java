package lv.test_2;

import java.util.Scanner;

public class lv2_15 {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
				System.out.println("로그인할 아이디를 입력해주세요 . ");
				int inAcc = sc.nextInt();
				
				if(inAcc == dbAcc1 || inAcc == dbAcc2) {
					System.out.println("비밀번호를 입력해주세요 ");
					int inPw = sc.nextInt();
					if(inAcc == dbAcc1 && inPw == dbPw1 || inAcc == dbAcc2 &&inPw == dbPw2) {
						System.out.println(inAcc + "님께서 로그인에 성공했습니다.");
						log = inAcc;
					}
					else {
						System.out.println("비밀번호를 다시 확인해주세요 . ");
					}
				}
				else {
					System.out.println("아이디를 다시한번 확인해주세요 . ");
				}
				}
				else {
					System.out.println("이미 로그인 상태입니다.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
				System.out.println("로그아웃이 되었습니다.");
				}
				else {
					System.out.println("이미 로그아웃 상태입니다 .");
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}//w
		
		
		
	}

}
