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
			System.out.println("���� ���� �Ӵ� : " +this.money+"��");
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
		System.out.println("1.�����۱���\n2.�������Ǹ�\n3.�������߰�\n4.�����ۻ���\n5.�ڷΰ���");
	}
}
