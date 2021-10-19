package lv2;

import java.util.Scanner;

public class Level_Test_4 {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 뒤로가기
		 * 
		 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
		 *      뒤로가기 누르기전까지 남성의류 페이지 를 유지하려고한다.
		 * 힌트) 개층 별로 반복문을 추가 해주면된다. 
		 * 1. 남성의류
		 * 		1) 티셔츠
		 * 		2) 바지
		 * 		3) 뒤로가기
		 * 2. 여성의류
		 * 		1) 가디건
		 * 		2) 치마
		 * 		3) 뒤로가기
		 * 3. 종료
		 */
		//	시작 : 10:56
		//	종료 : 11:10
		//	소요 : 14분
		
		
		Scanner sc = new Scanner(System.in);
		int sel = 0;
	
		
		boolean t = true;
		while (t) {
			System.out.println("------------쁘띠-----------");
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");
			System.out.println("--------------------------");
		
		System.out.println("메뉴의 번호를 입력해주세요 .");
		 sel = sc.nextInt();
		
		if (sel == 1) {

			while (t) {
				System.out.println("1.남성의류");
				System.out.println("    1)티셔츠");
				System.out.println("    2)바지");
				System.out.println("    3)뒤로가기");	
				sel = sc.nextInt();
				if (sel == 1 ) {
					continue;
				}
				else if ( sel == 2 ) {
					continue;
				}
				else if (sel == 3) {
					break;
				}
				else {
					System.out.println("잘못된 메뉴입력입니다 .");
				}
			}
			
		}
		else if (sel == 2) {

			while (t) {
				System.out.println("1.여성");
				System.out.println("    1)가디건");
				System.out.println("    2)치마");
				System.out.println("    3)뒤로가기");	
				sel = sc.nextInt();
				if (sel == 1 ) {
					continue;
				}
				else if ( sel == 2 ) {
					continue;
				}
				else if (sel == 3) {
					break;
				}
				else {
					System.out.println("잘못된 메뉴입력입니다 .");
				}
				
			}
		}
		else if (sel == 3) {
			System.out.println("쇼핑몰을 종료합니다 .");
			break;
		}
		else {
			System.out.println("잘못된 메뉴입니다 . ");
		}
		}

	}

}
