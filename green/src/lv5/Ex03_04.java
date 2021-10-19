package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex03_04 {

	public static void main(String[] args) {
		//파일컨트롤러1문제
		Scanner sc = new Scanner(System.in);
		int vector[] = null;
		int cnt = 0;
		int load = 0;
		int loadCheck = 0;
		String fileName = "vector.txt";
		
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		while (true) {
			System.out.print("백터베열 : ");
			for(int i=0; i<cnt; i++) {
				System.out.print(vector[i] + " ");
			}System.out.println();
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel == 1) { // 배열에 원하는 값 추가 . 
				System.out.println("추가할 값을 입력해주세요 ");
				int inNum = sc.nextInt();
				if(cnt == 0) {
					vector = new int[1];
					vector[0] = inNum;
					cnt++;
				}
				else {
					int temp[] = vector;
					vector = new int[cnt+1];
					vector[cnt] = inNum;
					for(int i=0; i<temp.length; i++) {
						vector[i] = temp[i];
					}
					cnt++;
				}
				System.out.println("추가완료 !");
			}
			else if (sel == 2) { // 배열에 원하는 값 삭제 . 
				if (cnt !=0) {
				System.out.println("삭제할 값을 입력해주세요 ");
				int delNum = sc.nextInt();
				int check = 0;
				for(int i=0; i<cnt; i++) {
					if(vector[i] == delNum) {
						vector[i] = 0;
						cnt--;
						check = 1;
					}
				}
				if(check == 1) {
					int temp[] = vector;
					vector = new int[cnt];
					int x = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i] != 0) {
							vector[x] = temp[i];
							x++;
						}
					}
					System.out.println("삭제완료 ");
				}else System.out.println("삭제할 값을 다시 확인해주세요 . ");
				
				}else System.out.println("삭제할 값이 없습니다 .");
			} 
			else if (sel == 3) { // 파일에 배열값을 새로 갱신 
				try {
					fw = new FileWriter(file);
					for(int i=0; i<cnt; i++) {
						fw.write(vector[i]+"\n");
					}
					fw.close();
					System.out.println("저장완료 ! ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} 
			else if (sel == 4) {
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					int check = 0;
					load = 0;
					cnt = 0;
					while(check == 0) {
						String data = br.readLine();
						if(data == null) { // 있는값만 출력 
							break;
						}
						load ++;
						if(loadCheck == 0) { //새로 시작해 로드를 하면 file의 값을 vector배열에 추가
											// 이미 백터배열이 어떠한 값을 가지고 있던 file에서 로드함 . 
						while(cnt < load) {
							if(cnt == 0) {
								vector = new int[load];
								vector[0] = Integer.parseInt(data);
								cnt ++;

							}else {
								int temp[] = vector;
								vector = new int[load];
								for(int i=0; i<temp.length; i++) {
									vector[i] = temp[i];
								}
								vector[cnt] =Integer.parseInt(data);
								cnt++;
								
							}
						}
						}
						System.out.println(data);
					}
					loadCheck = 1;
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				
			} 
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}//w

	}

}
