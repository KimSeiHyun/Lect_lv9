package lv.test_1;

public class lv1_06s {

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
				
		if(num1 > 0 ) {
			System.out.println(num1+"은 양수이다 ! ");
		}
		if(num1 == 0 ) {
			System.out.println(num1+"은 0이다 ! ");
		}
		if(num1 < 0 ) {
			System.out.println(num1+"은 음수이다 ! ");
		}
		// 문제 2) 4의 배수 출력
		int num2 = 12;
				
		if(num2 %4 ==0 ) {
			System.out.println(num2 +"는 4의 배수이다.");
		}
		if(num2 %4 !=0 ) {
			System.out.println(num2 +"는 4의 배수가 아니다.");
		}
		// 문제 3) 합격, 불합격 출력
		int score = 87;	
		if(score >= 70 && score <=100) {
			System.out.println(score+"점은 합격 !");
		}
		if(score >= 0 && score <70) {
			System.out.println(score+"점은 불합격 !");
		}
		
	}

}
