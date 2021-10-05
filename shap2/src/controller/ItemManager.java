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
			System.out.print("�߰��� ������ �̸� �Է� : ");
			String itemName = um.sc.next();
			int check = 0;
			for(int i=0; i<this.item.size(); i++) {
				if(this.item.get(i).getName().equals(itemName)) check = 1;
			}
			if(check == 0) {
				System.out.print("�������� ���� �Է� : ");
				int itemPrice = um.sc.nextInt();
				System.out.println("�ش� �������� ī�װ��� �����ּ���(��ȣ�״���Է�) . ");
				this.s.categoryList();
				//instance
//				System.out.println("--ī�װ����--");
//				for(int i=0; i<this.shop.category.size(); i++) {
//					System.out.printf("%d.%s\n",(i+1),this.shop.category.get(i));
//				}
//				System.out.println("-------------");
				int selCategory = um.sc.nextInt()-1;
				if(selCategory >= 0 && selCategory < this.shop.category.size()) {
					item.add(new Item(itemName,itemPrice,this.shop.category.get(selCategory)));
				}else System.out.println("������ ī�װ��� ������ ������ϴ�.");
			}else System.out.println("�ش� �������̸��� �̹� �����մϴ�.");
		}else System.out.println("�������� �߰��ϱ����� ī�װ��� ���� �߰����ּ��� .");
	}
	
	public void deleteItem() {
		System.out.print("������ ������ �̸� �Է� : ");
		String itemName = um.sc.next();
		int idx = -1;
		for(int i=0; i<this.item.size(); i++) {
			if(this.item.get(i).getName().equals(itemName)) idx = i;
		}
		if(idx != -1) {
			this.item.remove(idx);
		}else System.out.println("�ش� �������� ã�� �� �����ϴ�.");
	}
	
	public void itemListPrint() {
		System.out.println("---�����۸���Ʈ---");
		System.out.println("��ȣ\t�̸�\t����\tī�װ�");
		for(int i=0; i<this.item.size(); i++) {
			System.out.printf("%d\t%s\t%d\t%s\n",i+1,this.item.get(i).getName(),this.item.get(i).getPrice(),this.item.get(i).getCategory());
		}
		System.out.println("--------------");
	}
	
}
