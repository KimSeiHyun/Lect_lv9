package lv6;

import java.util.Scanner;

class POS{
	Scanner sc = new Scanner(System.in);
	
	int total;
	String menu[] = {"스테이크버거" , "치즈버거" ,"해시포에이토" ,"콜라" };
	int price[] = {9000,6000,4000,1500};
	int moneys[] = {50000,10000,5000,1000,500,100};
	int charges[] = {1,1,1,5,7,10};
	int choice[]; //count용도
	void printMenu() {
		for(int i=0; i<this.menu.length; i++) {
			System.out.printf("%d) %s\t%d원\n",i+1 , this.menu[i] , this.price[i]);
		}
		System.out.println("0) 결제하기");
		System.out.println("9) 종료");
	}
	boolean selectMenu() {
		choice = new int [this.menu.length];
		while(true) {
			int sel = sc.nextInt()-1;
			if(sel >= 0 && sel < this.menu.length)
				choice[sel] ++;
			if(sel == -1) {
				break;
			}
			if(sel == 8) {
				return false;
			}
		}
		return  true;
	}
	int[] calculate() {
		int result[] = new int[2];
		int sum = 0;
		for(int i=0; i<this.choice.length; i++) {
			sum += this.choice[i] * this.price[i];
		}
		System.out.println("총 결제할 금액 : " + sum + "원");
		
		System.out.print("1.현금 \n2.카드\n선택 :");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			System.out.println("현금 : ");
			int cash = sc.nextInt();
			if(cash < sum) {
				System.out.println("현금이 부족합니다 . ");
			}
			else {
				result[0] = sum;
				result[1] = cash-sum;
				
				//POS 에 남은 현금 연산 
				int extra = cash - sum;
				int temp[] = new int[this.charges.length];
				for(int i=0; i<temp.length; i++) {
					temp[i] = this.charges[i];
				}
				for(int i=0; i<this.moneys.length; i++) {
					if(extra >= this.moneys[i] && temp[i] > 0) {
						temp[i] --;
						extra -= this.moneys[i];
						i --;
					}
				}
				
				if(extra > 0) {
					System.out.println("잔돈이 부족합니다 . 관리자에게 문의 요망 . ");
				}
				else {
					for(int i=0; i<this.moneys.length;i ++) {
						if(cash >= this.moneys[i]) {
							temp[i] ++;
							cash -= this.moneys[i];
							i--;
						}
					}
					
					this.charges = temp;
				}
			}
			
		}
		else if(sel == 2) {
			
		}
		
		
		return result;
	}
	void printRecipe(int[] result) {
		System.out.println("--------영수증-------");
		for(int i=0; i<this.choice.length; i++) {
			if(this.choice[i] > 0)
			System.out.printf("%s\t%d개\n",this.menu[i],this.choice[i]);
		}
		System.out.println("-----------------");
		System.out.println("총 금액 : " + result[0] + "원");
		System.out.println("거스름톤 : " + result[1] + "원");
		System.out.println("-----------------");
		
	}
	
	public void run() {
		while(true) {
			for(int i=0; i<this.charges.length; i++) {
				System.out.print(this.charges[i] + " ");
			}System.out.println();
			printMenu();
			if(selectMenu()) {
				printRecipe(calculate());				
			}
			else {
				break;
			}
			
			
		}
	}
}
public class Ex003_001tc {

	public static void main(String[] args) {
		POS pos = new POS();
		pos.run();

	}

}
