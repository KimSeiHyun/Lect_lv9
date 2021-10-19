package lv.test_5;

public class lv5_25 {

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

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		
		while(true) {
			
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) {}
					else if(choice == 2) {}
					else if(choice == 3) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) {}
					else if(choice == 2) {
						break;
					}
				}
			}
		}
	}


}