package lv.test_1;

import java.util.Scanner;

public class lv1_11 {

	public static void main(String[] args) {
		/*
		 * # 로그인[3단계]
		 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
		 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
		 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
		 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
		 */
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요 . ");
		int inId = sc.nextInt();
		
		if(inId == dbId ) {
			System.out.println("비밀번호를 입력해주세요 . ");
			int inPw = sc.nextInt();
			if(inPw != dbPw) { 
				System.out.println("비밀번호를 확인해주세요 . ");
			}
			if(inId == dbId && inPw == dbPw ) {
				System.out.println("로그인 성공 !! ");
			}
		}
		if(inId != dbId ) {
			System.out.println("아이디를 확인해주세요 .");
		}

		
	}

}
