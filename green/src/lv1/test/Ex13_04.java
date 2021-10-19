package lv1.test;

import java.util.Scanner;

public class Ex13_04 {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 뒤로가기
		 * 
		 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
		 *      뒤로가기 누르기전까지 남성의류 페이지 를 유지할려고한다.
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
		
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		int sel2 = 0;
		boolean a = true;

		while (a) {
			boolean b = true;
			System.out.println("-----------옷가게-----------");
			System.out.println("1. 남성의류");
			System.out.println("2. 여성의류");
			System.out.println("3. 종료");
			System.out.println("---------------------------");
			System.out.println("번호를 입력해주세요 ! ");
			sel = sc.nextInt();
			if (sel == 1) {
				while (b) {
					System.out.println("1) 티셔츠");
					System.out.println("2) 바지");
					System.out.println("3) 뒤로가기");
					sel2 = sc.nextInt();
					if (sel2 == 1) {
					} 
					else if (sel2 == 2) {
					} 
					else if (sel2 == 3) {
						b = false;
					}
					else {
						System.out.println("잘못된 번호입니다 다시 입력해주세요 .");
					}
				}
			}
				if (sel == 2) {
					while (b) {
						System.out.println("1) 가디건");
						System.out.println("2) 치마");
						System.out.println("3) 뒤로가기");
						sel2 = sc.nextInt();
						if (sel2 == 1) {
						} 
						else if (sel2 == 2) {
						} 
						else if (sel2 == 3) {
							b = false;
						}
						else {
							System.out.println("잘못된 번호입니다 다시 입력해주세요 .");
						}
					}

				}
				if (sel == 3) {
					a = false;
					System.out.println("브라우저를 닫습니다 .");

				} 
				else {
					System.out.println("잘못된 번호입니다 다시 입력해주세요 .");
				}
			}
			
}
	}

