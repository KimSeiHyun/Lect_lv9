package lv.test_6;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스[변수]
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 */

class BurgerShop{
	
	Scanner sc = new Scanner(System.in);

	String name = "";		// 가게 이름
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	int[] arCount = new int[4];
	int total = 0;
	
	void showMeu() {
		System.out.println("===== " + name + " =====");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i+1) + "." + arMenu[i] + ": " + arPrice[i] + "원");
		}
		System.out.println("5.종료하기");
	}
	
	void select1() { arCount[0] += 1; }
	void select2() { arCount[1] += 1; }
	void select3() { arCount[2] += 1; }
	void select4() { arCount[3] += 1; }
	
	void getReceipt() {
		System.out.println("===== 영수증 =====");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i + 1) + "." + arMenu[i] + ": " + arCount[i] + "개");
			total += arPrice[i] * arCount[i];
		}
		System.out.println("총 금액 : " + total + "원");		
	}
	
	void run() {
		while(true) {
			// 메뉴 출력
			showMeu();
			
			// 메뉴 선택
			System.out.print("메뉴를 선택하세요 : ");
			int choice = sc.nextInt();
			
			// 치즈버거
			if(choice == 1) { select1(); }
			// 불고기버거
			else if(choice == 2) { select2(); }
			// 감자튀김
			else if(choice == 3) { select3(); }
			// 콜라
			else if(choice == 4) { select4(); }
			// 종료 및 영수증 출력
			else if(choice == 5) {
				getReceipt();
				break;
			}
		}		
	}
}

public class lv6_28 {

	public static void main(String[] args) {
		BurgerShop moms = new BurgerShop();
		moms.name = "맘츠터치 햄버거";
		
		moms.run();
		
	}
}
