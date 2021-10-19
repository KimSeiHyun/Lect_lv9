package lv.test_2;

import java.util.Scanner;

public class lv2_04s {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력[2단계]
		 * 1. 5번 주문을 받는다.
		 * 2. 주문이 끝난 후, 돈을 입력받는다.
		 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 예)
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 3
		 * 총 금액 = 31300원
		 * 현금 입력 : 32000
		 * === 롯데리아 영수증 ===
		 * 1. 불고기 버거 : 2개
		 * 2. 새우    버거 : 2개
		 * 3. 콜         라 : 1개
		 * 4. 총   금   액 : 31300원
		 * 5. 잔         돈 : 700원
		 */
		
		Scanner sc = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우  버거 : " + price2 + "원");
		System.out.println("3.콜     라 : " + price3 + "원");
		
		int x = 0;
		int cnt1= 0;
		int cnt2= 0;
		int cnt3= 0;
		int charge = 0;
		while (x <5 ) {
			System.out.println("주문하실 메뉴의 번호를 입력해주세요 ! ");
			int a = sc.nextInt();
			if (a == 1) cnt1 ++;
			if (a == 2) cnt2 ++;
			if (a == 3) cnt3 ++;
			x ++;
		}
		charge = price1*cnt1 + price2*cnt2 + price3*cnt3 ;
		System.out.println("지불할 현금을 입력해주세요 . ");
		int money = sc.nextInt();
		
		if(money > charge ) {
		System.out.println("------영수증-----");
		System.out.println("불고기버거 : " + cnt1 + "개");
		System.out.println("새우 버거  : " + cnt2 + "개");
		System.out.println("콜라      : " + cnt3 + "개");
		System.out.println("내신금액 : " + money);
		System.out.println("지불하실금액 : " + charge);
		System.out.println("잔돈 : "+(money - charge));
		
		}
		else {	System.out.println("현금이 부족합니다 .");

		}

	}

}
