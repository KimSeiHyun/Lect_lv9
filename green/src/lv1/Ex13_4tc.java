package lv1;

import java.util.Scanner;

public class Ex13_4tc {

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
		

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		int total = 0;
		int n = 0;
		while(n < 5) {
			System.out.println("메뉴 선택 : ");
			int sel = sc.nextInt(); // 1~3
			
			if (sel == 1) {
				cnt1 ++;
				total += price1;
			}
			else if (sel == 2) {
				cnt2 ++;
				total += price2;
			}
			else if (sel == 3) {
				cnt3 ++;
				total += price3;
			}
			else {
				System.out.println("존재하지 않는 메뉴입니다.");
			}
			n ++; 
			// 증갑식은 반복문 말미에 위치. (아무곳에 둬도 상관없지만 증감되는 순간이 익숙해지기 전에는 마지막에 위치.)
		}
		// 영수증 출력 
		// ㄴ 메뉴별 주문수량확인 ( cnt 변수 사용 )
		
		System.out.println("------------영수증-----------");
		
		if (cnt1 > 0) {
			System.out.println("불고기 버거 " + cnt1 + "개");
		}
		if (cnt2 > 0) {
			System.out.println("새우   버거 " + cnt2 + "개");
		}
		if ( cnt3 > 0) {
			System.out.println("콜     라" + cnt3 + "개");
		}
		System.out.println("---------------------------");
		System.out.println("총 급액 : " + total  + "원");

	}

}
