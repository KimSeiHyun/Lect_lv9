package lv5.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		//���۽ð� 01 : 16
		//����ð� 02 : 02
		//�ҿ�ð� 00 : 46
		
		Scanner sc = new Scanner(System.in);
		
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "���", "�ٳ���", "����" };
		
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
		System.out.println("[1]�α���");
		System.out.println("[2]�α׾ƿ�");
		System.out.println("[3]����");
		System.out.println("[4]��ٱ���");
		System.out.println("[5]����");
		System.out.println("[6]�ε�");
		System.out.println("[0]����");
		System.out.println("log :" + log);
		System.out.print("�޴� ���� : ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			if(log == -1) {
				System.out.println("���̵� �Է� : ");
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
					System.out.println("��й�ȣ �Է� : ");
					String pw = sc.next();
						if(pws[idx].equals(pw)) {
							check2 = 1;
							System.out.println(id+"�Բ��� �α����ϼ̽��ϴ�.");
							log = idx;
						}
					if(check2 == 0) System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ��� . ");
				}else System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
			}else System.out.println("�̹� �α��� ���Դϴ�.");
		}
		else if (sel == 2) {
			if(log != -1) {
				log = -1;
				System.out.println("�α׾ƿ� �߽��ϴ�.");
			}else System.out.println("�̹� �α׾ƿ� �����Դϴ�.");
		}
		else if (sel == 3) {
			if(log != -1) {
				System.out.println("1.���\n2.�ٳ���\n3.����");
				int menu = sc.nextInt()-1;
				if(menu >= 0 && menu <= 2) {
					jang[cnt][0] = log;
					jang[cnt][1] = menu;
					cnt++;
				}else System.out.println("1~3��ȣ�� ������ ������ϴ�.");
			}else System.out.println("�α����� ���� ���ּ��� . ");
			
		}
		else if (sel == 4) {
			if(log != -1) {
				for(int i=0; i<cnt; i++) {
					if(jang[i][0] == log) {
						System.out.println(ids[log]+"�Բ���  >>   "+items[jang[i][1]] + "�� ����");
					}
				}
			}else System.out.println("�α����� ���� ���ּ��� .");
			
		}
		else if (sel == 5) {
			try {
				fw = new FileWriter(file);
				for(int i=0; i<cnt; i++) {
					fw.write(jang[i][0]+"/");
					fw.write(jang[i][1]+"\n");
				}
				fw.close();
				System.out.println("save�߽��ϴ�.");
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
					System.out.println("load�߽��ϴ�.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else System.out.println("load�� ������ �����ϴ�.");
		}
		else if (sel == 0) {
			System.out.println("���α׷��� �����մϴ�");
			break;
		}
		
		}//while

		
	}

}
