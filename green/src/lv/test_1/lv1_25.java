package lv.test_1;

import java.util.Scanner;

public class lv1_25 {

	public static void main(String[] args) {
		/*
		 * # 지하철 요금 계산
		 * 1. 이용할 정거장 수를 입력받는다.
		 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
		 * 3. 요금표
		 * 1) 1~5	: 500원
		 * 2) 6~10	: 600원
		 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
		 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
		 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
		 * ... 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이용할 정거장 수를 입력하세요 . ");
		int x = sc.nextInt();
		
		int charge = 600;
		int cnt = 0;
		if(x >= 1 && x <= 5) {
			charge = 500;
		}
		if(x >= 6 && x <= 10) {
			charge = 600;
		}
		if(x >10 && x %2 == 0) {
			cnt = (x-10)/2 ;
			charge += cnt*50;
		}
		if(x >10 && x %2 == 1) {
			x ++;
			cnt = (x-10)/2 ;
			charge += cnt*50;
		}
		
		System.out.println("요금은 : " + charge + "입니다." );
	
	}

}
