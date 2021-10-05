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
			System.out.println("더이상 계좌를 생성 할 수 없습니다.");
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
			System.out.print("삭제할 계좌번호 다섯자리를 입력해주세요 . ");
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
			}else System.out.println("계좌번호를 다시 확인해주세요 . ");
		}else System.out.println("삭제할 계좌가 없습니다. ");
	}
	
	public void deposit() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("입금할 금액을 입력해주세요 . ");
			int money = um.sc.nextInt();
			int idx = -1;
			for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
				if(this.um.user.get(this.bank.log).acc.get(i).getRep() ==true) idx = i;
			}
			this.um.user.get(this.bank.log).acc.get(idx).inputMoney(money);
			System.out.println("대표계좌에 입금이 되었습니다.");
		}else System.out.println("입금할 계좌가 없습니다.");
	}
	
	public void withdraw() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("출금할 금액을 입력해주세요 . ");
			int money = um.sc.nextInt();
			int idx = -1;
			for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
				if(this.um.user.get(this.bank.log).acc.get(i).getRep() ==true) idx = i;
			}
			if(this.um.user.get(this.bank.log).acc.get(idx).getMoney() >= money) {
				this.um.user.get(this.bank.log).acc.get(idx).outputMoney(money);
			}else System.out.println("대표계좌의 잔액이 부족합니다.");
		}else System.out.println("출금할 계좌가 없습니다.");
	}
	
	public void transfer() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("이체할 계좌번호 5자리를 입력해주세요 . ");
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
					System.out.println("나의 대표계좌에서 대표계좌로는 이체 할 수 없습니다.");
				}else {
					System.out.print("이체할 금액을 입력해주세요 . ");
					int money = um.sc.nextInt();
					if(this.um.user.get(this.bank.log).acc.get(tempIdx).getMoney()>= money) {
						this.um.user.get(this.bank.log).acc.get(tempIdx).outputMoney(money);
						this.um.user.get(idx1).acc.get(idx2).inputMoney(money);
						
					}else System.out.println("대표계좌의 잔액이 부족합니다.");
				}
				
			}else System.out.println("해당 계좌를 찾을 수 없습니다.");
			
		}else System.out.println("대표계좌부터 생성해주세요 . ");
	}
	
	public void selectRep() {
		if(this.um.user.get(this.bank.log).acc.size() != 0) {
			System.out.print("대표계좌를 선택해주세요 . ");
			int idx = um.sc.nextInt();
			if( idx >= 0&& idx <this.um.user.get(this.bank.log).acc.size() ) {
				for(int i=0; i<this.um.user.get(this.bank.log).acc.size(); i++) {
					if(this.um.user.get(this.bank.log).acc.get(i).getRep() == true) {
						this.um.user.get(this.bank.log).acc.get(i).setRepFalse();
					}
				}
				this.um.user.get(this.bank.log).acc.get(idx).setRepTrue();
			}else System.out.println("선택한 범위가 벗어났습니다.");
		}else System.out.println("계좌가 존재하지 않습니다.");
	}
}
