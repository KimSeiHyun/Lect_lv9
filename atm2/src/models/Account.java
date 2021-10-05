package models;

public class Account {
	
	public static final int MAX = 3;
	private boolean rep;
	private int userCode;
	private int accNum;
	private int money;
	
	public Account(boolean rep , int userCode , int accNum , int money) {
		this.rep = rep;
		this.userCode = userCode;
		this.accNum = accNum;
		this.money = money;
	}
	public Account(int userCode , int accNum , int money) {
		this.userCode = userCode;
		this.accNum = accNum;
		this.money = money;
	}
	
	public boolean getRep() {
		return this.rep;
	}
	public int getUserCode() {
		return this.userCode;
	}
	public int getAccNum () {
		return this.accNum;
	}
	public int getMoney() {
		return this.money;
	}
	public void setRepTrue() {
		this.rep = true;
	}
	public void setRepFalse() {
		this.rep = false;
	}
	public void inputMoney(int money) {
		this.money = getMoney() + money;
	}
	public void outputMoney(int money) {
		this.money = getMoney() - money;
	}
	
}
