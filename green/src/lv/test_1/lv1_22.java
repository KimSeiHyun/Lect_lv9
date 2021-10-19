package lv.test_1;

import java.util.Scanner;

public class lv1_22 {

	public static void main(String[] args) {
		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		
		int cash = 20000;  // 입금시 감소  , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소 
		int account  = 11111; // 로그인시 사용
		int password  = 1234; // 로그인시 사용 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===ATM===");
			System.out.println("1.로그인 2.종료");
			int sel = sc.nextInt();
		if(sel == 1) {
			System.out.println("아이디를 입력해주세요 . ");
			int inId = sc.nextInt();
			System.out.println("비밀번호를 입력해주세요 . ");
			int inPw = sc.nextInt();
			if(inId == account && inPw == password) {
				System.out.println("1.입금 2.출금 3.조회");
				sel = sc.nextInt();
				if(sel == 1) {
					System.out.println("입금할 금액을 입력해주세요 . ");
					int inMoney = sc.nextInt();
					if(inMoney < cash) {
						balance += inMoney;
						cash -= inMoney;
						System.out.println("입금이 되었습니다.");
					}
					else {
						System.out.println("잔액이 부족합니다.");
					}
				}
				if(sel == 2) {
					System.out.println("출금할 금액을 입력해주세요 . ");
					int outMoney = sc.nextInt();
					if(outMoney < balance) {
						balance -= outMoney;
						cash += outMoney;
						System.out.println("출금이 되었습니다.");
					}
					else {
						System.out.println("잔액이 부족합니다. ");
					}
				}
				if(sel == 3) {
					System.out.println("현재 현금은 : " + cash);
					System.out.println("현재 통장에 금액은 : " + balance);
				}
			}
			else {
				System.out.println("아이디와 비밀번호를 확인해주세요 . ");
			}
			
		}
		else {
			System.out.println("종료합니다 . ");
			break;
		}
		}
		
	}

}
