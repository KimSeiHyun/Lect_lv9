package lv6;

import java.util.Scanner;

class Ex003_02 {
	Scanner sc = new Scanner(System.in);
	String ids[] = null;
	String pws[] = null;
	int moneys[] = null;
	int log = -1;
	int cnt = 0;
	void print( ) {
		if(cnt != 0) {
			System.out.print("id     ");
			for(int i=0; i<cnt; i++) {
				System.out.print(this.ids[i] + "\t");
			}System.out.println();
			System.out.print("pw     ");
			for(int i=0; i<cnt; i++) {
				System.out.print(this.pws[i] + "\t");
			}System.out.println();
			System.out.print("money  ");
			for(int i=0; i<cnt; i++) {
				System.out.print(this.moneys[i] + "\t");
			}System.out.println();
		}
		System.out.println("log : " + this.log);
		System.out.println("cnt : " + this.cnt);
        System.out.println("===ATM===");
		System.out.println("1.회원가입");	
		System.out.println("2.회원탈퇴");
		System.out.println("3.로그인");
		System.out.println("4.로그아웃");
		System.out.println("5.입금하기");
		System.out.println("6.이체하기");

	}
	
	
	void sign () {
			if(this.cnt ==0) {
				System.out.println("회원가입할 아이디를 입력해주세요 . ");
				String inId = sc.next();
				System.out.println("회원가입할 비밀번호를 입력해주세요 . ");
				String inPw = sc.next();
				this.cnt++;
				this.ids = new String[this.cnt];
				this.pws = new String[this.cnt];
				this.moneys = new int[this.cnt];
				this.ids[0] = inId;
				this.pws[0] = inPw;
				this.moneys[0] = 1000;
			}else {
				System.out.println("회원가입할 아이디를 입력해주세요 . ");
				String inId = sc.next();
				int check = 0;
				for(int i=0; i<this.cnt; i++) {
					if(inId.equals(this.ids[i])) {
						check = 1;
					}
				}
				if(check == 1) {
					System.out.println("중복된 아이디가 있습니다 . ");
				}else {
					System.out.println("회원가입할 비밀번호를 입력해주세요 . ");
					String inPw = sc.next();
					cnt++;
					String temp1[] = this.ids;
					String temp2[] = this.pws;
					int temp3[] = this.moneys;
					this.ids = new String[this.cnt];
					this.pws = new String[this.cnt];
					this.moneys = new int[this.cnt];
					this.ids[this.cnt-1] = inId;
					this.pws[this.cnt-1] = inPw;
					this.moneys[this.cnt-1] = 1000;
					for(int i=0; i<this.cnt-1; i++) {
						this.ids[i] = temp1[i];
						this.pws[i] = temp2[i];
						this.moneys[i] = temp3[i];
					}
				}
				
			}

	}
	void signOut () {
		if(this.log != -1) {
			System.out.println("회원탈퇴할 자신의 아이디를 입력해주세요 . ");
			String inId = sc.next();
			if(inId.equals(this.ids[log])) {
				System.out.println("정말로 회원탈퇴를 하시겠습니까? 1.yes  2.no");
				int sel = sc.nextInt();
				if(sel == 1) {
					String temp1[] = this.ids;
					String temp2[] = this.pws;
					int temp3[] = this.moneys;
					cnt--;
					this.ids = new String[cnt];
					this.pws = new String[cnt];
					this.moneys = new int[cnt];
					int x = 0;
					for(int i=0; i<cnt+1; i++) {
						if( i != log) {
							this.ids[x] = temp1[i];
							this.pws[x] = temp2[i];
							this.moneys[x] = temp3[i];
							x++;
						}
					}
					this.log = -1;
				}else System.out.println("회원탈퇴를 하지 않습니다 .");
			}else System.out.println("아이디를 다시 확인해주세요");
			
		}else System.out.println("로그인을 먼저 해주세요 . ");
			

	}
	void logIn () {
		if(this.log == -1) {
			System.out.println("아이디를 입력 :");
			String inId = sc.next();
			int check =0;
			int idx = 0;
			for(int i=0; i<cnt; i++) {
				if(inId.equals(this.ids[i])) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.println("비밀번호 입력 : ");
				String inPw = sc.next();
				if(inPw.equals(this.pws[idx])) {
					System.out.printf("로그인 성공 !  %s님이 로그인 하셧습니다.\n",this.ids[idx]);
					this.log = idx;
				}else System.out.println("비밀번호를 틀리셨습니다.");
			}else System.out.println("입력하신 아이디를 찾을 수 없습니다.");
		}else System.out.println("이미 로그인 상태입니다.");
			

	}
	void logOut () {
		if(this.log != -1) {
			System.out.println("로그아웃이 됐습니다.");
			this.log = -1;
		}else System.out.println("로그인을 먼저 해주세요 . ");
		
		
	}
	void deposit () {
		System.out.println("입금할 아이디를 입력해주세요 .");
		String inId = sc.next();
		int check =0;
		int idx = -1;
		for(int i=0; i<this.cnt; i++) {
			if(inId.equals(this.ids[i])) {
				check = 1;
				idx = i;
			}
		}
		if(check == 1) {
			System.out.println("입금할 금액 입력 : ");
			int inMoney = sc.nextInt();
			moneys[idx] += inMoney;
			System.out.printf("%d원을 입금하셨습니다.\n",inMoney);
			
		}else System.out.println("입금할 아이디를 다시 확인해주세요 . ");

	}
	void transfer () {
		if(this.log != -1) {
			System.out.println("이체하실 아이디를 입력해주세요 . ");
			String inId = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(inId.equals(this.ids[i]) && i != log) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.println("이체하실 금액 입력 : ");
				int outMoney = sc.nextInt();
				if(outMoney > this.moneys[log]) {
					System.out.println("가지고 계신 금액이 이체하실 금액보다 작습니다 . ");
				}
				else {
					this.moneys[log] -= outMoney;
					this.moneys[idx] += outMoney;
					System.out.printf("%s님께서 %s님께 %d원을 이체하셨습니다.\n"
							,this.ids[log],this.ids[idx],outMoney);
				}
			}else System.out.println("이체할 아이디를 다시 확인해주세요 . ");
		}else System.out.println("로그인을 먼저 해주세요 .");
		
		
	}
	
	

	public void run() {
		while(true) {
			print();
			int sel = sc.nextInt();
			if(sel == 1) {
				sign();
			}else if(sel == 2) {
				signOut();
			}else if(sel == 3) {
				logIn();
			}else if(sel == 4) {
				logOut();
			}else if(sel == 5) {
				deposit();
			}else if(sel == 6) {
				transfer();
			}
			
			
		}//while(true)
	}
	
	
}


public class Ex003_002 {

	public static void main(String[] args) {
		Ex003_02 ex = new Ex003_02();
		ex.run();
		
	}

}
