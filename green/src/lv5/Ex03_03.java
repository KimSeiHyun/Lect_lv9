package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex03_03 {

	public static void main(String[] args) {
		//���Ϻҷ����⹮��
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		String fileName = "fileTest02.txt";
		
		//�ݺ����� �Ἥ ó���غ����� . 
		//���ڿ��� ��ŭ�� �������� �𸥴ٴ� �����Ͽ� �ذ� . 
		File file = new File(fileName);
		
		FileReader fr = null;
		BufferedReader br = null;
		int num = 0;
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String temp = br.readLine();
				System.out.println("temp : " + temp); //���ڿ��� �� Ȯ�� . 
				String temp2[] = br.readLine().split("/");
				num = temp2.length;
				System.out.println("���ڿ��� ���� : " + num); 
				ids = new String[num];
				pws = new String[num];
				moneys = new int[num];
				br.close();
				fr.close();
				
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				int x =0;
				while(x <3) { //���ڿ��� ���� Ȯ���� ���̸�ŭ �� �迭�� ���� . 
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
				System.out.println("���Ϸε� ���� ,, ");
				e.printStackTrace();
			}
		}//if
		
		//���
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
