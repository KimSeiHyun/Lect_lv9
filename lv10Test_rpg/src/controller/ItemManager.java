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
	private GuildManager gm = GuildManager.getGuildManagerInstance();
	
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
				this.inventory();
			}
			if(sel == 4) {
				this.addItem();
			}
			if(sel == 5) {
				this.delectItem();
			}
			if(sel == 6) {
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
		System.out.println("1.아이템구입\n2.아이템판매\n3.인벤토리\n[4.아이템목록추가]\n[5.아이템목록삭제]\n6.뒤로가기");
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
	
	// 판매시 착용한 길드원이 있다면 해당길드원의 착용해제 먼저 적용하기 - no
	private void sellItem() {
		if(this.inventory.size() != 0) {
			this.inventoryListPrint();
			System.out.println("판매할 아이템의 번호를 입력해주세요 ");
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.inventory.size() ) {
				if(this.inventory.get(idx).getUse() == false) {
					int price = this.inventory.get(idx).getPrice();
					this.inventory.remove(idx);
					Player.money += price/2;					
				}else System.out.println("아이템 착용해제를 먼저 해주세요 . ");
			}else System.out.println("번호를 다시 확인해주세요 . ");
		}else System.out.println("인벤토리가 비어있습니다. ");
	}
	
	private void inventory() {
		while(true) {
			this.inventoryListPrint();
			System.out.print("[1.착용]  [2.해제]  [3.뒤로가기]");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("착용할 아이템의 번호를 입력 : ");
				int invenIdx = sc.nextInt();
				if(invenIdx >= 0 && invenIdx < this.inventory.size()) {
					if(this.inventory.get(invenIdx).getUse() == false) {
						if(this.inventory.get(invenIdx).getKind().equals("무기")) {
							this.gm.guildMemberPrint();
							System.out.print("해당 아이템을 착용할 길드원의 번호 입력 : ");
							int memberIdx = sc.nextInt();
							if(memberIdx >= 0 && memberIdx < this.gm.member.size()) {
								if(this.gm.member.get(memberIdx).getWeapon( )== null) {
									this.inventory.get(invenIdx).setUse(true);
									this.inventory.get(invenIdx).setUserName(this.gm.member.get(memberIdx).getName());
									this.gm.member.get(memberIdx).setAtk((this.inventory.get(invenIdx).getPower()+this.gm.member.get(memberIdx).getAtk()));
									this.gm.member.get(memberIdx).setWeapon(this.inventory.get(invenIdx));
								}else System.out.println("해당 길드원은 무기를 이미 착용중입니다.");
							}else System.out.println("길드원의 번호를 다시 확인해주세요 . ");
						}
						if(this.inventory.get(invenIdx).getKind().equals("방어구")) {
							this.gm.guildMemberPrint();
							System.out.print("해당 아이템을 착용할 길드원의 번호 입력 : ");
							int memberIdx = sc.nextInt();
							if(memberIdx >= 0 && memberIdx < this.gm.member.size()) {
								if(this.gm.member.get(memberIdx).getArmor() == null) {
									this.inventory.get(invenIdx).setUse(true);
									this.inventory.get(invenIdx).setUserName(this.gm.member.get(memberIdx).getName());
									this.gm.member.get(memberIdx).setDef((this.inventory.get(invenIdx).getPower()+this.gm.member.get(memberIdx).getDef()));
									this.gm.member.get(memberIdx).setArmor(this.inventory.get(invenIdx));
								}else System.out.println("해당 길드원은 방어구를 이미 착용중입니다.");
							}else System.out.println("길드원의 번호를 다시 확인해주세요 . ");
						}
						if(this.inventory.get(invenIdx).getKind().equals("장신구")) {
							this.gm.guildMemberPrint();
							System.out.print("해당 아이템을 착용할 길드원의 번호 입력 : ");
							int memberIdx = sc.nextInt();
							if(memberIdx >= 0 && memberIdx < this.gm.member.size()) {
								if(this.gm.member.get(memberIdx).getAccessorise()== null) {
									this.inventory.get(invenIdx).setUse(true);
									this.inventory.get(invenIdx).setUserName(this.gm.member.get(memberIdx).getName());
									this.gm.member.get(memberIdx).setMaxHp((this.inventory.get(invenIdx).getPower()+this.gm.member.get(memberIdx).getMaxHp()));
									this.gm.member.get(memberIdx).setHp((this.inventory.get(invenIdx).getPower()+this.gm.member.get(memberIdx).getHp()));
									this.gm.member.get(memberIdx).setAccessorise(this.inventory.get(invenIdx));
								}else System.out.println("해당 길드원은 장신구를 이미 착용중입니다.");
							}else System.out.println("길드원의 번호를 다시 확인해주세요 . ");
						}
					}else System.out.println("해당 아이템은 이미 착용중입니다.");
				}else System.out.println("아이템의 번호를 다시 확인해주세요 . ");				
			}
			if(sel == 2) {
				System.out.print("헤재할 아이템의 번호를 입력 : ");
				int invenIdx = sc.nextInt();
				if(invenIdx >= 0 && invenIdx < this.inventory.size()) {
					if(this.inventory.get(invenIdx).getUse() == true) {
						if(this.inventory.get(invenIdx).getKind().equals("무기")) {
							int memberIdx = -1;
							for(int i=0; i<this.gm.member.size(); i++) {
								if(this.gm.member.get(i).getWeapon() == this.inventory.get(invenIdx)) {
									memberIdx = i;
								}
							}
							this.inventory.get(invenIdx).setUse(false);
							this.inventory.get(invenIdx).setUserName(null);
							this.gm.member.get(memberIdx).setAtk((this.gm.member.get(memberIdx).getAtk()-this.inventory.get(invenIdx).getPower()));
							this.gm.member.get(memberIdx).setWeapon(null);
						}
						if(this.inventory.get(invenIdx).getKind().equals("방어구")) {
							int memberIdx = -1;
							for(int i=0; i<this.gm.member.size(); i++) {
								if(this.gm.member.get(i).getArmor() == this.inventory.get(invenIdx)) {
									memberIdx = i;
								}
							}
							this.inventory.get(invenIdx).setUse(false);
							this.inventory.get(invenIdx).setUserName(null);
							this.gm.member.get(memberIdx).setDef((this.gm.member.get(memberIdx).getDef()-this.inventory.get(invenIdx).getPower()));
							this.gm.member.get(memberIdx).setArmor(null);
						}
						if(this.inventory.get(invenIdx).getKind().equals("장신구")) {
							int memberIdx = -1;
							for(int i=0; i<this.gm.member.size(); i++) {
								if(this.gm.member.get(i).getAccessorise() == this.inventory.get(invenIdx)) {
									memberIdx = i;
								}
							}
							this.inventory.get(invenIdx).setUse(false);
							this.inventory.get(invenIdx).setUserName(null);
							this.gm.member.get(memberIdx).setHp((this.gm.member.get(memberIdx).getHp()-this.inventory.get(invenIdx).getPower()));
							this.gm.member.get(memberIdx).setMaxHp((this.gm.member.get(memberIdx).getMaxHp()-this.inventory.get(invenIdx).getPower()));
							this.gm.member.get(memberIdx).setAccessorise(null);
						}
					}else System.out.println("해당 아이템은 이미 착용하고있지 않습니다.");
				}else System.out.println("아이템의 번호를 다시 확인해주세요 . ");	
			}
			if(sel == 3) {
				break;
			}
		}
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
		System.out.println("번호\t종류\t이름\t파워\t가격\t착용자\t착용여부");
		for(int i=0; i<this.inventory.size(); i++) {
			System.out.println(i+"\t"+this.inventory.get(i).getKind()+"\t"+
				this.inventory.get(i).getName()+"\t"+this.inventory.get(i).getPower()+"\t"+
				this.inventory.get(i).getPrice()+"\t"+this.inventory.get(i).getUserName()+"\t"+this.inventory.get(i).getUse());
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
