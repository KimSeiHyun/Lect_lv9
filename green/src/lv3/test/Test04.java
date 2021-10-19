package lv3.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		/*
		 * # 회원가입 
		 * 1. 가입
		 * . 아이디 와 비밀번호를 입력받아 가입
		 * . 아이디 중복검사
		 * 2. 탈퇴
		 * . 아이디 를 입력받아 탈퇴
		 */
		
		// 시작 10:46
		// 종료 10:56
		// 소요 12시간10분
		
		int id[] = new int[5];
		int pw[] = new int[5];
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		
		while (t) {
			System.out.println("cnt : " + cnt);
			System.out.print("id : ");
			for(int i=0; i<5; i++) {
				System.out.print(id[i] + " ");
			}
			System.out.println();
			System.out.print("pw : ");
			for(int i=0; i<5; i++) {
				System.out.print(pw[i] + " ");
			}
			System.out.println();
			System.out.println("#회원가입 . \n1.가입 \n2.탈퇴 \n3.종료");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				int check = 1;
				System.out.println("아이디를 입력해주세요 . ");
				int inId = sc.nextInt();
				System.out.println("비밀번호를 입력해주세요 . ");
				int inPw = sc.nextInt();
				
				for(int i =0; i<cnt; i++) {
					if(id[i]==inId) {
						check = -1;
					}
				}
				
				if(check == 1) {
					id[cnt] = inId;
					pw[cnt] = inPw;
					cnt++;
				}
				else {
					System.out.println("이미 회원가입된 아이디입니다.");
				}

			 }
			
			else if(sel == 2) {
				int check = 1;
				System.out.println("아이디를 입력해주세요 . ");
				int delId = sc.nextInt();
				System.out.println("비밀번호를 입력해주세요 . ");
				int delPw = sc.nextInt();
				
				for(int i=0; i<cnt; i++) {
					if(id[i] == delId ) {
						check = -1;
					}
				}
				if(check == -1) {
					for(int i =0; i<cnt-1; i++) {
						id[i] = id[i+1];
						pw[i] = pw[i+1];
					}
					id[cnt-1] = 0;
					pw[cnt-1] = 0;
					cnt--;
					
				}
				else {
					System.out.println("없는 회원정보입니다 .");
				}

			}
			else if(sel == 3) {
				System.out.println("종료합니다.");
				break;
			}
	
		}
		
	}
}
	


