package backjoon;

import java.util.Scanner;

public class lv5_03_2577 {

	public static void main(String[] args) { // 2577
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = a*b*c;
		String str = x+"";
		
		for(int i=0; i<=9; i++) {
			int cnt = 0;
			String temp = i+"";
			for(int j=0; j<str.length(); j++) {
				String temp2 = str.charAt(j)+"";
				if(temp.equals(temp2)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		
		
		
		
		
	}

}