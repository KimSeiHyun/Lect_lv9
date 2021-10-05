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
					System.out.println("종료합니다.");
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
		System.out.println("1.회원가입\n2.로그인\n3.종료\n100.관리자모드");
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
		System.out.println("1.장바구니에아이템추가\n2.장바구니에아이템삭제\n3.장바구니출력\n4.아이템구입\n5.로그아웃\n6.회원탈퇴");
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
			System.out.print("추가할 아이뎀 번호 입력 : ");
			int sel = um.sc.nextInt()-1;
			if(sel >= 0 && sel <this.im.item.size()) {
				String userId = this.um.user.get(this.um.log).getId();
				String itemName = this.im.item.get(sel).getName();
				int itemPrice = this.im.item.get(sel).getPrice();
				Cart a = new Cart(userId,itemName,itemPrice);
				this.um.user.get(this.um.log).cart.add(a);
			}else System.out.println("아이템의 번호를 다시 확인해주세요 . ");
		}else System.out.println("추가할 아이템 목록이 없습니다. 아이템을 먼저 추가해주세요 ! ");
	}
	private void basketDelete() {
		if(this.um.user.get(this.um.log).cart.size()!= 0) {
			basketListPrint();
			System.out.print("삭제할 아이템의 번호를 입력해주세요 . ");
			int sel = this.um.sc.nextInt()-1;
			if(sel >= 0 && sel < this.um.user.get(this.um.log).cart.size()) {
				this.um.user.get(this.um.log).cart.remove(sel);
			}
		}else System.out.println("삭제할 아이템이 존재하지 않습니다.");
		
	}
	private void basketListPrint() {
		if(this.um.user.get(this.um.log).cart.size()!= 0) {
			System.out.println("아이템번호\t아이템이름\t아이템가격");
			for(int i=0; i<this.um.user.get(this.um.log).cart.size(); i++) {
				System.out.printf("%d\t%s\t%d\n",(i+1),this.um.user.get(this.um.log).cart.get(i).getItemName(),this.um.user.get(this.um.log).cart.get(i).getItemPrice());
			}			
		}else System.out.println("장바구니에 출력할 아이템이 없습니다.");
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
				}System.out.println("를 구매했습니다.");
				System.out.println("나의 보유금액 : " + this.um.user.get(this.um.log).getMoney());
				this.um.user.get(this.um.log).cart.clear();
			}else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("장바구니 총 계산금액 : " + totalPrice);
				System.out.println("나의 보유금액 : " + this.um.user.get(this.um.log).getMoney());
			}
		}else System.out.println("구매할 아이템이 존재하지 않습니다.");
	}
	
	private void ManagerMenu() {
		System.out.println("---관리자모드---");
		System.out.println("1.아이템관리\n2.카테고리관리\n3.회원출력\n4.회원삭제\n5.뒤로가기");
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
		System.out.println("---아이템관리모드---");
		System.out.println("1.아이템추가\n2.아이템삭제\n3.아이템출력\n4.뒤로가기");
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
		System.out.println("---카테고리관리모드---");
		System.out.println("1.카테고리추가\n2.카테고리삭제\n3.카테고리출력\n4.뒤로가기");
		System.out.println("-----------------");
	}
	private int categoryManager() {
		int sel = um.sc.nextInt();
		if(sel == 1) {
			System.out.print("추가할 카테고리 입력 : ");
			String category = um.sc.next();
			int check = 0;
			for(int i=0; i<this.category.size(); i++) {
				if(this.category.get(i).equals(category)) check = 1;
			}
			if(check == 0) {
				this.category.add(category);
			}else System.out.println("해당 카테고리는 이미 존재합니다.");
		}
		if(sel == 2) {
			System.out.print("삭제할 카테고리 입력 : ");
			String category = um.sc.next();
			int idx = -1;
			for(int i=0; i<this.category.size(); i++) {
				if(this.category.get(i).equals(category)) idx = i;
			}
			if(idx != -1) {
				this.category.remove(idx);
			}else System.out.println("해당 카테고리를 찾을 수 없습니다.");
		}
		if(sel == 3) {
			categoryList();
		}
		return sel;
	}
	
	public  void categoryList() {
		System.out.println("--카테고리목록--");
		for(int i=0; i<category.size(); i++) {
			System.out.printf("%d.%s\n",(i+1),category.get(i));
		}
		System.out.println("-------------");
	}
	
	private void memberListPrint() {
		System.out.println("아이디\t보유자금");
		for(int i=0; i<this.um.user.size(); i++) {
			System.out.printf("%s\t%d\n",this.um.user.get(i).getId(),this.um.user.get(i).getMoney());
		}
	}
	
	private void deleteMember() {
		System.out.print("삭제할 회원의 아이디 입력 : ");
		String id = this.um.sc.next();
		int idx = -1;
		for(int i=0; i<this.um.user.size(); i++) {
			if(this.um.user.get(i).getId().equals(id)) idx = i;
		}
		if(idx != -1) {
			this.um.user.remove(idx);
		}else System.out.println("해당 아이디를 찾을 수 없습니다.");
	}
	
	
}
