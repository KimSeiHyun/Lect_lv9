package lv.test_2;

import java.util.Scanner;

public class lv2_16s {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. 입금
		 * . 입금할 금액을 입력받아, myMoney에 입금
		 * 2. 출금
		 * . 출금할 금액을 입력받아, myMoney에서 출금
		 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
		 * 3. 이체
		 * . yourAcc 계좌번호를 입력받아, 이체
		 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
		 * . 이체 후 yourMoney 잔액 증가
		 * 4. 조회
		 * . myMoney와 yourMoney 잔액 모두 출력
		 */
		
		Scanner sc = new Scanner(System.in);

		int myAcc = 1111;
		int myMoney = 50000;

		int yourAcc = 2222;
		int yourMoney = 70000;

		boolean run = true;
		while (run) {

			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("입금할 금액을 입력해주세요 . ");
				int inMoney = sc.nextInt();
				myMoney += inMoney;
				System.out.println("입금이 완료되었습니다 .");
			} 
			else if (sel == 2) {
				System.out.println("출금할 금액을 입력해주세요 . ");
				int outMoney = sc.nextInt();
				if(outMoney > myMoney ) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					myMoney -= outMoney;
					System.out.println("출금이 완료되었습니다.");
				}
			} 
			else if (sel == 3) {
				System.out.println("이체할 계좌번호를 입력해주세요 . ");
				int inAcc = sc.nextInt();
				if(inAcc == yourAcc) {
					System.out.println("이체할 금액을 입력해주세요 . ");
					int money = sc.nextInt();
					if(money > myMoney ) {
						System.out.println("이체할 금액이 부족합니다.");
					}
					else {
						yourMoney += money;
						myMoney -= money;
					}
				}
				else {
					System.out.println("계좌번호를 다시 확인해주세요 . ");
				}
			} 
			else if (sel == 4) {
				System.out.println("myMoney :" + myMoney);
				System.out.println("yourMoney :" + yourMoney);
			} 
			else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
