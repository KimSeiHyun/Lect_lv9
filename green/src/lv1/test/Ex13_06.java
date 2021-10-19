package lv1.test;

import java.util.Scanner;

public class Ex13_06 {

	public static void main(String[] args) {
		/*
		 * # ATM[종합]
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
		 * 3. 입금
		 * . 로그인 후 이용가능
		 * 4. 출금
		 * . 로그인 후 이용가능
		 * 5. 이체
		 * . 로그인 후 이용가능
		 * 6. 조회
		 * . 로그인 후 이용가능
		 * 7. 종료
		 */

		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean a = true;
		while(a) {
			System.out.println("----------ATN---------");
			
			if(log != -1) {
				if ( log == 1  ) {
					System.out.println("1111님이 로그인 중입니다 .");
				}
				else if ( log == 2 ) {
					System.out.println("2222님이 로그인 중입니다.");
				}
			}
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("----------------------");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 조회");
			System.out.println("7. 종료.");
			
			
			int sel = sc.nextInt();
			
			if (sel == 1) {
				if ( log == -1) {
					//로그인가능
					System.out.println("비밀번호를 입력해주세요 . ");
					System.out.println("비밀번호 :");
					int inPw = sc.nextInt();
					if (inPw == dbPw1 ) {
						System.out.println("로그인이 정상처리 되었습니다.");
						log = 1;
					}

				    if (inPw == dbPw2) {
						System.out.println("로그인이 정상처리 되었습니다.");
						log = 2;
						}
					else {
						System.out.println("아이디와 비밀번호를 확인해주세요 . ");
					}
					
				}
				else {
					System.out.println("이미 로그인 되어 있습니다 .");
				}
			}
			else  if (sel == 2 ) {
				
				if (log == -1) {
					System.out.println("이미 로그아웃 했습니다 .");
				}
				else {
					System.out.println("로그아웃이 되었습니다 .");
					log = -1;
				}
			}
			else if (sel == 3) {
				System.out.println("3. 입금");	
				if (log == 1 || log ==2) {
					System.out.println("입금할 금액을 입력해주세요 . ");
					int inMoney = sc.nextInt();
					if (log == 1) {
						dbMoney1 += inMoney;
					}
					if (log == 2) {
						dbMoney2 += inMoney;

					}

				}
				else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if (sel == 4 ) {
				// 출금
				System.out.println("4. 출금");	
				if (log == 1 || log ==2) {
					System.out.println("출금할 금액을 입력해주세요 . ");
					int outMoney = sc.nextInt();
					if (log == 1 && dbMoney1 > outMoney) {
						dbMoney1 -= outMoney;
					}
					else if (log == 1 && dbMoney1 < outMoney) {
						System.out.println("금액이 부족합니다.");
					}
					if (log == 2 && dbMoney2 > outMoney) {
						dbMoney2 -= outMoney;
					}
					else if (log == 2 && dbMoney2 < outMoney) {
						System.out.println("금액이 부족합니다.");
					}
				}
				else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if (sel == 5 ) {
				// 이체 
				System.out.println("5. 이체");
				if (log == 1 || log == 2) {
					System.out.println("이쳬할 계좌를 입력해주세요 . ");
					int inAcc = sc.nextInt();
					if (inAcc != dbAcc1) {
						System.out.println("계좌번호가 틀렸습니다.");
					}
					if (inAcc != dbAcc2) {
						System.out.println("계좌번호가 틀렸습니다.");
					}
					System.out.println("로그아웃 됩니다 .");
					log = -1;
					if (log == 1 || log == 2) {
						System.out.println("이쳬할 금액을 입력해주세요 . ");
						int outMoney = sc.nextInt();
						if (inAcc == dbAcc2 && dbMoney1 >outMoney) {

							dbMoney1 -= outMoney;
							dbMoney2 += outMoney;
						}
						else if (log == 1&& inAcc == dbAcc2 && dbMoney1 <outMoney) {
							System.out.println("금액이 부족합니다 .");
						}
						if (inAcc == dbAcc1 && dbMoney2 >outMoney) {
							dbMoney2 -= outMoney;
							dbMoney1 += outMoney;
						}
						else if (log == 2 & inAcc == dbAcc1&& dbMoney2 <outMoney) {
							System.out.println("금액이 부족합니다 .");
						}


						
					}
				}
				else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}

			}
			else if (sel == 6 ) {
				// 조회 
				if ( log == 1 ) {
					System.out.println(dbMoney1);
				}
				if ( log == 2) {
					System.out.println(dbMoney2);
				}
				else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if (sel == 7) {
				// 종료 
				System.out.println("ATM을 종료합니다.");
				a = false;
			}
			
			System.out.println("정산 : " + dbMoney1);
			System.out.println("정산 : " + dbMoney2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
