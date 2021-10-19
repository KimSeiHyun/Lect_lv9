package lv1;
import java.util.Scanner;
public class Ex12_7 {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력[1단계]
		 * 1. 메뉴판을 출력한다.
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		 * 3. 현금을 입력받는다.
		 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 *  시작 : 10 : 12
		 *  종료 : 10 : 50
		 *  소요 : 38분 ..
		 */
		Scanner sc = new Scanner(System.in);
		int menu1 = 1000;
		int menu2 = 2000;
		int menu3 = 3000;
		int myMoney = 2100;
		System.out.println("----------메뉴----------");
		System.out.println("menu1 = " + menu1);
		System.out.println("menu2 = " + menu2);
		System.out.println("menu2 = " + menu2);
		System.out.println("----------메뉴----------");
		
		System.out.println("주문할 메뉴와 현금을 입력해주세요 . .");
		System.out.println("1 = 1000원 , 2 = 2000원 , 3 = 3000원");
		int inMenu = sc.nextInt();
		int inMoney = sc.nextInt();
		int total = 0;
		
		if (inMenu == 1 ) {
			total = menu1;
		}
		else if (inMenu == 2) {
			total = menu2;
		}
		else if  (inMenu == 3) {
			total = menu3;
		}
		else {
			System.out.println("없는 메뉴입니다.");
		}
		

		if (total != 0  ) {
			if (inMenu == 1 && total < myMoney) {
				System.out.println("---------영수증--------");
				System.out.println("나의 현금 = " + myMoney);
				System.out.println("menu1 의 가격 = " + menu1);
				System.out.println("현재 잔액 = " + (myMoney - total));				
			}
			else if (inMenu == 2 && total < myMoney) {
				System.out.println("---------영수증--------");
				System.out.println("나의 현금 = " + myMoney);
				System.out.println("menu2 의 가격 = " + menu2);
				System.out.println("현재 잔액 = " + (myMoney - total));	
		}
			else if (inMenu == 3 && total < myMoney) {
				System.out.println("---------영수증--------");
				System.out.println("나의 현금 = " + myMoney);
				System.out.println("menu3 의 가격 = " + menu3);
				System.out.println("현재 잔액 = " + (myMoney - total));	
		}
			else {
				if ( total > myMoney) {
					System.out.println("현금이 부족합니다.");
				}
			}

	
		}

	}

}
