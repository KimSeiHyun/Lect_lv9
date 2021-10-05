package controller;

import java.util.ArrayList;

import models.Account;
import models.Bank;
import models.User;

public class AccountManager {
//	ArrayList<Account> acc = new ArrayList<>();
	public static AccountManager instance = new AccountManager();
	private Bank bank = Bank.instance;
	private UserManager um = UserManager.instance;
	private User user = User.instance;
	public void addAcc() {
		if(this.um.user.get(this.bank.log).acc.size() == 0) {
			int accNum = duplicateAccNum();
			int userCode = this.um.user.get(this.bank.log).getCode();
			this.um.user.get(this.bank.log).addAcc(new Account(true , userCode , accNum , 1000));
		}else if(this.um.user.get(this.bank.log).acc.size() == Account.MAX) {
			System.out.println("���̻� ���¸� ���� �� �� �����ϴ�.");
		}else {
			int accNum = duplicateAccNum();
			int userCode = this.um.user.get(this.bank.log).getCode();
			this.um.user.get(this.bank.log).addAcc(new Account(userCode , accNum , 1000));
		}
		
	}
	
	private int duplicateAccNum () {
		int accNum = 0;
		while(true) {
			accNum = um.rn.nextInt(40000)+10000;
			int check = 0;
			for(int i=0; i<this.um.user.size(); i++) {
				for(int j=0; j<this.um.user.get(i).acc.size(); j++) {
					if(this.um.user.get(i).acc.get(j).getAccNum() == accNum) {
						check = 1;
					}
				}
			}
			if(check == 0 ) {
				break;
			}
		}
		return accNum;
	}
	
	public void leaveAcc() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("������ ���¹�ȣ �ټ��ڸ��� �Է����ּ��� . ");
			int accNum = um.sc.nextInt();
			int idx = -1;
			for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
				if(this.um.user.get(this.bank.log).acc.get(i).getAccNum() == accNum) idx = i;
			}
			if(idx != -1) {
				this.um.user.get(this.bank.log).acc.remove(idx);
				if(this.um.user.get(this.bank.log).acc.size() != 0) {
					int check = 0;
					for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
						if(this.um.user.get(this.bank.log).acc.get(i).getRep() == true) check = 1;
					}
					if(check == 0 ) {
						this.um.user.get(this.bank.log).acc.get(0).setRepTrue();
					}
				}
			}else System.out.println("���¹�ȣ�� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("������ ���°� �����ϴ�. ");
	}
	
	public void deposit() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("�Ա��� �ݾ��� �Է����ּ��� . ");
			int money = um.sc.nextInt();
			int idx = -1;
			for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
				if(this.um.user.get(this.bank.log).acc.get(i).getRep() ==true) idx = i;
			}
			this.um.user.get(this.bank.log).acc.get(idx).inputMoney(money);
			System.out.println("��ǥ���¿� �Ա��� �Ǿ����ϴ�.");
		}else System.out.println("�Ա��� ���°� �����ϴ�.");
	}
	
	public void withdraw() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("����� �ݾ��� �Է����ּ��� . ");
			int money = um.sc.nextInt();
			int idx = -1;
			for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
				if(this.um.user.get(this.bank.log).acc.get(i).getRep() ==true) idx = i;
			}
			if(this.um.user.get(this.bank.log).acc.get(idx).getMoney() >= money) {
				this.um.user.get(this.bank.log).acc.get(idx).outputMoney(money);
			}else System.out.println("��ǥ������ �ܾ��� �����մϴ�.");
		}else System.out.println("����� ���°� �����ϴ�.");
	}
	
	public void transfer() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("��ü�� ���¹�ȣ 5�ڸ��� �Է����ּ��� . ");
			int accNum = um.sc.nextInt();
			int idx1 = -1;
			int idx2 = -1;
			for(int i=0; i<this.um.user.size(); i++) {
				for(int j=0; j<this.um.user.get(i).acc.size(); j++) {
					if(this.um.user.get(i).acc.get(j).getAccNum() ==accNum) {
						idx1 = i;
						idx2 = j;
					}
				}
			}
			int tempIdx = -1;
			for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
				if(this.um.user.get(this.bank.log).acc.get(i).getRep() == true) tempIdx = i;
			}
			if(idx1 != -1 && idx2 != -1) {
				if(idx1 == this.bank.log && idx2 == tempIdx) {
					System.out.println("���� ��ǥ���¿��� ��ǥ���·δ� ��ü �� �� �����ϴ�.");
				}else {
					System.out.print("��ü�� �ݾ��� �Է����ּ��� . ");
					int money = um.sc.nextInt();
					if(this.um.user.get(this.bank.log).acc.get(tempIdx).getMoney()>= money) {
						this.um.user.get(this.bank.log).acc.get(tempIdx).outputMoney(money);
						this.um.user.get(idx1).acc.get(idx2).inputMoney(money);
						
					}else System.out.println("��ǥ������ �ܾ��� �����մϴ�.");
				}
				
			}else System.out.println("�ش� ���¸� ã�� �� �����ϴ�.");
			
		}else System.out.println("��ǥ���º��� �������ּ��� . ");
	}
	
	public void selectRep() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("��ǥ���¸� �������ּ��� . ");
			int idx = um.sc.nextInt();
			if( idx >= 0&& idx <this.um.user.get(this.bank.log).acc.size() ) {
				for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
					if(this.um.user.get(this.bank.log).acc.get(i).getRep() == true) {
						this.um.user.get(this.bank.log).acc.get(i).setRepFalse();
					}
				}
				this.um.user.get(this.bank.log).acc.get(idx).setRepTrue();
			}else System.out.println("������ ������ ������ϴ�.");
		}else System.out.println("���°� �������� �ʽ��ϴ�.");
	}
}
