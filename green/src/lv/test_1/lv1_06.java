package lv.test_1;

public class lv1_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("실행 O");
		}
		
		if(a != b) {
			System.out.println("실행 X");
		}
		
		// 문제 1) 양수, 0, 음수 출력
		int num1 = -10;
		if(num1 > 0) {
			System.out.println("양수이다 . ");
		}
		if(num1 == 0) {
			System.out.println("0이다. ");
		}
		if(num1 < 0) {
			System.out.println("음수이다 . ");
		}
		
		// 문제 2) 4의 배수 출력
		int num2 = 12;
				
		if(num2 %4 == 0) {
			System.out.println("4의 배수이다 . ");
		}
		if(num2 %4 != 0) {
			System.out.println("4의 배수가 아니다  . ");
		}
		// 문제 3) 합격, 불합격 출력
		int score = 87;	
		if (score >= 80  && score <= 100) {
			System.out.println("합격 ! ");
		}
		if (score >= 0  && score < 80  ) {
			System.out.println("불합격 ! ");
		}
		
	}

}
