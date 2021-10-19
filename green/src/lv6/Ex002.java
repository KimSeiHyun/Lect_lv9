package lv6;

import java.util.Random;

// 클래스 : 사용자 정의 자료형
// ㄴ 요소 
//  1)맴버변수
//  2)매서드

// 메서드(함수) : 기능단위의 코드들을 재사용할 수 있게 만든 것.
// 메서드 정의 
// 자료형키워드 메서드명(){ 실행문 }
// void - 반환할 타입이 정해지지 않은 경우에 사용 
class Intro {
	String name;
	
	// Type 1
	// void 반환 X . 파라미터 X . 
	void sayHello() {
		// 실행문 
		System.out.printf("%s아 안녕 ! \n", name);
	}
	// 문제) 1~5까지의 합을 출력하는 메서드.
	void sum() {
		int sum = 0;
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	// 4가지 유형의 메서드 정의방법 
	// Type 2
	// 반환 X , 파라미더 O
	void add(int num1, int num2) { // parameter 매개변수
		int sum = num1+num2;
		System.out.println("sum : " +sum);
		
	}
	
	// Type 3
	// 반환 O , 파라미터 X
	int ranNum() {
		Random rn = new Random();
		int rNum = rn.nextInt(10)+1;
		return rNum;
	}
	// Type 4
	// 반환 O , 파라미터 O
	String makeStr(String key) {
		return key + "야 안녕!";
	}
	
}//class Intro




public class Ex002 {

	public static void main(String[] args) {
		String str = "abcd";
//		str.
		// 메서드의 사용(호출)
		// .(닷)을 찍고 > 클래스가 가지고 있는 메서드를 선택 . 
		
		Intro intro = new Intro();
		Calculater cal = new Calculater();
		intro.name = "김세현";
		intro.sayHello();
		
		intro.sum();
		
		int a = 10;
		int b = 20;
		
		intro.add(a,b); // arguments 인자(값)
		
		int num = intro.ranNum();
		System.out.println(num);
		
		String result = intro.makeStr("둘리");
		System.out.println(result);
		System.out.println();
		
		cal.guide();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
