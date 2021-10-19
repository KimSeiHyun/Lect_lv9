package lv.test_1;

import java.util.Scanner;

public class lv1_10 {

	public static void main(String[] args) {
		/*
		 * # 로그인[2단계]
		 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
		 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
		 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */
		int dbId = 0;
		int dbPw = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입 아이디를 입력해주세요 . ");
		int id = sc.nextInt();
		System.out.println("회원가입 비밀번호를 입력해주세요 . ");
		int pw = sc.nextInt();
		
		dbId = id;
		dbPw = pw;
		System.out.println("회원가입 완료 ! ");
		System.out.println("id : " +dbId);
		System.out.println("pw : " +dbPw);
		
		System.out.println("로그인할 아이디를 입력해주세요 ");
		int inId = sc.nextInt();
		System.out.println("로그인할 비밀번호를 입력해주세요 ");
		int inPw = sc.nextInt();
		
		if(inId == dbId && inPw == dbPw ) {
			System.out.println("로그인 성공 ! ");
		}
		if(inId != dbId || inPw != dbPw ) {
			System.out.println("로그인 실패 .  ");
		}
		
		
	}

}
