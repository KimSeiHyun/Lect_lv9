package backjoon;

import java.util.Scanner;

public class lv4_03_1110 {

	public static void main(String[] args) { //문제번호 1110
		Scanner sc = new Scanner(System.in);
		
		 int x = sc.nextInt();
		 int temp = x;
		 int y = 0;
		 while(true) {
			 int a = x/10;
			 int b = x%10;
			 int c = a+b;
			 x = b*10+(c%10);
			 y ++;
			 if(x == temp) break;
		 }
		 System.out.println(y);
		 

		
	}

}