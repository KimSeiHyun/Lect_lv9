package backjoon;

import java.util.Scanner;

public class lv2_001_1330 {

	public static void main(String[] args) { //문제번호 1330
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); int y = sc.nextInt();
		if(x >= -10000 && x <= 10000 && y >= -10000 && y<= 10000) {
			if(x > y) {
				System.out.println(">");
			}
			if(x < y) {
				System.out.println("<");
			}
			if(x == y) {
				System.out.println("==");
			}
		}
		
		
	}

}
