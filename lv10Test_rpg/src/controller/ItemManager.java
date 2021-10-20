package controller;

import java.util.ArrayList;
import java.util.Scanner;

import models.Inventory;
import models.Item;
import models.Player;

public class ItemManager {
	public static ItemManager instance = new ItemManager();
	
	public static ItemManager getItemManagerInstance() {
		return ItemManager.instance;
	}
	
	public static ArrayList<Item> item = new ArrayList<>();
	public static ArrayList<Inventory> inventory = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void itemManagerRun() {
		while(true) {
			System.out.println("현재 보유 골드 : " +Player.money);
			this.itemManagerMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				this.buyItem();
			}
			if(sel == 2) {
				this.sellItem();
			}
			if(sel == 3) {
				this.addItem();
			}
			if(sel == 4) {
				this.delectItem();
			}
			if(sel == 5) {
				break;
			}
		}
	
	}
	
	public void itemInit() {
		this.item.add(new Item("무기" , "목검" , 10 , 1000));
		this.item.add(new Item("무기" , "철검" , 20 , 2000));
		this.item.add(new Item("방어구" , "천갑옷" , 3 , 1000));
		this.item.add(new Item("방어구" , "철갑옷" , 6 , 2000));
		this.item.add(new Item("장신구" , "반지" , 30 , 1000));
		this.item.add(new Item("장신구" , "꽃반지" , 60 , 2000));
	}
	
	private void itemManagerMenuPrint() {
		System.out.println("1.아이템구입\n2.아이템판매\n[3.아이템목록추가]\n[4.아이템목록삭제]\n5.뒤로가기");
	}
	
	private void buyItem() {
		if(this.item.size() != 0) {
			this.itemListPrint();
			System.out.print("구매할 아이템의 번호 입력 : ");
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.item.size()) {
				if(this.item.get(idx).getPrice() <= Player.money) {
					String kind = this.item.get(idx).getKind();
					String name = this.item.get(idx).getName();
					int power = this.item.get(idx).getPower();
					int price = this.item.get(idx).getPrice();
					this.inventory.add(new Inventory(kind , name , power , price));
					Player.money -= price;
					this.sortInventoryList();
				}else System.out.println("보유 골드가 부족합니다.");				
			}else System.out.println("번호를 다시 확인해주세요 .");
		}else System.out.println("구매할 아이템 목록이 없습니다.");
	}
	private void sellItem() {
		if(this.inventory.size() != 0) {
			this.inventoryListPrint();
			System.out.println("판매할 아이템의 번호를 입력해주세요 ");
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.inventory.size()) {
				int price = this.inventory.get(idx).getPrice();
				this.inventory.remove(idx);
				Player.money += price/2;
			}else System.out.println("번호를 다시 확인해주세요 . ");
		}else System.out.println("인벤토리가 비어있습니다. ");
	}
	private void addItem() {
		String kind = null;
		while(kind == null) {
			System.out.println("아이템의 종류 선택 : [1.무기]  [2.방어구]  [3.장신구]");
			int sel = sc.nextInt();
			if(sel == 1) {
				kind = "무기";
			}
			if(sel == 2) {
				kind = "방어구";
			}
			if(sel == 3) {
				kind = "장신구";
			}else System.out.println("1~3사이의 번호를 입력해주세요 . ");
		}
		String name = null;
		System.out.println("아이템의 이름을 입력해주세요 . ");
		while(true) {
			name = sc.next();
			int check = 0;
			for(int i=0; i<this.item.size(); i++) {
				if(name.equals(this.item.get(i).getName())) {
					check = 1;
				}
			}
			if(check == 0 ) {
				break;
			}else System.out.println("아이템의 이름이 중복됐습니다.");
		}
		System.out.print("아이템의 파워 입력 : ");
		int power = sc.nextInt();
		System.out.print("아이템의 가격 입력 : ");
		int price = sc.nextInt();;
		Item item = new Item(kind , name , power , price);
		System.out.println("종류 : " +kind);
		System.out.println("이름 : " +name);
		System.out.println("파워 : " +power);
		System.out.println("가격 : " +price);
		this.item.add(item);
		this.sortItemList();
		return;
	}
	
	private void delectItem() {
		if(this.item.size() != 0) {
			this.itemListPrint();
			System.out.print("삭제할 아이템의 번호 입력 : ");
			int sel = sc.nextInt();	
			if(sel >= 0 && sel < this.item.size()) {
				this.item.remove(sel);
			}else System.out.println("번호를 제대로 입력해주세요 . ");
		}else System.out.println("삭제할 아이템목록이 없습니다.");
		
	}
	
	
	private void itemListPrint() {
		System.out.println("번호\t종류\t이름\t파워\t가격");
		for(int i=0; i<this.item.size(); i++) {
			System.out.println(i+"\t"+this.item.get(i).getKind()+"\t"+
				this.item.get(i).getName()+"\t"+this.item.get(i).getPower()+"\t"+
				this.item.get(i).getPrice());
		}
	}
	

	private void inventoryListPrint() {
		System.out.println("번호\t종류\t이름\t파워\t가격");
		for(int i=0; i<this.inventory.size(); i++) {
			System.out.println(i+"\t"+this.inventory.get(i).getKind()+"\t"+
				this.inventory.get(i).getName()+"\t"+this.inventory.get(i).getPower()+"\t"+
				this.inventory.get(i).getPrice());
		}
	}
	
	public void sortItemList() {
		// 정류별로 정렬
		for(int i=0; i<this.item.size(); i++) {
			for(int j=i; j<this.item.size(); j++) {
				if(this.item.get(i).getKind().compareTo(this.item.get(j).getKind()) > 0) {
					Item temp = this.item.get(i);
					this.item.set(i, this.item.get(j));
					this.item.set(j, temp);
				}
			}
		}
		// 파워순으로 정렬
		for(int i=0; i<this.item.size(); i++) {
			for(int j=i; j<this.item.size(); j++) {
				if(this.item.get(i).getKind().equals(this.item.get(j).getKind()) &&
						this.item.get(i).getPower() > this.item.get(j).getPower()) {
					Item temp = this.item.get(i);
					this.item.set(i, this.item.get(j));
					this.item.set(j, temp);
				}
			}
		}
	}
	
	public void sortInventoryList() {
		// 정류별로 정렬
		for(int i=0; i<this.inventory.size(); i++) {
			for(int j=i; j<this.inventory.size(); j++) {
				if(this.inventory.get(i).getKind().compareTo(this.inventory.get(j).getKind()) > 0) {
					Inventory temp = this.inventory.get(i);
					this.inventory.set(i, this.inventory.get(j));
					this.inventory.set(j, temp);
				}
			}
		}
		// 파워순으로 정렬
		for(int i=0; i<this.inventory.size(); i++) {
			for(int j=i; j<this.inventory.size(); j++) {
				if(this.inventory.get(i).getKind().equals(this.inventory.get(j).getKind()) &&
						this.inventory.get(i).getPower() > this.inventory.get(j).getPower()) {
					Inventory temp = this.inventory.get(i);
					this.inventory.set(i, this.inventory.get(j));
					this.inventory.set(j, temp);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
