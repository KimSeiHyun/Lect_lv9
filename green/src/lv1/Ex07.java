package lv1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 제어문 : 프로그램의 실행 흐름을 제어함. 
		// 조건문 , 반복문 , 보조제어문
		
		// 제어문의 구조
		// 키워드(조건식) {실행문;}    {} << 영역의 시작과 끝을 의미.
		
		// 조건문 if 
		if(true) { //조건식의 결과가 true 이면 , 영역 안으로 진입
			System.out.println("hello");
		}
		
		if(false) {
			System.out.println("hi");
		}
			System.out.println("end");
			
			// 제어문의 실행 순서 . 
			// 1. 위에서 아래로 
			// 2. 제어문을 만났을 때 , 조건식의 결과가 true 이면 -> 영역 안으로 문장 실행 . 
			
			System.out.println("오늘 밥 먹었니?  (yes = 1 , no = 2) : ");
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			
			if(answer == 1 ) {
				System.out.println("참 잘했어요 .");
			}
			if(answer == 2) {
				System.out.println("나랑 밥먹으러 가자 .");
				

				}
				// 문제 1) 양수, 0, 음수 출력
				// 문제 2) 4의 배수 출력
				// 문제 3) 합격, 불합격 출력
				
				
				int num1 = sc.nextInt(); 
				if(num1 > 0) {
					System.out.println("양수");
				}
				if(num1 == 0) {
					System.out.println("0");
				}
				if(num1 < 0 ) {
					System.out.println("음수 ");
				}
				
				int num2 = sc.nextInt();
				
				if(num2 % 4 == 0 )
					System.out.println("4의 배수");
				
				int num3 = sc.nextInt();
				if(num3 >= 80) { 
					System.out.println("합격");
				}
				if(num3 < 80 ) {
					System.out.println("불합격 ");
				}
				
				/* 업다운게임문제 . 
				 * # Up & Down 게임[1단계]
				 * 1. com은 8이다.
				 * 2. me는 숫자를 하나입력받는다.
				 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
				 * 1) me < com	: Up!
				 * 2) me == com : Bingo!
				 * 3) me > com  : Down!
				 */
				int com = 8;
				int me = sc.nextInt();
				
				System.out.println("업다운 숫자입력 : ");
				if(me < com) {
					System.out.println("Up!");
				}
				if(me == com) {
					System.out.println("Bingo!");
				}
				if(me > com) {
					System.out.println("Down!");
				}
				
				/* 가위바위보게임 1문제 답없음.
				 * # 가위(0)바위(1)보(2) 게임[1단계]
				 * 1. com은 바위(1)만 낼 수 있다.
				 * 2. me는 0~2 사이의 숫자를 입력받는다.
				 * 3. com과 me를 비교해,
				 * 		1) 비겼다.
				 * 		2) 내가 이겼다.
				 * 		3) 내가 졌다.			를 출력한다.
				 */
				int com1 = 1;
				System.out.println("가위 0 . 바위 1 . 보 2");
				int me1 = sc.nextInt();
				
				if(com1 == me1) {
				 System.out.println("비겻다.");
				}
				
				if(me1 > com1) {
					System.out.println("내가 이겻다 .");
				}
				if(me1 < com1) {
					System.out.println("내가 졋다 .");
				}
				
				/* 로그인문제 .
				 * # 로그인[1단계]
				 * 1. Id와 Pw를 입력받는다.
				 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
				 * 예) 로그인 성공 or 로그인 실패
				 */
				
				int Id = sc.nextInt();
				int Pw = sc.nextInt();
				int dbId = 1234;
				int dbPw = 1111;
				if(Id == dbId && Pw == dbPw ) {
					System.out.println("로그인성공");
				}
				if(Id == dbId || Pw == dbPw ) {
					System.out.println("로그인실패");
				}
			
				/* 회원가입로그인문제 .
				 * # 로그인[2단계]
				 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
				 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
				 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
				 * 예) 로그인 성공 or 로그인 실패
				 */
				
				System.out.println("화원가입할 아이디 입력 : ");
				int dbid2 = sc.nextInt();
				System.out.println("회원가입할 비밀번호 입력 : ");
				int dbpw2 = sc.nextInt();
				
				System.out.println("로그인할 아이디 입력 : ");
				int inid2 = sc.nextInt();
				System.out.println("로그인할 비밀번호 입력 : ");
				int inpw2 = sc.nextInt();
				
				if(dbid2 == inid2) {
					if(dbpw2 == dbpw2)
					System.out.println("로그인 성공 !");
				}
				if(dbid2 != inid2) {
					if(dbpw2 != dbpw2)
					System.out.println("로그인 실패 !");
				}
				
				
					
					/*
					 * # 로그인[3단계]
					 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
					 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
					 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
					 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
					 */
						//회원가입
					int dbid;
					int dbpw;
					System.out.println("회원가입할 아이디 입력 : ");
					dbid = sc.nextInt();
					System.out.println("회원가입할 비밀번호 입력 : ");
					dbpw = sc.nextInt();
					
					//로그인
					System.out.println("로그인할 아이디 입력 : ");
					int inId = sc.nextInt();
					
					
					//검사
					if(dbid != inId) {
						System.out.println("id를 확인해주세요.");
					}
					//중첩 제어문 (if 안에 if가 들어감.  )
					else { //if(dbid == inId) {
						System.out.println("로그인할 비밀번호 입력 : ");
						int inPw = sc.nextInt();
						if(dbpw != inPw) {
							System.out.println("비밀번호를 확인하세요 !");
						}
						else {  // if(dbpw == inPw) {
							System.out.println("로그인 성공 ! ");
						}
					}
					
				
				
	}
}
