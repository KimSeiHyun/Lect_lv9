package lv1;

import java.util.Scanner;

public class Ex13_4 {

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
		
		int water1 = 500;
		int water2 = 1000;
		int water3 = 1500;
		int water4 = 2000;
		System.out.println("=======에비앙=======");
		System.out.println("1.자연수 : " + water1 + "원");
		System.out.println("2.약숫물 : " + water2 + "원");
		System.out.println("3.수돗물 : " + water3 + "원");
		System.out.println("4.에비앙 : " + water4 + "원");

		Scanner sc = new Scanner(System.in);
		
		int a = 0 ;
		while ( a < 5) {
			int sel = sc.nextInt();
			if (sel == 1)
			a++;		
		}
	}

}
