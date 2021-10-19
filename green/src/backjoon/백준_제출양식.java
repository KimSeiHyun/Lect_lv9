package backjoon;


import java.io.*;
import java.util.StringTokenizer;

public class 백준_제출양식 {

	public static void main(String[] args) throws IOException {
		// 백준 제출양식 (Java)
		// 입출력 성능향상 : BufferedReader & BufferedWriter 사용 
		// ㄴ 주의1 : IOException 처리 필수 (try-catch 또는 throws)
		// ㄴ 주의2 : 모든 데이터를 String 으로 처리함 (후가공 필요)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		System.out.println("n : " + n);
//		for(int i=0; i<n; i++) {
//			String test[] = br.readLine().split(" ");
//			bw.write(Integer.parseInt(test[0]) + Integer.parseInt(test[1]) + "\n");
//			 split()보다 StringTokenizer 가 더 빠름 
			StringTokenizer test = new StringTokenizer(br.readLine(), " ");
			String temp = test+"";
			bw.write(Integer.parseInt(test.nextToken()) + Integer.parseInt(test.nextToken())  +"\n");
			bw.write(Integer.parseInt(test.nextToken())+"\n");
//		}
		System.out.println("temp : " +temp);
		br.close();
		bw.flush(); // 버퍼에 남아있는 데이터를 비움 
		bw.close();
		

		
		
		
		
		
	}
} 