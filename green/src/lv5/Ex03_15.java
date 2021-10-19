package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex03_15 {

	public static void main(String[] args) {
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
		String[][] board = null;
		int count = 0;				// ��ü �Խñ� ��
		int pageSize = 5;			// �� �������� ������ �Խñ� ��
		int curPageNum = 1;			// ���� ������ ��ȣ
		int pageCount = 0;			// ��ü ������ ����
		int startRow = 0;			// ���� �������� �Խñ� ���� ��ȣ
		int endRow = 0;				// ���� �������� �Խñ� ������ ��ȣ
		int a =0;
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		if(file.exists()) {//���۽� save���� �����ϸ� �ٷ� load��Ŵ . 
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
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				board = new String[count][2];
				for(int i=0; i<count; i++) {
					String data = br.readLine();
					String temp[] = data.split("/");
					board[i][0] = temp[0];
					board[i][1] = temp[1];
				}
				fr.close();
				br.close();
				System.out.println("save���������Ƿ� load�� ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else System.out.println("save�� ���� ���� . ");
	
		while(true) {
			int b =0;
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");
			System.out.println("======�Խ���======");
			for(int i=a; i<count; i++) {//5���� ��� 
					System.out.println(i+1+". " + board[i][0]);
					b++;
					if(b == pageSize) {
						break;
					}
			}
			if(count > 0) {
				System.out.printf("page [%d / %d ] ",curPageNum,1+(count-1)/5);				
			}
			System.out.println("��ü �Խñ� �� :" + count + "��");
			System.out.println("================");
			int choice = sc.nextInt();
			if(choice == 1) {
				if(a >1) {
					a -= 5;
					curPageNum --;
				}
			}
			else if(choice == 2) {
				if(a+5 < count) {
					a += 5;
					curPageNum ++;
				}
			}
			else if(choice == 3) {
				System.out.print("���� �Է� : ");
				String str = sc.next();
				if(count == 0) { // ī��Ʈ�� 0�� ��
					count ++;
					board = new String[count][2];
					System.out.println("���� �Է� : ");
					String str2 = sc.next();
					board[0][0] = str;
					board[0][1] = str2;
					continue;
				}
				else { //ī��Ʈ�� 0�� �ƴ� �� 
					int check = 0;
					for(int i=0; i<count; i++) {
						if(board[i][0].equals(str)) {
							System.out.println("�̹� �Է��Ͻ� ������ �����մϴ� .");
							check = 1;
						}
					}
					if(check == 0) {
						System.out.print("���� �Է� : ");
						String str2 = sc.next();
						count++;
						String temp[][] = board;
						board = new String[count][2];
						for(int i=0; i<count-1; i++) {
								board[i][0] = temp[i][0];
								board[i][1] = temp[i][1];
						}
						board[count-1][0] = str;
						board[count-1][1] = str2;
					}
					
				}
				
				try {//save���Ͽ� �ǽð� �߰� 
					fw = new FileWriter(file);
					for(int i=0; i<count; i++) {
						fw.write(board[i][0]+"/");
						fw.write(board[i][1]+"\n");
					}
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}//else if (choice == 3)
			else if(choice == 4) {
				System.out.println("������ �Խñ��� ��ȣ �Է� : ");
				int delNum = sc.nextInt()-1;
				if(delNum >=0 && delNum <=count-1 ) {
					count--;
					String temp[][] = board;
					board = new String[count][2];
					temp[delNum][0] = null;
					int x = 0;
					for(int i=0; i<count+1; i++) {
						if(temp[i][0] != null) {
							board[x][0] = temp[i][0];
							board[x][1] = temp[i][1];
							x++;
						}
					}
				}
				try {//save���Ͽ��� �ǽð� ���� . 
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
			else if(choice == 5) {
				System.out.print("���� Ȯ���� �Խù��� ��ȣ �Է� : ");
				int num = sc.nextInt()-1;
				if(num >= 0 && num <=count-1) {
					System.out.println(num+1+"�� �Խù��� ������ : " + board[num][1]);
				}else System.out.println("�Խù��� ��ȣ �ٽ� Ȯ��.");
				
			}
		}//while(true)

		
	}

}
