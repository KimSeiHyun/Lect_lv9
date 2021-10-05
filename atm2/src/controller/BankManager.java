package controller;

import models.Bank;

public class BankManager {
	public static BankManager instance = new BankManager();
	private Bank bank = Bank.instance;
	private UserManager um = UserManager.instance;
	private AccountManager am = AccountManager.instance;
	private FileManager fm = FileManager.instance;
	public void run() {
		this.fm.load();
		while(true) {
			System.out.println("log = " + Bank.instance.log +"(idx)");
			this.um.printUsers();
			if(this.bank.log == -1) {
				printMainMenu();
				if(selectMenu() == 4) break;				
			}else {
				loginMenu();
				selectLoginMenu();
			}
		}
		this.fm.save();
	}
	
	private void printMainMenu() {
		System.out.println("1.�α���\n2.ȸ������\n3.ȸ��Ż��\n4.����");
	}
	private void loginMenu() {
		System.out.println("1.���»���\n2.���»���\n3.�Ա�\n4.���\n5.��ü\n6.��ǥ��������\n7.�α׾ƿ�");
	}

	private int selectMenu() {
		int sel = um.sc.nextInt();
		if(sel == 1) {
			this.um.logIn();
		}
		if(sel == 2) {
			this.um.SignUp();
		}
		if(sel == 3) {
			this.um.leave();	
		}
		return sel;
	}
	private void selectLoginMenu() {
		int sel = um.sc.nextInt();
		if(sel == 1) {
			this.am.addAcc();
		}
		if(sel == 2) {
			this.am.leaveAcc();
		}
		if(sel == 3) {
			this.am.deposit();
		}
		if(sel == 4) {
			this.am.withdraw();
		}
		if(sel == 5) {
			this.am.transfer();
		}
		if(sel == 6) {
			this.am.selectRep();
		}
		if(sel == 7) {
			this.bank.log = -1;
		}
	}
	
}
