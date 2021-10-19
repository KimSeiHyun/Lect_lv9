package lv.test_2;

import java.util.Scanner;

public class lv2_17 {

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
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
				System.out.println("아이디를 입력해주세요 . ");
				int inAcc = sc.nextInt();
				if(inAcc == dbAcc1 || inAcc == dbAcc2) {
					System.out.println("비밀번호를 입력해주세요 ");
					int inPw = sc.nextInt();
					if(inAcc == dbAcc1 && inPw == dbPw1 || inAcc == dbAcc2 && inPw == dbPw2) {
						System.out.println(inAcc+"님께서 로그인을 하셨습니다");
						log = inAcc;
					} else {
						System.out.println("비밀번호를 확인해주세요 . ");
					}
				}
				else {
					System.out.println("아이디를 확인해주세요 . ");
				}
				}else {
					System.out.println("이미 로그인 상태입니다.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("로그아웃 되었습니다.");
					log = -1;
				} else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if(sel == 3) {
				if(log != -1) {
					System.out.println("입금할 금액을 입력해주세요 . ");
					int inMoney = sc.nextInt();
					if(log == dbAcc1) {
						dbMoney1 += inMoney;
					}
					if(log == dbAcc2) {
						dbMoney2 += inMoney;						
					}
				}
				else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if(sel == 4) {
				if(log != -1) {
					System.out.println("출금할 금액을 입력해주세요 . ");
					int outMoney = sc.nextInt();
					if(log == dbAcc1 && outMoney < dbMoney1) {
						dbMoney1 -= outMoney;
					}
					else if(log == dbAcc2 && outMoney < dbMoney2) {
						dbMoney2 -= outMoney;						
					}
					else {
						System.out.println("잔액이 부족합니다 .");
					}
				}
				else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if(sel == 5) {
				if(log != -1) {
					System.out.println("이체할 계좌를 입력해주세요 . ");
					int acc = sc.nextInt();
					System.out.println("이체할 금액을 입력해주세요 . ");
					int money = sc.nextInt();
					if(log == dbAcc1 && acc == dbAcc2  && money < dbMoney1) {
						dbMoney1 -= money;
						dbMoney2 += money;
					}
					else if(log == dbAcc2 && acc == dbAcc1 && money < dbMoney2) {
						dbMoney1 += money;
						dbMoney2 -= money;
					}else {
						System.out.println("계좌번호를와 잔액을 다시 확인해주세요 . ");
					}
				}
				else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if(sel == 6) {
				if(log != -1) {
					if(log == dbAcc1) {
						System.out.println(dbAcc1+"님의 잔액은 : " + dbMoney1 + "입니다.");
					}
					else if(log == dbAcc2) {
						System.out.println(dbAcc2+"님의 잔액은 : " + dbMoney2 + "입니다.");
					}
				}
				else {
					System.out.println("로그인을 먼저 해주세요 . ");
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}


	}

}