package lv.test_1;

import java.util.Scanner;

public class lv1_31s {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력[1단계]
		 * 1. 메뉴판을 출력한다.
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		 * 3. 현금을 입력받는다.
		 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우  버거 : " + price2 + "원");
		System.out.println("3.콜     라 : " + price3 + "원");
		
		System.out.println("주문하고자 하는 메뉴의 번호를 입력해주세요 .");
		int x = sc.nextInt();
		if(x == 1) {
			x = price1;
		}
		if(x == 2) {
			x = price2;
		}
		if(x == 3) {
			x = price3;
		}
		System.out.println("보유중인 현금을 입력해주세요 . ");
		int money = sc.nextInt();
		
		System.out.println("------영수증------");
		System.out.println("가지고 계신 현금 : " + money);
		System.out.println("선택한 메뉴의 가격 : " + x );
		System.out.println("-----------------");
		if(money > x ) {
			System.out.println("잔돈 : "+ (money -x) + "원" );
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}

	}

}
