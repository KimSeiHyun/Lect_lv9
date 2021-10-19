package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex03_15 {

	public static void main(String[] args) {
		/*
		 * # 콘솔 게시판
		 * 1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다.
		 * 2. 현재 페이지 번호에 해당되는 게시글만 볼 수 있다.
		 * 3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다.
		 * 4. 게시글을 추가하고 삭제할 때마다 파일입출력을 통해 데이터가 바로바로 저장된다.
		 * 5. 실행시 저장되어 있는 파일이 존재한다면, 바로 파일을 불러오도록 설계한다.
		 */
		
		Scanner sc = new Scanner(System.in);
        String fileName = "board.txt";
		String[][] board = null;
		int count = 0;				// 전체 게시글 수
		int pageSize = 5;			// 한 페이지에 보여줄 게시글 수
		int curPageNum = 1;			// 현재 페이지 번호
		int pageCount = 0;			// 전체 페이지 개수
		int startRow = 0;			// 현재 페이지의 게시글 시작 번호
		int endRow = 0;				// 현재 페이지의 게시글 마지막 번호
		int a =0;
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		if(file.exists()) {//시작시 save파일 존재하면 바로 load시킴 . 
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
				System.out.println("save파일있으므로 load함 ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else System.out.println("save된 파일 없음 . ");
	
		while(true) {
			int b =0;
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");
			System.out.println("======게시판======");
			for(int i=a; i<count; i++) {//5개씩 출력 
					System.out.println(i+1+". " + board[i][0]);
					b++;
					if(b == pageSize) {
						break;
					}
			}
			if(count > 0) {
				System.out.printf("page [%d / %d ] ",curPageNum,1+(count-1)/5);				
			}
			System.out.println("전체 게시글 수 :" + count + "개");
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
				System.out.print("제목 입력 : ");
				String str = sc.next();
				if(count == 0) { // 카운트가 0일 때
					count ++;
					board = new String[count][2];
					System.out.println("내용 입력 : ");
					String str2 = sc.next();
					board[0][0] = str;
					board[0][1] = str2;
					continue;
				}
				else { //카운트가 0이 아닐 때 
					int check = 0;
					for(int i=0; i<count; i++) {
						if(board[i][0].equals(str)) {
							System.out.println("이미 입력하신 제목이 존재합니다 .");
							check = 1;
						}
					}
					if(check == 0) {
						System.out.print("내용 입력 : ");
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
				
				try {//save파일에 실시간 추가 
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
				System.out.println("삭제할 게시글의 번호 입력 : ");
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
				try {//save파일에서 실시간 삭제 . 
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
				System.out.print("내용 확인할 게시물의 번호 입력 : ");
				int num = sc.nextInt()-1;
				if(num >= 0 && num <=count-1) {
					System.out.println(num+1+"번 게시물의 내용은 : " + board[num][1]);
				}else System.out.println("게시물의 번호 다시 확인.");
				
			}
		}//while(true)

		
	}

}
