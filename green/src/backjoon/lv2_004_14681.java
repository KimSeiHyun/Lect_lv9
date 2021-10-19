package backjoon;

import java.util.Scanner;

public class lv2_004_14681 {

	public static void main(String[] args) { // 문제번호 : 14681
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		int y = sc.nextInt(); 
		if(x >= 1 && y >= 1) {
			System.out.println("1");
		}
		else if (x <= -1 && y >= 1) {
			System.out.println("2");
		}
		else if (x <= -1 && y <= -1) {
			System.out.println("3");
		}
		else if (x >= 1 && y <= -1) {
			System.out.println("4");
		}
	}

}
