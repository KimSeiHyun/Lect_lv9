package backjoon6_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lv8_004_2869 {

	public static void main(String[] args)throws IOException {
//		while(true) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer (br.readLine());
		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		
//		int cnt = 0; //�ؿ� ���ǹ��� ��Ȯ�ϰ� ¥�������� �ݺ����� ���� ��Ȯ�� ���ϴ� ���� ���� ����� . 
//		int sum = 0;
//		while(true) {
//			cnt++;
//			
//			sum+=a;
//			if(sum >= c) break;
//			sum-=b;
//			
//			
//		}//true
//		
//
//		System.out.println("cnt : " + cnt);
		

		if( (a-b)%2 == 0 ) {
			if((c-a)%(a-b) %2 == 0) {
				System.out.println((c-a)/(a-b)+1);				
			}
			else {
				System.out.println((c-a)/(a-b)+2);				
				
			}
		}
		if( (a-b)%2 == 1) {
			if((c-a)%(a-b)%2 == 0) {
				System.out.println((c-a)/(a-b)+1);				
			}
			else {
				System.out.println((c-a)/(a-b)+2);				
				
			}
		}
		
		
//		}//while
		
		
		
		
    }
}