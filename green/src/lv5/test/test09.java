package lv5.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class test09 {

	public static void main(String[] args) {
		//시작시간 09 : 30
		//종료시간 11 : 32
		//소요시간 02 : 02
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
        File file = new File(fileName);
        FileWriter fw = null;
        FileReader fr = null;
        BufferedReader br = null;
		String[][] board = null;
		int count = 0;				// 전체 게시글 수
		int pageSize = 5;			// 한 페이지에 보여줄 게시글 수
		int curPageNum = 1;			// 현재 페이지 번호
		int pageCount = 0;			// 전체 페이지 개수
		int startRow = 0;			// 현재 페이지의 게시글 시작 번호
		int endRow = 0;				// 현재 페이지의 게시글 마지막 번호
		int a = 0;
		
		if(file.exists()) {//board.txt가 있으면 자동 로드 . 
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
			System.out.println("load할 파일이 있어 자동 load.");
		}else System.out.println("load할 save파일이 없습니다. ");
		
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
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");
			System.out.println("--------게시판--------");
			int cnt = 0;
			//출력문
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
				System.out.println("추가할 페이지의 제목 입력 : ");
				String s1 = sc.next();
				if(count == 0) {
					count++;
					board = new String [count][2];
					System.out.println("내용 입력 : ");
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
						System.out.println("내용 입력 : ");
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
					}else System.out.println("입력하신 제목이 이미 존재합니다 .");
				}
				
				try { //추가 할 때마다 자동 txt 파일에 저장. 
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
					System.out.println("삭제할 게시물의 번호 입력 : ");
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
					}else System.out.println("게시물의 번호를 다시 확인해주세요 . ");
					
				}else System.out.println("삭제할 게시물이 없습니다. ");
				
				try {//삭제 할 때마다 자동 저장 . 
					fw = new FileWriter(file);
					if(count > 0) {
						for(int i=0; i<count; i++) {
							fw.write(board[i][0]+"/");
							fw.write(board[i][1]+"\n");
						}
					}else if (count == 0) {//1개의 게시물이 있을때 삭제를하면 txt파일에 null만남게함. 
						fw.write("");
					}
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(sel == 5) {
				if(count > 0) {
					System.out.println("내용을 확인할 게시물의 번호를 입력 : ");
					int num = sc.nextInt()-1;
					if(num >= 0 && num < count) {
						System.out.printf("%d번 게시물의 내용 : " ,num+1);
						System.out.println(board[num][1]);
					}else System.out.println("게시물의 번호를 다시 확인해주세요 . ");
					
				}else System.out.println("게시물이 하나도 존재하지 않습니다.");
			}

		}//while

	}

}
