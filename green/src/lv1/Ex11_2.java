package lv1;

import java.util.Scanner;

public class Ex11_2 {

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
		
		System.out.println("정거장수를 입력하세요 . ");
		int stop = sc.nextInt();
		
		int total = 0; //총요금
		
		if(stop > 0) {
			total = 500; // 기본요금 
			// 1차 할증 ( 6 ~ 10 )
			if (stop >= 6) {
				total += 100;
			}
			// 2차 할증 ( 11~ )
			if(stop > 10) {
				// 2정거장마다 50원씩 증가.
				if(stop % 2 == 1 ) {
					stop ++; // 짝수로 맞춤 .
				}
				int count = (stop - 10)/2;
				int add = count * 50;
				
				total += add;
			}
			
		}
		System.out.println("요금은 " + total + "원 입니다.");
		
		System.out.println("이용할 정거장 수를 입력하세요 .");
		int a = sc.nextInt();
		int b = ++a;
		int money = 500;
		
		if (a > 0 && a < 6) {
			System.out.println(money + "원 입니다.");
		}
		else if (a > 5 && a < 11 ) {
			System.out.println(money + 100 + "원 입니다.");
		}
		else if (a > 10   ) {		
			System.out.println(b);
		}


	}

}
