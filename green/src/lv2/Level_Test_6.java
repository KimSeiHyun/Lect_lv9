package lv2;

import java.util.Scanner;

public class Level_Test_6 {

	public static void main(String[] args) {
	    /*  5회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 정수를 전부 합을 출력한다. 
		 * 3. 만약에 입력받은 합이 100 이상이면  반복이 5회가 아닐지라도 즉시 종료 
		 * 
		 * 예) 7 ==> 합 : 7 ,  14 ==> 합 : 21 , 1000 ==> 합 : 1021 !종료
		 * 
		 */	
		//	시작 : 12:33
		//	종료 : 12:54
		//	소요 : 21분
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int sum = 0;
		System.out.println("정수를 입력해주세요 . ");
		System.out.println("합이 100 이상이거나 5번의 정수를 입력하면 종료됩니다. ");
		while (a <=5) {
			System.out.print(a + "번째 정수를 입력해주세요 : ");
			int score = sc.nextInt();
			sum += score;
			System.out.println("정수들의 합 : " + sum);
			if (sum >= 100) {
				System.out.println("합이 100 이상이므로 종료합니다.");
				break;
			}
			a++;
		}
	}

}
