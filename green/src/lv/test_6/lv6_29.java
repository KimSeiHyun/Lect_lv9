package lv.test_6;

import java.util.Scanner;

class Bank {
	Scanner sc = new Scanner(System.in);
	String ids[];
	String pws[];
	int moneys[];
	int cnt = 0;
	String name;
	int log = -1;
	
	public void print() {
		if(cnt != 0) {
			System.out.print("ids    : ");
			for(int i=0; i<ids.length; i++) {
				System.out.print(this.ids[i] + "\t");
			}System.out.println();
			System.out.print("pws    : ");
			for(int i=0; i<ids.length; i++) {
				System.out.print(this.pws[i] + "\t");
			}System.out.println();
			System.out.print("moneys : ");
			for(int i=0; i<ids.length; i++) {
				System.out.print(this.moneys[i] + "\t");
			}System.out.println();
		}
		System.out.println("log : " + this.log);
		System.out.println("=== " + name + " ===");
		System.out.println("1.회원가입");	
		System.out.println("2.회원탈퇴");
		System.out.println("3.로그인");
		System.out.println("4.로그아웃");
		System.out.println("5.입금하기");
		System.out.println("6.이체하기");
	}
	
	public void signUp() {
		System.out.print("회원가입 아이디 입력 : ");
		String id = sc.next();
		int check = 0;
		for(int i=0; i<cnt; i++) {
			if(this.ids[i].equals(id)) check = 1;
		}
		if(check == 0) {
			String idsTemp[] = this.ids;
			String pwsTemp[] = this.pws;
			int moneysTemp[] = this.moneys;
			this.cnt ++;
			this.ids = new String[this.cnt];
			this.pws = new String[this.cnt];
			this.moneys = new int[this.cnt];
			for(int i=0; i<cnt-1; i++) {
				this.ids[i] = idsTemp[i];
				this.pws[i] = pwsTemp[i];
				this.moneys[i] = moneysTemp[i];
			}
			
			System.out.print("회원가입 비밀번호 입력 : ");
			String pw = sc.next();
			this.ids[cnt-1] = id;
			this.pws[cnt-1] = pw;
			this.moneys[cnt-1] = 1000;
			
			
		}else System.out.println("존재하는 아이디입니다.");
	}
	
	public void leave() {
		if(this.log != -1) {
			System.out.print("회원탈퇴할 자신의 아이디 입력 : ");
			String id  =sc.next();
			if(this.ids[log].equals(id)) {
				String idsTemp[] = this.ids;
				String pwsTemp[] = this.pws;
				int moneysTemp[] = this.moneys;
				this.cnt --;
				this.ids = new String[this.cnt];
				this.pws = new String[this.cnt];
				this.moneys = new int[this.cnt];
				int x = 0;
				for(int i=0; i<idsTemp.length; i++) {
					if(i != log) {
						this.ids[x] = idsTemp[i];
						this.pws[x] = pwsTemp[i];
						this.moneys[x] = moneysTemp[i];
						x++;
					}
				}
				this.log = -1;
			}else System.out.println("회원정보를 다시 확인해주세요 . ");
			
		}else System.out.println("로그인을 먼저 해주세요 . ");
	}
	
	public void logIn() {
		if(this.cnt != 0 ) {
			System.out.print("로그인 아이디 입력 : ");
			String id = sc.next();
			System.out.print("로그인 패스워드 입력 : ");
			String pw = sc.next();
			int check = 0;
			for(int i=0; i<cnt; i++) {
				if(ids[i].equals(id) && pws[i].equals(pw)) {
					this.log = i;
					check = 1;
					System.out.printf("%s님이 로그인 하셨습니다.\n",this.ids[i]);
				}
			}
			if(check == 0) System.out.println("회원정보를 다시 확인해주세요 ");
		}else System.out.println("로그인할 아이디가 존재하지 않습니다.");
	}
	
	public void logOut() {
		if(this.log != -1) {
			this.log = -1;
			System.out.println("로그아웃성공 . ");
		}else System.out.println("로그인을 먼저 해주세요 . ");
	}
	
	public void deposit() {
		if(this.log != -1) {
			System.out.print("입금할 금액 입력 : ");
			int inMoney = sc.nextInt();
			this.moneys[this.log] += inMoney;
		}else System.out.println("로그인을 먼저 해주세요 .");
	}
	public void transfer() {
		if(this.log != -1) {
			System.out.print("이체할 아이디 입력 : ");
			String id = sc.next();
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(this.ids[i].equals(id)) idx = i;
			}
			if(idx != -1) {
				System.out.print("이체할 금액 입력 : ");
				int transMoney = sc.nextInt();
				if(transMoney <= this.moneys[log]) {
					this.moneys[log] -= transMoney;
					this.moneys[idx] += transMoney;
				}else System.out.println("잔액이 부족합니다.");
			}else System.out.println("이체할 아이디가 존재하지 않습니다.");
		}else System.out.println("로그인을 먼저 해주세요 . ");
	}
	public void run() {
		while(true) {
			print();
			int sel = sc.nextInt();
			if(sel == 1) {signUp();}
			if(sel == 2) {leave();}
			if(sel == 3) {logIn();}
			if(sel == 4) {logOut();}
			if(sel == 5) {deposit();}
			if(sel == 6) {transfer();}
		}
	}
	
}
	
public class lv6_29 {

	public static void main(String[] args) {
		Bank e = new Bank();
		e.name = "ATM";
		e.run();

	}

}
