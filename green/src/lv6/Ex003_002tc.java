package lv6;

import java.util.Scanner;

class ATM {
	Scanner sc = new Scanner(System.in);
	String name = "GREEN BANK";
	
	// id , pw , money
	int cnt = 0;
	int log = -1;
	String users[][] = null;
	int moneys[] = null;
	
	void printMenu(){
        System.out.println("===" + this.name +  "===");
		System.out.println("1.회원가입");	
		System.out.println("2.회원탈퇴");
		System.out.println("3.로그인");
		System.out.println("4.로그아웃");
		System.out.println("5.입금하기");
		System.out.println("6.이체하기");
		
	}
	
	void selectMenu() {
		System.out.println("메뉴 선택 : ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			join() ;

		}
		else if(sel == 2) {
			if(log != -1) withdraw();
			else System.out.println("로그인을 해주세요 ! ");
		}
		else if(sel == 3) {
			login();
		}
		else if(sel == 4) {
			if(log != -1) leave();
			else System.out.println("로그인을 해주세요 ! ");
		}
		else if(sel == 5) {
			if(log != -1) inputMoney();
			else System.out.println("로그인을 해주세요 ! ");
		}
		else if(sel == 6) {
			if(log != -1) transfer();
			else System.out.println("로그인을 해주세요 ! ");
		}
	}
	
	void join() {
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pw : ");
		String pw = sc.next();
		
		//check 
		int check = -1;
		for(int i=0; i<this.cnt; i++) {
			if(this.users[i][0].equals(id)) check = i;
		}
		if(check == -1) {
			String temp[][] =users;
			int moneysTemp[] = this.moneys;
			
			this.users = new String[cnt+1][2];
			this.moneys = new int[cnt+1];
			
			if(cnt > 0) {
				for(int i=0; i<cnt; i++) {
					this.users[i][0] = temp[i][0];
					this.users[i][1] = temp[i][1];
					this.moneys[i] = moneysTemp[i];
				}
			}
			this.users[cnt][0] = id;
			this.users[cnt][1] = pw;
			cnt ++;
		}
		else {
			System.out.println("중복된 아이디입니다.");
		}
	}
	void withdraw() {
		System.out.print("pw : ");
		String pw = sc.next();
		
		if(this.users[log][1].equals(pw)) {
			String temp[][] = this.users;
			int moneysTemp[] = this.moneys;
			
			if(cnt == 1) {
				this.users = null;
				this.moneys = null;
			}
			else {
				this.users = new String[cnt-1][2];
				this.moneys = new int[cnt-1];
				
				int idx = 0;
				for(int i=0; i<temp.length; i++) {
					if( i != log) {
						this.users[idx][0] = temp[i][0];
						this.users[idx][1] = temp[i][1];
						this.moneys[idx] = moneysTemp[i];
						idx ++;
					}
				}
				cnt --;
				log = -1;
			}
		}else {
			System.out.println("회원정보를 다시 확인해주세요 . ");
		}
	}
	void login() {
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pw : ");
		String pw = sc.next();
		
		for(int i=0; i<this.cnt; i++) {
			if(this.users[i][0].equals(id) && this.users[i][1].equals(pw)) {
				log = i;
			}
		}
		
		if(log == -1) System.out.println("회원정보를 확인하세요 . ");
		
	}
	void leave() {
		log = -1;
		System.out.println("로그아웃 되었습니다.");
	}
	void inputMoney() {
		System.out.print("입금할 금액 입력 :");
		int money = sc.nextInt();
		this.moneys[log] += money;
		System.out.println("현재잔액 : " + this.moneys[log]  + " 원");
	}
	void transfer() {
		System.out.print("이체할 계좌 id : ");
		String tId = sc.next();
		
		int idx = -1;
		for(int i=0; i<this.users.length; i++) {
			if(this.users[i][0].equals(tId)) idx = i;
		}
		if(idx == -1 || idx == log) {
			System.out.println("계좌 정보를 다시 확인해주세요 . ");
		}else {
			//tranfer
			System.out.print("이체할 금액 : ");
			int tMoney = sc.nextInt();
			
			
			if(this.moneys[log] >= tMoney) {
				this.moneys[log] -= tMoney;
				this.moneys[idx] += tMoney;
				System.out.println("현재잔액 : " + this.moneys[log]  + " 원");
			}else {
				System.out.println("잔액이 부족합니다 . ");
			}
		}
	}
	
	
	public void run() {
		while(true) {
			for(int i=0; i<this.cnt; i++) {
				System.out.printf("%s %s %d\n",this.users[i][0],this.users[i][1], this.moneys[i]);
			}
			printMenu();
			selectMenu();
		}
	}
	
}
public class Ex003_002tc {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		atm.run();

	}

}
