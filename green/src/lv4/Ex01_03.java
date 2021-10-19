package lv4;

import java.util.Random;

public class Ex01_03 {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
		 */
		
		int[] arr = new int[5];

		Random ran = new Random();
		
		int a = 0;
		while (a <5) {
			int num = ran.nextInt(10)+1;
			
			int check = 0 ;
			for(int i =0; i<5; i++) {
				if ( num == arr[i]) {
					check = a;				
				}
			}
			if ( check == 0) {
				arr[a] = num;
				a++;
				
			}

		}
		
		for(int j=0; j<5; j++) {
			System.out.println(arr[j]);
		}
		

	}

}
