package backjoon6_10;

import java.io.IOException;
import java.util.Scanner;

public class lv9_001_1978 {

	public static void main(String[] args) { // 1978

			Scanner sc= new Scanner(System.in);
			int t = sc.nextInt();
			int cnt2 = 0;
			for(int i =0; i<t; i++) {
				int x = sc.nextInt();
				int cnt = 0;
				for(int j =1; j<=x; j++) {
					if(x %j == 0) {
						cnt ++;
					}
				}
				if(cnt == 2) {
					cnt2 ++;
				}
				
			}
			System.out.println(cnt2);
			
			

			
	    }
	}