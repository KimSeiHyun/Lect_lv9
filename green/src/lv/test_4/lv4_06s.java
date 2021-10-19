package lv.test_4;

import java.util.Scanner;

public class lv4_06s {

	public static void main(String[] args) {
		/*
		 * # ATM[4단계] : 전체 기능구현
		 * 1. 회원가입
		 * . id와 pw를 입력받아 가입
		 * . 가입 시 돈 1000원 부여
		 * . id 중복체크
		 * 2. 회원탈퇴
		 * . 로그인시에만 이용가능
		 * 3. 로그인
		 * . id와 pw를 입력받아 로그인
		 * . 로그아웃 상태에서만 이용가능
		 * 4. 로그아웃
		 * . 로그인시에만 이용가능
		 * 5. 입금
		 * . 로그인시에만 이용가능
		 * 6. 이체
		 * . 로그인시에만 이용가능
		 * 7. 잔액조회
		 * . 로그인시에만 이용가능
		 */
		
		final int SIZE = 5;
		int id[] = new int[SIZE];
		int pw[] = new int[SIZE];
		int money[] = new int[SIZE];
		int log = -1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		while (true) {
			System.out.print("id ");
			for(int i=0; i<5; i++ ) {
				System.out.print(id[i] + " ");
			}System.out.println();
			System.out.print("pw ");
			for(int i=0; i<5; i++ ) {
				System.out.print(pw[i] + " ");
			}System.out.println();
			System.out.print("money ");
			for(int i=0; i<5; i++ ) {
				System.out.print(money[i] + " ");
			}System.out.println();
			System.out.println("cnt : " +cnt);
			System.out.println("log : " + log);
		System.out.println("1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n5.입금\n6.이체\n7.잔액조회");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			if(cnt == 5) {
				System.out.println("더이상 회원가입을 할 수 없습니다.");
				continue;
			}
			System.out.println("회원가입할 아이디를 입력해주세요 . ");
			int check = 0;
			int inId = sc.nextInt();
			for(int i=0; i<5; i++) {
				if(id[i] == inId) {
					check = 1;
					System.out.println("이미 존재하는 아이디입니다.");
					break;
				}
			}
			if(check  == 0) {
				System.out.println("비밀번호를 입력해주세요 . ");
				int inPw = sc.nextInt();
				id[cnt] = inId;
				pw[cnt] = inPw;
				money[cnt] = 1000;
				cnt ++;
			}
		}
		if(sel == 2) {
			if(log != -1) {
			System.out.println("회원탈퇴 할 아이디를 입력해주세요 ");
			int outId = sc.nextInt();
			int check = 0;
			for(int i=0; i<5; i++) {
				if(id[i] == outId && log == outId) {
					id[i] = 0;
					pw[i] = 0;
					money[i] = 0;
					check = 1;
					cnt--;
					log = -1;
				}
				if(id[i] == 0 && i <=3) {
					id[i] = id[i+1];
					id[i+1] = 0;
					pw[i] = pw[i+1];
					pw[i+1] = 0;
					money[i] = money[i+1];
					money[i+1] = 0;

				}
			}
			if(check == 0) {
				System.out.println("아이디를 다시 확인해주세요 . ");
				continue;
			}
			}else {
				System.out.println("로그인을 먼저 해주세요 ");
			}
			
		}
		if(sel == 3) {
			if(log == -1) {
			System.out.println("로그인할 아이디를 입력해주세요 .");
			int inId = sc.nextInt();
			int check = 0;
			for(int i=0; i<5; i++) {
				if(id[i] == inId && id[i] != 0) {
					check = 1;
					System.out.println("비밀번호를 입력해주세요 . ");
					int inPw = sc.nextInt();
					if(pw[i] == inPw) {
						System.out.println(inId + "님이 로그인 하셨습니다.");
						log = inId;
						temp = i;
						
					}
					if(pw[i] != inPw) {
						System.out.println("비밀번호를 다시 확인해주세요 . ");
					}
				}
			}
			if (check == 0) {
				System.out.println("아이디를 다시 확인해주세요 .");
				continue;
			}
		}
			else {
				System.out.println("이미 로그인 상태입니다.");
				
			}
		}
		if(sel == 4) {
			if(log != -1) {
				System.out.println("로그아웃 되었습니다.");
				log = -1;
			}else {
				System.out.println("이미 로그아웃 상태입니다.");
			}
			
		}
		if(sel == 5) {
			if(log != -1) {
				System.out.println("입금할 금액을 입력해주세요 . ");
				int inMoney = sc.nextInt();
				for(int i=0; i<5; i++) {
					if(id[i] == log) {
						money[i] += inMoney;
					}
				}
			}else {
				System.out.println("로그인을 먼저 해주세요 .");
			}
			
		}
		if(sel == 6) {
			if (log != -1) {
				System.out.println("이체할 아이디를 입력해주세요 . ");
				int inId = sc.nextInt();
				int check = 0;
				int x = 0;
				for(int i=0; i<5; i++) {
					if(id[i] == log) {
						x = i;
					}
				}
				for(int i =0; i<5; i++) {
					if(id[i] == inId) {
						check  = 1;
						System.out.println("이체할 금액을 입력해주세요.");
						int outMoney = sc.nextInt();
						if(money[x] > outMoney) {
							money[x] -= outMoney;
							money[i] += outMoney;
						}
						else {
							System.out.println("잔액이 부족합니다.");
						}
					}
				}
				if(check == 0) {
					System.out.println("아이디를 확인해주세요 .");
				}

			} else {
				System.out.println("로그인을 먼저 해주세요 .");
			}
		}
		if (sel == 7) {
			if (log != -1) {
				System.out.println("잔액은 : "+money[temp]);

			} else {
				System.out.println("로그인을 먼저 해주세요 .");
			}
		}

		}//w

		
	}

}