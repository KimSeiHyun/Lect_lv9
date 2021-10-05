import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	public static Inventory instance = new Inventory();
	public static ArrayList<Item> itemList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	private Shop shop = Shop.instance;
	private Guild guild = Guild.instance;
	public void inventoryManager() {
		while(true) {
			inventoryMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				wearItem();
			}
			if(sel == 2) {
				wearOffItem();
			}
			if(sel == 3) {
				break;
			}
		}
	}
	
	private void inventoryMenuPrint() {
		System.out.println("1.아이템착용\n2.아이템착용해제\n3.뒤로가기");
	}
	
	private void wearItem() {
		
		if(this.itemList.size() != 0) {
			this.shop.inventoryList();
			System.out.print("챡용할 아이템 번호 입력 : ");
			int idx = sc.nextInt()-1;
			if(idx >= 0 && idx < this.itemList.size()) {
				if(this.itemList.get(idx).getUse() == false) {
					if(this.guild.member.size() != 0) {
						this.guild.GuildMemberList();
						System.out.print("아이템을 착용할 길드원의 번호 입력 : ");
						int idx2 = sc.nextInt()-1;
						if(idx2 >= 0 && idx2 < this.guild.member.size()) {
							Item temp = this.itemList.get(idx);
							if(this.itemList.get(idx).getKind().equals("무기")) {
								if(this.guild.member.get(idx2).getWeapon() == null) {
									this.guild.member.get(idx2).setWeapon(temp);
									this.guild.member.get(idx2).setAtk(temp.getPower());
									this.itemList.get(idx).setUse();
								}else {
									System.out.println("이미 착용중인 장비가 있습니다. 교체하시겠습니까? 1.[YES]\t2.[NO]");
									int sel = sc.nextInt();
									if(sel == 1) {
										Item wearItem = this.guild.member.get(idx2).getWeapon();
										this.guild.member.get(idx2).setAtk(-wearItem.getPower());
										this.guild.member.get(idx2).setWeapon(temp);
										this.guild.member.get(idx2).setAtk(temp.getPower());
										this.itemList.get(idx).setUse();
										for(int i=0; i<this.itemList.size(); i++) {
											if(this.itemList.get(i).getName().equals(wearItem.getName())) {
												this.itemList.get(i).setUse();
											}
										}
									}
								}
							}
							if(this.itemList.get(idx).getKind().equals("방어구")) {
								if(this.guild.member.get(idx2).getArmor() == null) {
									this.guild.member.get(idx2).setArmor(temp);
									this.guild.member.get(idx2).setDef(temp.getPower());
									this.itemList.get(idx).setUse();
								}else {
									System.out.println("이미 착용중인 장비가 있습니다. 교체하시겠습니까? 1.[YES]\t2.[NO]");
									int sel = sc.nextInt();
									if(sel == 1) {
										Item wearItem = this.guild.member.get(idx2).getArmor();
										this.guild.member.get(idx2).setDef(-wearItem.getPower());
										this.guild.member.get(idx2).setArmor(temp);
										this.guild.member.get(idx2).setDef(temp.getPower());
										this.itemList.get(idx).setUse();
										for(int i=0; i<this.itemList.size(); i++) {
											if(this.itemList.get(i).getName().equals(wearItem.getName())) {
												this.itemList.get(i).setUse();
											}
										}
									}
								}
							}
							if(this.itemList.get(idx).getKind().equals("장신구")) {
								if(this.guild.member.get(idx2).getAccessorise() == null) {
									this.guild.member.get(idx2).setAccessorise(temp);
									this.guild.member.get(idx2).setMaxHp(temp.getPower());
									this.itemList.get(idx).setUse();
								}else {
									System.out.println("이미 착용중인 장비가 있습니다. 교체하시겠습니까? 1.[YES]\t2.[NO]");
									int sel = sc.nextInt();
									if(sel == 1) {
										Item wearItem = this.guild.member.get(idx2).getAccessorise();
										this.guild.member.get(idx2).setMaxHp(-wearItem.getPower());
										this.guild.member.get(idx2).setAccessorise(temp);
										this.guild.member.get(idx2).setMaxHp(temp.getPower());
										this.itemList.get(idx).setUse();
										for(int i=0; i<this.itemList.size(); i++) {
											if(this.itemList.get(i).getName().equals(wearItem.getName())) {
												this.itemList.get(i).setUse();
											}
										}
									}
								}
							}
						}else System.out.println("길드원의 번호를 다시 확인해주세요 . ");
					}else System.out.println("아이템을 착용할 길드원이 존재하지 않습니다.");
				}else System.out.println("해당 아이템은 이미 장착중인 아이템입니다. ");
			}else System.out.println("착용할 아이템의 번호를 다시 확인해주세요 . ");
		}else System.out.println("착용할 아이템이 존재하지 않습니다.");
	}
	
	private void wearOffItem() {
		if(this.guild.member.size() != 0) {
			this.shop.inventoryList();
			int idx = sc.nextInt()-1;
			if(idx >= 0 && idx < this.itemList.size()) {
				if(this.itemList.get(idx).getUse() == true) {
					this.itemList.get(idx).setUse();
					Item temp = this.itemList.get(idx);
					if(temp.getKind().equals("무기")) {
						for(int i=0; i<this.guild.member.size(); i++) {
							if(this.guild.member.get(i).getWeapon().getName().equals(temp.getName())) {
								this.guild.member.get(i).setAtk(-temp.getPower());
							}
						}
					}else if(temp.getKind().equals("방어구")) {
						for(int i=0; i<this.guild.member.size(); i++) {
							if(this.guild.member.get(i).getArmor().getName().equals(temp.getName())) {
								this.guild.member.get(i).setDef(-temp.getPower());
							}
						}
					}else {
						for(int i=0; i<this.guild.member.size(); i++) {
							if(this.guild.member.get(i).getAccessorise().getName().equals(temp.getName())) {
								this.guild.member.get(i).setMaxHp(-temp.getPower());
							}
						}
					}
					return;
				}else System.out.println("해당 아이템은 미착용 상태입니다.");
			}else System.out.println("해제할 아이템의 번호를 다시 확인해주세요 . ");
		}else System.out.println("아이템해제를 할 길드원이 없습니다.");
	}
}
