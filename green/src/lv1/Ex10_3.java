package lv1;

import java.util.Scanner;
public class Ex10_3 {

	public static void main(String[] args) {
		/*
		 * # ATM[1단계] : 이체하기
		 * 1. 이체할 계좌번호를 입력받는다.
		 * 2. 계좌번호가 일치하면,
		 * 3. 이체할 금액을 입력받는다.
		 * 4. 이체할 금액 <= myMoney	: 이체가능
		 * 			myMoney   - 이체할 금액
		 * 			yourMoney + 이체할 금액
		 *    이체할 금액  > myMoney 	: 이체불가
		 */
		// 1. 로그인 2. 종료
		// 로그인 -> 1. 입금 2. 출금 3. 조회
		//
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myPw = 1111;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourPw = 2222;
		int yourMoney = 12000;
		System.out.println("--- Green ATM ---");
		System.out.println("1. 로그인 2. 종료 ");
		System.out.println("-----------------");
		System.out.println("메뉴선택: ");
		int sel = scan.nextInt();
		if (sel == 1) {
			int inputAcc = scan.nextInt();
			if (inputAcc == myAcc) {
				int inputPw = scan.nextInt();
				if (inputPw == myPw) {
					System.out.println("로그인이 되었습니다.");
					System.out.println("1.입금 2.출금 3.이체 4.조회 ");
					sel = scan.nextInt();
					if (sel == 1) {
						System.out.println("입금할 금액을 입력해주세요 .");
						int inMoney = scan.nextInt();
						myMoney += inMoney ; 
						System.out.println("입금이 되었습니다.");
					}

					else if (sel == 2) {
						System.out.println("출금할 금액 입력");
						int inMoney = scan.nextInt();
						
					} 
					else if (sel == 3) {
						// 입력받기
						System.out.print("이체할 계좌번호를 입력하세요 : ");
						inputAcc = scan.nextInt();
						// 계좌확인
						if (inputAcc == yourAcc) {
							// 이체진행
							int inputMoney = scan.nextInt();
							// 유효성 검사
							if (inputMoney > myMoney) {
								System.out.println("잔액이 부족합니다!");
							} else {
//				System.out.println("이체완료, 나의 잔액: " + (myMoney - inputMoney));
								myMoney -= inputMoney; // myMoney = myMoney - inputMoney;
								// 증감연산자 ( +=, -=, *=, /= )
								yourMoney += inputMoney;
								System.out.println("이체가 성공적으로 되었습니다!");
							}
						} else {
							System.out.println("존재하지 않는 계좌입니다. ");
						}
					} else if (sel == 4) {
					} else {
					}
				}
			}
		} 
		else if (sel == 2) {
			
		} 
		else {
		}
	}
}