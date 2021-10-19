package lv4;

import java.util.Scanner;

public class Ex01_06 {

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
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		int cnt = 0;
		int log = -1;
		while (t) {
			System.out.println("---------------------");
			System.out.print("id    : ");
			for(int i=0; i<SIZE; i++) {
				System.out.print(id[i] + " ");
			}
			System.out.println();
			System.out.print("pw    : ");
			for(int i=0; i<SIZE; i++) {
				System.out.print(pw[i] + " ");
			}
			System.out.println();
			System.out.print("money : ");
			for(int i=0; i<SIZE; i++) {
				System.out.print(money[i] + " ");
			}
			System.out.println();
			if(log == -1) {
				System.out.println("로그아웃 상태입니다.");
			}
			else {
				System.out.printf("%d님이 로그인 중입니다.",log);
			}
			System.out.println();
			System.out.println("---------ATM---------");
			System.out.println("1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n5.입금\n6.이체\n7.잔액조회\n8.종료");
			System.out.println("---------------------");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				int check = 1;
				if(cnt == 5) {
					System.out.println("더이상 회원가입을 할 수 없습니다. ");
					continue;
				}
				System.out.println("회원가입할 아이디를 입력해주세요 . ");
				int inId = sc.nextInt();
				for(int i=0; i<SIZE; i++) {
					if(id[i] == inId) {
						check = -1;
					}
				}
				System.out.println("회원가입할 비밀번호를 입력해주세요 . ");
				int inPw = sc.nextInt();
				if(check == 1) {
					id[cnt] = inId;
					pw[cnt] = inPw;
					money[cnt] += 1000;
					cnt++;
				}
				else {
					System.out.println("이미 회원가입된 아이디입니다.");
				}
			}
			
			else if (sel == 2) {
				if( log == -1) {
					System.out.println("로그인을 먼저 해주세요 .");
					continue;
				}
				if(cnt == 0) {
					System.out.println("회원탈퇴 할 아이디가 없습니다 . ");
					continue;
				}
				int check = 1;
				int j = 0;
				System.out.println("회원탈퇴를 할 아이디를 입력해주세요 . ");
				int delId = sc.nextInt();
				System.out.println("회원탈퇴를 할 비밀번호를 입력해주세요 .");
				int delPw = sc.nextInt();
				for(int i=0; i<cnt; i++) {
					if(id[i] == delId && pw[i] == delPw && log == id[i]) {
						check = -1;
						j = i;
					}
				}
				if (check == -1) {
					for(int i =j; i<cnt-1; i++) {
						id[i] = id[i+1];
						pw[i] = pw[i+1];
						money[i] = money[i+1];
					}
					id[cnt-1] = 0;
					pw[cnt-1] = 0;
					money[cnt-1] = 0;
					cnt --;
					log = -1;
				}
				else {
					System.out.println("회원정보가 틀렸습니다 . ");
				}
			}
			
			else if (sel == 3) {
				
				if( log == -1) {
				System.out.println("로그인 할 아이디를 입력해주세요 . ");
				int onId = sc.nextInt();
				System.out.println("로그인 할 비밀번호를 입력해주세요 . ");
				int onPw = sc.nextInt();
				
				for(int i=0; i<SIZE; i++) {
					if(id[i] == onId && pw[i] == onPw) {
						log = onId;
					}
				}
				}
				else {
					System.out.println("이미 로그인 중입니다.");
					continue;
				}
			}
			else if (sel == 4) {
				if(log != -1) {
					System.out.println("로그아웃 되었습니다.");
					log = -1;
				}
				else {
					System.out.println("이미 로그아웃 상태입니다.");
				}
			}
			else if (sel == 5) {
				if(log == -1) {
					System.out.println("로그인을 먼저 해주세요 .");
					continue;
				}
				System.out.println("입금할 아이디를 입력해주세요 . ");
				int inId2 = sc.nextInt();
				
				for(int i=0; i<SIZE; i++) {
					if(id[i] == inId2) {
						System.out.println("입금할 금액을 입력해주세요 . ");
						int inMoney = sc.nextInt();
						money[i] += inMoney; 
					}
				}
				for(int i=0; i<SIZE; i++) {
					if(id[i] != inId2) {
						System.out.println("아이디를 확인해주세요/.");
						break;
					}
				}
				
				
			}
			else if (sel == 6) {
				if(log == -1) {
					System.out.println("로그인을 먼저 해주세요 .");
					continue;
				}
				System.out.println("이체할 아이디를 입력해주세요.");
				int inId2 = sc.nextInt();
				
				for(int i=0; i<SIZE; i++) {
					if(id[i] == inId2) {
						System.out.println("이체할 금액을 입력해주세요 ");
						int inMoney = sc.nextInt();
						money[i] += inMoney;						
						for(int j =0; j<SIZE; j++) {
							if( money[j] < inMoney) {
								System.out.println("잔액이 부족합니다.");
								break;
							}
						if(id[j] == log && money[j] > inMoney) {
							money[j] -= inMoney;
						}

					}
				}
				}
				for(int i=0; i<SIZE; i++) {
					if(id[i] != inId2) {
						System.out.println("아이디를 확인해주세요/.");
						break;
					}
				}
			}
			else if (sel == 7) {
				if (log == -1) {
					System.out.println("로그인을 먼저 해주세요 .");
					continue;
				}
				for(int i=0; i<SIZE; i++) {
					if(id[i] == log) {
					System.out.printf("현재 %d님의 잔액은 : %d원 입니다. ", log,  money[i]);
				}
				}
				System.out.println();
			}
			else if (sel == 8) {
				System.out.println("종료합니다");
				break;
			}
			
		}//while
		

	}

}
