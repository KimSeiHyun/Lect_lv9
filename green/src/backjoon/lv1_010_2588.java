package backjoon;

import java.util.Scanner;

public class lv1_010_2588 {

	public static void main(String[] args) { //문제번호 : 2588
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = y%10;
		int a2 = (y%100)/10;
		int a3 = y/100;
		System.out.println(x*a);
		System.out.println(x*a2);
		System.out.println(x*a3);
		System.out.println(x*y);
		
	}

}
