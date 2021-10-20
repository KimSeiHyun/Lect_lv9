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
			System.out.println("���� ���� ��� : " +Player.money);
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
		this.item.add(new Item("����" , "���" , 10 , 1000));
		this.item.add(new Item("����" , "ö��" , 20 , 2000));
		this.item.add(new Item("��" , "õ����" , 3 , 1000));
		this.item.add(new Item("��" , "ö����" , 6 , 2000));
		this.item.add(new Item("��ű�" , "����" , 30 , 1000));
		this.item.add(new Item("��ű�" , "�ɹ���" , 60 , 2000));
	}
	
	private void itemManagerMenuPrint() {
		System.out.println("1.�����۱���\n2.�������Ǹ�\n3.�κ��丮\n[4.�����۸���߰�]\n[5.�����۸�ϻ���]\n6.�ڷΰ���");
	}
	
	private void buyItem() {
		if(this.item.size() != 0) {
			this.itemListPrint();
			System.out.print("������ �������� ��ȣ �Է� : ");
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
				}else System.out.println("���� ��尡 �����մϴ�.");				
			}else System.out.println("��ȣ�� �ٽ� Ȯ�����ּ��� .");
		}else System.out.println("������ ������ ����� �����ϴ�.");
	}
	
	// �ǸŽ� ������ ������ �ִٸ� �ش������ �������� ���� �����ϱ� - no
	private void sellItem() {
		if(this.inventory.size() != 0) {
			this.inventoryListPrint();
			System.out.println("�Ǹ��� �������� ��ȣ�� �Է����ּ��� ");
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.inventory.size() ) {
				if(this.inventory.get(idx).getUse() == false) {
					int price = this.inventory.get(idx).getPrice();
					this.inventory.remove(idx);
					Player.money += price/2;					
				}else System.out.println("������ ���������� ���� ���ּ��� . ");
			}else System.out.println("��ȣ�� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("�κ��丮�� ����ֽ��ϴ�. ");
	}
	
	private void inventory() {
		while(true) {
			this.inventoryListPrint();
			System.out.print("[1.����]  [2.����]  [3.�ڷΰ���]");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("������ �������� ��ȣ�� �Է� : ");
				int invenIdx = sc.nextInt();
				if(invenIdx >= 0 && invenIdx < this.inventory.size()) {
					if(this.inventory.get(invenIdx).getUse() == false) {
						if(this.inventory.get(invenIdx).getKind().equals("����")) {
							this.gm.guildMemberPrint();
							System.out.print("�ش� �������� ������ ������ ��ȣ �Է� : ");
							int memberIdx = sc.nextInt();
							if(memberIdx >= 0 && memberIdx < this.gm.member.size()) {
								if(this.gm.member.get(memberIdx).getWeapon( )== null) {
									this.inventory.get(invenIdx).setUse(true);
									this.inventory.get(invenIdx).setUserName(this.gm.member.get(memberIdx).getName());
									this.gm.member.get(memberIdx).setAtk((this.inventory.get(invenIdx).getPower()+this.gm.member.get(memberIdx).getAtk()));
									this.gm.member.get(memberIdx).setWeapon(this.inventory.get(invenIdx));
								}else System.out.println("�ش� ������ ���⸦ �̹� �������Դϴ�.");
							}else System.out.println("������ ��ȣ�� �ٽ� Ȯ�����ּ��� . ");
						}
						if(this.inventory.get(invenIdx).getKind().equals("��")) {
							this.gm.guildMemberPrint();
							System.out.print("�ش� �������� ������ ������ ��ȣ �Է� : ");
							int memberIdx = sc.nextInt();
							if(memberIdx >= 0 && memberIdx < this.gm.member.size()) {
								if(this.gm.member.get(memberIdx).getArmor() == null) {
									this.inventory.get(invenIdx).setUse(true);
									this.inventory.get(invenIdx).setUserName(this.gm.member.get(memberIdx).getName());
									this.gm.member.get(memberIdx).setDef((this.inventory.get(invenIdx).getPower()+this.gm.member.get(memberIdx).getDef()));
									this.gm.member.get(memberIdx).setArmor(this.inventory.get(invenIdx));
								}else System.out.println("�ش� ������ ���� �̹� �������Դϴ�.");
							}else System.out.println("������ ��ȣ�� �ٽ� Ȯ�����ּ��� . ");
						}
						if(this.inventory.get(invenIdx).getKind().equals("��ű�")) {
							this.gm.guildMemberPrint();
							System.out.print("�ش� �������� ������ ������ ��ȣ �Է� : ");
							int memberIdx = sc.nextInt();
							if(memberIdx >= 0 && memberIdx < this.gm.member.size()) {
								if(this.gm.member.get(memberIdx).getAccessorise()== null) {
									this.inventory.get(invenIdx).setUse(true);
									this.inventory.get(invenIdx).setUserName(this.gm.member.get(memberIdx).getName());
									this.gm.member.get(memberIdx).setMaxHp((this.inventory.get(invenIdx).getPower()+this.gm.member.get(memberIdx).getMaxHp()));
									this.gm.member.get(memberIdx).setHp((this.inventory.get(invenIdx).getPower()+this.gm.member.get(memberIdx).getHp()));
									this.gm.member.get(memberIdx).setAccessorise(this.inventory.get(invenIdx));
								}else System.out.println("�ش� ������ ��ű��� �̹� �������Դϴ�.");
							}else System.out.println("������ ��ȣ�� �ٽ� Ȯ�����ּ��� . ");
						}
					}else System.out.println("�ش� �������� �̹� �������Դϴ�.");
				}else System.out.println("�������� ��ȣ�� �ٽ� Ȯ�����ּ��� . ");				
			}
			if(sel == 2) {
				System.out.print("������ �������� ��ȣ�� �Է� : ");
				int invenIdx = sc.nextInt();
				if(invenIdx >= 0 && invenIdx < this.inventory.size()) {
					if(this.inventory.get(invenIdx).getUse() == true) {
						if(this.inventory.get(invenIdx).getKind().equals("����")) {
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
						if(this.inventory.get(invenIdx).getKind().equals("��")) {
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
						if(this.inventory.get(invenIdx).getKind().equals("��ű�")) {
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
					}else System.out.println("�ش� �������� �̹� �����ϰ����� �ʽ��ϴ�.");
				}else System.out.println("�������� ��ȣ�� �ٽ� Ȯ�����ּ��� . ");	
			}
			if(sel == 3) {
				break;
			}
		}
	}
	
	private void addItem() {
		String kind = null;
		while(kind == null) {
			System.out.println("�������� ���� ���� : [1.����]  [2.��]  [3.��ű�]");
			int sel = sc.nextInt();
			if(sel == 1) {
				kind = "����";
			}
			if(sel == 2) {
				kind = "��";
			}
			if(sel == 3) {
				kind = "��ű�";
			}else System.out.println("1~3������ ��ȣ�� �Է����ּ��� . ");
		}
		String name = null;
		System.out.println("�������� �̸��� �Է����ּ��� . ");
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
			}else System.out.println("�������� �̸��� �ߺ��ƽ��ϴ�.");
		}
		System.out.print("�������� �Ŀ� �Է� : ");
		int power = sc.nextInt();
		System.out.print("�������� ���� �Է� : ");
		int price = sc.nextInt();;
		Item item = new Item(kind , name , power , price);
		System.out.println("���� : " +kind);
		System.out.println("�̸� : " +name);
		System.out.println("�Ŀ� : " +power);
		System.out.println("���� : " +price);
		this.item.add(item);
		this.sortItemList();
		return;
	}
	
	private void delectItem() {
		if(this.item.size() != 0) {
			this.itemListPrint();
			System.out.print("������ �������� ��ȣ �Է� : ");
			int sel = sc.nextInt();	
			if(sel >= 0 && sel < this.item.size()) {
				this.item.remove(sel);
			}else System.out.println("��ȣ�� ����� �Է����ּ��� . ");
		}else System.out.println("������ �����۸���� �����ϴ�.");
		
	}
	
	
	private void itemListPrint() {
		System.out.println("��ȣ\t����\t�̸�\t�Ŀ�\t����");
		for(int i=0; i<this.item.size(); i++) {
			System.out.println(i+"\t"+this.item.get(i).getKind()+"\t"+
				this.item.get(i).getName()+"\t"+this.item.get(i).getPower()+"\t"+
				this.item.get(i).getPrice());
		}
	}
	

	private void inventoryListPrint() {
		System.out.println("��ȣ\t����\t�̸�\t�Ŀ�\t����\t������\t���뿩��");
		for(int i=0; i<this.inventory.size(); i++) {
			System.out.println(i+"\t"+this.inventory.get(i).getKind()+"\t"+
				this.inventory.get(i).getName()+"\t"+this.inventory.get(i).getPower()+"\t"+
				this.inventory.get(i).getPrice()+"\t"+this.inventory.get(i).getUserName()+"\t"+this.inventory.get(i).getUse());
		}
	}
	
	public void sortItemList() {
		// �������� ����
		for(int i=0; i<this.item.size(); i++) {
			for(int j=i; j<this.item.size(); j++) {
				if(this.item.get(i).getKind().compareTo(this.item.get(j).getKind()) > 0) {
					Item temp = this.item.get(i);
					this.item.set(i, this.item.get(j));
					this.item.set(j, temp);
				}
			}
		}
		// �Ŀ������� ����
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
		// �������� ����
		for(int i=0; i<this.inventory.size(); i++) {
			for(int j=i; j<this.inventory.size(); j++) {
				if(this.inventory.get(i).getKind().compareTo(this.inventory.get(j).getKind()) > 0) {
					Inventory temp = this.inventory.get(i);
					this.inventory.set(i, this.inventory.get(j));
					this.inventory.set(j, temp);
				}
			}
		}
		// �Ŀ������� ����
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
