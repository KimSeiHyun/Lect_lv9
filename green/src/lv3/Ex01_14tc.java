package lv3;

import java.util.Random;

public class Ex01_14tc {

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
		int[] check = new int[5]; // 중복처리를 위한 도구 . 
		int[] arr = new int[5]; // 결과값을 저장할 배열 . -> arr 배열 출력 ( 결과 ) 
		
		Random rn = new Random();
		
		int idx = 0; // arr 인덱스 (유요한 갑싱 채워질 때에만 증가)
		while(idx < 5) {
			// arr 배열에 차곡차곡 > 중복없이 값(0~4)을 저장 . 
			int rNum = rn.nextInt(5); // 0~4
			
			if(check[rNum] == 0) {
			// idx 증감식을 조건문 안에 가두기
				arr[idx] = rNum;
				check[rNum] = 1;
				idx ++;
			}
			
		}
		
		for ( int i=0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
