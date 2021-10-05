package controller;

import java.util.ArrayList;

import models.Item;

public class ItemManager {
	public static  ItemManager instance = new ItemManager();
	private UserManager um = UserManager.instance;
	private Shop shop = Shop.instance;
	private Shop s = new Shop();
	public static ArrayList<Item> item = new ArrayList<>();
	
	public void addItem() {
		if(this.shop.category.size() != 0) {
			System.out.print("추가할 아이템 이름 입력 : ");
			String itemName = um.sc.next();
			int check = 0;
			for(int i=0; i<this.item.size(); i++) {
				if(this.item.get(i).getName().equals(itemName)) check = 1;
			}
			if(check == 0) {
				System.out.print("아이템의 가격 입력 : ");
				int itemPrice = um.sc.nextInt();
				System.out.println("해당 아이템의 카테고리를 정해주세요(번호그대로입력) . ");
				this.s.categoryList();
				//instance
//				System.out.println("--카테고리목록--");
//				for(int i=0; i<this.shop.category.size(); i++) {
//					System.out.printf("%d.%s\n",(i+1),this.shop.category.get(i));
//				}
//				System.out.println("-------------");
				int selCategory = um.sc.nextInt()-1;
				if(selCategory >= 0 && selCategory < this.shop.category.size()) {
					item.add(new Item(itemName,itemPrice,this.shop.category.get(selCategory)));
				}else System.out.println("선택한 카테고리가 범위를 벗어났습니다.");
			}else System.out.println("해당 아이템이름은 이미 존재합니다.");
		}else System.out.println("아이템을 추가하기전에 카테고리를 먼저 추가해주세요 .");
	}
	
	public void deleteItem() {
		System.out.print("삭제할 아이템 이름 입력 : ");
		String itemName = um.sc.next();
		int idx = -1;
		for(int i=0; i<this.item.size(); i++) {
			if(this.item.get(i).getName().equals(itemName)) idx = i;
		}
		if(idx != -1) {
			this.item.remove(idx);
		}else System.out.println("해당 아이템을 찾을 수 없습니다.");
	}
	
	public void itemListPrint() {
		System.out.println("---아이템리스트---");
		System.out.println("번호\t이름\t가격\t카테고리");
		for(int i=0; i<this.item.size(); i++) {
			System.out.printf("%d\t%s\t%d\t%s\n",i+1,this.item.get(i).getName(),this.item.get(i).getPrice(),this.item.get(i).getCategory());
		}
		System.out.println("--------------");
	}
	
}
