package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex03_06 {

	public static void main(String[] args) {
		//파일장바구니문제
		Scanner sc = new Scanner(System.in);
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "사과", "바나나", "딸기" };
		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		String fileName = "jang.txt";
		int cnt = 0;
		int log = -1;
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		while (true) {
			System.out.println("[SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			System.out.println("log = " + log);
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				if(log == -1) {
					System.out.println("아이디 입력 : ");
					String id = sc.next();
					int check = 0;
					int x = 0;
					for(int i=0; i<3; i++) {
						if(ids[i].equals(id)) {
							check = 1;
							x = i;
						}
					}
					if(check == 1) {
						System.out.println("비밀번호 입력 : ");
						String pw = sc.next();
						if(pws[x].equals(pw)) {
							System.out.println(ids[x]+"님이 로그인 하셨습니다.");
							log = x;
						}else System.out.println("비밀번호를 다시 확인해주세요 . ");
					}else System.out.println("아이디를 다시 확인해주세요 . ");
					
				}else System.out.println("이미 로그인 상태입니다 .");
					
				
			} 
			
			else if (sel == 2) {
				if(log != -1) {
					System.out.println("로그아웃 했습니다");
					log = -1;
				}else System.out.println("이미 로그아웃 상태입니다.");
			} 
			
			else if (sel == 3) {
				if(log != -1) {
				System.out.println("장바구니에 담을 메뉴의 번호를 입력해주세요 . ");
				for(int i=0; i<3; i++) {
					System.out.print(i+") " + items[i] + "\n");
				}
				int menu = sc.nextInt();
				if(menu >=0 && menu <3) {
					jang[cnt][0] = log;
					jang[cnt][1] = menu;
					cnt++;
				}else System.out.println("메뉴의 범위를 벗어났습니다. ");
				}else System.out.println("로그인을 먼저 해주세요 . ");
				
			}
			
			else if (sel == 4) {
				if(log != -1) {
					for(int i=0; i<cnt; i++) {
						if(jang[i][0] == log) {
							System.out.println(ids[log] + "님꼐서 >> "+items[jang[i][1]]+"를 구매 .");
						}
					}
					
				}else System.out.println("로그인을 먼저 해주세요 . ");
			}
			
			else if (sel == 5) {
			System.out.println("save 하시겠습니까 1.yes  2.no");
			int sel2 = sc.nextInt(); 
			if(sel2 == 1) {
					try {
						fw = new FileWriter(file);
						int x= 0;
						while(x < cnt) {
							fw.write(jang[x][0]+"/");
							fw.write(jang[x][1]+"\n");
							x++;
						}
						fw.close();
						System.out.println("저장 완료 ! ");
					} catch (Exception e) {
						e.printStackTrace();
					}
			}else System.out.println("save를 하지 않습니다. ");

			}
			
			else if (sel == 6) {
				System.out.println("load 하시겠습니까? 1.yes  2.no");
				int sel2 = sc.nextInt();
				if(sel2 == 1) {
					if(file.exists()) {
						try {
							jang = new int[MAX_SIZE][2];
							fr = new FileReader(file);
							br = new BufferedReader(fr);
							cnt = 0;
							while (cnt < 100) {
								
								String data = br.readLine();

								System.out.println("data : " + data);

								if(data == null) {
									break;
								}

								String temp[] = data.split("/");
								jang[cnt][0] = Integer.parseInt(temp[0]);
								jang[cnt][1] = Integer.parseInt(temp[1]);
								cnt++;
							}
							
								fr.close();
								br.close();
							System.out.println("로드 완료 ! ");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}else System.out.println("load할 파일이 없습니다.");
					
				}else System.out.println("load를 하지 않습니다. ");
								
			}
			
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
				System.out.println("jang 배열 (run이 잘되는지 확인용)");
				for(int i=0; i<cnt; i++) {
					for(int j=0; j<jang[i].length; j++) {
						System.out.print(jang[i][j] + " ");
					}
					System.out.println();
				}
		}//w

		
	}

}
