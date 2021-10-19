package lv5.test;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		//시작시간 02 : 50
		//종료시간 03 : 27
		//소요시간 00 : 37
		
		// 식권 자판기 프로그램 		
		// 1) 관리자   2) 사용자 
		//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
		//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
	    //	       2)뒤로가기
		// 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
		//화면 
		// 식권 가격 : 3200원 
		// 식권 	  : ??매  (매진시 매진) 
		// 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
		// 1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 
		Scanner sc = new Scanner(System.in);
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		
		while(true) {
		System.out.println("[1]관리자");
		System.out.println("[2]사용자");
		System.out.println("[3]잔액 , 식권 출력");
		System.out.print("메뉴 선택 : ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			System.out.println("1)식권충전");
			System.out.println("2)잔돈충전");
			System.out.println("3)뒤로가기");
			System.out.print("메뉴 선택 : ");
			int sel2 = sc.nextInt();
			if(sel2 == 1) {
				System.out.println("식권을 몇장 충전하시겠습니까 ? ");
				int x = sc.nextInt();
				tickets += x;
			}
			else if(sel2 == 2) {
				System.out.println("충전하고싶은 화폐의 단위를 적어주세요 ");
				int x = sc.nextInt();
				int check =0;
				for(int i=0; i<6; i++) {
					if(money[i] == x) {
						System.out.println("충전할 갯수를 적어주세요 . ");
						int y = sc.nextInt();
						charges[i] += y;
						check = 1;
					}
				}
				if(check == 0) System.out.println("화폐의 단위를 다시 확인해주세요 .");
			}
			else if(sel2 == 3) {
				continue;
			}
		}
		
		else if(sel == 2) {
			System.out.println("1)구입");
			System.out.println("2)뒤로가기");
			System.out.print("메뉴 선택 : ");
			int sel2 = sc.nextInt();
			if(sel2 == 1) {
				System.out.println("식권을 몇장 구매하시겠습니까?");
				int buy = sc.nextInt();
				if(buy <= tickets) {
					System.out.printf("식권 %d장의 가격은 %d 입니다.",buy,price*buy);
					System.out.println("입금할 금액을 입력해주세요 ");
					int inMoney = sc.nextInt();
					if(inMoney < price*buy) {
						System.out.println("입금한 금액이 부족합니다. 메인메뉴로 이동합니다.");
						continue;
					}
					int x = inMoney-(buy*price);
					System.out.println("잔돈 : " + x);
					int temp[] = new int[6];
					for(int i=0; i<6; i++) {
						temp[i] = charges[i];
					}
					for(int i=0; i<6; i++) {
						int a = 0;
						int cnt = 0;
						for(int j=0; j<charges[i]; j++) {
							if(x - money[i] >= 0) {
								x -= money[i];
								a = i;
								cnt ++;
							}
						}
						charges[a] -= cnt;
					}
					System.out.println("계산후 남은 잔돈 : " + x);
					if(x != 0) {
						for(int i=0; i<6; i++) {
							charges[i] = temp[i];
						}
						System.out.println("거스름돈이 부족해 식권 구매가 취소됩니다.");
					}
				}else System.out.println("식권의 갯수가 구매하시는 갯수보다 부족합니다.");
				
				
			}
			else if(sel2 == 2) {
				continue;
			}
		}
		else if(sel == 3) {
			for(int i=0; i<6; i++) {
				System.out.print(money[i] + "원\t");
			}System.out.println();
			for(int i=0; i<6; i++) {
				System.out.print(charges[i] + "개\t");
			}System.out.println();
			System.out.println("식권 : " + tickets);
		}
		
		}//while

		
	}

}
