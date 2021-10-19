package lv5.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		//시작시간 01 : 16
		//종료시간 02 : 02
		//소요시간 00 : 46
		
		Scanner sc = new Scanner(System.in);
		
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "사과", "바나나", "딸기" };
		
		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		String fileName = "jang.txt";
		
		int log = -1;
		int cnt = 0;
		
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		while(true) {
			for(int i=0; i<cnt; i++) {
				System.out.print(jang[i][0] + "  ");
				System.out.println(jang[i][1]);
			}
		System.out.println("[SHOP]");
		System.out.println("[1]로그인");
		System.out.println("[2]로그아웃");
		System.out.println("[3]쇼핑");
		System.out.println("[4]장바구니");
		System.out.println("[5]저장");
		System.out.println("[6]로드");
		System.out.println("[0]종료");
		System.out.println("log :" + log);
		System.out.print("메뉴 선택 : ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			if(log == -1) {
				System.out.println("아이디 입력 : ");
				String id = sc.next();
				int check = 0;
				int check2 = 0;
				int idx = -1;
				for(int i=0; i<3; i++) {
					if(ids[i].equals(id)) {
						idx = i;
						check = 1;
					}
				}
				if(check == 1) {
					System.out.println("비밀번호 입력 : ");
					String pw = sc.next();
						if(pws[idx].equals(pw)) {
							check2 = 1;
							System.out.println(id+"님께서 로그인하셨습니다.");
							log = idx;
						}
					if(check2 == 0) System.out.println("비밀번호를 다시 확인해주세요 . ");
				}else System.out.println("아이디를 다시 확인해주세요 . ");
			}else System.out.println("이미 로그인 중입니다.");
		}
		else if (sel == 2) {
			if(log != -1) {
				log = -1;
				System.out.println("로그아웃 했습니다.");
			}else System.out.println("이미 로그아웃 상태입니다.");
		}
		else if (sel == 3) {
			if(log != -1) {
				System.out.println("1.사과\n2.바나나\n3.딸기");
				int menu = sc.nextInt()-1;
				if(menu >= 0 && menu <= 2) {
					jang[cnt][0] = log;
					jang[cnt][1] = menu;
					cnt++;
				}else System.out.println("1~3번호의 범위를 벗어났습니다.");
			}else System.out.println("로그인을 먼저 해주세요 . ");
			
		}
		else if (sel == 4) {
			if(log != -1) {
				for(int i=0; i<cnt; i++) {
					if(jang[i][0] == log) {
						System.out.println(ids[log]+"님께서  >>   "+items[jang[i][1]] + "를 구매");
					}
				}
			}else System.out.println("로그인을 먼저 해주세요 .");
			
		}
		else if (sel == 5) {
			try {
				fw = new FileWriter(file);
				for(int i=0; i<cnt; i++) {
					fw.write(jang[i][0]+"/");
					fw.write(jang[i][1]+"\n");
				}
				fw.close();
				System.out.println("save했습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (sel == 6) {
			if(file.exists()) {
				cnt = 0;
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					while(true) {
						String data = br.readLine();
						if(data == null) break;
						cnt++;
					}
					fr.close();
					br.close();
					
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					for(int i=0; i<cnt; i++) {
						String data = br.readLine();
						String temp[] = data.split("/");
						jang[i][0] = Integer.parseInt(temp[0]);
						jang[i][1] = Integer.parseInt(temp[1]);
					}
					fr.close();
					br.close();
					System.out.println("load했습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else System.out.println("load할 파일이 없습니다.");
		}
		else if (sel == 0) {
			System.out.println("프로그램을 종료합니다");
			break;
		}
		
		}//while

		
	}

}
