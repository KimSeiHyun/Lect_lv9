package lv5.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class test09 {

	public static void main(String[] args) {
		//���۽ð� 09 : 30
		//����ð� 11 : 32
		//�ҿ�ð� 02 : 02
		/*
		 * # �ܼ� �Խ���
		 * 1. [����] �Ǵ� [����] ��ư�� ������ ������ ��ȣ�� ����ȴ�.
		 * 2. ���� ������ ��ȣ�� �ش�Ǵ� �Խñ۸� �� �� �ִ�.
		 * 3. 2���� �迭 board�� 0������ ������ 1������ �Խñ��� ������ �����Ѵ�.
		 * 4. �Խñ��� �߰��ϰ� ������ ������ ����������� ���� �����Ͱ� �ٷιٷ� ����ȴ�.
		 * 5. ����� ����Ǿ� �ִ� ������ �����Ѵٸ�, �ٷ� ������ �ҷ������� �����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
        String fileName = "board.txt";
        File file = new File(fileName);
        FileWriter fw = null;
        FileReader fr = null;
        BufferedReader br = null;
		String[][] board = null;
		int count = 0;				// ��ü �Խñ� ��
		int pageSize = 5;			// �� �������� ������ �Խñ� ��
		int curPageNum = 1;			// ���� ������ ��ȣ
		int pageCount = 0;			// ��ü ������ ����
		int startRow = 0;			// ���� �������� �Խñ� ���� ��ȣ
		int endRow = 0;				// ���� �������� �Խñ� ������ ��ȣ
		int a = 0;
		
		if(file.exists()) {//board.txt�� ������ �ڵ� �ε� . 
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while(true) {
					String data = br.readLine();
					if(data == null) break;
					count++;
				}
				fr.close();
				br.close();
				
				board = new String[count][2];
				fr = new FileReader(file);
				br  = new BufferedReader(fr);
				for(int i=0; i<count; i++) {
					String data = br.readLine();
					String temp[] = data.split("/");
					board[i][0] = temp[0];
					board[i][1] = temp[1];
				}
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("load�� ������ �־� �ڵ� load.");
		}else System.out.println("load�� save������ �����ϴ�. ");
		
		while(true) {
			if(count == 0) {
				pageCount = 0;
				curPageNum = 0;
			}else if (count == 1) {
				pageCount = 1;
				curPageNum = 1;
			}else if(count > 1) {
				pageCount = (count+4)/5;
			}
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");
			System.out.println("--------�Խ���--------");
			int cnt = 0;
			//��¹�
			if(count > 0) {
				for(int i=a; i<count; i++) {
					if(cnt == 5) break;
					System.out.print(i+1 + ". ");
					cnt++;
					for(int j=0; j<2; j++) {
						System.out.print(board[i][j] + " ");
					}System.out.println();
				}System.out.println();
			}
			System.out.printf("page [ %d / %d ]  count : %d",curPageNum,pageCount,count);
			int sel = sc.nextInt();
			if(sel == 1) {
				if(a > 4) {
					a -= 5;
					curPageNum -= 1;
				}
			}
			else if(sel == 2) {
				if(a < count-5 ) {
					a += 5;
					curPageNum += 1;
				}
			}
			else if(sel == 3) {
				System.out.println("�߰��� �������� ���� �Է� : ");
				String s1 = sc.next();
				if(count == 0) {
					count++;
					board = new String [count][2];
					System.out.println("���� �Է� : ");
					String s2 = sc.next();;
					board[count-1][0] = s1;
					board[count-1][1] = s2;
				}else {
					int s1Check = 0;
					for(int i=0; i<count; i++) {
							if(board[i][0].equals(s1)) {
								s1Check = 1;
						}
					}
					if(s1Check == 0) {
						System.out.println("���� �Է� : ");
						String s2 = sc.next();
						count++;
						String temp[][] = board;
						board = new String [count][2];
						for(int i=0; i<count-1; i++) {
								board[i][0] = temp[i][0];
								board[i][1] = temp[i][1];
						}
						board[count-1][0] = s1;
						board[count-1][1] = s2;
					}else System.out.println("�Է��Ͻ� ������ �̹� �����մϴ� .");
				}
				
				try { //�߰� �� ������ �ڵ� txt ���Ͽ� ����. 
					fw = new FileWriter(file);
					for(int i=0; i<count; i++) {
						fw.write(board[i][0]+"/");
						fw.write(board[i][1]+"\n");
					}
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(sel == 4) {
				if(count > 0) {
					System.out.println("������ �Խù��� ��ȣ �Է� : ");
					int del = sc.nextInt()-1;
					if(del >= 0 && del < count) {
						count--;
						String temp[][] = board;
						board = new String[count][2];
						int x = 0;
						for(int i=0; i<count+1; i++) {
							if(i != del) {
								board[x][0] = temp[i][0];
								board[x][1] = temp[i][1];
								x++;
							}
						}
						if(a == count) {
							if(a == 0) {
								a+=5;
							}
							curPageNum -= 1;
							a-= 5;
						}
					}else System.out.println("�Խù��� ��ȣ�� �ٽ� Ȯ�����ּ��� . ");
					
				}else System.out.println("������ �Խù��� �����ϴ�. ");
				
				try {//���� �� ������ �ڵ� ���� . 
					fw = new FileWriter(file);
					if(count > 0) {
						for(int i=0; i<count; i++) {
							fw.write(board[i][0]+"/");
							fw.write(board[i][1]+"\n");
						}
					}else if (count == 0) {//1���� �Խù��� ������ �������ϸ� txt���Ͽ� null��������. 
						fw.write("");
					}
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(sel == 5) {
				if(count > 0) {
					System.out.println("������ Ȯ���� �Խù��� ��ȣ�� �Է� : ");
					int num = sc.nextInt()-1;
					if(num >= 0 && num < count) {
						System.out.printf("%d�� �Խù��� ���� : " ,num+1);
						System.out.println(board[num][1]);
					}else System.out.println("�Խù��� ��ȣ�� �ٽ� Ȯ�����ּ��� . ");
					
				}else System.out.println("�Խù��� �ϳ��� �������� �ʽ��ϴ�.");
			}

		}//while

	}

}
