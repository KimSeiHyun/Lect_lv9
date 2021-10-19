package lv.test_3;

import java.util.Scanner;

public class lv3_28 {

	public static void main(String[] args) {
		/*
		 * # 소수찾기[2단계]
		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 * 예)
		 * 입력 : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2; i<num; i++) {
			int cnt = 0;
			for(int j = 1; j<num; j++ ) {
				if(i%j == 0) {
					cnt ++;
				}
			}
			if(cnt == 2) {
				System.out.println(i);
			}
		}
		
		
	}

}
