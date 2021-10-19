package backjoon;

import java.util.Scanner;

public class lv1_009_10869 {

	public static void main(String[] args) { //문제번호 10869
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println((x+y)%z);
		System.out.println(((x%z)+(y%z))%z);
		System.out.println((x*y)%z);
		System.out.println(((x%z)*(y%z))%z);
	}

}
