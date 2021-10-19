package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex03_05 {

	public static void main(String[] args) {
		//파일ATM문제
		
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int count = 0;
		int log = -1;
		int loadcheck = 0;
		String[] accs = new String[0];
		String[] pws = new String[0];
		int[]  moneys = new int[0];
		String fileName = "atm.txt";
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		while(true) {
			for(int i=0; i<accs.length; i++) {
				System.out.print(accs[i] + " ");
			}System.out.println();
			for(int i=0; i<pws.length; i++) {
				System.out.print(pws[i] + " ");
			}System.out.println();
			for(int i=0; i<moneys.length; i++) {
				System.out.print(moneys[i] + " ");
			}System.out.println();
			System.out.println("log = " + log);
			System.out.println("[ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if(sel == 1) {//회원가입
				System.out.println("회원가입 아이디를 입력해주세요 ");
				String inId = sc.next();
				int check = 0;
				for (int i=0; i<accs.length; i++) {
					if(inId.equals(accs[i])) {
						check = 1;
					}
				}
				if(check == 0) {
					System.out.println("비밀번호를 입력해주세요 ");
					String inPw = sc.next();
					if(count == 0) {
						count ++;
						accs = new String[count];
						pws = new String[count];
						moneys = new int[count];
						accs[0] = inId;
						pws[0] = inPw;
					}
					else {
						count++;
						String temp1[] = accs;
						String temp2[] = pws;
						int temp3[] = moneys;
						
						accs = new String[count];
						pws = new String[count];
						moneys = new int[count];
						
						for(int i=0; i<temp1.length; i++) {
							accs[i] = temp1[i];
							pws[i] = temp2[i];
							moneys[i] = temp3[i];
						}
						accs[count-1] = inId;
						pws[count-1] = inPw;
						moneys[count-1] = 0;
						
					}

					
				}else System.out.println("이미 존재하는 아이디입니다.");
			}
			else if(sel == 2) {//탈퇴
				if(log != -1) {
					System.out.println("회원탈퇴를 하기위해 아이디를 다시 입력해주세요 . ");
					String id = sc.next();
						if(id.equals(accs[log])) {
							accs[log] = null;
							pws[log] = null;
							moneys[log] = -1;
							count --;
							
							String temp1[] = accs;
							accs = new String[count];
							String temp2[] = pws;
							pws = new String[count];
							int temp3[] = moneys;
							moneys = new int[count];
							int x= 0;
							for(int i=0; i<temp1.length; i++) {
								if(temp1[i] != null) {
									accs[x] = temp1[i];
									pws[x] = temp2[i];
									moneys[x] = temp3[i];
									x ++;
								}
							}
							
							log = -1;
							System.out.println("회원탈퇴를 하셧습니다.");
						}else System.out.println("아이디를 다시 확인해주세요 . ");
				}else System.out.println("로그인을 먼저 해주세요 . ");
			}
			else if(sel == 3) {//로그인
				if(log == -1) {
					System.out.println("로그인 아이디를 입력해주세요");
					String id = sc.next();
					int check = 0;
					int x = 0 ;
					for(int i=0; i<accs.length; i++) {
						if(id.equals(accs[i])) {
							check = 1;
							x = i;
						}
					}
					if(check == 1) {
						System.out.println("로그인 비밀번호를 입력해주세요 . ");
						String pw = sc.next();
						if(pws[x].equals(pw)) {
							System.out.println(accs[x] + "님께서 로그인에 성공하셧습니다 .");
							log = x;
						}else System.out.println("비밀번호를 다시 확인해주세요 . ");
					}else System.out.println("아이디를 다시 확인해주세요 . ");
				}else System.out.println("이미 로그인 상태입니다.");
				
			}
			else if(sel == 4) {//로그아웃
				if(log != -1 ) {
					System.out.println("로그아웃되었습니다.");
					log = -1;
				}else System.out.println("이미 로그아웃상태입니다. ");
				
			}
			else if(sel == 5) {//입금
				if(log != -1) {
					System.out.println("입금할 계좌(아이디)를 입력해주세요 ");
					String id = sc.next();
					int check = 0;
					int x = 0;
					for(int i=0;i<accs.length; i++) {
						if(id.equals(accs[i])) {
							check = 1;
							x  = i;
						}
					}
					if(check == 1) {
						System.out.println("입금할 금액을 입력해주세요 .");
						int money = sc.nextInt();
						moneys[x] += money;
					}else System.out.println("입급할 계좌(아이디)를 다시 확인해주세요 . ");
				}else System.out.println("로그인을 먼저 해주세요 .");
			}
			else if(sel == 6) {//출금
				if(log != -1) {
					System.out.println("출금할 금액을 입력해주세요");
					int outMoney = sc.nextInt();
					if(moneys[log] < outMoney) {
						System.out.println("잔액이 부족합니다.");
					}else {
						moneys[log] -= outMoney;
						System.out.println("출금이 완료되었습니다.");
					}
				}else System.out.println("로그인을 먼저 해주세요 .");
			
				
			}
			else if(sel == 7) {//이체
				if(log != -1) {
					System.out.println("이체할 계좌(아이디)를 입력해주세요 .");
					String id = sc.next();
					int check = 0;
					int x = 0;
					for(int i=0; i<accs.length; i++) {
						if(id.equals(accs[i])) {
							check = 1;
							x = i;
						}
					}
					if(check == 1) {
						System.out.println("이체할 금액을 입력해주세요 . ");
						int moveMoney = sc.nextInt();
						if(moveMoney < moneys[log]) {
							moneys[x] += moveMoney;
							moneys[log] -= moveMoney;
						}else System.out.println("잔액이 부족합니다.");
					}else System.out.println("이체할 계좌(아이디)를 다시 확인해주세요 . ");
				}else System.out.println("로그인을 먼저 해주세요 . ");
			}
			else if(sel == 8) {//잔액조회
				if(log != -1) {
					System.out.println("현재 가지고 계신 금액은 : " + moneys[log] + "원 입니다.");
				}else System.out.println("로그인을 먼저 해주세요 ");
			}
			else if(sel == 9) {//저장

					try {
						fw = new FileWriter(file);
						int save = 0;
						while(save < count) {
							fw.write(accs[save]+"/");
							fw.write(pws[save]+"/");
							fw.write(moneys[save]+"\n");
							save++;
						}
						fw.close();
						System.out.println("저장완료 ! ");
					} catch (Exception e) {
						e.printStackTrace();
					}

			}
			else if(sel == 10) {//로드
				if (file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						System.out.println("dat.txt에 저장된 값");
						int check = 0;
						int x = 0;
						count = 0;
						while (check < 1) {
							String datas = br.readLine();
							if(datas == null) {
								break;
							}
							System.out.println(datas); //dat.txt 데이터 출력 . 

								int y = 0;

								String arr[] = datas.split("/"); // 배열에 값을 로드 .
								if(count ==  0) {
									accs = new String[1];
									pws = new String[1];
									moneys = new int[1];
									accs[x] = arr[y];
									y++;
									pws[x] = arr[y];
									y++;
									moneys[x] = Integer.parseInt(arr[y]);
									x++;
									count ++;
									
									x++;
								}else {
									
									String temp1[] = accs;
									accs = new String[count+1];
									String temp2[] = pws;
									pws = new String[count+1];
									int temp3[] = moneys;
									moneys = new int[count+1];
									
									for(int i=0; i<temp1.length; i++) {
										accs[i] = temp1[i];
										pws[i] = temp2[i];
										moneys[i] = temp3[i];
									}
									accs[count] = arr[y];
									y++;
									pws[count] = arr[y];
									y++;
									moneys[count] = Integer.parseInt(arr[y]);
									x++;
									count ++;
								}

						}
						fr.close();
						br.close();
						System.out.println("로드완료!");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			else if(sel == 0) {
				break;
			}
		}
	}

}
