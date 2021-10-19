package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class lv3_004_15552 {

	public static void main(String[] args) throws IOException {//문제번호 15552
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		for(int i=0; i<x; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken())+"\n") ;
			
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
