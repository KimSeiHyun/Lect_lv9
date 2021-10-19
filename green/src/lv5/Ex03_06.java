package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex03_06 {

	public static void main(String[] args) {
		//������ٱ��Ϲ���
		Scanner sc = new Scanner(System.in);
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "���", "�ٳ���", "����" };
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
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[4]��ٱ���");
			System.out.println("[5]����");
			System.out.println("[6]�ε�");
			System.out.println("[0]����");
			System.out.println("log = " + log);
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				if(log == -1) {
					System.out.println("���̵� �Է� : ");
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
						System.out.println("��й�ȣ �Է� : ");
						String pw = sc.next();
						if(pws[x].equals(pw)) {
							System.out.println(ids[x]+"���� �α��� �ϼ̽��ϴ�.");
							log = x;
						}else System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ��� . ");
					}else System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
					
				}else System.out.println("�̹� �α��� �����Դϴ� .");
					
				
			} 
			
			else if (sel == 2) {
				if(log != -1) {
					System.out.println("�α׾ƿ� �߽��ϴ�");
					log = -1;
				}else System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
			} 
			
			else if (sel == 3) {
				if(log != -1) {
				System.out.println("��ٱ��Ͽ� ���� �޴��� ��ȣ�� �Է����ּ��� . ");
				for(int i=0; i<3; i++) {
					System.out.print(i+") " + items[i] + "\n");
				}
				int menu = sc.nextInt();
				if(menu >=0 && menu <3) {
					jang[cnt][0] = log;
					jang[cnt][1] = menu;
					cnt++;
				}else System.out.println("�޴��� ������ ������ϴ�. ");
				}else System.out.println("�α����� ���� ���ּ��� . ");
				
			}
			
			else if (sel == 4) {
				if(log != -1) {
					for(int i=0; i<cnt; i++) {
						if(jang[i][0] == log) {
							System.out.println(ids[log] + "�Բ��� >> "+items[jang[i][1]]+"�� ���� .");
						}
					}
					
				}else System.out.println("�α����� ���� ���ּ��� . ");
			}
			
			else if (sel == 5) {
			System.out.println("save �Ͻðڽ��ϱ� 1.yes  2.no");
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
						System.out.println("���� �Ϸ� ! ");
					} catch (Exception e) {
						e.printStackTrace();
					}
			}else System.out.println("save�� ���� �ʽ��ϴ�. ");

			}
			
			else if (sel == 6) {
				System.out.println("load �Ͻðڽ��ϱ�? 1.yes  2.no");
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
							System.out.println("�ε� �Ϸ� ! ");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}else System.out.println("load�� ������ �����ϴ�.");
					
				}else System.out.println("load�� ���� �ʽ��ϴ�. ");
								
			}
			
			else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
				System.out.println("jang �迭 (run�� �ߵǴ��� Ȯ�ο�)");
				for(int i=0; i<cnt; i++) {
					for(int j=0; j<jang[i].length; j++) {
						System.out.print(jang[i][j] + " ");
					}
					System.out.println();
				}
		}//w

		
	}

}
