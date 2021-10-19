package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_25s {

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
		
		System.out.println("이용할 정거장 수를 입력해주세요 .");
		int x = sc.nextInt();
		
		int y = 0;
		if(x >=1 && x <=5) {
			y = 500;
		}
		else if(x >=6 && x <=10) {
			y = 600;
		}
		else {
			if(x %2 == 1) {
				x ++;
			}
			y = 600+(x-10)/2*50;
		}
		
		System.out.println("이용금액은 : "+ y +"입니다.");

	}

}
