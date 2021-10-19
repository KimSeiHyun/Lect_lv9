package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_01 {

	public static void main(String[] args) {
		//파일저장문제
		
		// 김철수/20,이만수/30,이영희/40
		String[] names = { "김철수", "이만수", "이영희" };
		int[] ages = { 20, 30, 40 };
		String fileName = "fileTest01.txt";
		String data = "";
		
		File file = new File(fileName);
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			for(int i=0; i<3; i++) {
				if(i != 2) {
				fw.write(names[i]+"/");
				fw.write(ages[i]+",");
				}
				else {
				fw.write(names[i]+"/");
				fw.write(ages[i]+"");	
				}
			}
			fw.close();
			System.out.println("저장완료 ! ");
		} catch (Exception e) {
			System.out.println("저장실패 ,,");
		}
		
		FileReader fr = null;
		BufferedReader br = null;
		if(file.exists()) {
			try {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				
				String str = br.readLine();
				System.out.println("str : " +str);
			} catch (Exception e) {
				System.out.println("파일로드 실패 ,,");
				e.printStackTrace();
			}
		}

		
	}

}
