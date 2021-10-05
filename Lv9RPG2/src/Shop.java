import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	private Scanner sc = new Scanner(System.in);
	public static Shop instance = new Shop();
	public static ArrayList<Item> itemList = new ArrayList<>();
	Inventory inventory = Inventory.instance;
	
	public void buyItem() {
		if(this.itemList.size() != 0) {
			shopList();
			System.out.print("구매할 아이템의 이름을 입력해주세요. ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.itemList.size(); i++) {
				if(this.itemList.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				if(this.itemList.get(idx).getPrice() <= Player.money) {
					String kind2 = this.itemList.get(idx).getKind();
					String name2 = this.itemList.get(idx).getName();
					int power = this.itemList.get(idx).getPower();
					int price = this.itemList.get(idx).getPrice();
					Item temp = new Item(kind2 , name2 , power , price);
					this.inventory.itemList.add(temp);	
					
					Player.money -= this.itemList.get(idx).getPrice();
				}else System.out.println("보유머니가 부족합니다.");
			}else System.out.println("구매할 아이템의 이름을 정확히 입력해주세요 . ");
		}else System.out.println("구입할 아이템이 존재하지 않습니다 .아이템을 먼저 추가해주세요 . ");
	}
	
	public void sellItem() {
		if(this.inventory.itemList.size() != 0) {
			inventoryList();
			System.out.print("판매할 아이템의 이름을 입력해주세요 . ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.inventory.itemList.size(); i++) {
				if(this.inventory.itemList.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				if(this.inventory.itemList.get(idx).getUse() == false) {
					Player.money += this.inventory.itemList.get(idx).getPrice()/2;
					this.inventory.itemList.remove(idx);					
				}else System.out.println("착용중인 아이템은 판매할 수 없습니다.");
			}else System.out.println("판매할 아이템의 이름을 정확히 입력해주세요 . ");
		}else System.out.println("판매할 아이템이 존재하지 않습니다.");
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
				System.out.println("무기의 파워수치 \t> 공격력 증가 ");
				System.out.println("방어구의 파워수치 \t> 방어력 증가");
				System.out.println("장신구의 파워수치 \t> 체력중가");
				System.out.print("추가할 아이템의 파워를 입력해주세요 . ");
				int power = sc.nextInt();
				System.out.print("추가할 아이템의 가격을 입력해주세요 . ");
				int price = sc.nextInt();
				this.itemList.add(new Item(kind , name , power , price));
				sort();
				sort();
				sort();
			}else System.out.println("해당 아이템의 이름이 이미 존재합니다. ");
		}else System.out.println("숫자의 범위를 벗어났습니다.");
	}
	public void delItem() {
		if(this.itemList.size() != 0 ) {
			shopList();			
			System.out.print("삭제할 아이템의 이름을 입력 : ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.itemList.size(); i++) {
				if(this.itemList.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				this.itemList.remove(idx);
				sort();
			}else System.out.println("삭제할 아이템의 이름을 다시 확인해주세요.  ");
		}else System.out.println("삭제할 아이템이 없습니다.");
	}
	
	public void shopList() {
		System.out.println("------------상점-------------");
		System.out.println("종류\t이름\t파워\t가격");
		for(int i=0; i<this.itemList.size(); i++) {
			
			System.out.print(this.itemList.get(i).getKind()+"\t"+this.itemList.get(i).getName()+"\t"
					+this.itemList.get(i).getPower()+"\t"+this.itemList.get(i).getPrice()+"\n");
		}
		System.out.println("----------------------------");
	}
	public void inventoryList() {
		System.out.println("=============인벤토리===========");
		System.out.println("번호\t종류\t이름\t파워\t가격\t착용/미착용\t착용유저");
		for(int i=0; i<this.inventory.itemList.size(); i++) {
			System.out.print("["+(i+1)+"]\t" +this.inventory.itemList.get(i).getKind()+"\t"+this.inventory.itemList.get(i).getName()+"\t"
					+this.inventory.itemList.get(i).getPower()+"\t"+this.inventory.itemList.get(i).getPrice()
					+"\t"+this.inventory.itemList.get(i).getUse()+"\t"+this.inventory.itemList.get(i).getUserName()+"\n");
		}
		System.out.println("================================");
	}
	
	public void sort() {
		for(int i=0; i<this.itemList.size(); i++) {
			for(int j=0; j<this.itemList.size(); j++) {
				if( i != j && this.itemList.get(i).getKind().compareTo(this.itemList.get(j).getKind()) < 0) {
					Item temp = this.itemList.get(i);
					this.itemList.set(i, this.itemList.get(j));
					this.itemList.set(j, temp);
				}
			}
		}
		for(int i=0; i<this.itemList.size(); i++) {
			for(int j=0; j<this.itemList.size(); j++) {
				if( i != j && this.itemList.get(i).getKind().equals(this.itemList.get(j).getKind()) && this.itemList.get(i).getPower() <  this.itemList.get(j).getPower()) {
					Item temp = this.itemList.get(i);
					this.itemList.set(i, this.itemList.get(j));
					this.itemList.set(j, temp);
				}
			}
		}
	}
	
}
