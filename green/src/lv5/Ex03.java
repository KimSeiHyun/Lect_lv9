package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03 {

	public static void main(String[] args) {
		// FIle ����
		//  try - catch �� �ȿ��� ����ó���� ����� ��� ����.
		
		// ���Ͼ���
		// FileWriter
		
		File file = new File("text.txt");// text.txt ��� �̸� ������ �̸��� �ʱ�ȭ . 
		FileWriter fw = null;
		try {
			fw = new FileWriter(file); // text.txt ��� ���� ���� . 
			fw.write("�輼��\nddd"+123); // text.txt ��� ���Ͽ� ���� ���� .
			fw.close();					// �� �۾��� ������ �ݾ������ . (�߿�)
			System.out.println("����Ϸ�!");
		} catch (Exception e ) {
			System.out.println("�������!");
		}
		
		//�����б�
		// FIleReader
		// BufferedReader
		
		FileReader fr = null;
		BufferedReader br = null;
		if(file.exists()) {
			try {
				fr = new FileReader("text.txt"); // text.txt ������ ã�� ���Ҹ� �� . 
				br = new BufferedReader(fr);	// FileReader �� ã�� ������ ������ �ҷ��� 
				
				String data = br.readLine(); // ���ο� ���ڿ� �� �� ��(�ٹٲ� ����)�� �о�� . > String Ÿ������ ��ȯ
				String data2 = br.readLine(); 
				System.out.println("data : " + data);
				System.out.println("data2 : " + data2);
				
				fr.close();
				br.close();
			} catch (Exception e) {
				System.out.println("���Ϸε� ���� ! ");
				e.printStackTrace();
			}
			
		}
		
	}

}
