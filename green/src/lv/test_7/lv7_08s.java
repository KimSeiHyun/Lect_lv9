package lv.test_7;

import java.util.Scanner;

class Users{
	private String id;
	private String pw;
	
	public Users(String id , String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return this.id;
	}
	public String getPw() {
		return this.pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}

public class lv7_08s {

	public static void main(String[] args) {
		int max = 100;
		Users[] user = new Users[max];		
		/*
    1. 회원가입
    2. 회원탈퇴
    3. 전체출력
    */
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<user.length; i++) {
			user[i] = new Users("","");
		}
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.회원탈퇴");
			System.out.println("3.전체출력");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("회원가입 id 입력 :");
				String id =sc.next();
				int check = 0;
				for(int i=0; i<user.length; i++) {
					if(user[i].getId().equals(id)) check = 1;
				}
				
				if(check == 0) {
					System.out.print("회원가입 pw 입력 : ");
					String pw = sc.next();
					for(int i=0; i<user.length; i++) {
						if(user[i].getId().equals("")) {
							user[i].setId(id);
							user[i].setPw(pw);
							break;
						}
					}
				}else System.out.println("존재하는 아이디입니다.");
			}
			if(sel == 2) {
				System.out.print("회원탈퇴 id 입력 : ");
				String id = sc.next();
				int idx = -1;
				for(int i=0; i<user.length; i++) {
					if(user[i].getId().equals(id)) idx= i;
				}
				if(idx != -1 ) {
					System.out.print("회원탈퇴 pw 입력 : ");
					String pw = sc.next();
					if(user[idx].getPw().equals(pw)) {
						user[idx].setId("");
						user[idx].setPw("");
					}else System.out.println("비밀번호가 틀렸습니다.");
				}else System.out.println("존재하지 않는 아이디입니다.");
			}
			if(sel == 3) {
				System.out.print("id : ");
				for(int i=0; i<15; i++) {
					System.out.print(user[i].getId() + " ");
				}System.out.println();
				System.out.print("pw : ");
				for(int i=0; i<15; i++) {
					System.out.print(user[i].getPw() + " ");
				}System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		

	}
}