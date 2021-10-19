package lv1;

public class Ex04 {

	public static void main(String[] args) {
		// 변수
		// 변수를 선언한다 라고 표현 . 
		// 선언 : 자료형키워드 변수명;
		// 1. 정수 int
		// 2. 실수 double
		// 3. 문자 char
		// 4. 문자열  String(대문자키워드) 
		// 5. 논리형(참과 거짓) boolean
		
		int num;
		// System.out.println(num);
		// The local variable num may not have been initialized 
		// (지역변수 num이 초기화[값이 들어가있지 않다.] 되지 않았다.) 
		
		// 초기화 (값을 부여)
		// 대입연산자(=)를 사용해서 초기화를 한다.
		// 변수명 = 값   < 초기화 
		num = 100;
		System.out.println(num);
		
		// 선언과 초기화를 동시에 .
		double pie = 3.14;
		
		int a = 1;
		double b = 15.1;
		char c = 'c';
		String s = "가나";   
		boolean join = true; // and false
		System.out.println(join);
		
	}

}
