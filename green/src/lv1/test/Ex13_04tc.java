package lv1.test;

import java.util.Scanner;

public class Ex13_04tc {

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
		
		
		// escape 문자.
		// \n : 줄바꿈 
		// \t : 탭 (공백 4칸)
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean isRun = true;
		while(isRun) {
		System.out.println("--------green shop--------");
		System.out.println("1.남성의류 \n2.여성의류 \n3.종료");
		System.out.println("--------------------------");
		System.out.println("메뉴입력 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				boolean depth = true;
				while (depth) {
				System.out.println("----- 남성의류 -----");
				System.out.println("1) 티셔츠");
				System.out.println("2) 바지");
				System.out.println("3) 뒤로가기");
				System.out.println("------------------");		
				System.out.println("메뉴입력 : ");
				sel = sc.nextInt();
				
				if(sel == 1) {
					
				}
				else if (sel == 2) {
					
				}
				else if (sel == 3 ) { // 뒤로가기
					depth = false;
				}
				}
			}
			else if (sel ==2) {
				
			}
			else if (sel == 3) {
				isRun = false; 
			}
			else {
				System.out.println("잘못입력햇습니다 .");
			}
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
