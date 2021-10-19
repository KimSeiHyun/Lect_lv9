package lv.test_1;

import java.util.Random;

public class lv1_24s {

	public static void main(String[] args) {
		/*
		 * # 369게임[1단계]
		 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
		 * 2. 위 수에 369의 개수가
		 * 	1) 2개이면, 짝짝을 출력
		 *  2) 1개이면, 짝을 출력
		 *  3) 0개이면, 해당 숫자를 출력
		 * 예)
		 * 		33	 : 짝짝
		 * 		16	 : 짝
		 * 		 7	 : 7
		 */
		
		Random rn = new Random();
		
		int ranNum = rn.nextInt(50)+1;
		
		int x = ranNum / 10;
		int y = ranNum % 10;
		
		int cnt = 0;
		if(x == 3) {
			cnt ++;
		}
		if(y==3 || y==6 || y==9) {
			cnt ++;
		}
		
		if(cnt == 1) {
			System.out.println(ranNum + "짝");
		}
		else if(cnt == 2) {
			System.out.println(ranNum + "짝짝");
		}
		else {
			System.out.println(ranNum);
		}
		

	}

}
