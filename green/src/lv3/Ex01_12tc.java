package lv3;

import java.util.Scanner;

public class Ex01_12tc {

	public static void main(String[] args) {
		/*
		 * # 영화관 좌석예매
		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		 * 4. 한 좌석당 예매 가격은 12000원이다.
		 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
		 * 예)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 이미 예매가 완료된 자리입니다.
		 * ----------------------
		 * 매출액 : 24000원
		 */
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7]; // {0,0,0,0,0,0,0} // 1~7
		int total = 0;
		int ticket = 12000;
		
		boolean run = true;
		
		while(run) {
			//좌석현황 출력 
			for(int i =0; i<7; i++) {
//				System.out.print(seat[i]+ "  ");
				if( seat[i] == 1) {
					System.out.print("■ ");
				}
				else {
					System.out.print("□ ");
					
				}
			}
			System.out.println();
			for ( int i=0; i<7; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n=영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("좌석선택 (1~7) : ");
				int input = scan.nextInt() -1; // 인덱스로 변환
				
				if(input >= 0 && input <7) { 
				//예매 가능 확인 여부
				if(seat[input] == 1) {
					System.out.println("이미 선택된 좌석입니다.");
				}
				else {
					seat[input] = 1;
					System.out.println("예매가 완료 되었습니다");
					total += ticket;
				}
				}
				else {
					System.out.println("좌석 번호를 다시 확인해주세요 . ");
				}
			}
			
			else if(sel == 2){
				System.out.println("매출액 : " + total + "원");
				run = false;
			}
		}

	}

}
