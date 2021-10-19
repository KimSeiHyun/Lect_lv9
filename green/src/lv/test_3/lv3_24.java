package lv.test_3;

import java.util.Scanner;

public class lv3_24 {

	public static void main(String[] args) {
		/*
		 * # 회원가입 
		 * 1. 가입
		 * . 아이디 와 비밀번호를 입력받아 가입
		 * . 아이디 중복검사
		 * 2. 탈퇴
		 * . 아이디 를 입력받아 탈퇴
		 */
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		Scanner sc = new Scanner(System.in);
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			for(int i=0; i<5; i++) {
				System.out.print(ids[i] + " ");
			}System.out.println();
			for(int i=0; i<5; i++) {
				System.out.print(pws[i] + " ");
			}System.out.println();
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(cnt == 5) {
					System.out.println("회원가입을 할 공간이 없습니다.");
					continue;
				}
				int check = 0;
				System.out.println("아이디를 입력해주세요 ");
				int inId = sc.nextInt();
				System.out.println("비밀번호를 입력해주세요 ");
				int inPw = sc.nextInt();
				for(int i=0; i<5; i++) {
					if(inId == ids[i]) {
						check = 1;
						System.out.println("중복된 아이디입니다.");
						break;
					}
				}
				
				if(check == 0) {
				for(int i=0; i<5; i++) {
					if(ids[i] == 0 && pws[i] == 0) {
						ids[i] = inId;
						pws[i] = inPw;
						cnt ++;
						break;
					}
				}
				}
				
			}
			else if(sel == 2) {
				System.out.println("아이디를 입력해주세요.");
				int delId = sc.nextInt();
				for(int i=0; i<5; i++) {
					if(delId == ids[4]) {
						ids[4] = 0;
						pws[4] = 0;
						cnt --;
						break;
					}
					if(ids[i] == delId) {
						ids[i] = ids[i+1];
						pws[i] = pws[i+1];
						ids[i+1] = 0;
						pws[i+1] = 0;
						cnt--;
					}
					if(ids[i] == 0 ) {
						if(i == 4) {
							break;
						}
						ids[i] = ids[i+1];
						ids[i+1] = 0;
						pws[i] = pws[i+1];
						pws[i+1] = 0;
					}
				}
				
			}
			
		}//w

		
	}


}