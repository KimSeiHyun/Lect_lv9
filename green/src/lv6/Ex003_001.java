package lv6;

import java.util.Scanner;

class Ex003_01 {
	int total = 0;
	String menu[] = {"새우버거" , "치킨버거" , "게살버거" };
	int price[] = {500,1000,1500};
	int arr[] = { 50000, 10000, 5000, 1000, 500, 100};
	int arr2[] = {    1,     5,   10,   10,  10,  10};
	int check[] = new int[3];
	void printMenu() { //메뉴판 출력 
		System.out.println("-----메뉴판------");
		for(int i=0; i<menu.length; i++) {
			System.out.print(i+1 + "." + menu[i] +"  ");
			System.out.print(price[i] + "원\n");
		}
		System.out.println("---------------");
	}
	void selMenu(int a) { // total에 초이스한 메뉴값을 추가하고 check배열에 몇개 담았는지 추가함
		total += price[a-1];
		check[a-1] ++;
		System.out.println(menu[a-1]+"를 담았습니다.");
	}
		
	void calculate1(int x) { //카드계산 잔돈 줄 필요가 없음 . 
		x = x - total;
		System.out.println("잔돈은 " + x +"원 입니다.");
		total = 0;
		check = new int[3];
	}
	void calculate2(int x) { // 현금계싼
		
		int temp = x-total;
		int tempArr[] = new int[arr2.length];
		for(int i=0; i<arr2.length; i++) { //계산의 편의성을 위해 동전갯수의 배열을 하나 똑같이 더 만듬
			tempArr[i] = arr2[i];
		}
		for(int i=0; i<arr.length; i++) { // 반환해야할 잔돈의 갯수를 뺌 . 
			for(int j=0; j<arr2.length; j++) {
				if(temp-arr[i] >=0) {
					temp -= arr[i];
					arr2[i] --;
				}
			}
		}
		if(temp == 0) { //가지고 잇는 잔돈이 충분하면 계산을 마치고 모든것을 초기화함(잔돈갯수빼고)
			for(int i=0; i<arr2.length; i++) {
				if(tempArr[i]-arr2[i] != 0) {
					System.out.printf("%d원  %d개\n",arr[i],tempArr[i]-arr2[i]);					
				}
			}
			check = new int[3];
			total = 0;
		}else if(temp > 0) {//가지고 있는 잔돈이 부족하면 계산한것을 다시 초기화함 . 
			//초기화 하는것 arr2에서 - 했었던 동전의 갯수들
			System.out.println("잔돈이 부족하여 현금으로 잔돈을 반환 할 수 없습니다.");
			for(int i=0; i<arr2.length; i++) {
				arr2[i] = tempArr[i];
			}
		}
	}
	void printRecipe() { //무슨 메뉴가 얼마이고 몇개를 골랐는지 출력 
		for(int i=0; i<3; i++) {
			System.out.println(menu[i] + " " + price[i] +"원" + " " + check[i] +"개");
		}
		System.out.printf("결제하실 총 금액은 %d원 입니다.\n",total);
	}
	
	public void run() {
		Ex003_01 ex = new Ex003_01();

		
		while(true) {
			System.out.println("1.메뉴고르기");
			System.out.println("2.결제");
			System.out.println("3.종료");
			Scanner sc = new Scanner(System.in);
			int sel = sc.nextInt();
			if(sel == 1) {
				printMenu();
				System.out.println("원하시는 메뉴의 번호를 입력해주세요 . ");
				int x = sc.nextInt();
				if(x >= 1 && x<= 3) {
					selMenu(x);
				}else System.out.println("번호를 잘못 입력하셨습니다.");
				
			}
			else if(sel == 2) {
				if(total > 0) {
				printRecipe();
				System.out.println("1.카드결제 \n2.현금결제");
				int x = sc.nextInt();
				System.out.println("결제하실 금액을 입력해주세요 ");
				int inMoney = sc.nextInt();
					if(x == 1 && total <= inMoney) {
						calculate1(inMoney);
					}
					else if (x == 2 && total <= inMoney) {
						calculate2(inMoney);
					}
					else {
						System.out.println("결제하실 금액이 부족합니다.");
					}
				}else System.out.println("메뉴를 먼저 골라주세요 . ");
			}
			else if(sel == 3) {
				System.out.println("종료합니다.");
				break;
			}
		}//while(true)
	}//void run
	
	
}//class

public class Ex003_001 {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력하기 : 클래스[변수]
		 * 1. 햄버거 주문을 받아 영수증을 출력한다.
		 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
		 */
		//옵션 현금결제를 할시 잔돈 유무에따라 잔돈 나눠주고
		//    카드결제할시 그냥 이체 가능 , 
		Ex003_01 ex = new Ex003_01();
		
		ex.run();

		
	}

}
