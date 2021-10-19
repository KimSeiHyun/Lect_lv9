package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex10_2 {

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
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 302;
		int myMoney = 10000;
		
		int yourAcc = 333;
		int yourMoney = 5000;
		
		System.out.println("계좌를 입력해주세요.");
		int yourAcc2 = sc.nextInt();
		if (yourAcc != yourAcc2) {
			System.out.println("계좌번호가 틀렸습니다.");
		}
		if(yourAcc == yourAcc2) {
			System.out.println("금액을 입력해주세요 . ");
			int myMoney2 = sc.nextInt();
			if (myMoney > myMoney2) {
				System.out.println("이체가능");
				System.out.println("myMoney = " + myMoney + "원");
				System.out.println("이체할금액 = " + myMoney2 + "원");
				myMoney -= myMoney2 ; // myMoney = myMoney - myMoney2;
				//증감연산자 += , -= , *= , /=
				yourMoney += myMoney2 ; 
			//	System.out.println("이제 후 myMony =" +  (myMoney - myMoney2) + "원");
				System.out.println("yourMoney = " + (yourMoney + myMoney2) + "원");
			}
			else if (myMoney < myMoney2) {
				System.out.println("이체불가능");
			}
			
			
		}
		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		
		int id = 1234;
		int pw = 123123;
		
		int one = 0;
		int two = 0;
		int three = 0;
		
		System.out.println("아이디를 입력해주세요 .");
		int inId = sc.nextInt();
		System.out.println("비밀번호를 입력해주세요 .");
		int inPw = sc.nextInt(); 
		
		
		if(id == inId && pw == inPw) {
			System.out.println("로그인성공 . ");
			System.out.println("보기 메뉴중 선택하세요 .");
			System.out.println("1.입금 2.출금 3.조회 ");
			
		}
		else {
			System.out.println("로그인 실패 . ");
		}


	}

}
