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
		this.item.add(new Item("����" , "���" , 10 , 1000));
		this.item.add(new Item("����" , "ö��" , 20 , 2000));
		this.item.add(new Item("��" , "õ����" , 3 , 1000));
		this.item.add(new Item("��" , "ö����" , 6 , 2000));
		this.item.add(new Item("��ű�" , "����" , 30 , 1000));
		this.item.add(new Item("��ű�" , "�ɹ���" , 60 , 2000));
	}
	
	private void itemManagerMenuPrint() {
		System.out.println("1.�����۱���\n2.�������Ǹ�\n[3.�����۸���߰�]\n[4.�����۸�ϻ���]\n5.�ڷΰ���");
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
	private void sellItem() {
		if(this.inventory.size() != 0) {
			this.inventoryListPrint();
			System.out.println("�Ǹ��� �������� ��ȣ�� �Է����ּ��� ");
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.inventory.size()) {
				int price = this.inventory.get(idx).getPrice();
				this.inventory.remove(idx);
				Player.money += price/2;
			}else System.out.println("��ȣ�� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("�κ��丮�� ����ֽ��ϴ�. ");
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
		System.out.println("��ȣ\t����\t�̸�\t�Ŀ�\t����");
		for(int i=0; i<this.inventory.size(); i++) {
			System.out.println(i+"\t"+this.inventory.get(i).getKind()+"\t"+
				this.inventory.get(i).getName()+"\t"+this.inventory.get(i).getPower()+"\t"+
				this.inventory.get(i).getPrice());
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
