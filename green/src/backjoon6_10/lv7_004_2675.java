package backjoon6_10;

import java.util.Scanner;

public class lv7_004_2675 {

	public static void main(String[] args) { // 2675
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		for(int i=0; i<x; i++) {
			String temp = "";
			int y = sc.nextInt();
			String str = sc.next();
			for(int j=0; j<str.length(); j++) {
				for(int k= 0; k<y; k++) {
					temp += str.charAt(j);
				}
			}
			System.out.println(temp);
		}
		
		
		
		
		
	}

}