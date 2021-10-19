package lv5;

import java.util.Scanner;

public class Ex03_11 {

	public static void main(String[] args) {
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
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					System.out.print("메뉴 선택 : ");
					int choice = sc.nextInt();
					if(choice == 1) {
						System.out.println("식권을 얼마나 추가하시겠습니까?");
						int x = sc.nextInt();
						tickets += x;
						System.out.println("식권을 " + x +"장 추가했습니다.");
					}
					else if(choice == 2) {
						System.out.println("충전할 잔돈의 단위를 입력해주세요 .");
						int x = sc.nextInt();
						int check = 0;
						for(int i=0; i<6; i++) {
							if(money[i] == x) {
								System.out.println(x+"원을 얼마나 충전하시겠습니까 ?");
								int y = sc.nextInt();
								charges[i] += y;
								check = 1;
								System.out.printf("%d원 짜리를 %d개 추가했습니다.\n",x,y);
							}
						}
						if(check == 0) System.out.println("단위를 다시 확인해주세요 .");

					}
					else if(choice == 3) {
						break;
					}
				}//sel1 while
			}//sel1
			
			else if(sel == 2) {
				while(true) {
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
					System.out.print("메뉴 선택 : ");
					int choice = sc.nextInt();
					if(choice == 1) {
						System.out.println("식권을 몇장 구입하시겠습니까 ? ");
						int x = sc.nextInt();
						if(x <= tickets) {
						int total = x*price;
						System.out.printf("식권 %d장의 금액은 %d원 입니다.\n 입금할 금액 입력 : ",x,total);
						int inMoney = sc.nextInt();
						int y = inMoney-total;

						if(inMoney >= total) {
							int temp[] = new int[6];
							//int temp[] = charges;  #new 를 안쓰면 heap 에 새로 데이터가 갱신되지 않음 .. 
													//그래서 charges값이 변하면 주소값만 이어받은 temp도 값이 변함 
							for(int i=0; i<6; i++) {
								temp[i] = charges[i];
							}

							for(int i=0; i<6; i++) {
								//가지고있는 잔돈이 줘야할 잔돈보다 적거나 같을때 때 A
								if(y/money[i] > 0 && charges[i]> 0 && charges[i]  <= y/money[i]) {
									System.out.println("잔돈은 A : " + y + "원.");
									System.out.println(money[i]+"원"+charges[i]+"개");
									y -= money[i]*charges[i];
									charges[i] = 0;

								}
								//가지고잇는 잔돈이 줘야할 잔돈보다 많을 때 B
								else if(y/money[i] > 0 &&  charges[i]  > y/money[i]) {
									System.out.println("잔돈은 B : " + y + "원.");
									System.out.println(money[i]+"원"+y/money[i]+"개");
									charges[i] -= y/money[i];
									y -= money[i]*(y/money[i]);

								}

							}
							if(y == 0 ) {
								System.out.println("식권을 정상적으로 구매했습니다 .");
								tickets -= x;
								break;
							}
							else {
								for(int i=0; i<6; i++) {
									charges[i] = temp[i];
								}
								System.out.println("잔돈이 부족합니다 . ");
								break;
							}

						}else System.out.println("입금하신 금액이 부족합니다.");
						
						}else System.out.println("티켓이 부족합니다.");
					}
					else if(choice == 2) {
						break;
					}
				}//sel2 while
			}//sel2
			else if(sel == 3) {
				for(int i=0; i<6; i++) {
					System.out.print(money[i] + "원 ");
					System.out.print(charges[i] + "개    ");
				}
				System.out.println();
				System.out.println("잔여식권  : "+ tickets);
			}//sel3
		}//while
		

	}

}
