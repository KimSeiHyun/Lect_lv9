package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_02 {

	public static void main(String[] args) {
		// �������幮��2
		String[] names = { "momk", "megait", "github" };
		String[] pws = { "1111", "2222", "3333" };
		int[] moneys = { 20000, 30000, 40000 };
		String fileName = "fileTest02.txt";
		String data = "";
		// �������͸� �Ʒ��Ͱ��� �����غ�����.
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		File file = new File(fileName);
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			for(int i=0; i<3; i++) {
					fw.write(names[i]+"/");
					fw.write(pws[i]+"/");
					fw.write(moneys[i]+"\n");
			}
			fw.close();
			System.out.println("����Ϸ� ! ");
		} catch (Exception e) {
			System.out.println("������� ,, ");
			e.printStackTrace();
		}
		
		FileReader fr = null;
		BufferedReader br = null;
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String data1 = br.readLine();
				System.out.println(data1);
				String data2 = br.readLine();
				System.out.println(data2);
				String data3 = br.readLine();
				System.out.println(data3);
				fr.close();
				br.close();
			} catch (Exception e) {
				System.out.println("���Ϸε� ���� .. ");
				e.printStackTrace();
			}
		}
		
		
		
	}

}
