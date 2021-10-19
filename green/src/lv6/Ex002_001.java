package lv6;

//리턴형 연습문제
class Calculater {
	// 0. guide message (출력)
	// 1. 더하기
	// 2. 빼기
	// 3. 곱하기
	// 4. 나누기
	// 5. 나머지
	void guide() {
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("5. %");
	}
	int one(int num1 , int num2) {
		return num1+num2;
	}
	int two(int num1, int num2) {
		return num1-num2;
	}
	int three(int num1 , int num2) {
		return num1*num2;
	}
	int four(int num1 , int num2) {
		return num1/num2;
	}
	int five(int num1 , int num2) {
		return num1%num2;
	}
}

public class Ex002_001 {

	public static void main(String[] args) {
		Calculater cal = new Calculater();
		
		cal.guide();
		
		int a = 15;
		int b = 5;
		
		
		int one = cal.one(a, b);
		System.out.println(one);
		
		int two = cal.two(a, b);
		System.out.println(two);
		
		int three = cal.three(a, b);
		System.out.println(three);
		
		int four = cal.four(a, b);
		System.out.println(four);
		
		int five = cal.five(a, b);
		System.out.println(five);
		
		
	}

}
