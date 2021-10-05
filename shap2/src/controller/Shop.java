package controller;

import java.util.ArrayList;

import models.Cart;

public class Shop {
	public static Shop instance = new Shop();
	private UserManager um = UserManager.instance;
	private ItemManager im = ItemManager.instance;
	private FileManager fm = FileManager.instance;
	public static ArrayList<String> category = new ArrayList<>();
	public void run() {
		this.fm.load();
		while(true) {
			System.out.println("log : " +this.um.log);
			if(this.um.log == -1) {
				meinMenuPrint();
				if(selectMainMenu() == 3) {
					System.out.println("�����մϴ�.");
					this.fm.save();
					break;
				}
			}else {
				loginMenu();
				selectLoginMenu();
			}
		}
	}
	private void meinMenuPrint() {
		System.out.println("1.ȸ������\n2.�α���\n3.����\n100.�����ڸ��");
	}
	

	private int selectMainMenu() {
		int sel = this.um.sc.nextInt();
		if(sel == 1) {
			this.um.signUp();
		}
		if(sel == 2) {
			this.um.logIn();
		}
		if(sel == 100) {
			while(true) {
				ManagerMenu();
				if(selectManagerMenu() == 5) break;
			}
		}
		return sel;
	}
	
	private void loginMenu() {
		System.out.println("1.��ٱ��Ͽ��������߰�\n2.��ٱ��Ͽ������ۻ���\n3.��ٱ������\n4.�����۱���\n5.�α׾ƿ�\n6.ȸ��Ż��");
	}
	
	private void selectLoginMenu() {
		int sel = this.um.sc.nextInt();
		if(sel == 1) {
			basketAdd();
		}
		if(sel == 2) {
			basketDelete();
		}
		if(sel == 3) {
			basketListPrint();
		}
		if(sel == 4) {
			buyItem();
		}
		if(sel == 5) {
			this.um.log = -1;
		}
		if(sel == 6) {
			this.um.leave();
		}
	}
	
	private void basketAdd() {
		if(this.im.item.size() != 0) {
			this.im.itemListPrint();
			System.out.print("�߰��� ���̵� ��ȣ �Է� : ");
			int sel = um.sc.nextInt()-1;
			if(sel >= 0 && sel <this.im.item.size()) {
				String userId = this.um.user.get(this.um.log).getId();
				String itemName = this.im.item.get(sel).getName();
				int itemPrice = this.im.item.get(sel).getPrice();
				Cart a = new Cart(userId,itemName,itemPrice);
				this.um.user.get(this.um.log).cart.add(a);
			}else System.out.println("�������� ��ȣ�� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("�߰��� ������ ����� �����ϴ�. �������� ���� �߰����ּ��� ! ");
	}
	private void basketDelete() {
		if(this.um.user.get(this.um.log).cart.size()!= 0) {
			basketListPrint();
			System.out.print("������ �������� ��ȣ�� �Է����ּ��� . ");
			int sel = this.um.sc.nextInt()-1;
			if(sel >= 0 && sel < this.um.user.get(this.um.log).cart.size()) {
				this.um.user.get(this.um.log).cart.remove(sel);
			}
		}else System.out.println("������ �������� �������� �ʽ��ϴ�.");
		
	}
	private void basketListPrint() {
		if(this.um.user.get(this.um.log).cart.size()!= 0) {
			System.out.println("�����۹�ȣ\t�������̸�\t�����۰���");
			for(int i=0; i<this.um.user.get(this.um.log).cart.size(); i++) {
				System.out.printf("%d\t%s\t%d\n",(i+1),this.um.user.get(this.um.log).cart.get(i).getItemName(),this.um.user.get(this.um.log).cart.get(i).getItemPrice());
			}			
		}else System.out.println("��ٱ��Ͽ� ����� �������� �����ϴ�.");
	}
	private void buyItem() {
		if(this.um.user.get(this.um.log).cart.size()!= 0) {
			int totalPrice = 0;
			for(int i=0; i<this.um.user.get(this.um.log).cart.size(); i++) {
				totalPrice += this.um.user.get(this.um.log).cart.get(i).getItemPrice();
			}
			if(totalPrice <= this.um.user.get(this.um.log).getMoney()) {
				this.um.user.get(this.um.log).setMinusMoney(totalPrice);
				for(int i=0; i<this.um.user.get(this.um.log).cart.size(); i++) {
					System.out.print(this.um.user.get(this.um.log).cart.get(i).getItemName());
					if(i != this.um.user.get(this.um.log).cart.size()-1) System.out.print(",");
				}System.out.println("�� �����߽��ϴ�.");
				System.out.println("���� �����ݾ� : " + this.um.user.get(this.um.log).getMoney());
				this.um.user.get(this.um.log).cart.clear();
			}else {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("��ٱ��� �� ���ݾ� : " + totalPrice);
				System.out.println("���� �����ݾ� : " + this.um.user.get(this.um.log).getMoney());
			}
		}else System.out.println("������ �������� �������� �ʽ��ϴ�.");
	}
	
	private void ManagerMenu() {
		System.out.println("---�����ڸ��---");
		System.out.println("1.�����۰���\n2.ī�װ�����\n3.ȸ�����\n4.ȸ������\n5.�ڷΰ���");
		System.out.println("-------------");
	}
	private int selectManagerMenu() {
		int sel = um.sc.nextInt();
		if(sel == 1) {
			while(true) {
				itemManagerMenu();
				if(itemManager() == 4) break;
			}
		}
		if(sel == 2) {
			while(true) {
				categoryManagerMenu();
				if(categoryManager() == 4) break;
			}
		}
		if(sel == 3) {
			memberListPrint();
		}
		if(sel == 4) {
			deleteMember();
		}
		return sel;
	}
	
	private void itemManagerMenu() {
		System.out.println("---�����۰������---");
		System.out.println("1.�������߰�\n2.�����ۻ���\n3.���������\n4.�ڷΰ���");
		System.out.println("----------------");
	}
	private int itemManager() {
		int sel = um.sc.nextInt();
		if(sel == 1) {
			this.im.addItem();
		}
		if(sel == 2) {
			this.im.deleteItem();
		}
		if(sel == 3) {
			this.im.itemListPrint();
		}
		return sel;
	}
	
	private void categoryManagerMenu() {
		System.out.println("---ī�װ��������---");
		System.out.println("1.ī�װ��߰�\n2.ī�װ�����\n3.ī�װ����\n4.�ڷΰ���");
		System.out.println("-----------------");
	}
	private int categoryManager() {
		int sel = um.sc.nextInt();
		if(sel == 1) {
			System.out.print("�߰��� ī�װ� �Է� : ");
			String category = um.sc.next();
			int check = 0;
			for(int i=0; i<this.category.size(); i++) {
				if(this.category.get(i).equals(category)) check = 1;
			}
			if(check == 0) {
				this.category.add(category);
			}else System.out.println("�ش� ī�װ��� �̹� �����մϴ�.");
		}
		if(sel == 2) {
			System.out.print("������ ī�װ� �Է� : ");
			String category = um.sc.next();
			int idx = -1;
			for(int i=0; i<this.category.size(); i++) {
				if(this.category.get(i).equals(category)) idx = i;
			}
			if(idx != -1) {
				this.category.remove(idx);
			}else System.out.println("�ش� ī�װ��� ã�� �� �����ϴ�.");
		}
		if(sel == 3) {
			categoryList();
		}
		return sel;
	}
	
	public  void categoryList() {
		System.out.println("--ī�װ����--");
		for(int i=0; i<category.size(); i++) {
			System.out.printf("%d.%s\n",(i+1),category.get(i));
		}
		System.out.println("-------------");
	}
	
	private void memberListPrint() {
		System.out.println("���̵�\t�����ڱ�");
		for(int i=0; i<this.um.user.size(); i++) {
			System.out.printf("%s\t%d\n",this.um.user.get(i).getId(),this.um.user.get(i).getMoney());
		}
	}
	
	private void deleteMember() {
		System.out.print("������ ȸ���� ���̵� �Է� : ");
		String id = this.um.sc.next();
		int idx = -1;
		for(int i=0; i<this.um.user.size(); i++) {
			if(this.um.user.get(i).getId().equals(id)) idx = i;
		}
		if(idx != -1) {
			this.um.user.remove(idx);
		}else System.out.println("�ش� ���̵� ã�� �� �����ϴ�.");
	}
	
	
}
