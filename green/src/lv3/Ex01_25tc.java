package lv3;

import java.util.Scanner;

public class Ex01_25tc {

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
		int[] ids = {0, 0, 0, 0, 0}; // 중복 확인 후 가입처리 . 
		int[] pws  = {0, 0, 0, 0, 0};
		
		int cnt = 0;
		boolean run = true;
		while(run) {
			System.out.println("cnt : " + cnt );
			for(int i =0; i<5; i++ ) {
				System.out.print(ids[i] + " ");
			}
			System.out.println();
			for(int i =0; i<5; i++ ) {
				System.out.print(pws[i] + " ");
			}
			System.out.println();
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			
			if(sel == 1) { // 배열 컨트롤러 ( 추가 ) 			
			System.out.print("가입할 아이디 : ");
			int inputId = scan.nextInt();
			
			boolean  check = true;
			
			for(int i=0; i<cnt; i++) {
				if(ids[i] == inputId)	{
					check = false; 
					
				}
			
			}
			if(check == true) {
				System.out.print("비밀번호 입력 : ");
				int inputPw = scan.nextInt();
				
				ids[cnt] = inputId;
				pws[cnt] = inputPw;
				cnt ++;
				
				System.out.println("회원가입을 환영합니다/");
			}
			else {
				System.out.println("이미 사용중인 아이디입니다 . ");
			}
		
			}
			
			
			else if(sel == 2) {
				System.out.print("탈퇴할 아이디 입력 : ");
				int inputId = scan.nextInt();
				
				int delIdx = -1;
				for(int i=0; i<5; i++) {//삭제할 인덱스의 정보 찾기 
					if(ids[i] == inputId) {
						delIdx = i;
					}
				}
				
				if(delIdx != -1) {
					System.out.print("비밀번호 입력 ");
					int inputPw = scan.nextInt();
					
					if (pws[delIdx] == inputPw) {
						
						for(int i= delIdx; i<cnt-1; i++) {
							ids[i] = ids[i+1];
							pws[i] = pws[i+1];
						}
						ids[cnt-1] = 0;
						pws[cnt-1] = 0;
						cnt --;
//						ids[delIdx] = 0;
//						pws[delIdx] = 0;
//						cnt --;
					}
					else {
						System.out.println("회원정보를 다시 확인해주세요 . ");
					}
				}
				else {
					System.out.println("회원정보를 다시 확인해주세요 . ");
					
				}
				
			}
			
		}
		
		
		
		
		
	}

}
