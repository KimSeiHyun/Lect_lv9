package lv5.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		//시작시간 12 : 50
		//종료시간 01 : 13
		//소요시간 00 : 23
		
		String fileName = "vector.txt";
		int vector[] = null;
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		
		
		
		
		while(true) {
			if(cnt > 0) {
				for(int i=0; i<vector.length; i++) {
					System.out.print(vector[i] + " ");
				}System.out.println();
			}
		System.out.println("cnt : " + cnt);
		System.out.println("[벡터 컨트롤러]");
		System.out.println("[1]추가하기");
		System.out.println("[2]삭제하기");
		System.out.println("[3]저장하기");
		System.out.println("[4]로드하기");
		System.out.println("[5]종료하기");
		System.out.print("메뉴 선택 : ");
		int sel = sc.nextInt();
		if(sel == 1) {
			if(cnt == 0) {
				System.out.println("추가할 값 입력 : ");
				int num = sc.nextInt();
				cnt++;
				vector = new int[cnt];
				vector[0] = num;
			}else {
				System.out.println("추가할 값 입력 : ");
				cnt++;
				int num = sc.nextInt();
				int temp[] = vector;
				vector = new int[cnt];
				for(int i=0; i<temp.length; i++) {
					vector[i] = temp[i];
				}
				vector[cnt-1] = num; 
			}
		}
		else if (sel == 2) {
			if(cnt == 0) {
				System.out.println("삭제할 값이 없습니다.");
			}else {
				System.out.println("삭제할 값 입력 : ");
				int num = sc.nextInt();
				
				for(int i=0; i<vector.length; i++) {
					if(vector[i] == num) {
						vector[i] = -1;
						cnt --;
					}
				}
				int temp[] = vector;
				int x = 0;
				vector = new int[cnt];
				for(int i=0; i<temp.length; i++) {
					if(temp[i] != -1) {
						vector[x] = temp[i];
						x++;
					}
				}

			}
		}
		else if (sel == 3) {
			try {
				fw = new FileWriter(file);
				for(int i=0; i<cnt; i++) {
					fw.write(vector[i]+"\n");
				}
				fw.close();
				System.out.println("save했습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (sel == 4) {
			if(file.exists()) {
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					cnt = 0;
					while(true) {
						String data = br.readLine();
						if(data == null) break;
						cnt++;
					}
					fr.close();
					br.close();
					vector = new int[cnt];
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					for(int i=0; i<cnt; i++) {
						String data = br.readLine();
						vector[i] = Integer.parseInt(data);
					}
					fr.close();
					br.close();
					System.out.println("load했습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else System.out.println("load할 파일이 없습니다.");
		}
		else if (sel == 5) {
			System.out.println("종료합니다");
			break;
			
		}
		}//while

	}

}
