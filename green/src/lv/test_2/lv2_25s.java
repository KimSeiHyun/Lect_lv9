package lv.test_2;

import java.util.Scanner;

public class lv2_25s {

	public static void main(String[] args) {
		/*
		 * # 답없음 문제 
		 * 1. 5회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 정수를 전부 합을 출력한다. 
		 * 3. 만약에 입력받은 합이 100 이상이면  반복이 5회가 아닐지라도 즉시 종료 
		 * 
		 * 예) 7 ==> 합 : 7 ,  14 ==> 합 : 21 , 1000 ==> 합 : 1021 !종료
		 * 
		 */	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++) {
			System.out.println("숫자를 입력해주세요 .");
			int num = sc.nextInt();
			sum += num;
			System.out.println("sum :" + sum);
			if(sum >= 100) {
				System.out.println("100이 넘어가므로 종료 ! ");
				break;
			}
		}
	}

}
