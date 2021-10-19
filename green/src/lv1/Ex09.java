package lv1;

import java.util.Scanner;



public class Ex09 {

	public static void main(String[] args) {
		// 변수의 생명주기 ( scope )
		// {} 중괄호 : 영역의 시작과 끝 
		
		int a = 10;
		if(true) {
			int b= 20;
			
			if(true) {
				int c = 30 ;

				System.out.println(a); // 10
				System.out.println(b); // 20
				System.out.println(c); // 30
			}
				System.out.println(a); // 10
				System.out.println(b); // 20
			//	System.out.println(c); // c cannot be resolved to a variable
									   // c 변수가 범위를 벗어남. 다시c를 사용하려면 원하는 범위 내에 
									   // c 변수를 다시 초기화 . int c = 100;
		}
			System.out.println(a);
//				System.out.println(b);
//				System.out.println(c);
			
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
			
			System.out.print("메뉴선택 : ");
			int sel = sc.nextInt();
			
			System.out.println("현금입력 : ");
			int cash = sc.nextInt();
			// case는 3가지 . 
			int total = 0;
			
			if(sel == 1 ) {
				total = price1;
			}
			else if(sel == 2 ) {
				total = price2;
			}
			else if (sel == 3) {
				total = price3;
			}
			else { // 존재하지 않는 메뉴에 대한 예외처리 . 
				System.out.println("존재하지 않는 메뉴입니다 . ");
			}
			
			// total 과 cash 를 비교를해서 거스름돈 확인. 
			if(total != 0 ) { // 1~3까지의 선택한경우 
				if (total > cash)
					System.out.println("현금이 부족합니다.");
			} else {
				//영수증 출력. 
				//구매한 메뉴와 가격 표시를 > 거스름돈 출력. 
				System.out.println("---- 영 수 증 ----");
				if(sel == 1) {
					System.out.println("불고기버거 1개 " + price1 + "원");
				}else if (sel == 2 ) {
					System.out.println("새우버거 1개 " + price2 + "원");
				} else {
					System.out.println("콜라 1개 " + price3 + "원");
				}
				System.out.println("거스름돈 :" + (cash - total)  + "원");
				System.out.println("-----------------");
			}
			}
			

	}

	
	



