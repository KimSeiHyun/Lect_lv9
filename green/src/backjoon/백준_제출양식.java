package backjoon;


import java.io.*;
import java.util.StringTokenizer;

public class ����_������ {

	public static void main(String[] args) throws IOException {
		// ���� ������ (Java)
		// ����� ������� : BufferedReader & BufferedWriter ��� 
		// �� ����1 : IOException ó�� �ʼ� (try-catch �Ǵ� throws)
		// �� ����2 : ��� �����͸� String ���� ó���� (�İ��� �ʿ�)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		System.out.println("n : " + n);
//		for(int i=0; i<n; i++) {
//			String test[] = br.readLine().split(" ");
//			bw.write(Integer.parseInt(test[0]) + Integer.parseInt(test[1]) + "\n");
//			 split()���� StringTokenizer �� �� ���� 
			StringTokenizer test = new StringTokenizer(br.readLine(), " ");
			String temp = test+"";
			bw.write(Integer.parseInt(test.nextToken()) + Integer.parseInt(test.nextToken())  +"\n");
			bw.write(Integer.parseInt(test.nextToken())+"\n");
//		}
		System.out.println("temp : " +temp);
		br.close();
		bw.flush(); // ���ۿ� �����ִ� �����͸� ��� 
		bw.close();
		

		
		
		
		
		
	}
} 