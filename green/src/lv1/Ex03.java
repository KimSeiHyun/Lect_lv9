package lv1;

public class Ex03 {

	public static void main(String[] args) {
		// 연산자
		// 1. 산술연산자 ) 
		// 2. 비교연산자 
		// 3. 논리연산자
		// 4. 대입연산자
		
		// 1. 산술연산자
		// + - * / %(나머지)[어떤수를 나누고 남은 값.]
		
		// 주석처리 단축키 : 문장 위에 커서 두고 -> ctrl + '/'
		System.out.println(10+3);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10%3);
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println("연봉 = " + 100*12*0.9 + "원");
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		System.out.println("평균 = " + (30+50+4)/3);
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println("넓이 =" + 3*6/2);
		//문제4) 100초를 1분 40초로 출력
		System.out.println("100초 = " + 100/60 + "분 "+ 100%60 + "초");
		//문제5) 800원에서 500원짜리 개수 , 800에서 500원을뺀 100원짜리 개수 출력
		System.out.println("500원 개수 = " + (800/500) + "개," +  " 100원 개수 = " + (8%5) + "개");
		//정답5) 500원(2개), 100원(3개) 
	}

}
