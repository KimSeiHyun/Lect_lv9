package lv.test_4;

import java.util.Random;

public class lv4_03 {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
		 */
		
		int[] arr = new int[5];

		Random ran = new Random();
		
		int x = 0;
		while (x<5) {
			int check  = 0;
			int num = ran.nextInt(10)+1;
			for(int i=0; i<5; i++) {
				if(arr[i] == num) {
					check = 1;
				}
			}
			if(check == 0) {
				arr[x] = num;
				x++;
			}
			
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
