package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_01 {

	public static void main(String[] args) {
		//�������幮��
		
		// ��ö��/20,�̸���/30,�̿���/40
		String[] names = { "��ö��", "�̸���", "�̿���" };
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
			System.out.println("����Ϸ� ! ");
		} catch (Exception e) {
			System.out.println("������� ,,");
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
				System.out.println("���Ϸε� ���� ,,");
				e.printStackTrace();
			}
		}

		
	}

}
