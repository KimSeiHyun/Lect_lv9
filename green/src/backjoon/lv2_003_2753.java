package backjoon;

import java.util.Scanner;

public class lv2_003_2753 {

	public static void main(String[] args) { //문제번호 2753
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		if(x >= 1 && x <= 4000) {
			if(x%4 == 0 && x%100 != 0 || x%400 == 0) {
				System.out.println("1");
			}else System.out.println("0");
		}

	}

}
