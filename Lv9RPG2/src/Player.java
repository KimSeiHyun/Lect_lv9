import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	Shop shop = new Shop();
	public static int money;
	public Player() {
		this.money = 100000;
	}
	
	public void itemManager() {
		while(true) {
			System.out.println("나의 보유 머니 : " +this.money+"원");
			this.itemManagerMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				this.shop.buyItem();
			}
			if(sel == 2) {
				this.shop.sellItem();
			}
			if(sel == 3) {
				this.shop.addItem();
			}
			if(sel == 4) {
				this.shop.delItem();
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
