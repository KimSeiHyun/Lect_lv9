package backjoon;

import java.util.Scanner;

public class lv3_003_8393 {

	public static void main(String[] args) {//문제번호 8393
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=x; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
