import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	Shop shop = new Shop();
	private int money;
	public Player() {
		this.money = 100000;
	}
	
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money = this.money-money;
	}
	public void itemManager() {
		while(true) {
			this.itemManagerMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				
			}
			if(sel == 2) {
				
			}
			if(sel == 3) {
				
			}
			if(sel == 4) {
				
			}
			if(sel == 5) {
				break;
			}
		}
	}
	public void itemManagerMenuPrint() {
		System.out.println("1.아이템구입\n2.아이템판매\n3.아이템추가\n4.아이템삭제\n5.뒤로가기");
	}
}
