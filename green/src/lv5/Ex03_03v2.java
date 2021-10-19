package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex03_03v2 {

	public static void main(String[] args) {
		File file = new File("text.txt");
		
		FileReader fr = null;
		BufferedReader br = null;

		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				int y = 0;
				while(y<1) {
					String data = br.readLine();
					if(data == null) {
						break;
					}
					System.out.println(data);
				}
					
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
