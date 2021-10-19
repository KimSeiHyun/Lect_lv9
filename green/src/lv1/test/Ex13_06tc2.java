package lv1.test;

import java.util.Scanner;

public class Ex13_06tc2 {

	public static void main(String[] args) {
		/*
		 * # ATM[종합] 1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 2. 로그아웃 . 로그인 후 이용가능 3.
		 * 입금 . 로그인 후 이용가능 4. 출금 . 로그인 후 이용가능 5. 이체 . 로그인 후 이용가능 6. 조회 . 로그인 후 이용가능 7.
		 * 종료
		 */
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean run = true;
		while (run) {
			System.out.println("--- ATM ---");
			if(log != -1) {
				if(log == 1) {
					System.out.println("1111님 로그인 중입니다.");
				}
				else if(log == 2) {
					System.out.println("2222님 로그인 중입니다.");
				}
			}
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			System.out.println("-----------");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				if(log == -1) {
					System.out.print("id: ");
					int inputId = scan.nextInt();
					System.out.print("pw: ");
					int inputPw = scan.nextInt();
					// 로그인 확인
					if(inputId == dbAcc1 && inputPw == dbPw1) {
						System.out.println("1111회원님, 반갑습니다.");
						log = 1; //
					}
					else if(inputId == dbAcc2 && inputPw == dbPw2) {
						System.out.println("2222회원님, 반갑습니다.");
						log = 2; //
					}
					else {
						System.out.println("회원정보를 확인해주세요.");
					}
				}
				else {
					System.out.println("이미 로그인 되어있습니다. ");
				}
			} else if (sel == 2) {
				if(log == -1) {
					System.out.println("로그인을 먼저 해주세요!");
				}
				else {
					System.out.println("로그아웃을 했습니다.");
					log = -1; //
				}
			} else if (sel == 3) {
				if(log == -1) {
					System.out.println("로그인을 먼저 해주세요!");
				}
				else {
					System.out.print("입금할 금액: ");
					int inputMoney = scan.nextInt();
					if(inputMoney > 0) {
						if(log == 1) {
							dbMoney1 += inputMoney;
						}
						else if(log == 2) {
							dbMoney2 += inputMoney;
						}
					}
					else {
						System.out.println("유효한 값을 입력해주세요!");
					}
				}
			} else if (sel == 4) {
				if(log == -1) {
					System.out.println("로그인을 먼저 해주세요!");
				}
				else {
					// 보유 잔액 
					if(log == 1) {
						System.out.println("현재 잔액: " + dbMoney1 + "원");
					}
					else if(log == 2) {
						System.out.println("현재 잔액: " + dbMoney2 + "원");
					}
					System.out.println("출금할 금액 입력: ");
					int outMoney = scan.nextInt();
					if(log == 1) {
						if(outMoney > dbMoney1) {
							System.out.println("잔액이 부족합니다!");
						}
						else {
							System.out.println("출금이 완료되었습니다.");
							dbMoney1 -= outMoney;
						}
					}
					else if(log == 2) {
						if(outMoney > dbMoney2) {
							System.out.println("잔액이 부족합니다!");
						}
						else {
							System.out.println("출금이 완료되었습니다.");
							dbMoney2 -= outMoney;
						}
					}
				}
			} else if (sel == 5) {
				if(log == -1) {
					System.out.println("로그인을 먼저 해주세요!");
				}
				else {
					System.out.println("이체할 계좌 입력: ");
					int reAcc = scan.nextInt();
					System.out.println("이체할 금액 입력: ");
					int reMoney = scan.nextInt();
					if(log == 1 && reAcc != dbAcc1) {
						if(reAcc == dbAcc2) {
							if(reMoney <= dbMoney1) {
								dbMoney2 += reMoney;
								dbMoney1 -= reMoney;
								System.out.println("이체완료!");
							}
						}
					}
					else if(log == 2 && reAcc != dbAcc2) {
						if(reAcc == dbAcc1) {
							if(reMoney <= dbMoney2) {
								dbMoney1 += reMoney;
								dbMoney2 -= reMoney;
								System.out.println("이체완료!");
							}
						}
					}
				}
			} else if (sel == 6) {
				if(log == -1) {
					System.out.println("로그인을 먼저 해주세요!");
				}
				else {
					if(log == 1) {
						System.out.println("현재 잔액: " + dbMoney1 + "원");
					}
					else if(log == 2) {
						System.out.println("현재 잔액: " + dbMoney2 + "원");
					}
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}