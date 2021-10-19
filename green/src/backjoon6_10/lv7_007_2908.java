package backjoon6_10;

import java.util.Scanner;

public class lv7_007_2908 {

	public static void main(String[] args) {//2908
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		 x = x/100+(x-x/100*100)/10*10 + x%10*100;
		 y = y/100+(y-y/100*100)/10*10 + y%10*100;
		
		if(x > y) {
			System.out.println(x);
		}else System.out.println(y);
		
		
		
		
		
		
		
		
		
		
	}

}