package lv3;

import java.util.Scanner;

public class Ex01_25 {

	public static void main(String[] args) {
		/*
		 * # 회원가입 
		 * 1. 가입
		 * . 아이디 와 비밀번호를 입력받아 가입
		 * . 아이디 중복검사
		 * 2. 탈퇴
		 * . 아이디 를 입력받아 탈퇴
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		int cnt = 2;
		boolean run = true;
		while(run) {
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel == 1) {}
			else if(sel == 2) {}
		}
		
		
		
	}

}
