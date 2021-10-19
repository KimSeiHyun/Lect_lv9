package lv7;

import java.util.Scanner;

class User{
	String id;
	int pw;
	
}



public class Ex001_006 {

	public static void main(String[] args) {
		
		int max = 10;
		int cnt = 0;
		User[] user = new User[max];
		for(int i=0; i<user.length; i++) {
			user[i] = new User();
		}
		/*
    1. 회원가입
    2. 회원탈퇴
    3. 전체출력
    */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("cnt : " + cnt);
			System.out.println("1.회원가입\n2.회원탈퇴\n3.전체출력\n");
			int sel = sc.nextInt();
			if(cnt < 10) {
				if(sel == 1) {
					System.out.println("아이디 입력 : ");
					String inId = sc.next();
					int check = 0;
					for(int i=0; i<cnt; i++) {
						if(user[i].id.equals(inId)) {
							check = 1;
						}
					}
					if(check == 0) {
						System.out.println("비밀번호 입력 : ");
						int inPw = sc.nextInt();
						user[cnt].id = inId;
						user[cnt].pw = inPw;
						cnt ++;
					}
					else if(check == 1) {
						System.out.println("해당 아이디는 이미 존재합니다.");
					}
				
			}
			}
			else {
				System.out.println("더이상 회원가입을 할 수 없습니다.");
			}
			if(sel == 2) {
				if(cnt >0) {
				System.out.println("회원탈퇴할 아이디 입력 : ");
				String delId = sc.next();
				int check = 0;
				int idx = -1;
				for(int i=0; i<cnt; i++) {
					if(user[i].id.equals(delId)) {
						check = 1;
						idx = i;
					}
				}
				if(check == 1) {
					System.out.println("회원탈퇴할 아이디의 비밀번호 입력 : ");
					int delPw = sc.nextInt();
					if( delPw == user[idx].pw) {
						System.out.println("회원탈퇴 성공 ");
						user[idx].id = null;
						user[idx].pw = 0;
						cnt --;
					}
					for(int i=0; i<user.length-1; i++) {
						if(user[i].id == null) {
							user[i].id = user[i+1].id;
							user[i+1].id = null;
							user[i].pw = user[i+1].pw;
							user[i+1].pw = 0;
						}
					}
				}
				else {
					System.out.println("아이디를 다시 확인해주세요 . ");
				}
				}else System.out.println("회원탈퇴할 아이디가 없습니다");
			}
			if(sel == 3) {
				for(int i=0; i<user.length; i++) {
					System.out.print(user[i].id + "\t");
				}System.out.println();
				for(int i=0; i<user.length; i++) {
					System.out.print(user[i].pw + "\t");
				}System.out.println();
			}
		}
		
	}
}