package backjoon6_10;

import java.util.Scanner;

public class lv7_002_11720 {

	public static void main(String[] args) { //11720
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		for(int i=0; i<x; i++) {
			int y = Integer.parseInt(str.charAt(i)+"");
			sum += y;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}