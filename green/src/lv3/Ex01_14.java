package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex01_14 {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[1단계]
		 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
		 * 2. 단, 중복되는 숫자는 없어야 한다.
		 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
		 * 
		 * 예)
		 * 랜덤숫자 : 1
		 * check = {0, 1, 0, 0, 0}
		 * arr   = {1, 0, 0, 0, 0}
		 * 랜덤숫자 : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * 랜덤숫자 : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		int[] check = new int[5];
		int[] arr = new int[5];
		
		int t = 0;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		while (t<5) {
			int random = ran.nextInt(5);
				
			for(int i=0; i<5; i++) {
				
			}
		System.out.println(random);
			t++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
