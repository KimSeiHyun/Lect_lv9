package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex03_03 {

	public static void main(String[] args) {
		//파일불러오기문제
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		String fileName = "fileTest02.txt";
		
		//반복문을 써서 처리해보세요 . 
		//문자열이 얼만큼의 길이인지 모른다는 가정하에 해결 . 
		File file = new File(fileName);
		
		FileReader fr = null;
		BufferedReader br = null;
		int num = 0;
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String temp = br.readLine();
				System.out.println("temp : " + temp); //문자열의 끝 확인 . 
				String temp2[] = br.readLine().split("/");
				num = temp2.length;
				System.out.println("문자열의 길이 : " + num); 
				ids = new String[num];
				pws = new String[num];
				moneys = new int[num];
				br.close();
				fr.close();
				
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				int x =0;
				while(x <3) { //문자열의 길이 확인후 길이만큼 각 배열에 삽입 . 
				String data[] = br.readLine().split("/");
				int y =0;
				ids[x] = data[y];
				y++;
				pws[x] = data[y];
				y++;
				moneys[x] = Integer.parseInt(data[y]);
				x++;
				}
				fr.close();
				br.close();
			} catch (Exception e) {
				System.out.println("파일로드 실패 ,, ");
				e.printStackTrace();
			}
		}//if
		
		//출력
		for(int i=0; i<num; i++) {
			System.out.print(ids[i] + " ");
		}System.out.println();
		for(int i=0; i<num; i++) {
			System.out.print(pws[i] + " ");
		}System.out.println();
		for(int i=0; i<num; i++) {
			System.out.print(moneys[i] + " ");
		}

	}

}
