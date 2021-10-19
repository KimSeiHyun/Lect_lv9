package backjoon;

import java.util.Scanner;

public class lv5_06_8958 {

	public static void main(String[] args) { // 8958
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0; i<x; i++) {
			int sum = 0;
			int cnt = 0;
			String str = sc.next();
			int y = str.length();
			String arr[] = new String[y];
			for(int j=0; j<y; j++) {
				arr[j] = str.charAt(j)+"";
				if(arr[j].equals("O")) {
					cnt++;
					sum += cnt;
				}
				else if(arr[j].equals("X")) {
					cnt = 0;
				}
				
			}
			System.out.println(sum);
		}
		
		
		
		
		
	}

}