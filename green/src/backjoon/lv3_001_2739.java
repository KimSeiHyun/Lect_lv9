package backjoon;

import java.util.Scanner;

public class lv3_001_2739 {

	public static void main(String[] args) { //문제번호 2739

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(x + " * " + i + " = "+ x*i);
		}
	}

}
