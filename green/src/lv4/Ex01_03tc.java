package lv4;

import java.util.Random;

public class Ex01_03tc {

	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
		 */
		
		int[] arr = new int[5];

		Random rn = new Random();
		
		int i = 0;
		while(i<5) {
			int rNum = rn.nextInt(10) +1;
			
			int check = -1;
			// 중복확인 후 > 유요한 값 저장. 
			for(int j =0; j<5; j++) {
				if(rNum == arr[j]) {
					check = i;
				}
			}			
			if(check == -1) {
				arr[i] = rNum;
				i++;
			}
			
		} // while
		
		System.out.println("tc");
		for( i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
