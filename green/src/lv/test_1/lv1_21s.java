package lv.test_1;

import java.util.Scanner;

public class lv1_21s {

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
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		System.out.println("계좌번호를 입력해주세요 .");
		int inAcc = sc.nextInt();
		if(inAcc == yourAcc ) {
			System.out.println("이체할 금액을 입력해주세요 .");
			int inMoney = sc.nextInt();
			if(inMoney < myMoney) {
				yourMoney += inMoney;
				myMoney -= inMoney;
			}
			else {
				System.out.println("이체할 금액이 부족합니다. ");
			}
		}
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");

	}

}
