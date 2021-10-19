package lv.test_4;

import java.util.Scanner;

public class lv4_23s {

	public static void main(String[] args) {
		/*
		 * # 소수 찾기[3단계]
		 * 1. 숫자를 한 개 입력받는다.
		 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
		 * 
		 * 예) Enter Number ? 1000
		 *    1000보다 큰 첫번재 소수는 1009
		 * 예) Enter Number ? 500
		 *    500보다 큰 첫번째 소수는 503
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = sc.nextInt();
		
		while(true) {
			int check = 0;
			for(int i=1; i<=number; i++) {
				if(number%i == 0) {
					check ++;
				}
			}
			if(check == 2) {
				break;
			}
			number ++;
		}
		
		System.out.println(number);
	}

}
