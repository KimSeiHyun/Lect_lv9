package lv4;

import java.util.Random;

public class Ex01_03tc2 {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
		 */
		
		int[] arr = new int[5];

		Random rn = new Random();
		
		for(int i=0; i<5; i++) {
			int rNum = rn.nextInt(10) +1;
			boolean check = true;
			for(int j=0; j<5; j++) {
				if(arr[i] == rNum) {
					check = false;
				}
			}
			
			if(check == true) {
				arr[i] = rNum;
			}
			
			else { // 중복발견시 
				i--;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
