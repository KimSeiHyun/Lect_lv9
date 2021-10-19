package lv1;

public class EX05 {

	public static void main(String[] args) {
		// 비교연산자 (논리형으로 결과값을 반환)
		// >  <  >=  <=   ==(같다)   !=(같지않다.)
		// 프로그래밍 언어에서 !(느낌표)의 뜻은 not을 의미 .
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		
		boolean result;
		result = num1 == num2;
		System.out.println("num1과 num2가 같은가 : " + result);
		
		// 논리연산자
		// 1. and &&  ( 연산중에 하나라도 거짓이면 false)
		// 2. or  ||  ( 연산중에 하나라도 참이면 true)
		
		// num1과 num2가 같거나(or) num1이 작다.
		System.out.println(num1 == num2 || num1 < num2);
		
		//num1과 num2가 같고(and) num2이 작다.
		System.out.println(num1 == num2 && num1 < num2);
		
		// 예) 3의 배수이면서, 짝수이면 true 출력
				int num = 12;
				System.out.println(num % 3 == 0 && num % 2 == 0);
				// 문제 1) 과락
				// 3과목의 평균이 60점 이상이면, true
				// 단, 어느 한 과목이라도 50점 미만이면, false
				int kor = 100;
				int eng = 87;
				int math = 41;
				
				double avg = (kor + eng + math) / 3.0;
				
				System.out.println((kor+eng+math)/3 >= 60 && kor < 50 && eng < 50 && math < 50);
				
				
				// 문제 2) 키가 200cm이상이거나
				// 몸무게가 200kg 이상이면, 입장 (true)
				int cm = 183;
				int kg = 75;
				
				boolean pass = cm >= 200 && kg >= 200;
			//	System.out.println(cm >= 200 || kg >= 200);
				System.out.println("pass : " + pass);
				
	}

}
