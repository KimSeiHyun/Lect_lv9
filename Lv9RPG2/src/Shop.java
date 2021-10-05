import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	private Scanner sc = new Scanner(System.in);
	ArrayList<Item> itemList = new ArrayList<>();
	private Inventory inventory = Inventory.instance;
	public void buyItem() {
		if(this.itemList.size() != 0) {
			itemList();
			System.out.print("구매할 아이템의 이름을 입력해주세요. ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.itemList.size(); i++) {
				if(this.itemList.get(i).equals(name)) idx = i;
			}
			if(idx != -1) {
				
				Item temp = this.itemList.get(idx);
				this.inventory.itemList.add(temp);
			}else System.out.println("구매할 아이템의 이름을 정확히 입력해주세요 . ");
		}else System.out.println("구입할 아이템이 존재하지 않습니다 .아이템을 먼저 추가해주세요 . ");
	}
	public void sellItem() {
		itemList();
	
	}
	public void addItem() {
		
		System.out.println("추가할 아이템의 종류를 선택해주세요.");
		System.out.println("1.[무기]\t2.[방어구]\t3.[장신구]");
		String kind = "";
		int selKind = sc.nextInt();
		if(selKind >= 1 && selKind <= 3) {
			if(selKind == 1) {
				kind = "무기";
			}else if (selKind == 2) {
				kind = "방어구";
			}else kind = "장신구";
			System.out.print("추가할 아이템의 이름을 입력해주세요 .");
			String name = sc.next();
			int check = 0;
			for(int i=0; i<this.itemList.size(); i++) {
				if(this.itemList.get(i).getName().equals(name)) check = 1;
			}
			if(check == 0) {
				System.out.print("추가할 아이템의 파워를 입력해주세요 . ");
				int power = sc.nextInt();
				System.out.print("추가할 아이템의 가격을 입력해주세요 . ");
				int price = sc.nextInt();
				this.itemList.add(new Item(kind , name , power , price));
			}else System.out.println("해당 아이템의 이름이 이미 존재합니다. ");
		}else System.out.println("숫자의 범위를 벗어났습니다.");
	}
	public void delItem() {
		itemList();
	}
	
	public void itemList() {
		System.out.println("----------상점-------------");
		System.out.println("종류\t이름\t파워\t가격");
		for(int i=0; i<this.itemList.size(); i++) {
			
			System.out.print(this.itemList.get(i).getKind()+"\t"+this.itemList.get(i).getName()+"\t"
					+this.itemList.get(i).getPower()+"\t"+this.itemList.get(i).getPrice()+"\n");
		}
		System.out.println("----------------------------");
	}
	
}
